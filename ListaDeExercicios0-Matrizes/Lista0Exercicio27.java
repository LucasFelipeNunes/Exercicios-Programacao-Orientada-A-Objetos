/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 25) Escreva um programa em Java para gerar uma matriz Y (N x M). Ordene os ele-
mentos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/
import java.util.Scanner;
import java.util.Arrays;
public class Lista0Exercicio27{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0;
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
		int[][] X = new int[N][M];
		System.out.print("Matriz X original:");
		for (int i = 0; i < X.length; i++)
		{
			System.out.println();
			for (int j = 0; j < X[i].length; j++)
			{
				X[i][j] = (int) (Math.random() * 100);
				System.out.print("\t" + X[i][j]);
			}
			Arrays.sort(X[i]);
		}
		System.out.print("\nMatriz X com cada linha em ordem crescente:");
		for (int i = 0; i < X.length; i++)
		{
			System.out.println();
			for (int j = 0; j < X[i].length; j++)
			{
				System.out.print("\t" + X[i][j]);
			}
		}
	}
}
