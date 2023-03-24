/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 13) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N. Imprimir os elementos da abaixo da diagonal secundária (exclusa)*/

import java.util.Scanner;

public class Lista0Exercicio13{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int dimensaoN = 0;
		do{
			System.out.print("Digite a dimensao N da matriz K:\t");
			dimnesaoN = ler.nextInt();
			if(dimensaoN <= 0){
				System.out.print("Valor invalido. ");
			}
		}while(dimensaoN <= 0);
		int[][] K = new int[dimensaoN][dimensaoN];
		for (int i = 0; i < K.length; i++)
		{
			for (int j = 0; j < K[i].length; j++)
			{
				System.out.print("Digite o valor da posicao [" + i + "][" + j + "] da matriz K: ");
				K[i][j] = ler.nextInt();
			}
		}
		System.out.print("Os elementos da diagonal abaixo da secundaria sao:");
		for (int i = 1; i < K.length; i++)
		{
			System.out.print(" " + K[i][K.length - i]);			
		}
	}
}
