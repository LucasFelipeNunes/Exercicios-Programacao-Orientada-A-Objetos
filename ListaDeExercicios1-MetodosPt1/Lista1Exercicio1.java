/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 1) [POO-001] Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é
positivo ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de
entrada) e informe se ele é positivo ou negativo através de um retorno do tipo boolean. Assuma o número
zero como positivo. Declare como: boolean isPositivo(double num)
*/
import java.util.Scanner;
public class Lista1Exercicio1{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero:\t");
		System.out.print("O numero digitado e " + (isPositivo(ler.nextDouble()) ? "positivo." : "negativo."));
	}
	static boolean isPositivo(double num){
		return num >= 0;
	}
}
