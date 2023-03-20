import java.util.Scanner;

public class Lista2Exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        
        while(true) {
            System.out.println("Jogar o dado [s/n]");

            if(scan.next().equalsIgnoreCase("s")) {
                System.out.println("Saiu: " + dado());
            } else {
                break;
            }
        } 

    }

    static double dado() {
        return Math.floor(Math.random() * 6 + 1);
    }
}
