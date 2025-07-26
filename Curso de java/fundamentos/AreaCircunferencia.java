package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        // a palavra final antes de definir a variavel transforma ela em uma constante
        final double PI = 3.14159;
        //  calculo para resolver area de um circulo
        double area = PI * raio * raio;

        System.out.println(area);


        raio = 10;
        area = PI * raio * raio;
        System.out.println("area = " + area);

    }
}
   