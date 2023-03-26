/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 27) Escreva um programa em Java para gerar uma matriz Y (N x M). Ordene os ele-
mentos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/

import java.util.Scanner;
import java.util.Arrays;

public class Lista0Exercicio27{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int dimensaoN = 0, dimensaoM = 0;
		do{
			System.out.print("Digite o valor da dimensao N:\t");
			dimensaoN = ler.nextInt();
			if(dimensaoN <= 0) System.out.print("Valor invalido. ");
		}while(dimensaoN <= 0);
		do{
			System.out.print("Digite o valor da dimensao M:\t");
			dimensaoM = ler.nextInt();
			if(dimensaoM <= 0) System.out.print("Valor invalido. ");
		}while(dimensaoM <= 0);
		int[][] matrizX = new int[dimensaoN][dimensaoM];
		System.out.print("Matriz X original:");
		for (int i = 0; i < matrizX.length; i++){
			System.out.println();
			for (int j = 0; j < matrizX[i].length; j++){
				matrizX[i][j] = (int) (Math.random() * 100);
				System.out.print("\t" + matrizX[i][j]);
			}
			Arrays.sort(matrizX[i]);
		}
		System.out.print("\nMatriz X com cada linha em ordem crescente:");
		for(int i = 0; i < matrizX.length; i++){
			System.out.println();
			for(int j = 0; j < matrizX[i].length; j++)	{
				System.out.print("\t" + matrizX[i][j]);
			}
		}
	}
}
