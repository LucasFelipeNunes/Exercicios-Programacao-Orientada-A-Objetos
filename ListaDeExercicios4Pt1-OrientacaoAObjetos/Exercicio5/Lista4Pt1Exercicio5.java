/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e
c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz
ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo
grau.*/
public class Lista4Pt1Exercicio5{
	public static void main (String[] args) {
		EquacaoDoSegundoGrau equacaoDoSegundoGrau = new EquacaoDoSegundoGrau();
		equacaoDoSegundoGrau.setA(1);
		equacaoDoSegundoGrau.setB(-2);
		equacaoDoSegundoGrau.setC(1);
		equacaoDoSegundoGrau.calcularRaizes();
	}
}

