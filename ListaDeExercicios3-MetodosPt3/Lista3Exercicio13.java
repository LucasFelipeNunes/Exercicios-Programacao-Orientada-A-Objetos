/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 13) [POO-026] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada. Este
método deverá retornar, apenas, os números perfeitos existentes no conjunto recebido.
Entrada: 								Saída:
Entre com a quantidade de termos: 4 	>> 496 28
Entre com 1º número: 31
Entre com 2º número: 72
Entre com 3º número: 496
Entre com 4º número: 28

Entre com a quantidade de termos: 3 	>> 6
Entre com 1º número: 5
Entre com 2º número: 6
Entre com 3º número: 7

Entre com a quantidade de termos: -5 	Erro! Valor inválido.

Entre com a quantidade de termos: 0 	Erro! Valor inválido*/

import java.util.Scanner;

public class Lista3Exercicio13{

    public static void main (String args[]){

        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com a quantidade de termos: ");
		int qtdTermos = ler.nextInt();

        if(qtdTermos <= 0){
			System.out.print("Erro! Valor invalido.");
		}

        else{
            int[] numeros = new int[qtdTermos];

            for (int i = 0; i < numeros.length; i++){

                System.out.print("Entre com " + (i + 1) + "º numero: ");
                numeros[i] = ler.nextInt();

            }

            int[] numerosPerfeitos = verificaNumerosPerfeitos(numeros);

            System.out.print("Numeros perfeitos encontrados: ");

            for (int i = 0; i < numerosPerfeitos.length; i++) {

                System.out.print(numerosPerfeitos[i] + " ");

            }

        }

    }

    public static int[] verificaNumerosPerfeitos(int[] numeros) {

        int[] numerosPerfeitos = new int[numeros.length];

        int qtdPerfeitos = 0, somaDivisores = 0;

        for (int i = 0; i < numeros.length; i++) {

            somaDivisores = 0;

            for(int j = 1;j <= numeros[i] / 2; j++){

                if(numeros[i] % j == 0){
                    somaDivisores += j;
				}

            }

            if (somaDivisores == numeros[i]) {
                numerosPerfeitos[qtdPerfeitos] = numeros[i];

                qtdPerfeitos++;
            }

        }

        int[] resultado = new int[qtdPerfeitos];

        for (int i = 0; i < resultado.length; i++) {

            resultado[i] = numerosPerfeitos[i];

        }

        return resultado;

    }    

}