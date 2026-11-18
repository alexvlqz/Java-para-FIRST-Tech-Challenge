public class Comparaciones {
    public static void main(String[] args) {
        double numero1 = 2.0;
        double numero2 = 1234124.0;
        double numero3 = 423.1;
        double mayor;

        if (numero1 > numero2 & numero1 > numero3) {
            mayor = numero1;
        } else if (numero2 > numero1 & numero2 > numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        System.out.println("El mayor es: "+mayor);
    }
}

