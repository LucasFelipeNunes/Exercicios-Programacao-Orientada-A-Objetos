public class Aluno extends Pessoa{
	private String curso;
	private double mensalidade;
	
	public Aluno(){
		super();
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public String getCurso(){
		return curso;
	}
	
	public void setMensalidade(double mensalidade){
		this.mensalidade = mensalidade;
	}
	
	public double getMensalidade(){
		return mensalidade;
	}
}
