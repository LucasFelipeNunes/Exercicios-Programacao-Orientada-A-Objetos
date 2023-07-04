public class Contrato extends Vaga{
	private boolean temporario;
	
	public Contrato(){
		super();
	}
	
	public void setTemporario(boolean temporario){
		this.temporario = temporario;
	}
	
	public boolean isTemporario(){
		return temporario;
	}
}
