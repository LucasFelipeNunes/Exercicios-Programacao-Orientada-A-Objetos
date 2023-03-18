import java.util.Scanner;

public class Lista1Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = 0;

        do {

            System.out.println("Digite o A (diferente de zero): ");

            a = scan.nextDouble();

        } while (a == 0); 
        
        System.out.println("Digite o B: ");

        double b = scan.nextDouble();

        System.out.println("Digite o C: ");

        double c = scan.nextDouble();

        double delta = calcularDelta(a, b, c);

        System.out.println("O delta e: " + delta + ( delta < 0 ? delta + ", De raiz imaginaria" : delta + ", De raiz real" ) );

        double[] raizes = calcularBhaskara(a, b, c);

        System.out.println("As raizes sao: " + raizes[0] + ", " + raizes[1]);

    }

    static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4*a*c;
    }

    static double[] calcularBhaskara(double a, double b, double c) {

        double[] raizes = new double[2];

        if(calcularDelta(a, b, c) < 0) {
            return raizes;
        } else {
            raizes[0] = (-b + Math.sqrt(calcularDelta(a, b, c))) / 2*a;
            raizes[1] = (-b - Math.sqrt(calcularDelta(a, b, c))) / 2*a;

            return raizes;
        }
    }
}
