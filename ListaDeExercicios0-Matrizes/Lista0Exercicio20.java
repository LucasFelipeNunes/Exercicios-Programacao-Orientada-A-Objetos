/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 20) Escreva um programa emJava para gerar uma matriz quadrada T de di-
mensão N. Imprimir os elementos da "ampulheta"*/
import java.util.Scanner;
public class Lista0Exercicio20{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
        System.out.print("Digite a dimensão N da matriz: ");
        int N = ler.nextInt();
        int[][] T = new int[N][N];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = (int) (Math.random() * 10);
                if (i == j || i == T.length - j - 1 || i == 0 || i == T.length - 1) 
                {
                    System.out.print(T[i][j] + " ");
                } 
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	}
}
