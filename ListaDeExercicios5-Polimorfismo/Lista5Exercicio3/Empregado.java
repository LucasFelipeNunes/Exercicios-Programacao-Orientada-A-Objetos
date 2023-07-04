public class Empregado extends Candidato{
	private String nomeDaEmpresa;
	
	public Empregado(){
		super();
	}
	
	public void setNomeDaEmpresa(String nomeDaEmpresa){
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	
	public String getNomeDaEmpresa(){
		return nomeDaEmpresa;
	}
}
