/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 25) Escreva um programa em Java para gerar uma matriz Y (N x M). Ordene os ele-
mentos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/
import java.util.Scanner;
import java.util.Arrays;
public class Lista0Exercicio25{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0, contador = 0;
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
		int[][] Y = new int[N][M];
		int[] elementos = new int[N * M];
		System.out.print("Matriz Y original:");
		for (int i = 0; i < Y.length; i++)
		{
			System.out.println();
			for (int j = 0; j < Y[i].length; j++)
			{
				Y[i][j] = (int) (Math.random() * 100);
				elementos[contador] = Y[i][j];
				System.out.print("\t" + Y[i][j]);
				contador++;
			}
		}
		System.out.print("\nMatriz Y em ordem crescente:");
		Arrays.sort(elementos);
		contador = 0;
		for (int i = 0; i < Y.length; i++)
		{
			System.out.println();
			for (int j = 0; j < Y[i].length; j++)
			{
				Y[i][j] = elementos[contador];
				System.out.print("\t" + Y[i][j]);
				contador++;
			}
		}
	}
}
