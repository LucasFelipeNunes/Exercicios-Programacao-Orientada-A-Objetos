/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Ge-
rar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas res-
pectivas colunas e apresentar as três matrizes.*/

import java.util.Scanner;

public class Lista0Exercicio21{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int dimensaoN = 0, dimensaoM = 0, dimensaoP = 0;
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
		do{
			System.out.print("Digite o valor da dimensao P:\t");
			dimensaoP = ler.nextInt();
			if(dimensaoP <= 0) System.out.print("Valor invalido. ");
		}while(dimensaoP <= 0);
		int[][] matriz1 = new int[dimensaoN][dimensaoM], matriz2 = new int[dimensaoN][dimensaoP];
		System.out.print("Matriz NxM:");
		for (int i = 0; i < matriz1.length; i++){
			System.out.println();
			for (int j = 0; j < matriz1[i].length; j++){
				matriz1[i][j] = (int) (Math.random() * 100);
				System.out.print("\t" + matriz1[i][j]);
			}
		}
		System.out.print("\nMatriz NxP:");
		for (int i = 0; i < matriz2.length; i++){
			System.out.println();
			for (int j = 0; j < matriz2[i].length; j++){
				matriz2[i][j] = (int) (Math.random() * 100);
				System.out.print("\t" + matriz2[i][j]);
			}
		}
		System.out.print("\nMatriz Nx(M+P):");
		for (int i = 0; i < matriz2.length; i++){
			System.out.println();
			for (int j = 0; j < (matriz1[i].length + matriz2[i].length); j++){
				System.out.print("\t" + ((j < matriz1[i].length) ? matriz1[i][j] : matriz2[i][j - matriz1[i].length]));
			}
		}
	}
}
