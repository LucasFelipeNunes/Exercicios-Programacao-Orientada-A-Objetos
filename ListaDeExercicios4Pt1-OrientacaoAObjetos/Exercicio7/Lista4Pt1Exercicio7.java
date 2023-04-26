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

public class Lista4Pt1Exercicio7{
  public static void main(String[] args{
    int frequenciaProcessador = 0, armazenamentoMemoria = 0, armazenamentoDiscoRigido = 0, tamanhoMonitor = 0;
    ModeloDeComputador modelo = new ModeloDeComputador();
    System.out.print("Monte um computador e veja o preco\n\nPlaca-mae: R$800,00\nFrequencias de processador disponiveis:\n- 1600Mhz: R$700,00\n- 1800Mhz: R$830,00\n- 1900Mhz: R$910,00\n");
    do{
      System.out.print("Digite o valor da frequencia que voce deseja: ");
      int frequenciaProcessador = ler.nextInt();
      if(frequenciaProcessador != 1600 && frequenciaProcessador != 1800 && frequenciaProcessador != 1900){
        System.out.print("Valor invalido. ");
      }
    }while(frequenciaProcessador != 1600 && frequenciaProcessador != 1800 && frequenciaProcessador != 1900);
    System.out.print("\nOpcoes de Memoria: 1GB, 2GB, 4GB, 6GB ou 8GB\nCada GB custa R$350,00\n\n");
    
    do{
      System.out.print("Digite a quantidade de memoria: ");
      int frequenciaProcessador = ler.nextInt();
      if(frequenciaProcessador != 1600 && frequenciaProcessador != 1800 && frequenciaProcessador != 1900){
        System.out.print("Valor invalido. ");
      }
    }while(frequenciaProcessador != 1600 && frequenciaProcessador != 1800 && frequenciaProcessador != 1900);
    
  }
}
