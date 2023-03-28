/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 5) [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do
segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja





maior ou igual a zero, as raízes serão reais. Caso o delta seja neg
ativo, as reais serão complexas
e da forma
,
assim retorne zero.*/
import java.util.Scanner;

public class Lista1Exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double a = 0;

        do {
            System.out.print("a: ");
            a = scan.nextDouble();
            if(a == 0) {
                System.out.print("Valor invalido");
            }
        } while (a == 0); 
        
        System.out.print("b: ");
        double b = ler.nextDouble();

        System.out.println("c: ");
        double c = ler.nextDouble();

        double delta = calcularDelta(a, b, c);
        System.out.println("O delta e: " + delta + ( (delta < 0) ? ", de raiz imaginaria" : ", de raiz real" ) );

        double[] raizes = calcularBhaskara(a, b, c);

        System.out.print("As raizes sao: " + raizes[0] + ", " + raizes[1]);

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
