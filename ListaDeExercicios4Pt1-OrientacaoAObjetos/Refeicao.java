public class Refeicao {
    
    private double valor;
    private int quantPessoas;
    private boolean gorjeta;

    public Refeicao (double valor, int quantPessoas, boolean gorjeta) {
        this.valor = valor;
        this.quantPessoas = quantPessoas;
        this.gorjeta = gorjeta;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }

    public void setQuantPessoas (int quantPessoas){
        this.quantPessoas = quantPessoas;
    }

    public void setGorjeta (boolean gorjeta) {
        this.gorjeta = gorjeta;
    }

    public double getValor () {
        return this.valor;
    }

    public int getQuantPessoas () {
        return this.quantPessoas;
    }

    public boolean getGorjeta () {
        return this.gorjeta;
    }

}
