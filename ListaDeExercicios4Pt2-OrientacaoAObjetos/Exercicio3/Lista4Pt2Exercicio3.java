/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Elabore um programa em java que contenha um método booleano que teste se um ano é ou não bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que sejam também divisíveis por 400*/
public class Lista4Pt2Exercicio3{
	public static void main(String[] args){
		Ano ano = new Ano();
		ano.setAno(2020);
		System.out.print("Ano: " + ano.getAno() + "\nO ano é bissexto? " + ano.ehBissexto());
	}
}
