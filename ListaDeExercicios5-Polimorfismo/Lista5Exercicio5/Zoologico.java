/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 5) Criar um projeto para cadastrar os animais de um zoológico.

Os animais são conhecidos por seus nomes e especie. Eles podem ser de 3 tipos
Voador, que tem a cor da pena, terrestres, que tem a quantidade de patas e aquáticos,
que podem ou não respirar fora da água.

No zoológico cada animal tem seu habitat. Os habitats do zoológico são cinco, pré-
definidos: jaula, gaiola, aquário, lago e viveiro. Cada habitat tem uma área e está
localizada em um local do zoológico.

A área é representada pela relação entre Comprimento e Largura.

Criar uma classe para testar todo o zoológico (main). Nesta classe deverá haver um
menu para Cadastrar animais, Listar animais, Quantidade de animais no Zoo, Quantidade de animais de cada tipo (Voador, Terrestre e Aquático), Quantidade de
animais por tipo de habitat e Area total que os animais ocupam.*/

import java.util.Scanner;

public class Zoologico{
	public static void main(String[] args){
		Habitat jaula = new Habitat(20, 50);
		Habitat gaiola = new Habitat(10,10);
		Habitat aquario = new Habitat(5,2);
		Habitat lago = new Habitat(50,50);
		Habitat viveiro = new Habitat(20,20);
		
		Voador[] voador = new Voador[10];
		Terrestre[] terrestre = new Terrestre[10];
		Aquatico[] aquatico = new Aquatico[10];
		
		Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);
		int opcao = 0;
		String tipoAnimal, respiraForaDaAgua;
		int[] qtd = new int[3];
		
		do{
			System.out.print("MENU DO ZOO\n\n0 - Sair\n1 - Cadastrar animais\n2 - Listar animais\n3 - Quantidade de animais no Zoo\n4 - Quantidade de animais por tipo\n5 - Quantidade de animais por tipo de habitat\n6 - Area total ocupada\n\nDigite aqui: ");
			opcao = ler.nextInt();
			
			switch(opcao){
				
				case 1:
					System.out.print("Digite se o tipo do animal e voador (v), terrestre (t) ou aquatico (a): ");
					tipoAnimal = lerString.nextLine();
					
					if(tipoAnimal.equalsIgnoreCase("v") || tipoAnimal.equalsIgnoreCase("t") || tipoAnimal.equalsIgnoreCase("a")){
						System.out.print("Digite o nome do animal: ");
						String nome = lerString.nextLine();
						
						System.out.print("Digite a especie do animal: ");
						String especie = lerString.nextLine();
						
						System.out.print("Digite se o habitat do animal e jaula (j), gaiola (g), aquario (a), lago (l) ou viveiro (v): ");
						String habitat = lerString.nextLine();
						
						switch(habitat){
							case "j":
								jaula.incrementaQtd();
								break;
								
							case "g":
								gaiola.incrementaQtd();
								break;
							
							case "a":
								aquario.incrementaQtd();
								break;
							
							case "l":
								lago.incrementaQtd();
								break;
							
							case "v":
								viveiro.incrementaQtd();
								break;
						}
						
						if(tipoAnimal.equalsIgnoreCase("v")){
							voador[qtd[0]] = new Voador();
							voador[qtd[0]].setNome(nome);
							voador[qtd[0]].setEspecie(especie);
							
							System.out.print("Digite a cor da pena: ");
							voador[qtd[0]].setCorDaPena(lerString.nextLine());
							
							qtd[0]++;
							
						} else if(tipoAnimal.equalsIgnoreCase("t")){
							terrestre[qtd[1]] = new Terrestre();
							terrestre[qtd[1]].setNome(nome);
							terrestre[qtd[1]].setEspecie(especie);
							
							System.out.print("Digite a quantidade de patas: ");
							terrestre[qtd[1]].setQtdPatas(ler.nextInt());
							
							qtd[1]++;
						} else{
							aquatico[qtd[2]] = new Aquatico();
							aquatico[qtd[2]].setNome(nome);
							aquatico[qtd[2]].setEspecie(especie);
							
							System.out.print("Digite se o animal respira fora d'agua (S/N): ");
							respiraForaDaAgua = lerString.nextLine();
							
							if(respiraForaDaAgua.equalsIgnoreCase("s")){
								aquatico[qtd[2]].setRespiraForaDaAgua(true);
							} else if(respiraForaDaAgua.equalsIgnoreCase("n")){
								aquatico[qtd[2]].setRespiraForaDaAgua(false);
							}
							
							qtd[2]++;
						}
					}
					break;
					
					case 2:
						System.out.println("Animais cadastrados: ");
						for (int i = 0; i < 3; i++){
							for (int j = 0; j < qtd[i]; j++){
								System.out.println(i == 0 ? voador[j].getNome() : i == 1 ? terrestre[j].getNome() : aquatico[j].getNome());
							}
						}
						break;
						
					case 3:
						System.out.println("Existem " + (qtd[0] + qtd[1] + qtd[2]) + " animais cadastrados.");
						break;
						
					case 4:
						System.out.println("Quantidade de animais voadores: " + qtd[0] + "\nQuantidade de animais terrestres: " + qtd[1] + "\nQuantidade de animais aquaticos: " + qtd[2]);
						break;
						
					case 5:
						System.out.print("Quantidade de jaulas: " + jaula.getQtd() + "\nQuantidade de gaiolas: " + gaiola.getQtd() + "\nQuantidade de aquarios: " + aquario.getQtd() + "\nQuantidade de lagos: " + lago.getQtd() + "\nQuantidade de viveiros: " + viveiro.getQtd());
						break;
						
					case 6:
						System.out.print("A area total ocupada e " + (jaula.calcularArea() + gaiola.calcularArea() + aquario.calcularArea() + lago.calcularArea() + viveiro.calcularArea()));
			}
		}while(opcao != 0);
	}
}
