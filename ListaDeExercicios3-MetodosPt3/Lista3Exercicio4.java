/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Arrays;
import java.util.Scanner;

public class Lista3Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas = new double[3];

        System.out.println("Entre com a primeira nota: ");

        notas[0] = scan.nextDouble();

        System.out.println("Entre com a segunda nota: ");

        notas[1] = scan.nextDouble();

        System.out.println("Entre com a terceira nota: ");

        notas[2] = scan.nextDouble();

        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < 0 || notas[i] > 10) {
                notas[i] = 0;
            }
        }

        double[] medias = calcularMedias(notas);

        System.out.println("Media aritmetica: " + medias[0] + " Media das 2 maiores: " + medias[1] + " Maior e menor: " + medias[2] + ", " + medias[3]);

    }

    static double[] calcularMedias(double[] notas) {

        double[] resultados = new double[4];

        for (int i = 0; i < notas.length; i++) {
            resultados[0] += notas[i];
        }

        resultados[0] /= notas.length;

        Arrays.sort(notas);

        resultados[1] = (notas[notas.length-1] + notas[notas.length-2])/2;

        resultados[2] = notas[notas.length-1];

        resultados[3] = notas[0];

        return resultados;
    }
}
