/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Elabore um programa em java que contenha um método booleano que teste se um ano é ou não bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que sejam também divisíveis por 400*/
public class Ano{
	private int ano;
	public Ano(){
		ano = 0;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public int getAno(){
		return ano;
	}
	public boolean ehBissexto(){
		return (ano % 4 == 0 && ano%100 != 0 || ano%400 == 0);
	}
}
