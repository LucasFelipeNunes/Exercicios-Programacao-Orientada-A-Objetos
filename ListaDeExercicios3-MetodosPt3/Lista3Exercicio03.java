/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Scanner;

public class Lista3Exercicio03 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);

        while(true) {
            System.out.print("[C] Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair:");
            
            String opcao = lerString.next();

            if(!opcao.equals("S")){
                
                System.out.print((opcao.equals("C") || opcao.equals("F") || opcao.equals("K")) ? "Digite a temperatura: " : "Opcao Invalida");
                double temperatura = ler.nextDouble();

                switch (opcao) {

                    case "C":

                        System.out.println( "F: " + celsiusParaFarenheit(temperatura) + "\nK: " + celsiusParaKelvin(temperatura) );
                        break;
                
                    case "F":
                        temperatura = ler.nextDouble();

                        System.out.println( "C: " + farenheitParaCelsius(temperatura) + "\nK: " + celsiusParaKelvin(farenheitParaCelsius(temperatura)) );
                        break;

                    case "K":

                        System.out.println("C: " + kelvinParaCelsius(temperatura) + "\nF: " + celsiusParaFarenheit(kelvinParaCelsius(temperatura)));
                        break;

                }
            }
        }
    }

    static double celsiusParaFarenheit(double temperaturaCelsius) {
        return 9 * temperaturaCelsius / 5 + 32;
    }

    static double celsiusParaKelvin(double temperaturaCelsius) {
        return temperaturaCelsius + 273;
    }

    static double farenheitParaCelsius(double temperaturaFarenheit) {
        return 5 * (temperaturaFarenheit - 32) / 9;
    }

    static double kelvinParaCelsius(double temperaturaKelvin) {
        return temperaturaKelvin - 273;
    }
}
