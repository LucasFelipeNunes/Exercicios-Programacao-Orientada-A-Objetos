/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 2) Se a mãe natureza pudesse criar um programa em Java para criar plantas de uma
floresta e as plantas sendo conhecidas por seus nomes e especie, podendo ser de 3 tipos:

Arvore, que pode ou não ser frutifera;
Flor, que tem a cor dos suas flores; e
Carnívora, que pode ou não ser venenosa.

Como seria a criação de uma floresta?
Criar uma classe para criar uma floresta (main). Nesta classe deverá haver um menu
para cadastrar plantas, listar plantas, mostrar quantidade de plantas na floresta e
mostrar a quantidade de plantas de cada tipo (Arvore, Flor e Carnívora)*/
import java.util.Scanner;

public class Lista5Exercicio2{
    public static void main(String[] args){
		Arvore[] arvore = new Arvore[10];
		Flor[] flor = new Flor[10];
		Carnivora[] carnivora = new Carnivora[10];
		
		Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);
		int opcao = 0;
		int[] qtd = new int[3];
		String tipoPlanta;
		
		do{
			System.out.print("\nMENU DA MAE NATUREZA\n0 - Sair\n1 - Cadastrar plantas\n2 - Listar plantas\n3 - Mostrar quantidade de plantas\n4 - Mostrar quantidade de plantas por tipo\n\nDigite aqui: ");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1:
					System.out.print("Digite se o tipo da planta e arvore (a), flor (f) ou carnivora (c): ");
					tipoPlanta = lerString.nextLine();
					
					if(tipoPlanta.equalsIgnoreCase("f") || tipoPlanta.equalsIgnoreCase("c") || tipoPlanta.equalsIgnoreCase("a")){
						System.out.print("Digite o nome do animal: ");
						String nome = lerString.nextLine();
						
						System.out.print("Digite a especie do animal: ");
						String especie = lerString.nextLine();
						
						if(tipoPlanta.equalsIgnoreCase("a")){
							System.out.print("Digite se a arvore e frutifera ou nao (S/N): ");
							String eFrutifera = lerString.nextLine();
							
							arvore[qtd[0]] = new Arvore(nome, especie, eFrutifera.equalsIgnoreCase("s"));
							
							qtd[0]++;
						} else if(tipoPlanta.equalsIgnoreCase("c")){
							System.out.print("Digite se a planta e carnivora ou nao (S/N): ");
							String eCarnivora = lerString.nextLine();
							
							carnivora[qtd[1]] = new Carnivora(nome, especie, eCarnivora.equalsIgnoreCase("s"));
							
							qtd[1]++;
						} else{
							System.out.print("Digite qual a cor da flor: ");
							String cor = lerString.nextLine();
							
							flor[qtd[2]] = new Flor(nome, especie, cor);
							
							qtd[2]++;
						}
					}
					break;
					
				case 2:
					System.out.println("Plantas cadastradas:");
					for (int i = 0; i < 3; i++){
						for (int j = 0;j < qtd[i]; j++){
							System.out.println(i == 0 ? arvore[j].getNome() : i == 1 ? carnivora[j].getNome() : flor[j].getNome());
						}
					}
					break;
					
				case 3:
					System.out.println("Existem " + (qtd[0] + qtd[1] + qtd[2]) + " plantas cadastradas.");
					break;
					
				case 4:
					System.out.println("Quantidade de Arvores: " + qtd[0] + "Quantidade de Carnivoras: " + qtd[1] + "Quantidade de Flores:" + qtd[2]);
					break;
			}
		}while(opcao != 0);
	}
}
