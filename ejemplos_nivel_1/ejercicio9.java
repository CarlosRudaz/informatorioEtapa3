package ejemplos_nivel_1;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        /*Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
        aparece una letra dada.*/

        Scanner consola = new Scanner(System.in);
        String texto, caracter;
        
        System.out.println("\nIngrese una palabra o texto: ");
        texto = consola.nextLine();
        
        System.out.println("\nIndique que caracter desea contar: ");
        caracter = consola.nextLine();
        
        System.out.println("\n==========================================================================");
        //el - 1 va, porque la función split nos devuelve una lista de fragmentos cortados de un texto en el caracter que le pasamos nosotros como argumento.
        System.out.println("El caracter '" + caracter + "' aparece " + (texto.split(caracter, texto.length()).length - 1) + " veces...");
        System.out.println("==========================================================================\n");

        consola.close();

    }
}
