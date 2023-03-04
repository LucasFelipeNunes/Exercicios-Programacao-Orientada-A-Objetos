/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 30) Item ao exercício anterior, mas utilizando a sequencia de Fibonacci.*/
import java.util.Scanner;
import java.util.Arrays;
public class Lista0Exercicio30{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int valor = 0, numeroPassado = 1, numeroRetrasado = 0;
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
		System.out.print("\nMatriz gerada:");
		for (int i = 0; i < matriz.length; i++)
		{
			System.out.print("\n" + matriz[i][0]);
			for(int j = 1; j < matriz[i].length; j++)
			{
				if(j > 2){
					matriz[i][j] = numeroPassado + numeroRetrasado;
					numeroRetrasado = numeroPassado;
					numeroPassado = matriz[i][j];
				}
				System.out.print("\t" + ((j == 1) ? numeroRetrasado : (j == 2) ? numeroPassado : matriz[i][j]));
			}
			numeroPassado = 1;
			numeroRetrasado = 0;
		}
		
	}
}
