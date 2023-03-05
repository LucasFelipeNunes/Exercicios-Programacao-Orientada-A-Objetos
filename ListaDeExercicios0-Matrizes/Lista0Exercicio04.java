/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 4) Escreva um programa em Java para ler uma matriz D de dimensão N x M,
onde N e M não poderem ser menores que um. Gerar os elementos
aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios. O programa efetuar todas as
validações. Lembre-se de aproveitar os recursos da linguagem Java para
facilitar as validações*/
import java.util.Scanner;
public class Lista0Exercicio04{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0, valorMaximo = 0;
		do{
			System.out.print("Digite o valor da dimensao N:\t");
			N = ler.nextInt();
			if(N < 1) System.out.print("Valor invalido. ");
		}while(N < 1);
		do{
			System.out.print("Digite o valor da dimensao M:\t");
			M = ler.nextInt();
			if(M < 1) System.out.print("Valor invalido. ");
		}while(M < 1);
		int[][] D = new int[N][M];
		do{
			System.out.print("Digite o valor maximo que pode ser gerado na matriz D:\t");
			valorMaximo = ler.nextInt();
			if(valorMaximo < 1) System.out.print("Valor invalido. ");
		}while(valorMaximo < 1);
		System.out.print("A matriz D gerada foi:");
		for (int i = 0; i < D.length; i++)
		{
			System.out.println();
			for (int j = 0; j < D[i].length; j++)
			{
				D[i][j] = (int) (Math.random() * valorMaximo);
				System.out.print("\t" + D[i][j]);
			}
		}
	}
}
