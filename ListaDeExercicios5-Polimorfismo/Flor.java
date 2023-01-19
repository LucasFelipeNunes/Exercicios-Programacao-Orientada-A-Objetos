public class Flor extends Planta {

    String cor;

    public Flor(String nome, String especie, String cor) {
        super(nome, especie);
        this.cor = cor;

    }

    public String getCor () {
        return cor;
    }

    public void setCor (String cor) {
        this.cor = cor;
    }
}
