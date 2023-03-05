/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 8) 2) Escreva um programa em Java para geral aleatoriamente os elementos
(menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
gerada e imprimir a matriz em ordem invertida.*/
public class Lista0Exercicio02{
	public static void main (String[] args) {
		int[][] B = new int[6][3];
		System.out.print("Matriz B gerada:");
		for (int i = 0; i < B.length; i++)
		{
			System.out.println();
			for (int j = 0; j < B[i].length; j++)
			{
				B[i][j] = (int)(Math.random() * 100);
				System.out.print(" " + B[i][j]);
			}
			
		}
		System.out.print("\nMatriz B em ordem invertida:");
		for (int i = B.length - 1; i >= 0; i--)
		{
			System.out.println();
			for (int j = B[i].length - 1; j >= 0; j--)
			{
				System.out.print(" " + B[i][j]);
			}
		}
	}
}
