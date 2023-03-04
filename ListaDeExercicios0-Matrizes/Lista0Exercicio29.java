/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 25) Escreva um programa em Java para gerar uma matriz Y (N x M). Ordene os ele-
mentos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/
import java.util.Scanner;
import java.util.Arrays;
public class Lista0Exercicio29{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int valor = 0, aux = 2;
		boolean ePrimo = false;
		do{
			System.out.print("Digite um valor positivo inteiro:\t");
			valor = ler.nextInt();
			if(valor <= 0) System.out.print("Valor invalido. ");
		}while(valor <= 0);
		System.out.print("Vetor gerado:");
		int[] vetor = new int[valor];
		int[][] matriz = new int[valor][];
		for (int i = 0; i < vetor.length; i++)
		{
			vetor[i] = (int) (Math.random() * 10);
			System.out.print(" " + vetor[i]);
			matriz[i] = new int[vetor[i] + 1];
			matriz[i][0] = vetor[i];
		}
		System.out.print("\nMatriz gerada");
		for (int i = 0; i < matriz.length; i++)
		{
			System.out.print("\n" + matriz[i][0]);
			for(int j = 1; j < matriz[i].length; j++)
			{
				ePrimo = false;
				for(int k = aux;ePrimo == false;k++){
					ePrimo = true;
					for(int l = 2;l < k;l++){
						if(k%l == 0) ePrimo = false;
					}
					if(ePrimo){
						matriz[i][j] = k;
						aux = k + 1;
					}
				}
				System.out.print("\t" + matriz[i][j]);
			}
			aux = 2;
		}
		
	}
}
