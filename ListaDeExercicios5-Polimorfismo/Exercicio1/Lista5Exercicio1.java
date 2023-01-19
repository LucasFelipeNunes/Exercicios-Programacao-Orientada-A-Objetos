/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie um sistema de vendas de produtos, onde cada pedido poderá ter no máximo
100 itens. O pedido deverá ser capaz de receber vários tipos produtos (superclasse),
como frios, pães, doces, etc (subclasses). Ao final da entrada dos produtos o pedido
deverá ter um método que calcule o valor total do pedido, onde ele varrerá o vetor de
produtos somando seus valores. Desafio: implementar a quantidade de produtos vezes
seu valor, no cálculo do valor do pedido. Implemente as classes para do modelo
abaixo:*/
import java.util.Scanner;
public class Lista5Exercicio1{
	static Frios frios = new Frios();
	static Paozinho paozinho = new Paozinho();
	static Doces doces = new Doces();
	static Scanner ler = new Scanner(System.in);
	static int qtdProdutos = 100;
	public static void main (String[] args){
		System.out.print("Digite o valor dos frios:\t");
		frios.setPreco(ler.nextDouble());
		System.out.print("Digite a quantidade de frios:\t");
		frios.setQuantidade(ler.nextDouble());
		if(frios.getQuantidade() >= 100){
			frios.setQuantidade(100);
			System.out.print("Número máximo de produtos atingido (100).\nO preco total do seu pedido será " + valorPedido());
		}
		else{
			System.out.print("Digite o valor dos pãezinhos:\t");
			paozinho.setPreco(ler.nextDouble());
			System.out.print("Digite a quantidade de pãezinhos:\t");
			paozinho.setQuantidade(ler.nextDouble());
			if(frios.getQuantidade() + paozinho.getQuantidade() >= 100){
				paozinho.setQuantidade(100 - frios.getQuantidade());
				System.out.print("Número máximo de produtos atingido (100).\nO preco total do seu pedido será " + valorPedido());
			}
			else{
				System.out.print("Digite o valor dos doces:\t");
				doces.setPreco(ler.nextDouble());
				System.out.print("Digite a quantidade de doces:\t");
				doces.setQuantidade(ler.nextDouble());
				if(frios.getQuantidade() + paozinho.getQuantidade() + doces.getQuantidade() >= 100){
					doces.setQuantidade(100 - frios.getQuantidade() - paozinho.getQuantidade());
					System.out.println("Número máximo de produtos atingido (100).\n");
				}
				System.out.print("\nO preco total do seu pedido será " + valorPedido());
			}
		}
	}
	static public double valorPedido(){
		return frios.getPreco() * frios.getQuantidade() + doces.getPreco() * doces.getQuantidade() + paozinho.getPreco() * paozinho.getQuantidade();
	}
}
