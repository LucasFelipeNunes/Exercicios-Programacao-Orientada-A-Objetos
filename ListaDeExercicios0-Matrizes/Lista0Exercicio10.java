/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 10) Escreva um programa em Java para gerar uma matriz quadrada H de di-
mensão N. Imprimir os elementos da diagonal secundária (linha + coluna =
dimensão + 1).*/
import java.util.Scanner;
public class Lista0Exercicio10{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz L:\t");
			N = ler.nextInt();
			if(N <= 0) System.out.print("Valor invalido. ");
		}while(N <= 0);
		int[][] H = new int[N][N];
		for (int i = 0; i < H.length; i++)
		{
			for (int j = 0; j < H.length; j++)
			{
				H[i][j] = (int)(Math.random() * 10);
			}
		}
		System.out.print("Os elementos da matriz sao:");
		for (int i = 0; i < H.length; i++)
		{
			System.out.println();
			for (int j = 0;j < H.length;j++)
			{
				System.out.print("\t" + H[i][j]);
			}
		}
		System.out.print("\nOs elementos da diagonal secundaria sao:");
		for (int i = 0; i < H.length; i++)
		{
			System.out.print(" " + H[i][H.length - 1 - i]);	
		}
	}
}
