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

public class Midia{
	
	private int codigo;
	private String descricao;
	private String tipo;
	private String genero;
	private double preco;
	private boolean alugada;
	private boolean pago;
	
	public Midia(){
		
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public boolean setTipo(String tipo){
		if(tipo.equalsIgnoreCase("CD") || tipo.equalsIgnoreCase("DVD") || tipo.equalsIgnoreCase("Brochura") || tipo.equalsIgnoreCase("Blu-Ray") || tipo.equalsIgnoreCase("Cartucho") || tipo.equalsIgnoreCase("Digital")){
			this.tipo = tipo;
			return true;
		}
		return false;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setAlugada(boolean alugada){
		this.alugada = alugada;
	}
	
	public boolean isAlugada(){
		return alugada;
	}
	
	public void setPago(boolean pago){
		this.pago = pago;
	}
	
	public boolean isPago(){
		return pago;
	}
}
