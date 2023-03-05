/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 7) Escreva um programa em Java para gerar uma matriz E de dimensão N x M, deter-
minar e imprimir o maior e o menor elemento deste conjunto, informando a posição
dos mesmos.*/
import java.util.Scanner;
public class Lista0Exercicio07{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double N = 0, M = 0, menorValor = 0, maiorValor = 0;
		String posicaoMenorValor = "", posicaoMaiorValor = ""; 
		do{
			System.out.print("Digite a dimensao inteira e positiva N de elementos na linha da matriz a ser digitada:\t");
			N = ler.nextDouble(); 
			if((N*10)%10 != 0 || N <= 0){
				System.out.print("Valor invalido. ");
			}
		}while((N*10)%10 != 0 || N <= 0);
		do{
			System.out.print("Digite a dimensao inteira e positiva M de elementos na coluna da matriz a ser digitada:\t");
			M = ler.nextDouble();
			if((M*10)%10 != 0 || M <= 0){
				System.out.print("Valor invalido. ");
			}
		}while((M*10)%10 != 0 || M <= 0);
		System.out.println("Vetor E gerado:\t");
		double[][] E = new double[(int)N][(int)M];
		for (int i = 0; i < N; i++){
			System.out.println();
			for (int j = 0; j < M; j++){
				E[i][j] = Math.random() * 20;
				System.out.print("\t" + E[i][j]);
				if(menorValor > E[i][j] || (j == 0 && i == 0)){
					menorValor = E[i][j];
					posicaoMenorValor = i + ", " + j;
				}
				if(maiorValor < E[i][j] || (j == 0 && i == 0)){
					maiorValor = E[i][j];
					posicaoMaiorValor = i + ", " + j;
				}
			}
		}
		System.out.print("\n\nO menor valor gerado foi [" + menorValor + "], na posicao " + posicaoMenorValor + "\nO maior valor digitado foi [" + maiorValor + "], na posicao " + posicaoMaiorValor);
	}
}
