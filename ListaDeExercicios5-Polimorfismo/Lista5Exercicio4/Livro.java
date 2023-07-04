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

public class Livro extends Midia{
	private String autor;
	private String editora;
	private int edicao;
	
	public Livro(){
		super();
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void setEditora(String editora){
		this.editora = editora;
	}
	
	public String getEditora(){
		return editora;
	}
	
	public void setEdicao(int edicao){
		this.edicao = edicao;
	}
	
	public int getEdicao(){
		return edicao;
	}
}
