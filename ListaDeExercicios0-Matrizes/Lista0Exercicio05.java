/*Nome: Lucas Felipe da Silva Nunes
5) Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e calcular a soma entre elas gerando uma terceira matriz.*/

import java.util.Scanner;

public class Lista0Exercicio05{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in), lerString = new Scanner (System.in);
		int N = 0, M = 0;
		do{
			System.out.print("Digite a dimensao inteira e positiva N de elementos nas linhas das 3 matrizes:\t");
			N = ler.nextInt(); 
			if(N <= 0){
				System.out.print("Valor invalido. ");
			}
		}while(N <= 0);
		do{
			System.out.print("Digite a dimensao inteira e positiva M de elementos nas colunas das matrizes a serem digitadas:\t");
			M = ler.nextInt(); 
			if(M <= 0){
				System.out.print("Valor invalido. ");
			}
		}while((M*10)%10 != 0 || M <= 0);
		int[][] matriz1 = new int[N][M], matriz2 = new int[N][M], matriz3 = new int[N][M];
		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				System.out.print("Digite o elemento da linha " + (i + 1) + " e da coluna " + (j + 1) + " da primeira matriz:\t");
				matriz1[i][j] = ler.nextInt();
			}
		}
		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				System.out.print("Digite o elemento da linha " + (i + 1) + " e da coluna " + (j + 1) + " da segunda matriz:\t");
				matriz2[i][j] = ler.nextInt();
			}
		}
		System.out.println("\nMatriz soma entre as digitadas:");
		for (int i = 0; i < N; i++){
			System.out.println();
			for (int j = 0; j < M; j++){
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print("\t" + matriz3[i][j]);
			}
		}
	}
}

