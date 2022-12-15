/*Nome: Lucas Felipe da Silva Nunes
11) Escreva um programa em Java
para gerar uma matriz quadrada K de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa).*/
import java.util.Scanner;
public class Lista0Exercicio11{
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		double N = 0;
		do{
			System.out.print("Digite a dimensao inteira e positiva N da matriz quadrada K:\t");
			N = ler.nextDouble();
			if((N*10)%10 != 0 || N <= 0){
				System.out.print("Valor invalido. ");
			}
		}while((N*10)%10 != 0 || N <= 0);
		double[][] K = new double[(int)N][(int)N];
		System.out.print("Elementos abaixo da diagonal principal:");
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				K[i][j] = Math.random() * 20;
			}
		}	
		for (int i = 0; i < N - 1; i++)
		{
			System.out.print("\t" + K[i + 1][i]);
		}
	}
}
