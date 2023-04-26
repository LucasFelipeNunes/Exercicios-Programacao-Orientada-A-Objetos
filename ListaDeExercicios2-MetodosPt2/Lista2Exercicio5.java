/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 5) [POO-010] Crie um programa que solicite ao usuário três números inteiros. Através de um método, que
receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores.

Restrição: USAR a técnica de sobrecarga para o método, um com 2 e outro com 3 parâmetros.

Entrada: 									Saída:
	Entre com um número inteiro: 8 				O maior é: 8
	Entre com outro número inteiro: 2
	Entre com mais um número inteiro: 5

	Entre com um número inteiro: -48 			O maior é: 48
	Entre com outro número inteiro: 48
	Entre com mais um número inteiro: 1

	Entre com um número inteiro: 17 			O maior é: 17
	Entre com outro número inteiro: 17
	Entre com mais um número inteiro: 17

Referências: POO-006 e POO-008*/

import java.util.Scanner;

public class Lista2Exercicio5 {
	
    public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com um numero inteiro: ");
        int numero1 = ler.nextInt();
        
        System.out.print("Entre com outro numero inteiro: ");
        int numero2 = ler.nextInt();

        System.out.print("Digite o terceiro numero inteiro");
        int numero3 = ler.nextInt();

		System.out.print((numero1 == numero2 && numero1 == numero3) ? "Os dois numeros sao iguais" : "O maior e: " + maiorValor(numero1, numero2, numero3));

    }

    static int maiorValor(int numero1, int numero2) {
		
        return Math.max(numero1, numero2);
    
    }

    static int maiorValor(int numero1, int numero2, int numero3) {
		
        return Math.max(numero1, Math.max(numero2, numero3));
        
    }
}
