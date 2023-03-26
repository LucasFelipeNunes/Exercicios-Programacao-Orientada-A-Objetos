/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 25) Escreva um programa em Java para gerar uma matriz Y (N x M). Ordene os ele-
mentos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/

import java.util.Scanner;
import java.util.Arrays;

public class Lista0Exercicio25{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int dimensaoN = 0, dimensaoM = 0, contador = 0;
		do{
			System.out.print("Digite a dimensao N:\t");
			dimensaoN = ler.nextInt();
			if(dimensaoN <= 0) System.out.print("Valor invalido. ");
		}while(dimensaoN <= 0);
		do{
			System.out.print("Digite o valor da dimensao M:\t");
			dimensaoM = ler.nextInt();
			if(dimensaoM <= 0) System.out.print("Valor invalido. ");
		}while(dimensaoM <= 0);
		int[][] matrizY = new int[dimensaoN][dimensaoM];
		int[] elementos = new int[dimensaoN * dimensaoM];
		System.out.print("Matriz Y:");
		for(int i = 0; i < matrizY.length; i++){
			System.out.println();
			for(int j = 0; j < matrizY[i].length; j++){
				matrizY[i][j] = (int)(Math.random() * 200);
				elementos[contador] = matrizY[i][j];
				System.out.print("\t" + matrizY[i][j]);
				contador++;
			}
		}
		System.out.print("\nMatriz Y em ordem crescente:");
		Arrays.sort(elementos);
		contador = 0;
		for(int i = 0; i < matrizY.length; i++){
			System.out.println();
			for(int j = 0; j < matrizY[i].length; j++){
				matrizY[i][j] = elementos[contador];
				System.out.print("\t" + matrizY[i][j]);
				contador++;
			}
		}
	}
}
