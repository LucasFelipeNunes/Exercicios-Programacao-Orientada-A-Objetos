/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e
c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz
ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo
grau.*/
import java.lang.Math;
public class EquacaoDoSegundoGrau{
	private double a, b, c;
	public EquacaoDoSegundoGrau(){
		a = 0;
		b = 0;
		c = 0;
	}
	public void setA(double a){
		this.a = a;
	}
	public void setB(double b){
		this.b = b;
	}
	public void setC(double c){
		this.c = c;
	}
	private double calcularDelta(){
		return Math.pow(b, 2) - 4 * a * c;
	}
	public void calcularRaizes(){
		double delta = calcularDelta();
		if(delta >= 0){
			System.out.print("x' = " + (-b + Math.sqrt(delta)) / (2 * a) + ((delta != 0) ? "\nx'' = " + (-b - Math.sqrt(delta)) / (2 * a) : ""));
		}
		else{
			System.out.print("O valor do delta é negativo");
		}
	}
}
