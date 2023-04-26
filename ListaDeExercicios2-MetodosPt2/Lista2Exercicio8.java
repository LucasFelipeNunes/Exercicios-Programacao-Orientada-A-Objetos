/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 8) [POO-013] Utilizando o método dado(), criado no exercício [POO-012], lance o dado 1 milhão de vezes.
Conte quantas vezes cada número saiu. A probabilidade deu certo? Ou seja, a porcentagem dos números
foi parecida?
Saída:
	1: 166666 - 16.67%
	2: 166667 - 16.67%
	3: 166667 - 16.67%
	4: 166666 - 16.67%
	5: 166669 - 16.67%
	6: 166665 - 16.67%*/
	
public class Lista2Exercicio8 {
	
    public static void main(String[] args) {
        
        int[] quantidadeVezes = new int[6];

        for (int i = 0; i < 1000000; i++) {
			
            quantidadeVezes[dado()-1]++;
        
        }

        for (int i = 0; i < 6; i++) {
			
            System.out.print( (i + 1) + ": " + quantidadeVezes[i] + " - " + quantidadeVezes[i]/10000.0 + "%");
        
        }
        
    }

    static int dado() {
        
        return (int) (Math.floor(Math.random() * 6 + 1));
    
    }
    
}
