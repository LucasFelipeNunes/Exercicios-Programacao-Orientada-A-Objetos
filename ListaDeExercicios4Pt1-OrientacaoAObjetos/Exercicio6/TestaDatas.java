public class TestaDatas{
	private int dia1, mes1, ano1, dia2, mes2, ano2;
	public TestaDatas(){
		dia1 = 0;
		mes1 = 0;
		ano1 = 0;
		dia2 = 0;
		mes2 = 0;
		ano2 = 0;
	}
	public void setDia1(int dia1){
		this.dia1 = dia1;
	}
	public void setMes1(int mes1){
		this.mes1 = mes1;
	}
	public void setAno1(int ano1){
		this.ano1 = ano1;
	}
	public void setDia2(int dia2){
		this.dia2 = dia2;
	}
	public void setMes2(int mes2){
		this.mes2 = mes2;
	}
	public void setAno2(int ano2){
		this.ano2 = ano2;
	}
	public int getDia1(){
		return this.dia1;
	}
	public int getMes1(){
		return this.mes1;
	}
	public int getAno1(){
		return this.ano1;
	}
	public int getDia2(){
		return this.dia2;
	}
	public int getMes2(){
		return this.mes2;
	}
	public int getAno2(){
		return this.ano2;
	}
	public boolean areIguais(){
		return dia1 == dia2 && mes1 == mes2 && ano1 == ano2;
	}
	public int diferencaEmDias(){
		int diferenca = (ano1 > ano2 ? ano1 - ano2 : ano2 - ano1) * 365 + (mes1 > mes2 ? mes1 - mes2 : mes2 - mes1) * 30 + (dia1 > dia2 ? dia1 - dia2 : dia2 - dia1);
		return diferenca;
	}
}
