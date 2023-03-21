public class Lista3Exercicio5 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 1000; i++) {
            System.out.print(verificaPrimo(i) ? " " + i : "");
        }

    }

    static boolean verificaPrimo(int numero) {

        boolean divisores = false;

        for (int i = 2; i < numero; i++) {
            
            if(numero%i == 0){
                divisores = true;
                break;
            }

        }

        return !divisores;
    }
}
