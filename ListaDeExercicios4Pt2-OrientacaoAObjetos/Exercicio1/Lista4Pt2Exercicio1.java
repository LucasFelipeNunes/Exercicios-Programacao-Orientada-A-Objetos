/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em
formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos
métodos assessores de cada característica, temos um método que recebe como parâmetro de
entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse
método deve ser chamado por fazAniversario, não havendo retorno. Siga o diagrama abaixo para
implementar a classe Pessoa. Após crie uma classe para testar. Observe os sinais de mais e de
menos antes dos nomes dos atributos e métodos. Respeite-os*/
public class Lista4Pt2Exercicio1{
	public static void main(String[] args){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");
		pessoa.setIdade(18);
		pessoa.setAltura(1.79);
		System.out.print("Nome: " + pessoa.getNome() + "\nIdade (antes do aniversario): " + pessoa.getIdade());
		pessoa.fazAniversario(true);
		System.out.print("\nIdade (depois do aniversario): " + pessoa.getIdade() + "\nAltura: " + pessoa.getAltura());
	}
}
