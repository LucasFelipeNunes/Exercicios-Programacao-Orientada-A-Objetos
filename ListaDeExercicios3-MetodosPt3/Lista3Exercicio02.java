/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 2) [POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O
usuário deverá escolher se o valor de temperatura que ser á informa do em Celsius ou em Fahrenheit. Se a
entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de
conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como
parâmetro de entrada e retorne a temperatura convertida. Para os cálculos de conversão, utilize as
fórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuário
desejar
Entrada:									Saída:		Cálculo:
[C] Celsius, [F] Fahrenheit e [S] Sair: V
			Opção Inválida!
[C] Celsius, [F] Fahrenheit e [S] Sair: C
Entre com a temperatura: 0					Saída: 32	(F = (9 * 0 / 5) + 32)
[C] Celsius, [F] Fahrenheit e [S] Sair: S

[C] Celsius, [F] Fahrenheit e [S] Sair: S

[C] Celsius, [F] Fahrenheit e [S] Sair: C
Entre com a temperatura: 100				Saída: 212	(F = (9 * 100 / 5) + 32)
[C] Celsius, [F] Fahrenheit e [S] Sair: F
Entre com a temperatura: 86					Saída: 30	(C = 5 * (86 - 32) / 9)
[C] Celsius, [F] Fahrenheit e [S] Sair: S*/
import java.util.Scanner;

public class Lista3Exercicio02{

    public static void main (String args[]){

        Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);

        String opcao = new String();

        do{

            do{

                System.out.print("[C] Celsius, [F] Fahrenheit e [S] Sair: ");
                opcao = lerString.nextLine();

                if(!opcao.equals("C") && !opcao.equals("F") && !opcao.equals("S") || opcao.length() > 1){
                    System.out.println("\tOpcao Invalida!");
                }

            }while(!opcao.equals("C") && !opcao.equals("F") && !opcao.equals("S") || opcao.length() > 1);

            if(!opcao.equals("S")){
                
                System.out.print("Entre com a temperatura: ");
				double temperatura = ler.nextDouble();

                System.out.print("Saida: " + (opcao.equals("C") ? retornaTemperaturaFarenheit(temperatura) : retornaTemperaturaCelsius(temperatura)));

            }
		}while(!opcao.equals("S"));
	}

    static double retornaTemperaturaCelsius(double temperaturaFarenheit){

        return 5 * (temperaturaFarenheit - 32) / 9;

    }

    static double retornaTemperaturaFarenheit(double temperaturaCelsius){

        return 9 * temperaturaCelsius / 5 + 32;

    }

}