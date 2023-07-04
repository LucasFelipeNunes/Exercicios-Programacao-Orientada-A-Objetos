public class Professor extends Pessoa{
	private String[] disciplinas;
	private double salario;
	
	public Professor(){
		super();
	}
	
	public void setQtdDisciplinas(int qtdDisciplinas){
		this.disciplinas = new String[qtdDisciplinas];
	}
	
	public void setDisciplinas(String disciplina){
		for (int i = 0 ; i < this.disciplinas.length ; i++ ) {
			if ( this.disciplinas[i] == null ) {
				this.disciplinas[i] = disciplina;
				return;
			}
		}
	}
	
	public String[] getDisciplinas(){
		return disciplinas;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return salario;
	}
}
