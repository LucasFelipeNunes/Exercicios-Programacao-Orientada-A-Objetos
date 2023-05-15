public class Casa{
	private String cor;
	private boolean portas[];
	
	public Casa(int qtdPortas, String cor){
		this.cor = cor;
		portas = new boolean[qtdPortas];
	}
	
	public boolean abrirPorta(int numeroPorta){
		if(portas[numeroPorta] == false){
			portas[numeroPorta] = true;
			return true;
		}
		return false;
	}
	
	public boolean fecharPorta(int numeroPorta){
		if(portas[numeroPorta] == true){
			portas[numeroPorta] = false;
			return true;
		}
		return false;
	}
	
	public boolean getPorta(int numeroPorta){
		return portas[numeroPorta];
	}
	
	public boolean trocarCor(String cor){
		if(!cor.equals(this.cor) || !cor.equals("branca") && !cor.equals("azul") && !cor.equals("vermelha")){
			return false;
		}
		this.cor = cor;
		return true;
	}
}
