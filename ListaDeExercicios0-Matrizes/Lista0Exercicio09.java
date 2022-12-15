/*Nome: Lucas Felipe da Silva Nunes
9) Escreva um programa em Java
para gerar uma matriz quadrada G de dimensão N.
Imprimir os elementos da diagonal principal (linha = coluna).*/
import java.util.Scanner;
public class Lista0Exercicio09{
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		double N = 0;
		do{
			System.out.print("Digite a dimensao inteira e positiva N da matriz quadrada G:\t");
			N = ler.nextDouble(); 
			if((N*10)%10 != 0 || N <= 0){
				System.out.print("Valor invalido. ");
			}
		}while((N*10)%10 != 0 || N <= 0);
		double[][] G = new double[(int)N][(int)N];
		System.out.print("Elementos da diagonal principal:");
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				G[i][j] = Math.random() * 20;
			}
		}	
		for (int i = 0; i < N; i++)
		{
			System.out.print("\t" + G[i][i]);
		}
	}
}
