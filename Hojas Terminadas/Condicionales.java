public class Condicionales {
    public static void main(String[] args) {
        int Calificacion = 40;
        
        // Si Calificación es mayor o igual a 90, imprimir "Excelente"
        // Si Calificación es mayor o igual a 70, imprimir "Aprobado"
        // En cualquier otro caso, imprimir "Reprobado"
        
        boolean Excelente = Calificacion >= 90;
        
        if (Excelente) {
            System.out.println("Excelente");
        } else if (Calificacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
 
        // Probar cambiando el valor de Calificación a 95, 70 y 40 para ver los 3 caminos.
        
        // (Y &&) (O ||) (No !)
        
        // ------------------------------------------------------------------------------------------------------------
        
        int Edad = 11;
        
        if (Edad >= 12 && Edad <= 17) {
            System.out.println("Es Adolescente");
        } else if (Edad < 12 || Edad > 17) {
            System.out.println("No es Adolescente");
        }

        // Si Edad es mayor o igual a 12 Y menor o igual a 17,
        // imprimir "Es Adolescente".
        // Si Edad es menor a 12 O mayor a 17 (sin usar else),
        // imprimir "No es Adolescente".
 
        // ------------------------------------------------------------------------------------------------------------
        
        String Contraseña = "robot123";
        String Intento = "Robot123";
 
        // Si Intento es igual a Contraseña, imprimir "Correcto".
        // Si no, revisar si son iguales ignorando capitalización.
        // Si son iguales, imprimir "Revise su capitalización".
        // Si no, imprimir "Incorrecto"

        if (Intento == Contraseña) {
            System.out.println("Correcto");
        } else if (Intento.equalsIgnoreCase(Contraseña)) {
            System.out.println("Revise su capitalización");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
