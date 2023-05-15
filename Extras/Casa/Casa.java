public class Casa{
	private String cor;
	private boolean portas[];
	private int qtdPortas;
	
	public Casa(){
		setCasa(3, "branca");
	}
	
	public Casa(int qtdPortas, String cor){
		setCasa(qtdPortas, cor);
	}
	
	private void setCasa(int qtdPortas, String cor){
		this.cor = cor;
		setQtdPortas(qtdPortas);
		portas = new boolean[this.qtdPortas];
	}
	
	private void setQtdPortas(int qtdPortas){
		if(qtdPortas >= 1 && qtdPortas <= 100){
			this.qtdPortas = qtdPortas;
		} else {
			this.qtdPortas = 3;
		}
	}
	
	private int getQtdPortas(){
		return qtdPortas;
	}
	
	public boolean setPorta(boolean acao, int numeroPorta){
		numeroPorta--;
		if(porta >= 0 && porta < 100 && portas[numeroPorta] != acao){
			portas[numeroPorta] = acao;
			return true;
		}
		return false;
	}
	
	public boolean abrirPorta(int numeroPorta){
		return setPorta(numeroPorta, true);
	}
	
	public boolean fecharPorta(int numeroPorta){
		return setPorta(numeroPorta, true);
	}
	
	public boolean getPorta(int numeroPorta){
		if(numeroPorta >= 0 && porta < 100){
			return portas[numeroPorta];
		}
		return false; //eu sei que ta errado...
	}
	
	public int qtdPortasAbertas(){
		soma = 0;
		for(int atual = 0;atual < qtdPortas;atual++){
			soma += (portas[atual] ? 1 : 0);
		}
		return soma;
	}
	
	public boolean trocarCor(String cor){
		if(!cor.equals(this.cor) || !cor.equals("branca") && !cor.equals("azul") && !cor.equals("vermelha")){
			return false;
		}
		this.cor = cor;
		return true;
	}
	
	@Override
	public String toString(){
		String saida = "";
		
		for(int atual = 0;atual < qtdPortas;atual++){
			saida += "\nPorta" + (atual + 1) + ": " + (getPorta(atual) ? "aberta\n" : "fechada\n");
		}
	}
}
