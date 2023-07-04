public class Sala{
	private String nome;
	Pessoa[] pessoa;
	
	public Sala(){
	
	}
	
	public Sala(int qtdPessoas){
		pessoa = new Pessoa[qtdPessoas];
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
}
