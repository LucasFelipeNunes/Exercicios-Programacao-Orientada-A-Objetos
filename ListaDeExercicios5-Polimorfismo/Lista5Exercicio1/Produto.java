/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie um sistema de vendas de produtos, onde cada pedido poderá ter no máximo
100 itens. O pedido deverá ser capaz de receber vários tipos produtos (superclasse),
como frios, pães, doces, etc (subclasses). Ao final da entrada dos produtos o pedido
deverá ter um método que calcule o valor total do pedido, onde ele varrerá o vetor de
produtos somando seus valores. Desafio: implementar a quantidade de produtos vezes
seu valor, no cálculo do valor do pedido. Implemente as classes para do modelo
abaixo:*/
public class Produto{
	protected double preco;
	protected double quantidade;
	private int qtdProdutos;
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public void setQuantidade(double quantidade){
		this.quantidade = quantidade;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public double getQuantidade(){
		return quantidade;
	}
}
