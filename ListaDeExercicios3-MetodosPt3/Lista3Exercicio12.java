/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 12) [POO-025] Crie um programa que solicite ao usuário um número inteiro. Utilizando métodos, exiba a
sequência dos números perfeito até o número informado.
Entrada: 					Saída:
Entre com um número: 10 	>> 6
Entre com um número: 50 	>> 6 28
Entre com um número: -4 	Erro! Valor inválido.
Entre com um número: 0 		Erro! Valor inválido.*/
import java.util.Scanner;
public class Lista3Exercicio12{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um numero: ");
		int numero = ler.nextInt();
		if(numero > 0){
			System.out.print(">>");
			sequenciaPerfeitos(numero);
		}
		else{
			System.out.print("Erro! Valor invalido.");
		}
	}
	static void sequenciaPerfeitos(int numero){
		for(int i = 6;i <= numero;i++){
			int somaDivisores = 1;
			for(int j = 2;j <= i / 2; j++){
				if(i % j == 0){
					somaDivisores += j;
				}
			}
			if(somaDivisores == i){
				System.out.print(" " + i);
			}
		}
	}
}
