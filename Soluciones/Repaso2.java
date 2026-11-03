package Soluciones;

public class Repaso2 {
    public static void main(String[] args) {
        // ----------------------------------------------------------------
        // Escribir un Hello World
        
        System.out.println("Hello World");

        // ----------------------------------------------------------------

        // Calcular el promedio de 5 variables int (8, 2, 5, 6, 10)

        double promedio = (8+2+5+6+10) / 5.0;
        
        System.out.println(promedio);

        // ----------------------------------------------------------------

        // Iniciar una variable de tipo int, nombre "numero" y con valor 15

        // Si la variable numero es menor o igual a 4, escribir "Caso A"
        // Si la variable numero es menor que 20, escribir "Caso B"
        // Si no, escribir "Otro Caso".

        int numero = 15;

        if (numero <= 4) {
            System.out.println("Caso A");
        } else if (numero < 20) {
            System.out.println("Caso B");
        } else {
            System.out.println("Otro Caso");
        }
        
    }
}
