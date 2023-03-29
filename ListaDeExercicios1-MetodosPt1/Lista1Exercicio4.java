/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 4) [POO-004] Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo
Grau. O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores,
'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por
'b² - 4ac'.
Entrada:            Saída:
a: 1 b: -1 c: -12   Delta é 49.
a: 1 b: -4 c: -5    Delta é 36.*/

import java.util.Scanner;

public class Lista1Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("a: ");
        double a = ler.nextDouble();

        System.out.print("b: ");
        double b = ler.nextDouble();

        System.out.print("c: ");
        double c = ler.nextDouble();

        System.out.print("Delta e: " + calcularDelta(a, b, c));
    }

    static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
