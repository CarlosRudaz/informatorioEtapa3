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

        int num1, num2, bandera = 1;     
        Scanner consola = new Scanner(System.in);

        do{
            if(bandera == 1){
                System.out.println("Ingrese la cota inferior (incluida): ");
                num1 = consola.nextInt();
                consola.nextLine();

                System.out.println("Ingrese la cota superior (Excluida):");
                num2 = consola.nextInt();
                consola.nextLine();
                bandera = 0;
            }else{
                System.out.println("¡Tenga en cuenta que el primer valor debe ser menor que el segundo!");
                System.out.println("Ingrese la cota inferior (incluida): ");
                num1 = consola.nextInt();
                consola.nextLine();

                System.out.println("Ingrese la cota superior (Excluida):");
                num2 = consola.nextInt();
                consola.nextLine();
            }
            
        }while(num1 >= num2);
            
        
        ArrayList<String> resultado = juego(num1, num2);
        
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }

        consola.close();
    }

    static ArrayList<String> juego(Integer dato1, Integer dato2){
        ArrayList<String> resultado = new ArrayList<String>();
        
        for (int i = dato1 ; i < dato2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                resultado.add("#" + i + ". FizzBuzz");
            } else if (i % 3 == 0) {
                resultado.add("#" + i + ". Buzz");
            } else if (i % 2 == 0) {
                resultado.add("#" + i + ". Fizz");
            } else {
                System.out.println("#" + i + ". No es divisible ni por 2 ni por 3...");
            }

        }
        return resultado;
    }
}
