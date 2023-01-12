/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.*/
public class LampadaDeTresEstados{
	private byte estado;
	public LampadaDeTresEstados(){
		this.estado = 0;
	}
	public LampadaDeTresEstados(byte estado){
		this.estado = estado;
	}
	public void setEstado(byte estado){
		this.estado = estado;
	}
	public byte getEstado(){
		return estado;
	}
}
