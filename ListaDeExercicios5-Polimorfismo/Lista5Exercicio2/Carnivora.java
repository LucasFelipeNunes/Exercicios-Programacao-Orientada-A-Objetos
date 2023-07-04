public class Carnivora extends Planta{
    boolean venenosa;
	
	public Carnivora(){
		super();
	}
	
    public Carnivora(String nome, String especie, boolean venenosa) {
        super(nome, especie);
        this.venenosa = venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }
    
    public boolean isVenenosa(){
        return venenosa;
    }
}
