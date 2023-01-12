/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os
dados inseridos não permitindo absurdos.*/
public class Refeicao {
    
    private double valor;
    private int quantPessoas;
    private boolean gorjeta;
	public Refeicao(){
		valor = 0;
		quantPessoas = 0;
		gorjeta = false;
	}
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

    public boolean isGorjeta () {
        return this.gorjeta;
    }

}
