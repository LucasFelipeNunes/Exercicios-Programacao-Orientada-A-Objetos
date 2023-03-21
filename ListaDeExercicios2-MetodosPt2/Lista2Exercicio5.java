/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Scanner;

public class Lista2Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro");

        int a = ler.nextInt();
        
        System.out.println("Digite o segundo numero inteiro");

        int b = ler.nextInt();

        System.out.println("Digite o terceiro numero inteiro");

        int c = ler.nextInt();

        maior(a,b,c);
    }

    static int maior(int a, int b) {
        return Math.max(a,b);
    }

    static int maior(int a, int b, int c) {
        return Math.max(a, Math.max(b, c) );
    }
}
