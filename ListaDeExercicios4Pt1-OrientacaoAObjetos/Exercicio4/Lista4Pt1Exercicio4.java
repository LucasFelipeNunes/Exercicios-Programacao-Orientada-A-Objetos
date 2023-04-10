import java.util.Scanner;
public class Lista4Pt1Exercicio4{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		Data data = new Data();
		System.out.print("Digite o dia: ");
		data.setDia(ler.nextInt());
		System.out.print("Digite o mes: ");
		data.setMes(ler.nextInt());
		System.out.print("Digite o ano: ");
		data.setAno(ler.nextInt());
		System.out.print("Dia: " + data.getDia() + "\nMes: " + data.getMes() + "\nAno: " + data.getAno() + "\nA data " + (data.isValida() ? "e" : "nao e") + " valida.\n");
		if(data.isValida()){
			data.mostrarData();
		}
	}
}
