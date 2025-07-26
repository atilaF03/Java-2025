package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double valor = 32;
        final double valor2 = 5 / 9.0;
        double F = 86;
        double C ;

        C = (F - valor) * valor2;
        System.out.println("o resultado é: " + C+"°");

    }
}
