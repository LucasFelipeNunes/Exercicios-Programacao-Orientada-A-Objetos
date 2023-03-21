/*Nome: Lucas Felipe da Silva Nunes*/
import java.util.Scanner;

public class Lista2Exercicio6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);

        double menor = Double.MAX_VALUE;

        String resposta = "s";

        while (resposta.equalsIgnoreCase("s")) {
            System.out.println("Digite um numero: ");

            menor = Math.min(ler.nextDouble(), menor);

            System.out.println("Digitar outro? [s/n]");
            
            resposta = lerString.next();
        }
        
        System.out.println("Menor: " + menor);

    }
}
