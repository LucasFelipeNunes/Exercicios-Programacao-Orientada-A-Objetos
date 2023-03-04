/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 29) Escreva um programa em Java para solicitar ao usuário um valor. Este valor lido
será a quantidade de elementos de um vetor. Gerar os elementos do vetor. A partir do
vetor gerado, criar uma matriz, onde a quantidade de linhas será igual à quantidade
de elementos do vetor e as colunas serão os valores dos elementos do vetor mais um.
Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo ele-
mento do vetor criado inicialmente e os demais elementos da linha serão formados
pela sequencia de Primos. Imprimir a matriz resultante*/
import java.util.Scanner;
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
