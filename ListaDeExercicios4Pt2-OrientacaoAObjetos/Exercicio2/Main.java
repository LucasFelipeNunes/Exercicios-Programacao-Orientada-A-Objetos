public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setNumero1(10);
        calculadora.setNumero2(5);

        System.out.println(calculadora.getNumero1());
        System.out.println(calculadora.getNumero2());

        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());
        System.out.println(calculadora.dividir());


    }
}
