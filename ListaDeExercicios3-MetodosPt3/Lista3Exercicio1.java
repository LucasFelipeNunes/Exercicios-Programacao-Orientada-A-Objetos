/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 1)[POO-014] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit.O usuário
deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de
conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro 
de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a
fórmula F= (9 * C/5) + 32

Entrada:								Saída:
Entre com temperatura em Celsius: 0		A temperatura em Fahrenheit é: 32
Entre com temperatura em Celsius: 100	A temperatura em Fahrenheit é: 212
Entre com temperatura em Celsius: 30	A temperatura em Fahrenheit é: 86*/
import java.util.Scanner;
public class Lista3Exercicio1{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a temperatura em Celsius: ");
		double temperaturaCelsius = ler.nextDouble();
		System.out.print("A temperatura em Farenheit e " + conversaoFarenheit(temperaturaCelsius));
	}
	static double conversaoFarenheit(double temperaturaCelsius){
		return 9 * temperaturaCelsius / 5 + 32;
	}
}
