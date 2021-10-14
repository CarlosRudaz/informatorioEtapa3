package ejemplos_nivel_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un númeroentero al principio de la 
        lista y otro al final. Por último, iterar e imprimir loselementos de la lista y el tamaño de la 
        misma (antes y después de agregar aen la primera y última posición).*/

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner consola = new Scanner(System.in);
        int contador = 1, i;
        

        do{
            System.out.println("\nIngrese numero entero (" + contador++ + ") : ");
            numeros.add(consola.nextInt());
            consola.nextLine();
            

            do{
                System.out.println("\nAgregar otro numero?\n1- SI\n2- NO");
                i = consola.nextInt();
                consola.nextLine();
            }while(i != 1 && i != 2);
                
        }while(i == 1);

        consola.close();

        System.out.println("\n=====================================================================");
        System.out.println("Numeros cargados: ");

        for (i = 0; i < numeros.size(); i++) {
            if(i != (numeros.size()-1)){
                System.out.print("" + numeros.get(i) + " - ");
            }else{
                System.out.print("" + numeros.get(i));
            }
        }

        System.out.println("\nCantidad de elementos de la lista: " + numeros.size());
        numeros.add(0, 0);
        numeros.add((numeros.size()), (numeros.size()));

        System.out.println("\nAgrego 2 elementos en las posiciones primera y ultima, cantidad de elementos: " + numeros.size());
        for (i = 0; i < numeros.size(); i++) {
            if(i != (numeros.size()-1)){
                System.out.print("" + numeros.get(i) + " - ");
            }else{
                System.out.print("" + numeros.get(i));
            }
        }


        numeros.remove(0);
        numeros.remove((numeros.size() - 1));

        System.out.println("\n\nSacamos el primero y ultimo elemento y quedan: " + numeros.size());
        for (i = 0; i < numeros.size(); i++) {
            if(i != (numeros.size()-1)){
                System.out.print("" + numeros.get(i) + " - ");
            }else{
                System.out.print("" + numeros.get(i));
            }
        }
        System.out.println("\n=====================================================================\n");
        
    }
}
