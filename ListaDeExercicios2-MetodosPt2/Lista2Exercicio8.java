public class Lista2Exercicio8 {
    public static void main(String[] args) {
        int[] quantidadeVezes = new int[6];

        for (int i = 0; i < 1000000; i++) {
            quantidadeVezes[dado()-1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println( (i + 1) + ": " + quantidadeVezes[i] + " " + quantidadeVezes[i]/10000.0 + "%");
        }
    }

    static int dado() {
        return (int) (Math.floor(Math.random() * 6 + 1));
    }
}
