/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 9) [POO-022] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que
receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MMC (Mínimo
Múltiplo Comum) destes números fornecidos. Utilize decomposição simultânea ou fatoração simultânea.
Entrada: Saída: Cálculo:
Entre com um valor: 10 		MMC: 20 	10, 20 | 2
Entre com outro valor: 20 				5, 10 | 2
										5, 5 | 5
										1, 1 | 2 * 2 * 5 = 20
										
Entre com um valor: 162 	MMC: 810 	162, 90 | 2
Entre com outro valor: 					90 81, 45 | 3
										27, 15 | 3
										9, 5 | 3
										3, 5 | 3
										1, 5 | 5
										1, 1 | 2 * 3 * 3 * 3 * 3 * 5 = 810
										
Entre com um valor: 23 		MMC: 483 	23, 21 | 3
Entre com outro valor: 21 				23, 7 | 7
										23, 1 | 23
										1, 1 | 3 * 7 * 23 = 483*/
import java.util.Scanner;
public class Lista3Exercicio09{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um valor: ");
		int valor1 = ler.nextInt();
		System.out.print("Entre com outro valor: ");
		int valor2 = ler.nextInt();
		System.out.print("MMC: " + MMC(valor1, valor2));
	}
	static int MMC(int valor1, int valor2){
		int MMC = 1;
		for (int i = 2; valor1 != 1 || valor2!= 1; i++)
		{
			boolean isPrimo = true;
			for (int j = 2; j < i; j++)
			{
				if(i % j == 0){
					isPrimo = false;
				}
			}
			if(isPrimo){
				while(valor1 % i == 0 || valor2 % i == 0){
					MMC *= i;
					if(valor1 % i == 0) valor1 /= i;
					if(valor2 % i == 0) valor2 /= i;
				}
			}
		}
		return MMC;
	}
}
