/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 19) Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
Imprimir os elementos da "asa da borboleta".*/
import java.util.Scanner;
public class Lista0Exercicio19{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
        System.out.print("Digite a dimensão N da matriz: ");
        int N = ler.nextInt();
        int[][] S = new int[N][N];
        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < S[i].length; j++) {
                S[i][j] = (int) (Math.random() * 10);
                if (i == j || i == S.length - j - 1 || j == 0 || j == S.length - 1) 
                {
                    System.out.print(S[i][j] + " ");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
