/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 11) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa).*/

import java.util.Scanner;

public class Lista0Exercicio11{
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao inteira e positiva N da matriz quadrada K:\t");
			N = ler.nextInt();
			if(N <= 0){
				System.out.print("Valor invalido. ");
			}
		}while(N <= 0);
		double[][] K = new double[N][N];
		System.out.print("Elementos abaixo da diagonal principal:");
		for (int i = 0; i < K.length; i++)
		{
			for (int j = 0; j < K[i].length; j++)
			{
				K[i][j] = Math.random() * 50;
			}
		}	
		for (int i = 0; i + 1 < K[i].length; i++)
		{
			System.out.print("\t" + K[i + 1][i]);
		}
	}
}
