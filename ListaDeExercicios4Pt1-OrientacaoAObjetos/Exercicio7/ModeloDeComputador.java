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
public class ModeloDeComputador{
	private double placaMae;
	private double processador;
	private double memoria;
	private double discoRigido;
	private double monitor;
	public ModeloDeComputador{
		placaMae = 800;
		processador = 0;
		memoria = 350;
		discoRigido = 0;
		monitor = 0;
	}
	public double CalcularPreco(int frequenciaProcessador, int armazenamentoMemoria, int armazenamentoDiscoRigido, int tamanhoMonitor){
		double preco = placaMae + armazenamentoMemoria * memoria;
		if(frequenciaProcessador == 1600){
			
		}
	}
}
