public class Numero{
	private int numero;
	public Numero(){
		
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}
	public int inverter(){
		int inverso = 0;
		while(numero > 0 ? numero > 0 : numero < 0){
			inverso = inverso * 10 + numero % 10;
			numero /= 10;
		}
		return inverso;
	}
}
