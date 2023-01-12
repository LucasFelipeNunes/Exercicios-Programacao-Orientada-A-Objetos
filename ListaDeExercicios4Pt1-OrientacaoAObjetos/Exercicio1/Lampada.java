/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Criar uma classe para representar uma lâmpada vendida em um supermercado.
Além de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou
apagada).*/
public class Lampada{
	private String marca, modelo, tipo;
	private boolean aceso;
	public Lampada(){
		marca = "";
		modelo = "";
		tipo = "";
		aceso = false;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setAceso(boolean aceso){
		this.aceso = aceso;
	}
	public String getMarca(){
		return this.marca;
	}
	public String getModelo(){
		return this.modelo;
	}
	public String getTipo(){
		return this.tipo;
	}
	public boolean isAceso(){
		return this.aceso;
	}
}
