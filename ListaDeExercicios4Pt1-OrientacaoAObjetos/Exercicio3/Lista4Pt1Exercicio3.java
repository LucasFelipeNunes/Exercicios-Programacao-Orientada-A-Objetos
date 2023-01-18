/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.*/
public class Lista4Exercicio3{
	public static void main(String[] args){
		byte aux = 2;
		LampadaDeTresEstados lampada = new LampadaDeTresEstados();
		lampada.setEstado(aux);
		System.out.print("Estado: " + ((lampada.getEstado() == 0) ? "apagada" : (lampada.getEstado() == 1) ? "meia-luz" : "acesa")); 
	}
}
