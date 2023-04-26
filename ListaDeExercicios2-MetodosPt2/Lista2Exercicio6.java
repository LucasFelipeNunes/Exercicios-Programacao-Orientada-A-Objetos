/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 6) [POO-011] Crie um programa que solicite ao usuário números inteiros. A cada número inserido,
perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o
menor dos valores.

Entrada: 								Saída:
	Entre com um número inteiro: 8 			O menor é: 2
	Inserir outro [s/n]: s
	Entre com um número inteiro: 2
	Inserir outro [s/n]: n

	Entre com um número inteiro: -48 		O menor é: -48
	Inserir outro [s/n]: n

	Entre com um número inteiro: 17 		O menor é: 17
	Inserir outro [s/n]: s
	Entre com outro número inteiro: 17
	Inserir outro [s/n]: s
	Entre com outro número inteiro: 34
	Inserir outro [s/n]: n

Referências: POO-007 e POO-009.*/

import java.util.Scanner;

public class Lista2Exercicio6 {
	
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);

        double menorValor = Double.MAX_VALUE;

        String resposta = "s";

        while (resposta.equals("s")) {
			
            System.out.print("Entre com um numero inteiro: ");
            menorValor = Math.min(ler.nextDouble(), menorValor);

            System.out.print("Inserir outro [s/n]: ");
            resposta = lerString.next();
            
        }
        
        System.out.print("O menor e: " + menorValor);

    }
}
