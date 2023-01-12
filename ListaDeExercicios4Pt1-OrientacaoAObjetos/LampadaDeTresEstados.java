public class LampadaDeTresEstados{
	private byte estado;
	public LampadaDeTresEstados(){
		this.estado = 0;
	}
	public LampadaDeTresEstados(byte estado){
		this.estado = estado;
	}
	public void setByte(byte estado){
		this.estado = estado;
	}
	public byte getByte(){
		return estado;
	}
}
