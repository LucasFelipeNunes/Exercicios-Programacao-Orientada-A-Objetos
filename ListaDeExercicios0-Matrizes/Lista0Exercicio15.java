/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 15) Escreva um programa em Java para gerar uma matriz quadrada O de dimensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e acima da diagonal secundária (inclusa).*/

import java.util.Scanner;

public class Lista0Exercicio15{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz O:\t");
			N = ler.nextInt();
			if(N <= 0){
				System.out.print("Valor invalido. ");
			}
		}while(N <= 0);
		int[][] O = new int[N][N];
		for (int i = 0; i < O.length; i++){
			for (int j = 0; j < O.length; j++){
				O[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.print("Os elementos da matriz sao:");
		for (int i = 0; i < O.length; i++){
			System.out.println();
			for (int j = 0;j < O[i].length;j++){
				System.out.print("\t" + O[i][j]);
			}
				
		}
		System.out.print("\nOs elementos da diagonal abaixo da principal sao:");
		for (int i = 1; i < O.length; i++){
			System.out.print(" " + O[i][i - 1]);	
		}
		System.out.print("\nOs elementos da diagonal acima da secundaria sao:");
		for (int i = 0; i < O.length - 1; i++){
			System.out.print(" " + O[O.length - i - 2][i]);	
		}
		
	}
}
