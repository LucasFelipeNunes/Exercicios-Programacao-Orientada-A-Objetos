/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 4) [POO-009] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que
receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores.

Restrição: USAR o pacote Math, em específico, o método min().

Entrada: 								Saída:
	Entre com um número inteiro: 8 			O menor é: 2
	Entre com outro número inteiro: 2

	Entre com um número inteiro: -48 		O menor é: -48
	Entre com outro número inteiro: 48

	Entre com um número inteiro: 17 		O menor é: 17
	Entre com outro número inteiro: 17*/
	
import java.util.Scanner;

public class Lista2Exercicio4 {
	
	public static void main (String args[]) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com um numero inteiro: ");
		int numero1 = ler.nextInt();

		System.out.print("Entre com outro numero inteiro: ");
		int numero2 = ler.nextInt();

		System.out.print((numero1 == numero2) ? "Os dois numeros sao iguais" : "O menor e: " + menorValor(numero1, numero2));

	}

	static int menorValor(int numero1, int numero2) {
		
		return Math.min(numero1, numero2);
	
	}
}
