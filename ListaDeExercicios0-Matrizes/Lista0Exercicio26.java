/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 26) Escreva um programa em Java para gerar uma matriz W (N x M). Ordene
os elementos da matriz de forma decrescente e imprimir a matriz original e a
matriz ordenada.*/
import java.util.Scanner;
import java.util.Arrays;
public class Lista0Exercicio26{
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
		int[][] W = new int[N][M];
		int[] elementos = new int[N * M];
		System.out.print("Matriz W original:");
		for (int i = 0; i < W.length; i++)
		{
			System.out.println();
			for (int j = 0; j < W[i].length; j++)
			{
				W[i][j] = (int) (Math.random() * 100);
				elementos[contador] = W[i][j];
				System.out.print("\t" + W[i][j]);
				contador++;
			}
		}
		System.out.print("\nMatriz W em ordem crescente:");
		Arrays.sort(elementos);
		for (int i = 0; i < elementos.length / 2; i++)
		{
			contador = elementos[i];
			elementos[i] = elementos[elementos.length - 1 - i];
			elementos[elementos.length - 1 - i] = contador;
		}
		contador = 0;
		for (int i = 0; i < W.length; i++)
		{
			System.out.println();
			for (int j = 0; j < W[i].length; j++)
			{
				W[i][j] = elementos[contador];
				System.out.print("\t" + W[i][j]);
				contador++;
			}
		}
	}
}
