package Soluciones;

public class Metodos {
    public static void main(String[] args) {
        // METODOS SIMPLES

        saludar();

        imprimirTabla(5);
        imprimirTabla(9);

        // METODOS CON RETURN

        System.out.println("5+7 = "+sumar(5,7));
        System.out.println("6+2 = "+sumar(6,2));

        System.out.println("El promedio de 1, 4, y 7 es: "+promedio(1,4,7));
        System.out.println("El promedio de 2, 6, y 8 es: "+promedio(2,6,8));

    }

    // METODOS SIMPLES ----------------------------------------------------------------------------------------------------

    // Definir un método saludar() que imprima un "Hola Mundo".
    public static void saludar() {
        System.out.println("Hola Mundo");
    }

    // Definir un método imprimirTabla(numero) que use un ciclo For para imprimir la tabla de el número dado en el argumento.
    public static void imprimirTabla(int num) {
        for (int i=1; i<=10; i++) {
            System.out.println(num+"x"+i+" = "+(num*i));
        }
    }


    // METODOS CON RETURN -------------------------------------------------------------------------------------------------

    // Definir un método sumar(num1, num2) que tome 2 numeros int como argumentos y regrese la suma de los dos numeros.
    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    // Definir un método promedio(num1,num2,num3) que tome 3 numeros int como argumentos y regrese el promedio de los tres numeros.
    public static double promedio(int num1, int num2, int num3) {
        double promedio = (num1+num2+num3)/3.0;
        return promedio;
    }
}
