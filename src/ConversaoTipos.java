public class ConversaoTipos {
    public static void main(String[] args) {
    int numero = 10;
    double d = numero;

    double d2 = 10.5;
    int int2 = (int) d2;

    System.out.println(d);
    System.out.println(int2);

    Integer numeroInteger = 10;
    String numeroString = numeroInteger.toString();

    System.out.println(numeroInteger + " " + numeroString);

    }
}
