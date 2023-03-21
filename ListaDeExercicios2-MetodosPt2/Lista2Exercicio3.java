/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Scanner;

public class Lista2Exercicio3 {
	public static void main (String args[]) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com um numero inteiro: ");

		int n1 = ler.nextInt();

		System.out.print("Entre com outro numero inteiro: ");

		int n2 = ler.nextInt();

		System.out.print("O maior e: " + maior(n1,n2));

	}

	static int maior(int n1, int n2) {
		return Math.max(n1, n2);
	}
}
