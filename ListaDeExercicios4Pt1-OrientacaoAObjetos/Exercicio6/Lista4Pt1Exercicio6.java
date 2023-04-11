import java.util.Scanner;
public class Lista4Pt1Exercicio6{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		TestaDatas testaDatas = new TestaDatas();
		System.out.print("Digite o dia da data 1: ");
		testaDatas.setDia1(ler.nextInt());
		System.out.print("Digite o mes da data 1: ");
		testaDatas.setMes1(ler.nextInt());
		System.out.print("Digite o ano da data 1: ");
		testaDatas.setAno1(ler.nextInt());
		System.out.print("Digite o dia da data 2: ");
		testaDatas.setDia2(ler.nextInt());
		System.out.print("Digite o mes da data 2: ");
		testaDatas.setMes2(ler.nextInt());
		System.out.print("Digite o ano da data 2: ");
		testaDatas.setAno2(ler.nextInt());
		System.out.print("Data 1\nDia: " + testaDatas.getDia1() + "\nMes: " + testaDatas.getMes1() + "\nAno: " + testaDatas.getAno1() + "\nData 2\nDia: " + testaDatas.getDia2() + "\nMes: " + testaDatas.getMes2() + "\nAno: " + testaDatas.getAno2() + "\nAs datas " + (testaDatas.areIguais() ? "sao" : "nao sao") + " iguais.\n");
		if(!testaDatas.areIguais()){
			System.out.print("A diferenca em dias entre as datas e aproximadamente " + testaDatas.diferencaEmDias() + " dias.");
		}
	}
}
