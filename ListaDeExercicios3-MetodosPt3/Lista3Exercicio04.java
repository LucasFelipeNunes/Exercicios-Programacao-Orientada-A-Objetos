/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 4) [POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta as
duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário o valor double das 3
notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota
mais alta e a nota mais baixa. Tente criar apenas um método para retornar essas médias. Este método
deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. As notas devem
ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.
Entrada:                    Saída:                      Cálculo:
    Entre com a nota 1: 6       Média maiores: 7            [ (6 + 8) / 2 ]
    Entre com a nota 2: 8       Média aritmética: 6         [ (6 + 8 + 4) / 3 ]
    Entre com a nota 3: 4       Maior nota: 8               [ 6, 8, 4 ]
                                Menor nota: 4               [ 6, 8, 4 ]

    Entre com a nota 1: 6       Média maiores: 7            [ (6 + 8) / 2 ]
    Entre com a nota 2: 8       Média aritmética: 4,7       [ (6 + 8 + 0 ) / 3 ]
    Entre com a nota 3: 14      Maior nota: 8               [ 6, 8, 0 ]
                                Menor nota: 0               [ 6, 8, 0 ]*/
                                
import java.util.Arrays;

import java.util.Scanner;

public class Lista3Exercicio04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[] notas = new double[3];

        System.out.print("Entre com a primeira nota: ");
        notas[0] = ler.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        notas[1] = ler.nextDouble();

        System.out.print("Entre com a terceira nota: ");
        notas[2] = ler.nextDouble();

        for (int i = 0; i < notas.length; i++) {

            if(notas[i] < 0 || notas[i] > 10) {
                notas[i] = 0;
            }

        }

        double[] medias = calcularResultados(notas);

        System.out.print("Media aritmetica: " + medias[0] + " Media das 2 maiores: " + medias[1] + " Maior e menor: " + medias[2] + ", " + medias[3]);

    }

    static double[] calcularResultados(double[] notas) {

        double[] resultados = new double[4];

        for (int i = 0; i < notas.length; i++) {
            resultados[0] += notas[i];
        }

        resultados[0] /= notas.length;

        Arrays.sort(notas);

        resultados[1] = (notas[notas.length - 1] + notas[notas.length-2]) / 2;

        resultados[2] = notas[notas.length-1];

        resultados[3] = notas[0];

        return resultados;
    }
}
