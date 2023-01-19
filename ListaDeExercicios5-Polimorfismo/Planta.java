public class Planta {
    
    String nome;
    String especie;

    public Planta (String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome () {
        return nome;
    }

    public String getEspecie () {
        return especie;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setEspecie (String especie) {
        this.especie = especie;
    }

    
}
