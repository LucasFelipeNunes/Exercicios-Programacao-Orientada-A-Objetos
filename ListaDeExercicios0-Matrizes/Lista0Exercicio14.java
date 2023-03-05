/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 13) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
Imprimir os elementos da abaixo da diagonal secundária (exclusa)*/
import java.util.Scanner;
public class Lista0Exercicio14{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz K:\t");
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
		System.out.print("\nOs elementos da diagonal acima da secundaria sao:");
		for (int i = 0; i < L.length - 1; i++)
		{
			System.out.print(" " + L[L.length - i - 2][i]);	
		}
	}
}
