/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 12) Escreva um programa em Java para gerar uma matriz quadrada L de di-
mensão N. Imprimir os elementos da acima da diagonal principal (exclusa).*/
import java.util.Scanner;
public class Lista0Exercicio12{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz L:\t");
			N = ler.nextInt();
			if(N <= 0) System.out.print("Valor invalido. ");
		}while(N <= 0);
		int[][] L = new int[N][N];
		for (int i = 0; i < L.length; i++)
		{
			for (int j = 0; j < L.length; j++)
			{
				L[i][j] = (int)(Math.random() * 10);
			}
		}
		System.out.print("Os elementos da matriz sao:");
		for (int i = 0; i < L.length; i++)
		{
			System.out.println();
			for (int j = 0;j < L.length;j++)
			{
				System.out.print("\t" + L[i][j]);
			}
		}
		System.out.print("\nOs elementos da diagonal acima da principal sao:");
		for (int i = 0; i < L.length - 1; i++)
		{
			System.out.print(" " + L[i][i + 1]);	
		}
	}
}
