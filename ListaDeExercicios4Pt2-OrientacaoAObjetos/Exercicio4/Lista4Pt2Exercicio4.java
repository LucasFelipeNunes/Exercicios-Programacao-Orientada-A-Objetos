import java.util.Scanner;
public class Lista4Pt2Exercicio4{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		Numero numero = new Numero();
		System.out.print("Digite um numero: ");
		numero.setNumero(ler.nextInt());
		System.out.print("Este numero, invertido, e " + numero.inverter());
	}
}
