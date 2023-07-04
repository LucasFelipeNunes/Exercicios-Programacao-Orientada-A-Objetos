import java.util.Scanner;

public class Colegio{
	public static void main(String[] args){
		Sala[] sala = new Sala[10];
		Aluno[] aluno = new Aluno[10];
		Professor[] professor = new Professor[10];
		
		Scanner ler = new Scanner(System.in), lerStr = new Scanner(System.in);
		int opcao = 0, qtdSalas = 0, qtdAlunos = 0, qtdProfessores = 0;
		
		System.out.println("COLEGIO");
		do{
			System.out.println("\nO que voce deseja fazer?\n\n0 - Sair\n1 - Cadastrar Sala\n2 - Listar Salas\n3 - Cadastrar Professor\n4 - Listar Professores\n5 - Cadastrar Aluno\n6 - Listar Alunos");
			
			do{
				System.out.print("\nDigite aqui: ");
				opcao = ler.nextInt();
				
				if(opcao < 0 || opcao > 6){
					System.out.print("Valor invalido. ");
				}
			}while(opcao < 0 || opcao > 6);
			
			switch(opcao){
				case 1:
					System.out.print("Digite a quantidade de pessoas na sala: ");
					int qtdPessoas = ler.nextInt();
					sala[qtdSalas] = new Sala(qtdPessoas);
					
					System.out.print("Digite o nome da sala: ");
					String nomeSala = lerStr.nextLine();
					sala[qtdSalas].setNome(nomeSala);
					
					qtdSalas++;				
					
					System.out.println("Sala cadastrada!");
					break;
				
				case 2:
					System.out.println("Os nomes das salas cadastradas sao: ");
					
					for(int i = 0;i < qtdSalas;i++){
						System.out.println(sala[i].getNome());
					}
					break;
					
				case 3:
					professor[qtdProfessores] = new Professor();
					
					System.out.print("Digite o nome do professor: ");
					professor[qtdProfessores].setNome(lerStr.nextLine());
					
					System.out.print("Digite a idade do professor: ");
					professor[qtdProfessores].setIdade(ler.nextInt());
					
					System.out.print("Digite a quantidade de disciplinas que ele leciona: ");
					int qtdDisciplinas = ler.nextInt();
					professor[qtdProfessores].setQtdDisciplinas(qtdDisciplinas);
					
					for (int i = 0; i < qtdDisciplinas; i++){
						System.out.print("Digite o nome da " + (i + 1) + " disciplina: ");
						professor[qtdProfessores].setDisciplinas(lerStr.nextLine());
					}
					
					System.out.print("Digite o salario do professor: ");
					professor[qtdProfessores].setSalario(ler.nextDouble());
					
					qtdProfessores++;
					System.out.print("Professor cadastrado!");
					break;
				
				case 4:
					System.out.println("Os nomes dos professores cadastrados sao: ");
					
					for(int i = 0;i < qtdProfessores;i++){
						System.out.println(professor[i].getNome());
					}
					break;
					
				case 5:
					aluno[qtdAlunos] = new Aluno();
					
					System.out.print("Digite o nome do aluno: ");
					aluno[qtdAlunos].setNome(lerStr.nextLine());
					
					System.out.print("Digite a idade do aluno: ");
					aluno[qtdAlunos].setIdade(ler.nextInt());
					
					System.out.print("Digite o curso do aluno: ");
					aluno[qtdAlunos].setCurso(lerStr.nextLine());
					
					System.out.print("Digite a mensalidade do aluno: ");
					aluno[qtdAlunos].setMensalidade(ler.nextDouble());
					
					qtdAlunos++;
					System.out.print("Aluno cadastrado!");
					break;
					
				case 6:
					System.out.println("Os nomes dos alunos cadastrados sao: ");
					
					for(int i = 0;i < qtdAlunos;i++){
						System.out.println(aluno[i].getNome());
					}
					
			}
		}while(opcao != 0);
	}
}
