/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os
dados inseridos não permitindo absurdos.*/
public class Lista4Exercicio2{
	public static void main(String[] args){
		Refeicao refeicao1 = new Refeicao();
		refeicao1.setValor(100);
		refeicao1.setQuantPessoas(10);
		refeicao1.setGorjeta(true);
		System.out.print("Valor: " + refeicao1.getValor() + "\nQuantidade de pessoas: " + refeicao1.getQuantPessoas() + "\nVai ter gorjeta: " + refeicao1.isGorjeta() + "\nValor a ser pago por cada pessoa: " + ((refeicao1.isGorjeta()) ? 1.1 * refeicao1.getValor() / refeicao1.getQuantPessoas() : refeicao1.getValor() / refeicao1.getQuantPessoas())); 
	}
}
