/*Nome: Lucas Felipe da Silva Nunes
14) [POO-027] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
receba esse número inteiro como parâmetro de entrada, inverta dígito-a-dígito e retorne um valor inteiro
com o número invertido.
Entrada:					Saída:
Entre com um número: 12 	>> 21
Entre com um número: 430 	>> 34
Entre com um número: -27 	>> -72
Entre com um número: 0 		>> 0*/
import java.util.Scanner;
public class Lista3Exercicio14{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um numero: ");
		int numero = ler.nextInt();
		System.out.print(">> " + inverterNumero(numero));
	}
	static int inverterNumero(int numero){
		int numeroInvertido = 0;
        while(numero != 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero = numero / 10;
        }
		return numeroInvertido;
	}
}
