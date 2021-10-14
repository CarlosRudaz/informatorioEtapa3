package ejemplos_nivel_2;

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio3 {
    public static void main(String[] args) {
        /*Crear una lista que contenga como elementos la numeración de cartas de unabaraja 
        francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (enorden), imprimir, 
        imprimir en orden inverso (reverse), desordenar (mezclar) elarrayList y volver a imprimir. */

        ArrayList<String> baraja = new ArrayList<String>();
        baraja.add("2"); baraja.add("3"); baraja.add("4"); baraja.add("5"); baraja.add("6");
        baraja.add("7"); baraja.add("8"); baraja.add("9"); baraja.add("10"); baraja.add("J");
        baraja.add("Q"); baraja.add("K"); baraja.add("A");

        System.out.println("BARAJA FRANCESA:");

        System.out.println("\n===============================================================");
        System.out.println("Ordenada de menor a mayor:");
        for (int i = 0; i <baraja.size() ; i++) {
            System.out.print(" " + baraja.get(i) + " -");
        }
        
        System.out.println("\n===============================================================");
        System.out.println("De mayor a menor:");

        Collections.reverse(baraja); //invierte el orden de la lista

        for (int i = 0; i <baraja.size() ; i++) {
            System.out.print(" " + baraja.get(i) + " -");
        }
        
        System.out.println("\n===============================================================");
        System.out.println("Ahora orden aleatorio:");

        Collections.shuffle(baraja); //desordena los valores de la lista

        for (int i = 0; i < baraja.size() ; i++) {
            System.out.print(" " + baraja.get(i) + " -");
        }
        
        System.out.println("\n===============================================================\n");

    }
}
