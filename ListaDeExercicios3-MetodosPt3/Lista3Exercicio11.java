/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 11) [POO-024] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
receba esse número inteiro como parâmetro de entrada, verifique e retorne um valor boolean, que
indicará, caso true que ele é um número perfeito, caso false, que não é.
Entrada: 					Saída:
Entre com um número: 6 		O número 6 é perfeito
Entre com um número: 11 	O número 11 não é perfeito
Entre com um número: -4 	Erro! Valor inválido.
Entre com um número: 0 		Erro! Valor inválido.*/
import java.util.Scanner;

public class Lista3Exercicio11{

    public static void main (String args[]){

        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
		int numero = ler.nextInt();

        System.out.print(numero > 0 ? ("O numero " + numero + (isPerfeito(numero) ? " " : " nao ") + "e perfeito") : "Erro! Valor invalido.");

    }

    static boolean isPerfeito(int numero){

        int somaDivisores = 0;

        for(int i = 1; i <= numero / 2; i++){

            if(numero % i == 0){
				somaDivisores += i;
			}

        }

        return somaDivisores == numero;

    }

}