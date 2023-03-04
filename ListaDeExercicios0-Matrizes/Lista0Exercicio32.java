/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 32) Escreva um programa em Java para gerar uma matriz (N x M). A matriz
deve ser criada com a seguinte dimensão ((N+1) x (M+1)). Para cada linha
imprimir a soma na casa final. Repetir o processo para coluna. Na posição
((N+1) x (M+1)), apresentar a soma dos elementos da diagonal principal (li-
nha = coluna).*/
import java.util.Scanner;
import java.util.Arrays;
public class Lista0Exercicio32{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0, somaDiagonal = 0;
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
		int[][] matriz = new int[N + 1][M + 1];
		int[] somaColunas = new int[M + 1];
		for (int i = 0; i < matriz.length; i++)
		{
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++)
			{
				if(i != matriz.length - 1)
				{
					matriz[i][j] = (j != matriz[i].length - 1) ? (int) (Math.random() * 10) : Arrays.stream(matriz[i]).sum();
					somaColunas[j] += matriz[i][j];
					if(i == j && i != matriz.length - 1 && j != matriz[i].length - 1) somaDiagonal += matriz[i][j];
				}
				else if(i == matriz.length - 1 && j == matriz[i].length - 1) matriz[i][j] = somaDiagonal;
				else matriz[i][j] = somaColunas[j];
				System.out.print("\t" + matriz[i][j]);
			}
		}
		
	}
}
