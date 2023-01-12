//Nome: Luiz Gustavo Duarte Chagas

import java.util.Scanner;
public class Lista0Exercicio02 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String[][] A = new String[6][3];
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				A[i][j] = String.valueOf((int) (Math.random() * 100));
			}
		}
		System.out.println("\n A matriz B gerada e:");
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print("\t" + A[i][j]);
			}
			System.out.println();
		}

        System.out.println("\n A matriz B em ordem inversa e:");
		for (int i = 5; i >= 0; i--)
		{
			for (int j = 2; j >= 0; j--)
			{
				System.out.print("\t" + A[i][j]);
			}
			System.out.println();
		}
	}
}