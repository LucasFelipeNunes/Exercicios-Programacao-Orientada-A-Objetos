public class Arvore extends Planta {
    boolean frutifera;
    
    public Arvore(){
		super();
	}

    public Arvore(String nome, String especie, boolean frutifera) {
        super(nome, especie);
        this.frutifera = frutifera;

    }

    public void setFrutifera(boolean frutifera) {
        this.frutifera = frutifera;
    }

	public boolean isFrutifera() {
        return frutifera;
    }
}
