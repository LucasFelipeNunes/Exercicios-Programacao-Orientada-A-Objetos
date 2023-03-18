import java.util.Scanner;

public class Lista1Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o A: ");

        double a = scan.nextDouble();

        System.out.println("Digite o B: ");

        double b = scan.nextDouble();

        System.out.println("Digite o C: ");

        double c = scan.nextDouble();

        System.out.println("O delta e: " + calcularDelta(a, b, c));

    }

    static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4*a*c;
    }
}
