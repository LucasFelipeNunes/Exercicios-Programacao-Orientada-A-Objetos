/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 28) Escreva um programa em Java para gerar uma matriz Z (N x M). Ordenar
as colunas da matriz de forma crescente e imprimir a matriz original e a ma-
triz ordenada.*/
import java.util.Scanner;
public class Lista0Exercicio28{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0, aux = 0;
		do{
			System.out.print("Digite o valor da dimensao N:\t");
			N = ler.nextInt();
			if(N <= 0) System.out.print("Valor invalido. ");
		}while(N <= 0);
		do{
			System.out.print("Digite o valor da dimensao M:\t");
			M = ler.nextInt();
			if(M <= 0) System.out.print("Valor invalido. ");
		}while(M <= 0);
		int[][] Z = new int[N][M];
		System.out.print("Matriz Z original:");
		for (int i = 0; i < Z.length; i++)
		{
			System.out.println();
			for (int j = 0; j < Z[i].length; j++)
			{
				Z[i][j] = (int) (Math.random() * 100);
				System.out.print("\t" + Z[i][j]);
			}
		}
		System.out.print("\nMatriz Z com cada coluna em ordem crescente:");
		for (int i = 0; i < M; i++)
		{
			for (int j = 0; j < N; j++)
			{
				for(int k = 0;k < j;k++)
				{
					if(Z[k][i] > Z[j][i])
					{
						aux = Z[k][i];
						Z[k][i] = Z[j][i];
						Z[j][i] = aux;
					}
				}
			}
		}
		for (int i = 0; i < Z.length; i++)
		{
			System.out.println();
			for (int j = 0; j < Z[i].length; j++)
			{
				System.out.print("\t" + Z[i][j]);
			}
		}
	}
}
