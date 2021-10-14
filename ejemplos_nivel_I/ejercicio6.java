package ejemplos_nivel_I;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        /*Se desea una aplicación que solicite 2 números enteros y realice la operación
        de potencia (sin uso de librerías).*/

        Scanner consola = new Scanner(System.in);

        int base, exponente, aux = 1;
        System.out.println("Ingrese la base de la potencia: ");
        base = consola.nextInt();

        System.out.println("\nAhora ingrese el exponente:");
        exponente = consola.nextInt();

        for(int i=1; i<=exponente; i++){
            aux *= base;
        }

        System.out.println("\n==================================================================");

        System.out.println("La expresion (" + base + ")^" + exponente + " = " + aux);

        System.out.println("==================================================================\n");

        consola.close();

    }
}
