/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 7) [POO-020] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que
receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor
Comum) destes números fornecidos.
Entrada: 					Saída: 		Cálculo:
Entre com um valor: 10 		MDC: 10 	10, 20 | 2 [√]
Entre com outro valor: 20 				5, 10 | 2 [x]
										5, 5 | 5 [√]
										1, 1 | 1 * 2 * 5 = 10
										
Entre com um valor: 162 	MDC: 18 	162, 90 | 2 [√]
Entre com outro valor: 90 				81, 45 | 3 [√]
										27, 15 | 3 [√]
										9, 5 | 3 [x]
										3, 5 | 3 [x]
										1, 5 | 5 [x]
										1, 1 | 1 * 2 * 3 * 3 = 18

Entre com um valor: 23 		MDC: 1 		23, 21 | 3 [x]
Entre com outro valor: 21 				23, 7 | 7 [x]
										23, 1 | 23 [x]
										1, 1 | 1 = 1*/
import java.util.Scanner;
public class Lista3Exercicio07{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um valor: ");
		int valor1 = ler.nextInt();
		System.out.print("Entre com outro valor: ");
		int valor2 = ler.nextInt();
		System.out.print("MDC: " + MDC(valor1, valor2));
	}
	static int MDC(int valor1, int valor2){
		int MDC = 1;
		for (int i = 2; valor1 > 1 || valor2 > 1; i++)
		{
			boolean isPrimo = true;
			for (int j = 2; j < i; j++)
			{
				if(i % j == 0){
					isPrimo = false;
				}
			}
			if(isPrimo){
				if(valor1 % i == 0) valor1 /= i;
				if(valor2 % i == 0) valor2 /= i;
				if(valor1 % i == 0 || valor2 % i == 0){
					MDC *= i;
					System.out.print(" " + i);
				}
			}
		}
		return MDC;
	}
}
