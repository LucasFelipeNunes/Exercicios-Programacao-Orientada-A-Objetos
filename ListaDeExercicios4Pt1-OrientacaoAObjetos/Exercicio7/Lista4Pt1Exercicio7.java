/*Nome: Lucas Felipe da Silva Nunes
7) Escrever uma classe ModeloDeComputador que encapsule valores que definam a configuração de um
microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por
exemplo). Essa classe deve ter um método calcularPreco que calculará o preço do computador como sendo
a soma do custo de seus componentes:

• Placa-mãe: R$800
• Opções de processadores: 1600Mhz a R$700, 1800Mhz a R$830, 1900Mhz a R$910
• Opções de memória: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350.
• Opções de disco rígido: 500 GB a R$300, 1 TB a R$420, 2TB a R$500.
• Opções de monitor: 15 polegadas a R$320, 17 polegadas a R$520.*/

import java.util.Scanner;

public class Lista4Pt1Exercicio7{
  public static void main(String[] args){
    
    Scanner ler = new Scanner(System.in);
    int freqProcessador = 0, armMemoria = 0, armDiscoRigido = 0, tamMonitor = 0;
    
    ModeloDeComputador modelo = new ModeloDeComputador();
    
    System.out.print("Monte um computador e veja o preco\n\nPlaca-mae: R$800,00\n\nFrequencias de processador disponiveis:\n- 1600Mhz: R$700,00\n- 1800Mhz: R$830,00\n- 1900Mhz: R$910,00\n");
    
    do{
      
      System.out.print("Digite o valor da frequencia que voce deseja, em megahertz: ");
      freqProcessador = ler.nextInt();
      
      if(freqProcessador != 1600 && freqProcessador != 1800 && freqProcessador != 1900){
        System.out.print("Valor invalido. ");
      } else{
		modelo.setProcessador((freqProcessador == 1600) ? 700 : (freqProcessador == 1800) ? 830 : 910);
      }
      
    }while(freqProcessador != 1600 && freqProcessador != 1800 && freqProcessador != 1900);
    
    System.out.print("\n\nOpcoes de Memoria: 1GB, 2GB, 4GB, 6GB ou 8GB\nCada GB custa R$350,00\n");
    
    do{
      
      System.out.print("Digite o armazenameto desejado para a memoria, em gigabytes: ");
      armMemoria = ler.nextInt();
      
      if(armMemoria != 1 && !(armMemoria % 2 == 0 && armMemoria < 9 && armMemoria > 1)){
        System.out.print("Valor invalido. ");
      } else{
		modelo.setMemoria(armMemoria * 350);
	  }
      
    }while(armMemoria != 1 && armMemoria != 2 && armMemoria != 4 && armMemoria != 6 && armMemoria != 8);
    
    System.out.print("\nOpcoes de disco rigido:\n500 GB a R$300\n1 TB a R$420\n2TB a R$500\n\n");
    
    do{
      
      System.out.print("Digite o armazenamento desejado do disco rígido, em gigabytes: ");
      armDiscoRigido = ler.nextInt();
      
      if(armDiscoRigido != 500 && armDiscoRigido != 1000 && armDiscoRigido != 2000){
        System.out.print("Valor invalido. ");
      } else{
		modelo.setDiscoRigido(armDiscoRigido == 500 ? 300 : armDiscoRigido == 1000 ? 420 : 500);
	  }
      
    }while(armDiscoRigido != 500 && armDiscoRigido != 1000 && armDiscoRigido != 2000);
	
	System.out.print("\nOpcoes de monitor:\n15 polegadas a R$320,\n17 polegadas a R$520.\n");
    
    do{
      
      System.out.print("Digite o tamanho desejado do monitor, em polegadas: ");
      tamMonitor = ler.nextInt();
      
      if(tamMonitor != 15 && tamMonitor != 17){
        System.out.print("Valor invalido. ");
      } else{
		modelo.setMonitor(tamMonitor == 15 ? 320 : 520);
      }
      
    }while(tamMonitor != 15 && tamMonitor != 17);
    
    System.out.print("\nPrecos:\nPlaca Mae: R$ " + modelo.getPlacaMae() + ",00\nProcessador: R$ " + modelo.getProcessador() + ",00\nMemoria: R$ " + modelo.getMemoria() + ",00\nDisco Rigido: R$ " + modelo.getDiscoRigido() + ",00\nMonitor: R$ " + modelo.getMonitor() + ",00\nTotal: " + modelo.calcularPreco() + ",00");
  }
}
