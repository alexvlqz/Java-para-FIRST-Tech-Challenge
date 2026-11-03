package Soluciones;

public class Ciclos {
    public static void main(String[] args) {
        // Usar un ciclo for para imprimir "Vuelta 1", "Vuelta 2", ... "Vuelta 10".
        
        for (int i=1; i<=10; i++) {
            System.out.println("Vuelta "+i);
        }


        // ------------------------------------------------------------------------------------------------------------

        // Usar un ciclo for para imprimir la tabla del 5 del 1 al 10.

        for (int i=1; i<=10; i++){
            System.out.println(i+"x5 = "+(i*5));
        }

        // ------------------------------------------------------------------------------------------------------------
        
        int Contador = 10;
 
        // Usar un ciclo while para hacer una cuenta regresiva
        // de 10 a 1 imprimiendo cada número.
        // Al terminar el ciclo, imprimir "¡Despegue!"

        while (Contador >= 1) {
            System.out.println(Contador);
            Contador --;
        }
        System.out.println("¡Despegue!");

        // ------------------------------------------------------------------------------------------------------------
        
        // Imprimir los números del 1 al 20, pero:
        //  - Saltarse los múltiplos de 3 (usar continue)
        //  - Detener el ciclo por completo al llegar al 17 (usar break)
        
        int i = 1;

        while (i<=20) {
            if (i%3 == 0){
                i++;
                continue;
            } else if (i == 17){
                break;
            }
            System.out.println(i);
            i++;
        }

    }
}
