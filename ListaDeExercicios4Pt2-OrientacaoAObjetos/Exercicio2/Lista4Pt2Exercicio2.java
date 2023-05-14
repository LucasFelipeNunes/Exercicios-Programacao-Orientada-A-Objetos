public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setNumero1(10);
        calculadora.setNumero2(5);

        System.out.println("Primeiro numero: " + calculadora.getNumero1() + "\nSegundo numero: " + calculadora.getNumero2());

        System.out.println("Soma: " + calculadora.somar());
        System.out.println("Subtracao: " + calculadora.subtrair());
        System.out.println("Multiplicacao: " + calculadora.multiplicar());
        System.out.print("Divisao: " + calculadora.dividir());


    }
}
