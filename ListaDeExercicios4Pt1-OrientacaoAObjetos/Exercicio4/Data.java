public class Data{
	private int dia, mes, ano;
	public Data(){
		dia = 1;
		mes = 1;
		ano = 1;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	public boolean isValida(){
		return ano > 0 && mes > 0 && mes < 13 && dia > 0 && (dia < 29 || dia < 30 && mes == 2 && ano % 4 == 0 || (mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31 || (mes != 2 || mes != 4 || mes != 6 || mes != 9 || mes != 11) && dia < 32);
	}
	public void mostrarData(){
		System.out.print(((dia < 10) ? ("0" + dia) : dia) + ((mes < 10) ? ("/0" + mes) : "/" + mes) + ((ano < 10) ? "/0" + ano : "/" + ano));
	}
}
