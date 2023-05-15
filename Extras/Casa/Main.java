import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);
		int qtdPortas = 0, opcao = 0, numeroPorta = 0;
		String cor;
		Casa casa;
		System.out.print("Voce deseja construir uma casa padrao?\nDigite aqui (s/n): ");
		if(lerString.nextLine().equalsIgnoreCase("s")){
			casa = new Casa();
		}
		else{
			do{
				System.out.print("Digite a quantidade de portas da casa (entre 1 e 100): ");
				qtdPortas = ler.nextInt();

				if(qtdPortas <= 0 || qtdPortas > 100){
					System.out.print("Valor invalido. ");
				}

			}while(qtdPortas <= 0);

			do{
				System.out.print("Digite a cor da casa (branca, azul ou vermelha): ");
				cor = lerString.nextLine();

				if(!cor.equals("branca") && !cor.equals("azul") && !cor.equals("vermelha")){
					System.out.print("Cor invalida. ");
				}

			}while(!cor.equals("branca") && !cor.equals("azul") && !cor.equals("vermelha"));

			casa = new Casa(qtdPortas, cor);

			while(opcao != 6){
				System.out.println("\n1. Abrir porta\n2. Fechar porta\n3. Visualizar porta\n4. Trocar cor\n5. Visalizar cor\n6. Encerrar o programa\n");
				do{
					System.out.print("Escolha uma opcao: ");
					opcao = ler.nextInt();

					if(opcao < 1 || opcao > 6){
						System.out.print("Opcao invalida.");
					}
				}while(opcao < 1 || opcao > 6);
				if(opcao < 4){
					do{
						System.out.print("Escolha a porta: ");
						numeroPorta = ler.nextInt();

						if(numeroPorta <= 0 || numeroPorta >= qtdPortas){
							System.out.print("Porta inexistente. ");
						}
					}while(numeroPorta <= 0 || numeroPorta >= qtdPortas);

					switch(opcao){	
						case 1:
							if(casa.abrirPorta(numeroPorta - 1)){
								System.out.println("A porta " + numeroPorta + " foi aberta");
							} else {
								System.out.println("A porta " + numeroPorta + " ja esta aberta");
							}
							break;

						case 2:
							if(casa.fecharPorta(numeroPorta - 1)){
								System.out.println("A porta " + numeroPorta + " foi fechada");
							} else {
								System.out.println("A porta " + numeroPorta + " ja esta fechada");
							}
							break;

						case 3:
							System.out.println("A porta " + (casa.getPorta(numeroPorta - 1) ? "esta" : "nao esta") + " aberta.");
							break;
					}
				} else if(opcao == 4){
					System.out.print("Digite a cor que voce quer pintar: ");
					cor = lerString.nextLine();

					System.out.print("A cor da casa " + (casa.trocarCor(cor) ? "foi trocada" : "nao foi trocada (por estar com a mesma cor ou porque a cor e invalida)");
				} else if(opcao == 5){
					System.out.print("A cor da casa e " + casa.getCor());
				}
			}
		}
	}
}
