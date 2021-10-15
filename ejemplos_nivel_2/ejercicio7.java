package ejemplos_nivel_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        /* Crear una función que dado 2 argumentos (int, siendo el primero menor alsegundo), 
        nos devuelva un array de Strings. Con la secuencia de númerosenteros de principio a final. 
        Pero si el número es multiplo de 2 colocara el valor“Fizz”, si es múltiplo de 3 “Buzz” y si 
        es a la vez múltiplo de ambos colocara“FizzBuzz”.Observacion: Los 2 argumentos indican con que 
        valor se arranca a calcular y elsegundo con qué valor debe frenar (no se incluye en el cálculo)
        Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4  */

        int num1;
        int num2;
        ArrayList<String> sumaTotal = new ArrayList<String>();
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese su primer numero, que sea del menor: ");
        num1 = consola.nextInt();
        consola.nextLine();
        System.out.println("Ingrese su segundo numero, el más grande: ");
        num2 = consola.nextInt();
        consola.nextLine();

        for (int i = num1; i < num2; i++) {
            if (num1 % 2 == 0 && num1 % 3 == 0) {
                sumaTotal.add(i + ". FizzBuzz");
            } else if (num1 % 3 == 0) {
                sumaTotal.add(i + ". Buzz");
            } else if (num1 % 2 == 0) {
                sumaTotal.add(i + ". Fizz");
            } else {
                System.out.println("Numero no multiplo de 2 ni de 3");
            }

        }
        for (int j = 0; j < sumaTotal.size(); j++) {
            System.out.println(sumaTotal.get(j));

        }

        consola.close();
    }
}
