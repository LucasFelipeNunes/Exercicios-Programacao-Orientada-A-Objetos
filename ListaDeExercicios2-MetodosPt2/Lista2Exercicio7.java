/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 7) [POO-012] Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. Por meio de
um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa
deve ser executado enquanto o usuário quiser continuar jogando o dado.

Entrada: 					Saída:
	Jogar o dado [s/n]: s 		Saiu: 4
	Jogar o dado [s/n]: s 		Saiu: 3
	Jogar o dado [s/n]: s 		Saiu: 1
	Jogar o dado [s/n]: n
	
	Jogar o dado [s/n]: s 		Saiu: 6
	Jogar o dado [s/n]: n

	Jogar o dado [s/n]: n*/
	
import java.util.Scanner;

public class Lista2Exercicio7 {
	
    public static void main(String args[]) {
        
        Scanner lerString = new Scanner(System.in);
		
		String resposta = "s";
		
        while(resposta.equals("s")) {
			
            System.out.print("Jogar o dado [s/n]: ");
			resposta = lerString.next();
			
            if(lerString.next().equals("s")) {
				
                System.out.println("Saiu: " + dado());
                
            }
            
        } 

    }

    static double dado() {
		
        return Math.floor(Math.random() * 6 + 1);
        
    }
}
