public class ConversaoDeUnidadesDeArea{
	private double metroQuadrado;
	private double peQuadrado;
	private double milhaQuadrada;
	private double acre;
	public ConversaoDeUnidadesDeArea(){
		
	}
	public void setMetroQuadrado(double metroQuadrado){
		this.metroQuadrado = metroQuadrado;
	}
	public void setPeQuadrado(double peQuadrado){
		this.peQuadrado = peQuadrado;
	}
	public void setMilhaQuadrada(double milhaQuadrada){
		this.milhaQuadrada = milhaQuadrada;
	}
	public void setAcre(double acre){
		this.acre = acre;
	}
	public double getMetroQuadrado(){
		return this.metroQuadrado;
	}
	public double getPeQuadrado(){
		return this.peQuadrado;
	}
	public double getMilhaQuadrada(){
		return this.milhaQuadrada;
	}
	public double getAcre(){
		return this.acre;
	}
	public double metroQuadradoParaPeQuadrado(){
		return metroQuadrado * 10.76;
	}
	public double peQuadradoParaCmQuadrado(){
		return peQuadrado * 929;
	}
	public double milhaQuadradaParaAcre(){
		return milhaQuadrada * 640;
	}
	public double acreParaPeQuadrado(){
		return acre * 43.56;
	}
}
