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


public class Animal{
	private String nome;
	private String especie;
	
	public Animal(){
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setEspecie(String especie){
		this.especie = especie;
	}
	
	public String getEspecie(){
		return especie;
	}
}

