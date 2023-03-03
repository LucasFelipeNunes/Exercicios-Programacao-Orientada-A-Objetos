//Nome: Luiz Gustavo Duarte Chagas

import java.util.Scanner;
public class Lista0Exercicio04 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, m;

		do{
			System.out.println("Digite a quantidade de linhas");
			n = ler.nextInt();
		} while(n < 1);
		
		do{
			System.out.println("Digite a quantidade de colunas");
			m = ler.nextInt();
		} while(m < 1);
		

		String[][] A = new String[n][m];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				A[i][j] = String.valueOf((int) (Math.random() * 100));
			}
		}
		System.out.println("\n A matriz B gerada e:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				System.out.print("\t" + A[i][j]);
			}
			System.out.println();
		}
	}
}