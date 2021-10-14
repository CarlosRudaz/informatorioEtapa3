package ejemplos_nivel_I;

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        /*Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
        mensaje “HOLA {USUARIO}!!!”*/

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        var nombreUsuario = consola.nextLine();

        System.out.println("\n\n");
        System.out.println("¡¡¡Hola " + nombreUsuario + "!!!");

        consola.close();
    }
}
