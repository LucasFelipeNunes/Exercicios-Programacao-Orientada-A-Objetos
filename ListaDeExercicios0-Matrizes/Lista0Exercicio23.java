/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Ge-
rar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas res-
pectivas colunas e apresentar as três matrizes*/
import java.util.Scanner;
public class Lista0Exercicio23{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int dimensao1 = 0, dimensao2 = 0, aux = 2;
		boolean ePrimo = false;
		do{
			System.out.print("Digite o valor da primeira dimensao da matriz de primos:\t");
			dimensao1 = ler.nextInt();
			if(dimensao1 <= 0) System.out.print("Valor invalido. ");
		}while(dimensao1 <= 0);
		do{
			System.out.print("Digite o valor da segunda dimensao da matriz de primos:\t");
			dimensao2 = ler.nextInt();
			if(dimensao2 <= 0) System.out.print("Valor invalido. ");
		}while(dimensao2 <= 0);
		int[][] matrizPrimos = new int[dimensao1][dimensao2];
		System.out.print("Matriz de Primos:");
		for (int i = 0; i < matrizPrimos.length; i++)
		{
			System.out.println();
			for (int j = 0; j < matrizPrimos[i].length; j++)
			{
				ePrimo = false;
				for(int k = aux;ePrimo == false;k++){
					ePrimo = true;
					for(int l = 2;l < k;l++){
						if(k%l == 0) ePrimo = false;
					}
					if(ePrimo){
						matrizPrimos[i][j] = k;
						aux = k + 1;
					}
				}
				System.out.print("\t" + matrizPrimos[i][j]);
			}
		}
	}
}
