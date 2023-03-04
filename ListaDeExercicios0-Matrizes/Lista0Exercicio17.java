/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 17) Escreva um programa em Java para gerar uma matriz quadrada Q de dimensão N.
Imprimir os elementos da acima da diagonal principal (inclusa) e abaixo da diagonal
secundária (inclusa).*/
import java.util.Scanner;
public class Lista0Exercicio17{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz Q:\t");
			N = ler.nextInt();
			if(N <= 0) System.out.print("Valor invalido. ");
		}while(N <= 0);
		int[][] Q = new int[N][N];
		for (int i = 0; i < Q.length; i++)
		{
			for (int j = 0; j < Q.length; j++)
			{
				Q[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.print("Os elementos da matriz sao:");
		for (int i = 0; i < Q.length; i++)
		{
			System.out.println();
			for (int j = 0;j < Q.length;j++)
			{
				System.out.print("\t" + Q[i][j]);
			}
				
		}
		System.out.print("\nOs elementos da diagonal acima da principal sao:");
		for (int i = 0; i < Q.length - 1; i++)
		{
			System.out.print(" " + Q[i][i + 1]);	
		}
		System.out.print("\nOs elementos da diagonal abaixo da secundaria sao:");
		for (int i = 1; i < Q.length; i++)
		{
			System.out.print(" " + Q[i][Q.length - i]);	
		}
		
	}
}
