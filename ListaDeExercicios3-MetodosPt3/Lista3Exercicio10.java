/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 10) [POO-023] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
calcule e retorne o MMC (Mínimo Múltiplo Comum) desse conjunto de dados. Valide as entradas para
aceitar apenas números positivos (pode ser um método). Utilize decomposição simultânea ou fatoração
simultânea.
Entrada: 								Saída: 					Cálculo:
Entre com a quantidade de termos: 4 	MMC: 600 				40, 50, 30, 20 | 2
Entre com 1º número: 40 										20, 25, 15, 10 | 2
Entre com 2º número: 50 										10, 25, 15, 5 | 2
Entre com 3º número: 30 										5, 25, 15, 5 | 3
Entre com 4º número: 20 										5, 25, 5, 5 | 5
																1, 5, 1, 1 | 5
																1, 1, 1, 1 | 2 * 2 * 2 * 3 * 5 * 5 = 600

Entre com a quantidade de termos: 3 	MMC: 540 				45, 27, 36 | 2
Entre com 1º número: 45 										45, 27, 18 | 2
Entre com 2º número: 27 										45, 27, 9 | 3
Entre com 3º número: 36 										15, 9, 3 | 3
																5, 3, 1 | 3
																5, 1, 1 | 5
																1, 1, 1 | 1 * 2 * 2 * 3 * 3 * 3 * 5 = 540

Entre com a quantidade de termos: 2 	MMC: 8					8, 4 | 2
Entre com 1º número: 8 											4, 2 | 2
Entre com 2º número: 4 											2, 1 | 2
																1, 1 | 2 * 2 * 2 = 8

Entre com a quantidade de termos: 1 	Erro! Valor inválido.

Entre com a quantidade de termos: 0

Entre com a quantidade de termos: -7 	Erro! Valor inválido.*/

import java.util.Scanner;

public class Lista3Exercicio10{

    public static void main (String args[]){

        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com a quantidade de termos: ");
		int qtdTermos = ler.nextInt();

		if(validaQuantidade(qtdTermos)){

            int[] numeros = new int[qtdTermos];

            for (int i = 0; i < numeros.length; i++){
				
                do{
				
                    System.out.print("Entre com " + (i + 1) + "º numero: ");
					numeros[i] = ler.nextInt();
				
                    if(numeros[i] <= 0){
                        System.out.print("Valor invalido. ");
                    }
				
                }while(numeros[i] <= 0);

			}
			
            System.out.print("MMC: " + MMC(numeros));
		
        }
	
    }
	
    static boolean validaQuantidade(int qtdTermos){
        return !(qtdTermos <= 1);
	}

	static int MMC(int[] numeros){
	
        int MMC = 1, divisor = 2, contador = 0;
    
        while (contador != numeros.length) {
    
            contador = 0;
    
            boolean isDivisivel = false;
    
            for (int i = 0; i < numeros.length; i++) {
    
                if (numeros[i] == 1) {
                    contador++;
                }
    
                else if (numeros[i] % divisor == 0) {
    
                    isDivisivel = true;
    
                    numeros[i] /= divisor;
    
                }
    
            }
    
            if (isDivisivel) {
                MMC *= divisor;
            }
    
            else {
                divisor++;
            }
    
        }
    
        return MMC;
	
    }

}