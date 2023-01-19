import java.util.Scanner;

public class Lista5Exercicio2 {

    static Planta[] floresta = new Planta[100];
    static int quantArvore = 0;
    static int quantFlor = 0;
    static int quantCarnivora = 0;
    static Scanner scan = new Scanner(System.in);
    static Scanner stran = new Scanner(System.in);

    public static void main(String[] args) {
        
        

        
        
        while(true) {
            System.out.println("1 - cadastrar");
            System.out.println("2 - listar");
            System.out.println("3 - mostrar quantidade");
            System.out.println("4 - mostrar quantidade por tipo");
    
            int escolha = scan.nextInt();
    
            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome da planta");
                    String nome = stran.nextLine();
                    System.out.println("Digite a especie da planta");
                    String especie = stran.nextLine();
                    System.out.println("1-Arvore, 2-Flor, 3-Carnivora");
                    int tipo = scan.nextInt();
    
                    cadastrar(nome, especie, tipo);
                    break;
            
                case 2:
                    for (int i = 0; i < quantArvore + quantCarnivora + quantFlor; i++) {
                        System.out.println("-----------------------------------------------");

                        System.out.println((i+1) + "- Nome: " + floresta[i].getNome() + " Especie: " + floresta[i].getEspecie());
                        
                        System.out.println("-----------------------------------------------");
                    }
                    break;
                
                case 3:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Quantidade de plantas: " + (quantArvore + quantCarnivora + quantFlor));
                    System.out.println("-----------------------------------------------");
                    break;

                case 4:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Quantidade de arvore: " + (quantArvore));
                    System.out.println("-----------------------------------------------");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Quantidade de flor: " + (quantFlor));
                    System.out.println("-----------------------------------------------");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Quantidade de Carnivora: " + (quantCarnivora));
                    System.out.println("-----------------------------------------------");
                    break;
    
                default:
                    System.out.print("Valor invalido");
                    break;
            }
        }
       
    }

    public static void cadastrar(String nome, String especie, int tipo) {
        switch (tipo) {
            case 1:
                System.out.println("Frutifera? (true ou false)");
                
                boolean frutifera = scan.nextBoolean();

                floresta[quantArvore + quantCarnivora + quantFlor] = new Arvore(nome, especie, frutifera);
                
                quantArvore++;

                break;
                
            case 2:
                System.out.println("Digite a cor da flor: ");
                
                String cor = stran.nextLine();

                floresta[quantArvore + quantCarnivora + quantFlor] = new Flor(nome, especie, cor);
                
                quantFlor++;
                break;
            
            case 3:
                System.out.println("Venenosa? (true ou false)");
                
                boolean venenosa = scan.nextBoolean();

                floresta[quantArvore + quantCarnivora + quantFlor] = new Carnivora(nome, especie, venenosa);
            
                quantCarnivora++;
                break;
        
            default:
                throw new Error("tipo de planta invalido");
        }
    }

}