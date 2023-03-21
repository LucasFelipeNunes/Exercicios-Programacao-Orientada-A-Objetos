/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Scanner;

public class Lista3Exercicio3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Scanner scanumero = new Scanner(System.in);

        while(true) {
            System.out.print("[C] Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair:");
            
            String opc = scan.next();

            if(opc.equals("S")) {
                break;
            }

            double temp = 0;

            switch (opc) {

                case "C":
                    System.out.println("Digite a temperatura");
                    temp = scanumero.nextDouble();

                    System.out.println( "F: " + celsiusToFarenheit(temp) );
                    System.out.println( "K: " + celsiusToKelvin(temp) );
                    break;
            
                case "F":
                    System.out.println("Digite a temperatura");
                    temp = scanumero.nextDouble();

                    System.out.println( "C: " + farenheitToCelsius(temp) );
                    System.out.println( "K: " + celsiusToKelvin(farenheitToCelsius(temp)) );
                    break;

                case "K":
                    System.out.println("Digite a temperatura");
                    temp = scanumero.nextDouble();

                    System.out.println( "C: " + kelvinToCelsius(temp) );
                    System.out.println( "F: " + kelvinToFarenheit(temp) );
                    break;

                default:
                    System.out.println("Opcao Invalida");
                    break;

            }
        }
    }

    static double celsiusToFarenheit(double temp) {
        return 9*temp/5 + 32;
    }

    static double celsiusToKelvin(double temp) {
        return temp+273;
    }

    static double farenheitToCelsius(double farenheit) {
        return 5*(farenheit-32)/9;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin-273;
    }

    static double kelvinToFarenheit(double kelvin) {
        return celsiusToFarenheit(kelvinToCelsius(kelvin));
    }
}
