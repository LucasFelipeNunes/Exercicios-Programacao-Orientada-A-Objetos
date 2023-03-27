/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Scanner;

public class Lista1Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("a: ");

        double a = ler.nextDouble();

        System.out.print("b: ");

        double b = ler.nextDouble();

        System.out.print("c: ");

        double c = ler.nextDouble();

        System.out.print("Delta e: " + calcularDelta(a, b, c));

    }

    static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
