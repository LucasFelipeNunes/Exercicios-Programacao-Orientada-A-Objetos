import java.util.Scanner;

public class Lista1Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        double numero = scan.nextDouble();

        if(isPositivo(numero)) {

            System.out.println(isZero(numero) ? "Zero!" : numero + " e positivo");

        } else {
            System.out.println("Numero: " + numero + " e negativo");
        }
    }

    static boolean isPositivo(double num){
        return num >= 0;
    }
    
    static boolean isZero(double numero) {
        return numero == 0;
    }
}


