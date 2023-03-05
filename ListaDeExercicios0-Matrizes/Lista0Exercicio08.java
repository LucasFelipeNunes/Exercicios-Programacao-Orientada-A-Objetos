/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 8) Escreva um programa em Java para gerar uma matriz F (N x M). Criar os
vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da
matriz. Imprimir a matriz e os vetores. Validar para caso não haja uma das
duas possibilidades (sem elementos pares ou ímpares).*/
import java.util.Scanner;
public class Lista0Exercicio08{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double N = 0, M = 0;
		int qtdPares = 0, qtdImpares = 0, contadorPar = 0, contadorImpar = 0;
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
		System.out.println("Matriz F gerada:\t");
		int[][] F = new int[(int)N][(int)M];
		for (int i = 0; i < N; i++){
			System.out.println();
			for (int j = 0; j < M; j++){
				F[i][j] = (int)(Math.random() * 20);
				System.out.print("\t" + F[i][j]);
				if(F[i][j] % 2 == 0) qtdPares++;
				else qtdImpares++;
			}
		}
		if(qtdPares == 0) System.out.print("\nNao ha elementos pares nesta matriz");
		else{
			System.out.print("\nVetor PAR gerado:\t");
			int[] PAR = new int[qtdPares];
			for (int i = 0; i < F.length; i++){
				for (int j = 0; j < F.length; j++)
				{
					if(F[i][j] % 2 == 0){
						PAR[contadorPar] = F[i][j];
						System.out.print(" " + PAR[contadorPar]);
						contadorPar++;
					}
				}
			}
		}
		if(qtdImpares == 0) System.out.print("\nNao ha elementos impares nesta matriz");
		else{
			System.out.print("Vetor IMPAR gerado:\t");
			int[] IMPAR = new int[qtdImpares];
			for (int i = 0; i < F.length; i++){
				for (int j = 0; j < F.length; j++)
				{
					if(F[i][j] % 2 == 1){
						IMPAR[contadorImpar] = F[i][j];
						System.out.print(" " + IMPAR[contadorImpar]);
						contadorImpar++;
					}
				}
			}
		}
	}
}
