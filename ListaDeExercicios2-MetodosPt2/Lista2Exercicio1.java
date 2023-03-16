/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 1) [POO-006] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que
receba esses 2 números como parâmetros de entrada, verifique e retorne o maior dos dois valores.
Restrição: NÃO usar o pacote Math.*/
import java.util.Scanner;
public class Lista2Exercicio1{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um numero inteiro: ");
		int n1 = ler.nextInt();
		System.out.print("Entre com outro numero inteiro: ");
		int n2 = ler.nextInt();
		System.out.print("O maior e: " + maior(n1,n2));
	}
	static int maior(int n1, int n2){
		return (n1 > n2 ? n1 : n2);
	}
}
