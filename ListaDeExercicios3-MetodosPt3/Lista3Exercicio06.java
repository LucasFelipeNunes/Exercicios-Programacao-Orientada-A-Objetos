/*Nome: Lucas Felipe da Silva Nunes
6) [POO-019] Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados
como parâmetros de entrada para um método que irá gerar todos os números primos existentes no
intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com
a responsabilidade de imprimir o array de primos retornado pelo método. O método deve aceitar e
entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.
Entrada:                        Saída:
    Entre com um valor: 10          >> 11 13 17 19 23 29 31 37 41 43 47
    Entre com outro valor: 50
    Entre com um valor: 231         >> 211 223 227 229
    Entre com outro valor: 205
    Entre com um valor: 19          >> 19
    Entre com outro valor: 19*/
import java.util.Scanner;

public class Lista3Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero1 = ler.nextInt();

        System.out.print("Digite outro numero inteiro:");
        int numero2 = ler.nextInt();

        int[] primos = calcularPrimos(numero1, numero2);

        for (int i = 0; i < primos.length; i++) {
            System.out.print(" " + primos[i]);
        }

    }

    static int[] calcularPrimos(int numero1, int numero2) {

        int qtdPrimos = 0;

        for (int i = Math.min(numero1, numero2); i < Math.max(numero1,numero2); i++) {

            int divisores = 0;

            for (int j = 2; j < i; j++) {
                
                if(i % j == 0) {
                    divisores++;
                }
            
            }

            if(divisores == 0) {
                qtdPrimos++;
            }
        }

        int[] primos = new int[qtdPrimos];

        qtdPrimos = 0;

        for (int i = Math.min(numero1, numero2); i <= Math.max(numero1, numero2); i++) {

            int divisores = 0;

            for (int j = 2; j < i; j++) {
            
                if(i % j == 0) {
                    divisores++;
                }
            
            }

            if(divisores == 0) {
            
                primos[qtdPrimos] = i;
            
                qtdPrimos++;
            
            }

        }
        
        return primos;
    
    }

}