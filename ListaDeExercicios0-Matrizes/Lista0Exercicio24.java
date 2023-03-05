/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 24) Escreva um programa em Java para solicitar ao usuário dimensões de
uma matriz. Preencher a matriz com os elementos da sequencia de Fibonacci
e imprimir o resultado.*/
import java.util.Scanner;
public class Lista0Exercicio24{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int dimensao1 = 0, dimensao2 = 0, numeroPassado = 1, numeroRetrasado = 0;
		do{
			System.out.print("Digite o valor da primeira dimensao da matriz de Fibonacci:\t");
			dimensao1 = ler.nextInt();
			if(dimensao1 <= 0) System.out.print("Valor invalido. ");
		}while(dimensao1 <= 0);
		do{
			System.out.print("Digite o valor da segunda dimensao da matriz de Fibonacci:\t");
			dimensao2 = ler.nextInt();
			if(dimensao2 <= 0) System.out.print("Valor invalido. ");
		}while(dimensao2 <= 0);
		int[][] matrizFibonacci = new int[dimensao1][dimensao2];
		System.out.print("Matriz de Fibonacci:");
		for (int i = 0; i < matrizFibonacci.length; i++)
		{
			System.out.println();
			for (int j = 0; j < matrizFibonacci[i].length; j++)
			{
				if(i == 0 && j == 0) matrizFibonacci[i][j] = numeroRetrasado;
				else if(i == 0 && j == 1) matrizFibonacci[i][j] = numeroPassado;
				else{
					matrizFibonacci[i][j] = numeroRetrasado + numeroPassado;
					numeroRetrasado = numeroPassado;
					numeroPassado = matrizFibonacci[i][j];
				}
				System.out.print("\t" + matrizFibonacci[i][j]);
			}
		}
	}
}
