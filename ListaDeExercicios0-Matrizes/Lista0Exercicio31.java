/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 31) Escreva um programa em Java para gerar uma matriz (N x M). O usuário deve in-
formar uma faixa de valores inteiros positivos (valor inicial e valor final). O programa
deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores for-
necida pelo usuário. Ao final, imprimir a matriz resultante.*/
import java.util.Scanner;
public class Lista0Exercicio31{
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
		int[][] matriz = new int [N][M];
		System.out.print("Digite o valor inicial da faixa dos que serão impressos:\t");
		int valorInicial = ler.nextInt();
		System.out.print("Digite o valor final da faixa dos que serão impressos:\t");
		int valorFinal = ler.nextInt();
		System.out.print("Matriz Resultante:");
		for (int i = 0; i < N; i++) {
			System.out.println();
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * (valorFinal - valorInicial + 1)) + valorInicial;
				System.out.print("\t" + matriz[i][j]);
            }
        }
	}
}
