/*Nome: Lucas Felipe da Silva Nunes
3) Escreva um programa em Java para
ler uma matriz C quadrada de dimensão N,
onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados
aleatoriamente (menor que 100).*/
import java.util.Scanner;
public class Lista0Exercicio03{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a dimensao N da matriz quadrada C, positivo mas menor ou igual a 20:\t");
			N = ler.nextInt();
			if(N > 20 || N < 1){
				System.out.print("Valor invalido. ");
			}
		}while(N > 20 || N < 1);
		int[][] C = new int[N][N];
		System.out.print("\nMatriz C:");
		for (int i = 0; i < N; i++)
		{
			System.out.println();
			for (int j = 0; j < N; j++)
			{
				C[i][j] = (int) (Math.random() * 100);
				System.out.print("\t" + C[i][j]);
			}
		}
	}
}

