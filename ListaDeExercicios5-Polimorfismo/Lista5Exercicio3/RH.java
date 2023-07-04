import java.util.Scanner;

public class RH {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);
		int opcao = 0;
		int[] qtd = new int[4];
		String situacao, tipo;
		
		Empregado[] empregado = new Empregado[10];
		Desempregado[] desempregado = new Desempregado[10];
		Estagio[] estagio = new Estagio[10];
		Contrato[] contrato = new Contrato[10];		
		
		System.out.println("MENU DO RH");
		do{
			System.out.println("\n0 - Sair\n1 - Cadastrar candidato\n2 - Cadastrar vaga\n3 - Cadastrar candidato x vaga\n4 - Listar vagas por tipo\n5 - Mostrar quantidade e situação de candidatos\n6 - Mostrar candidatos x vaga");
			
			do{
				System.out.print("\nDigite uma opcao: ");
				opcao = ler.nextInt();
				
				if(opcao < 0 || opcao > 6){
					System.out.print("Opcao Invalida.");
				}
			
			}while(opcao < 0 || opcao > 6);
			
			switch(opcao){
				case 1:
					System.out.print("O candidato esta empregado (e) ou desempregado (d): ");
					situacao = lerString.nextLine();
					
					if(situacao.equalsIgnoreCase("e")){
						empregado[qtd[0]] = new Empregado();
						
						System.out.print("Digite o nome do candidato: ");
						empregado[qtd[0]].setNome(lerString.nextLine());
						
						System.out.print("Digite a idade do candidato: ");
						empregado[qtd[0]].setIdade(ler.nextInt());
						
						System.out.print("Digite o nome da empresa do candidato: ");
						empregado[qtd[0]].setNomeDaEmpresa(lerString.nextLine());
						
						qtd[0]++;
					} else if(situacao.equalsIgnoreCase("d")){
						desempregado[qtd[1]] = new Desempregado();
						
						System.out.print("Digite o nome do candidato: ");
						desempregado[qtd[1]].setNome(lerString.nextLine());
						
						System.out.print("Digite a idade do candidato: ");
						desempregado[qtd[1]].setIdade(ler.nextInt());
						
						System.out.print("Digite a quantidade de meses sem trabalhar do candidato: ");
						desempregado[qtd[1]].setMesesSemTrabalhar(ler.nextInt());
						
						qtd[1]++;
					}
					
					System.out.print("Candidato cadastrado!");
					break;
					
				case 2:
					System.out.print("A vaga e de estagio (e) ou contrato (c): ");
					tipo = lerString.nextLine();
					
					if(tipo.equalsIgnoreCase("e")){
						estagio[qtd[2]] = new Estagio();
						
						System.out.print("Digite a descricao da vaga: ");
						estagio[qtd[2]].setDescricao(lerString.nextLine());
						
						System.out.print("Digite o salario da vaga: ");
						estagio[qtd[2]].setSalario(ler.nextDouble());
						
						System.out.print("Digite o tempo em meses da vaga: ");
						estagio[qtd[2]].setMeses(ler.nextInt());
						
						qtd[2]++;
					} else if(tipo.equalsIgnoreCase("c")){
						contrato[qtd[3]] = new Contrato();
						
						System.out.print("Digite a descricao da vaga: ");
						contrato[qtd[3]].setDescricao(lerString.nextLine());
						
						System.out.print("Digite o salario da vaga: ");
						contrato[qtd[3]].setSalario(ler.nextDouble());
						
						System.out.print("Digite se a vaga e temporaria ou nao [S/N]: ");
						String sn = lerString.nextLine();
						
						if(sn.equalsIgnoreCase("s")){
							contrato[qtd[3]].setTemporario(true);
						} else if(sn.equalsIgnoreCase("n")){
							contrato[qtd[3]].setTemporario(false);
						}
						
						qtd[3]++;
					}
					
					System.out.print("Vaga cadastrada!");
					break;
				
				case 3:
					System.out.print("O candidato que voce vai cadastrar e empregado ou desempregado? (e/d): ");
					situacao = lerString.nextLine();
					
					System.out.print("Digite o numero dele: ");
					int nCandidato = ler.nextInt();
					
					System.out.print("A vaga que voce vai cadastrar e de estagio ou contrato? (e/c): ");
					tipo = lerString.nextLine();
					
					System.out.print("Digite o numero dela: ");
					int nVaga = ler.nextInt();
					
					if(tipo.equalsIgnoreCase("e")){
						estagio[nVaga - 1].setCandidato(tipo.equalsIgnoreCase("e") ? empregado[nCandidato - 1] : desempregado[nCandidato - 1]);
					} else if(tipo.equalsIgnoreCase("c")){
						contrato[nVaga - 1].setCandidato(tipo.equalsIgnoreCase("e") ? empregado[nCandidato - 1] : desempregado[nCandidato - 1]);
					}
					break;
				
				case 4:
					System.out.println("Vagas de estagio: ");
					
					for (int i = 0; i < qtd[2]; i++){
						System.out.println(estagio[i].getDescricao());
					}
					
					System.out.println("Vagas de contrato: ");
					for (int i = 0; i < qtd[3]; i++){
						System.out.println(contrato[i].getDescricao());
					}
					
					break;
				
				case 5:
					System.out.print("Existem " + (qtd[0] + qtd[1]) + " candidatos cadastrados, " + qtd[0] + " empregados e " + qtd[1] + " desempregados.");
					break;
				
				case 6:
					System.out.println("Vagas de Estagio\n");
					for (int i = 0; i < qtd[2]; i++){
						System.out.print(estagio[i].getDescricao() + "\n");
						estagio[i].getCandidato();
					}
					System.out.println("Vagas de Contrato\n");
					for (int i = 0; i < qtd[3]; i++){
						System.out.print(contrato[i].getDescricao() + "\n");
						contrato[i].getCandidato();
					}
					
			}
		}while(opcao != 0);
		ler.close();
	}
}
