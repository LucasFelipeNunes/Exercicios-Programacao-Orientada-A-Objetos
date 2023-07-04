/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 5) Criar um projeto para cadastrar os animais de um zoológico.

Os animais são conhecidos por seus nomes e especie. Eles podem ser de 3 tipos
Voador, que tem a cor da pena, terrestres, que tem a quantidade de patas e aquáticos,
que podem ou não respirar fora da água.

No zoológico cada animal tem seu habitat. Os habitats do zoológico são cinco, pré-
definidos: jaula, gaiola, aquário, lago e viveiro. Cada habitat tem uma área e está
localizada em um local do zoológico.

A área é representada pela relação entre Comprimento e Largura.

Criar uma classe para testar todo o zoológico (main). Nesta classe deverá haver um
menu para Cadastrar animais, Listar animais, Quantidade de animais no Zoo, Quantidade de animais de cada tipo (Voador, Terrestre e Aquático), Quantidade de
animais por tipo de habitat e Area total que os animais ocupam.*/

public class Habitat{
	private double comprimento;
	private double largura;
	private int qtd;
	
	public Habitat(){
		
	}
	
	public Habitat(double comprimento, double largura){
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public void incrementaQtd(){
		qtd++;
	}
	
	public int getQtd(){
		return qtd;
	}
	
	public void setComprimento(double comprimento){
		this.comprimento = comprimento;
	}
	
	public double getComprimento(){
		return comprimento;
	}
	
	public void setLargura(double largura){
		this.largura = largura;
	}
	
	public double getLargura(){
		return largura;
	}
	
	public double calcularArea(){
		return qtd * comprimento * largura;
	}
}
