/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 16) Escreva um programa em Java para gerar uma matriz quadrada P de di-
mensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e
abaixo da diagonal secundária (inclusa).*/
import java.util.Scanner;
public class Lista0Exercicio16{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz O:\t");
			N = ler.nextInt();
			if(N <= 0) System.out.print("Valor invalido. ");
		}while(N <= 0);
		int[][] P = new int[N][N];
		for (int i = 0; i < P.length; i++)
		{
			for (int j = 0; j < P.length; j++)
			{
				P[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.print("Os elementos da matriz sao:");
		for (int i = 0; i < P.length; i++)
		{
			System.out.println();
			for (int j = 0;j < P.length;j++)
			{
				System.out.print("\t" + P[i][j]);
			}
				
		}
		System.out.print("\nOs elementos da diagonal abaixo da principal sao:");
		for (int i = 1; i < P.length; i++)
		{
			System.out.print(" " + P[i][i - 1]);	
		}
		System.out.print("\nOs elementos da diagonal abaixo da secundaria sao:");
		for (int i = 1; i < P.length; i++)
		{
			System.out.print(" " + P[i][P.length - i]);	
		}
	}
}
