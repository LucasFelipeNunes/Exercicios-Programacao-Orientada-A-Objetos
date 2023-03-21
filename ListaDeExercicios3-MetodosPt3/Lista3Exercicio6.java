/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Scanner;

public class Lista3Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");

        int n1 = scan.nextInt();

        System.out.println("Digite um outro numero inteiro");

        int n2 = scan.nextInt();

        int[] primos = calcularPrimos(n1,n2);

        for (int i = 0; i < primos.length; i++) {
            System.out.print(" " + primos[i]);
        }

    }

    static int[] calcularPrimos(int n1, int n2) {

        int[] primos;
        int quantPrimos = 0;

        for (int i = Math.min(n1,n2); i < Math.max(n1,n2); i++) {

            int divisores = 0;

            for (int j = 2; j < i; j++) {
                if(i%j == 0) {
                    divisores++;
                }
            }

            if(divisores == 0) {
                quantPrimos++;
            }
        }

        primos = new int[quantPrimos];

        quantPrimos = 0;

        for (int i = Math.min(n1,n2); i <= Math.max(n1,n2); i++) {

            int divisores = 0;

            for (int j = 2; j < i; j++) {
                if(i%j == 0) {
                    divisores++;
                }
            }

            if(divisores == 0) {
                primos[quantPrimos] = i;
                quantPrimos++;
            }
        }
        

        return primos;
    }
}
