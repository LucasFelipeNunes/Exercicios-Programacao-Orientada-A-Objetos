import java.util.Scanner;
public class Lista4Pt1Exercicio8 {
	public static void main (String[] args) {
		int opcao = 0;
		Scanner ler = new Scanner(System.in);
		ConversaoDeUnidadesDeArea conversor = new ConversaoDeUnidadesDeArea();
		System.out.print("Opcoes de conversao\n\n1. Metros quadrados para pes quadrados\n2. Pes quadrados para cm quadrados\n3. Milhas quadradas para acres\n4. Acres para pes quadrados\n\n");
		do{
			System.out.print("Escolha uma opcao: ");
			opcao = ler.nextInt();
			if(opcao <= 0 || opcao > 4){
				System.out.print("Valor invalido. ");
			}
		}while(opcao <= 0 || opcao > 4);
		System.out.print("Digite o valor a ser convertido: ");
		switch(opcao){
			case 1:
				conversor.setMetroQuadrado(ler.nextDouble());
				break;
			case 2:
				conversor.setPeQuadrado(ler.nextDouble());
				break;
			case 3:
				conversor.setMilhaQuadrada(ler.nextDouble());
				break;
			default:
				conversor.setAcre(ler.nextDouble());
		}
		System.out.print("O valor digitado convertido e " + (opcao == 1 ? conversor.metroQuadradoParaPeQuadrado() + " pes quadrados." : opcao == 2 ? conversor.peQuadradoParaCmQuadrado() + " centimetros quadrados." : opcao == 3  ? conversor.milhaQuadradaParaAcre() + " acres." : conversor.acreParaPeQuadrado() + " pes quadrados."));
	}
}

