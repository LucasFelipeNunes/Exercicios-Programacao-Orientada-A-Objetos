public class Vaga{
	private String descricao;
	private double salario;
	private Candidato[] candidatos = new Candidato[20];
	private int qtdCandidatos;
	
	public Vaga(){
		
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public void setCandidato(Candidato candidato){
		candidatos[qtdCandidatos] = candidato;
		qtdCandidatos++;
	}
	public void getCandidato(){
		for (int i = 0; i < qtdCandidatos; i++){
			System.out.print(candidatos[i].getNome());
		}
		
	}
}
