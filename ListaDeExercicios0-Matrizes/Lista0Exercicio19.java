/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 19) Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
Imprimir os elementos da "asa da borboleta".*/
import java.util.Scanner;
public class Lista0Exercicio19{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
        System.out.print("Digite a dimensão N: ");
        int dimensaoN = ler.nextInt();
        int[][] matrizS = new int[N][N];
        for(int i = 0; i < S.length; i++) {
            for(int j = 0; j < S[i].length; j++) {
                S[i][j] = (int) (Math.random() * 10);
                System.out.print(((i == j || i == S.length - j - 1 || j == 0 || j == S.length - 1) ? S[i][j] + " " : " "));
            }
            System.out.println();
        }
	}
}
