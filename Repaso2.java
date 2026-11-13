public class Repaso2 {
    public static void main(String[] args) {
        // ----------------------------------------------------------------
        // Escribir un Hello World
        System.out.println("Hola Mundo");

        // ----------------------------------------------------------------

        // Calcular el promedio de 5 variables int (8, 2, 5, 6, 10)
        int numero1 = 8;
        int numero2 = 2;
        int numero3 = 5;
        int numero4 = 6;
        int numero5 = 10;

        double promedio = (numero1 + numero2 + numero3 + numero4 + numero5)/5.0;
        System.out.println(promedio);

        // ----------------------------------------------------------------

        // Iniciar una variable de tipo int, nombre "numero" y con valor 15
        int numero = 15;
        
        // Si la variable numero es menor o igual a 4, escribir "Caso A"
        // Si la variable numero es menor que 20, escribir "Caso B"
        // Si no, escribir "Otro Caso".
        
        if (numero <= 4) {
            System.out.println("Caso A");
        } if (numero < 20) {
            System.out.println("Caso B");
        } else {
            System.out.println("Otro Caso");
        }
        
    }
}
