/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número
tipo double. Após verifique se o númeroé positivo, negativo ou zero. As verificações devem ser feitas 
através de métodos.*/

import java.util.Scanner;

public class Lista1Exercicio3{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com um numero: ");

        double numero = ler.nextDouble();
        
        System.out.print("O numero " + %f " e ");
                         
        if(isPositivo(numero)) {
            System.out.println(isZero(numero) ? "zero." : "positivo.");
        } else {
            System.out.println("negativo");
        }
    }

    static boolean isPositivo(double numero) {
        return (numero >= 0);
    }
    
    static boolean isZero(double numero) {
        return (numero == 0);
    }
}


