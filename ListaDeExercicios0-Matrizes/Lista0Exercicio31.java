/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 31) Escreva um programa em Java para gerar uma matriz (N x M). O usuário deve informar uma faixa de valores inteiros positivos (valor inicial e valor final). O programa deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores fornecida pelo usuário. Ao final, imprimir a matriz resultante.*/

import java.util.Scanner;

public class Lista0Exercicio31{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int dimensaoN = 0, dimensaoM = 0;
		do{
			System.out.print("Digite o valor da dimensao N:\t");
			dimensaoN = ler.nextInt();
			if(dimensaoN <= 0){
				System.out.print("Valor invalido. ");
			}
		}while(dimensaoN <= 0);
		do{
			System.out.print("Digite o valor da dimensao M:\t");
			dimensaoM = ler.nextInt();
			if(dimensaoM <= 0) System.out.print("Valor invalido. ");
		}while(dimensaoM <= 0);
		int[][] matriz = new int[dimensaoN][dimensaoM];
		System.out.print("Digite o valor inicial da faixa dos que serão impressos:\t");
		int valorInicial = ler.nextInt();
		System.out.print("Digite o valor final da faixa dos que serão impressos:\t");
		int valorFinal = ler.nextInt();
		System.out.print("Matriz Resultante:");
		for(int i = 0; i < matriz.length; i++){
			System.out.println();
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * (valorFinal - valorInicial + 1)) + valorInicial;
				System.out.print("\t" + matriz[i][j]);
            }
        }
	}
}
