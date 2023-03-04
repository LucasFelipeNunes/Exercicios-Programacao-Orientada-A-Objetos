/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Ge-
rar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas res-
pectivas colunas e apresentar as três matrizes.*/
import java.util.Scanner;
public class Lista0Exercicio21{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0, P = 0;
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
		do{
			System.out.print("Digite o valor da dimensao P:\t");
			P = ler.nextInt();
			if(P <= 0) System.out.print("Valor invalido. ");
		}while(P <= 0);
		int[][] matriz1 = new int[N][M], matriz2 = new int[N][P];
		System.out.print("Matriz NxM:");
		for (int i = 0; i < matriz1.length; i++)
		{
			System.out.println();
			for (int j = 0; j < matriz1[i].length; j++)
			{
				matriz1[i][j] = (int) (Math.random() * 10);
				System.out.print("\t" + matriz1[i][j]);
			}
		}
		System.out.print("\nMatriz NxP:");
		for (int i = 0; i < matriz2.length; i++)
		{
			System.out.println();
			for (int j = 0; j < matriz2[i].length; j++)
			{
				matriz2[i][j] = (int) (Math.random() * 10);
				System.out.print("\t" + matriz2[i][j]);
			}
		}
		System.out.print("\nMatriz Nx(M+P):");
		for (int i = 0; i < matriz2.length; i++)
		{
			System.out.println();
			for (int j = 0; j < (matriz1[i].length + matriz2[i].length); j++)
			{
				System.out.print("\t" + ((j < matriz1[i].length) ? matriz1[i][j] : matriz2[i][j - matriz1[i].length]));
			}
		}
	}
}
