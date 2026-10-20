public class TiposDeDatos {
    public static void main(String[] args) {
        int Calificacion_1 = 8;
        int Calificacion_2 = 7;
        int Calificacion_3 = 10;

        // PEMDAS PARENTESIS () EXPONENTES ** MULTIPLICACION * DIVISION / SUMA + (ADDITION) RESTA - (SUBSTRACTION)

        // Calcular el Promedio de las 3 calificaciónes.
        // Recordar que para calcular el promedio, hay que sumar todos los valores,
        // y dividir el total entre la cantidad de valores.
        // Ej. (5 + 6 + 8 + 4) / 4

        double Promedio = (Calificacion_1 + Calificacion_2 + Calificacion_3) / 3.0; // Escribir su código aquí
        
        // Imprimir a la terminal "El promedio del estudiante fue: {Promedio}"

        System.out.println("El promedio del estudiante fué: " + Promedio);

        // ------------------------------------------------------------------------------------------------------------
        
        // Declarar una variable de tipo Int "Numero" (Elegir cualquer numero)
        int Numero = 9;

        // Averiguar si Número es par o impar (No hace falta imprimir nada, solo con obtener un valor que distinga si el numero es par o impar)
        boolean Impar = (Numero%2)==1;
    }       
}
