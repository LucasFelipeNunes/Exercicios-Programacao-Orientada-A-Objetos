import java.util.Scanner;

public class Lista1Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        double numero = scan.nextDouble();

       System.out.println(isZero(numero) ? numero + ", e zero" : numero + ", Nao e zero");
    }

    static boolean isZero(double numero) {
        return numero == 0;
    }
}
