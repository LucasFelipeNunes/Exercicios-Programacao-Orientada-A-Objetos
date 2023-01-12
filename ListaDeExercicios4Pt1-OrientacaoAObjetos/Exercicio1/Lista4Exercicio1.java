/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Criar uma classe para representar uma lâmpada vendida em um supermercado.
Além de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou
apagada).*/
public class Lista4Exercicio01{
	public static void main(String[] args){
		Lampada lampada1 = new Lampada();
		lampada1.setMarca("Elgin");
		lampada1.setModelo("100W");
		lampada1.setTipo("LED");
		lampada1.setAceso(true);
		System.out.print("Marca: " + lampada1.getMarca() + "\nModelo: " + lampada1.getModelo() + "\nTipo: " + lampada1.getTipo() + "\nEstá acesa: " + lampada1.isAceso()); 
	}
}
