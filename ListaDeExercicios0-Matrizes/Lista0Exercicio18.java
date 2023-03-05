/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 18) Escreva um programa em Java para gerar uma matriz quadrada R de di-
mensão N. Imprimir os elementos da acima da diagonal principal (inclusa) e
acima da diagonal secundária (inclusa).*/
import java.util.Scanner;
public class Lista0Exercicio18{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz Q:\t");
			N = ler.nextInt();
			if(N <= 0) System.out.print("Valor invalido. ");
		}while(N <= 0);
		int[][] R = new int[N][N];
		for (int i = 0; i < R.length; i++)
		{
			for (int j = 0; j < R.length; j++)
			{
				R[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.print("Os elementos da matriz sao:");
		for (int i = 0; i < R.length; i++)
		{
			System.out.println();
			for (int j = 0;j < R.length;j++)
			{
				System.out.print("\t" + R[i][j]);
			}
				
		}
		System.out.print("\nOs elementos da diagonal acima da principal sao:");
		for (int i = 0; i < R.length - 1; i++)
		{
			System.out.print(" " + R[i][i + 1]);	
		}
		System.out.print("\nOs elementos da diagonal acima da secundaria sao:");
		for (int i = 0; i < R.length - 1; i++)
		{
			System.out.print(" " + R[R.length - i - 2][i]);	
		}
	}
}
