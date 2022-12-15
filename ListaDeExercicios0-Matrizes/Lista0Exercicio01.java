/*Nome: Lucas Felipe da Silva Nunes
1) Escreva um programa em Java para
ler uma matriz A de 4 linhas por 5 colunas e
imprimir seus elementos.*/
import java.util.Scanner;
public class Lista0Exercicio01{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String[][] A = new String[4][5];
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print("Digite o elemento da linha " + (i + 1) + " e da coluna " + (j + 1) + " da matriz A:\t");
				A[i][j] = ler.nextLine();
			}
		}
		System.out.println("\n A matriz A digitada é:");
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print("\t" + A[i][j]);
			}
			System.out.println();
		}
	}
}

