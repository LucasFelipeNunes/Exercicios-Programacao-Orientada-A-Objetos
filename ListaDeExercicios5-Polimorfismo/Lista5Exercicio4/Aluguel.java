/*Nome: Lucas Felipe da Silva Nunes
4) Criar um projeto para uma locadora. Esta locadora deve poder alugar filmes, livros
e jogos. O projeto deverá permitir o aluguel qualquer tipo de mídia citada
anteriormente. Uma mídia é alugada para um Cliente e o Cliente devolve a mídia
alugada. O cliente pode pagar no aluguel ou na devolução.

a. Escreva uma classe para representar a Mídia que será alugada. A mídia tem: um
código (int); uma descrição ou título (String); um tipo (String), que indica se é
um CD, DVD, Blu-ray, Brochura, Cartucho ou Digital; um gênero (String); e valor
(Double), que é o valor do aluguel.
b. Escreva uma classe para representar o Filme, que é filho da mídia. O filme terá:
uma classificação (String); e uma duração (int) em minutos.
c. Escreva uma classe para representar o Livro, que, também é filho de mídia. O
livro terá: um autor (String); uma editora (String); e uma edição (int).
d. Escreva uma classe para representar o Jogo, que, também é filho de mídia. O
jogo terá: console (String).
e. Escreva uma classe para representar um Cliente. O cliente terá: código (int);
nome (String); e idade (int).
f. Escrever uma classe para representar o aluguel. Uma mídia é alugada para um
cliente. Um cliente pode devolver uma mídia alugada. O aluguel pode ser pago
no início ou no fim do processo. O dono da locadora deseja saber quanto ele
recebeu e o cliente quanto tem para pagar.
* 
Faça todas as adaptações necessárias para que o aluguel e a devolução funcionem.
Use vetores de objetos para alugar e devolver.*/

import java.util.Scanner;

public class Aluguel{
	
	public static void main(String[] args){
		System.out.println("ALGUEL DE MIDIAS\n");
		
		Filme[] listaFilmes = new Filme[10];
		Livro[] listaLivros = new Livro[10];
		Jogo[] listaJogos = new Jogo[10];
		
		for(int i = 0;i < 10;i++){
			listaFilmes[i] = new Filme();
			listaFilmes[i].setCodigo(i + 1);
			listaFilmes[i].setPreco(10);
			
			listaLivros[i] = new Livro();
			listaLivros[i].setCodigo(i + 1);
			listaLivros[i].setPreco(20);
			
			listaJogos[i] = new Jogo();
			listaJogos[i].setCodigo(i + 1);
			listaLivros[i].setPreco(30);
		}
		
		Scanner lerStr = new Scanner(System.in), ler = new Scanner(System.in);
		String usuario;
		int opcao = 0;
		do{
			do{
				System.out.print("Digite se voce e dono (d) ou cliente (c), ou se voce deseja sair (s): ");
				usuario = lerStr.nextLine();
				
				if(!usuario.equalsIgnoreCase("d") && !usuario.equalsIgnoreCase("c") && !usuario.equalsIgnoreCase("s")){
					System.out.print("Opcao invalida");
				}
			}while(!usuario.equalsIgnoreCase("d") && !usuario.equalsIgnoreCase("c") && !usuario.equalsIgnoreCase("s"));
			
			do{
				if(usuario.equalsIgnoreCase("d")){
					System.out.print("\nO que voce deseja fazer?\n\n0 - Voltar\n1 - Ver quanto recebeu\n\nDigite aqui: ");
					opcao = ler.nextInt();
					
					if(opcao == 1){
						double recebido = 0;
						
						for(int i = 0;i < 10;i++){
							if(listaFilmes[i].isAlugada() && listaFilmes[i].isPago()){
								recebido += listaFilmes[i].getPreco();
							}
							if(listaLivros[i].isAlugada() && listaLivros[i].isPago()){
								recebido += listaLivros[i].getPreco();
							}
							if(listaJogos[i].isAlugada() && listaLivros[i].isPago()){
								recebido += listaJogos[i].getPreco();
							}
						}
						
						System.out.println("O valor recebido foi " + recebido + " reais.");
					}
					
				} 
				else if (usuario.equalsIgnoreCase("c")){
					String fjl;
					int codigo = 0;
					
					System.out.print("\nO que voce deseja fazer?\n\n0 - Voltar\n1 - Alugar midia\n2 - Devolver midia\n3 - Ver quanto tem para pagar\n\nDigite aqui: ");
					opcao = ler.nextInt();
					
					switch(opcao){
						case 1:
							System.out.print("Digite o codigo da midia (entre 1 e 10) que voce quer alugar: ");
							codigo = ler.nextInt();
							
							if(codigo < 1 || codigo > 10){
								System.out.print("Codigo invalido.");
							} else {
								System.out.print("Digite se voce vai pagar agora (a) ou depois (d): ");
								String ad = lerStr.nextLine();
								
								if(!ad.equalsIgnoreCase("a") && !ad.equalsIgnoreCase("d")){
									System.out.print("Codigo invalido.");
								} else {
									System.out.print("Digite se voce quer alugar um filme (f), jogo(j) ou livro (l): ");
									fjl = lerStr.nextLine();							
								
									switch(fjl){
										case "f":
											listaFilmes[codigo - 1].setAlugada(true);
											listaFilmes[codigo - 1].setPago(ad.equalsIgnoreCase("a"));
											break;
											
										case "j":
											listaJogos[codigo - 1].setAlugada(true);
											listaJogos[codigo - 1].setPago(ad.equalsIgnoreCase("a"));
											break;
										
										case "l":
											listaLivros[codigo - 1].setAlugada(true);
											listaLivros[codigo - 1].setPago(ad.equalsIgnoreCase("a"));
											break;
											
										default:
											System.out.print("Opcao invalida.");
									}	
								}
							}
						break;
							
						case 2:							
							System.out.print("Digite o codigo da midia (entre 1 e 10) que voce quer devolver: ");
							codigo = ler.nextInt();
							
							if(codigo < 1 || codigo > 10){
								System.out.print("Codigo invalido.");
							} else {
								System.out.print("Digite se voce quer devolver um filme (f), jogo(j) ou livro (l): ");
								fjl = lerStr.nextLine();

								switch(fjl){
									case "f":
										listaFilmes[codigo - 1].setAlugada(true);
										listaFilmes[codigo - 1].setPago(true);
										break;
										
									case "j":
										listaJogos[codigo - 1].setAlugada(true);
										listaJogos[codigo - 1].setPago(true);
										break;
									
									case "l":
										listaLivros[codigo - 1].setAlugada(true);
										listaLivros[codigo - 1].setPago(true);
										break;
											
									default:
										System.out.print("Opcao invalida.");
								}
								
							}
							break;
						case 3:
							double devido = 0;
						
							for(int i = 0;i < 10;i++){
								if(listaFilmes[i].isAlugada() && !listaFilmes[i].isPago()){
									devido += listaFilmes[i].getPreco();
								}
								if(listaLivros[i].isAlugada() && !listaLivros[i].isPago()){
									devido += listaLivros[i].getPreco();
								}
								if(listaJogos[i].isAlugada() && !listaLivros[i].isPago()){
									devido += listaJogos[i].getPreco();
								}
							}
							
							System.out.println("O valor devido e " + devido + " reais.");
					}
							
				}
			}while(opcao != 0);
		}while(!usuario.equalsIgnoreCase("s"));
	}
}
