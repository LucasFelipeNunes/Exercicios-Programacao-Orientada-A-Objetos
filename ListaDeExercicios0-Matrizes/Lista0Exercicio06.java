/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 4) Escreva um programa em Java para ler uma matriz D de dimensão N x M,
onde N e M não poderem ser menores que um. Gerar os elementos
aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios. O programa efetuar todas as
validações. Lembre-se de aproveitar os recursos da linguagem Java para
facilitar as validações*/
import java.util.Scanner;
public class Lista0Exercicio06{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0, valorDigitado = 0;
		boolean temNaMatriz = false;
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
		int[][] matriz = new int[N][M];
		do{
			System.out.print("Digite um valor menor que 25:\t");
			valorDigitado = ler.nextInt();
			if(valorDigitado < 0 || valorDigitado >= 25) System.out.print("Valor invalido. ");
		}while(valorDigitado < 0 || valorDigitado >= 25);
		System.out.print("A matriz gerada foi:");
		for (int i = 0; i < matriz.length; i++)
		{
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++)
			{
				matriz[i][j] = (int) (Math.random() * 25);
				System.out.print("\t" + matriz[i][j]);
				if(matriz[i][j] == valorDigitado) temNaMatriz = true;
			}
		}
		System.out.print("\n\nO valor digitado" + ((temNaMatriz) ? " " : " nao ") + "esta na matriz");
	}
}
