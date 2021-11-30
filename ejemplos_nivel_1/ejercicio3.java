package ejemplos_nivel_1;


import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        /*Confeccionar un programa que dado un número entero como dato de
        entrada imprima la secuencia de números (incrementos de 1) de la siguiente
        forma:*/

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver sus anteriores hasta el 1: ");
        int a = consola.nextInt();
       
        System.out.println("\n==========================================================================");
        for(int i = 1; i <= a; i++){
            
            for(int j = 1; j <= i ; j++){
                System.out.print(j); //saco el ln de "println" para que no haga salto de línea por cada iteración
            }
            
            System.out.println("");
        }
        System.out.println("==========================================================================\n");

        consola.close();
    }
    
}
