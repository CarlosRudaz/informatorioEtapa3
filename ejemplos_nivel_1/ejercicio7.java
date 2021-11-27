package ejemplos_nivel_I;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        
        /*Realizar un programa que dado un String de entrada en minúsculas lo
        convierta por completo a mayúsculas. Sin uso de métodos o librerías que
        realicen toUppercase()*/

        String palabraMinuscula;
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese su palabra en 'minuscula' para pasarla a 'MAYUSCULAS': ");
        palabraMinuscula = consola.nextLine();
        System.out.println("\n====================================================");
        System.out.println("Palabra '" + palabraMinuscula + "' pasada a MAYUSCULAS: ");
        System.out.println(convertirMayuscula(palabraMinuscula));
        System.out.println("====================================================\n");

        consola.close();

    }

    static String convertirMayuscula(String palabra){
        String palabraMayuscula = "";
        char caracter = ' ';
        
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z'){
                // -32 es la diferencia en codigo ASCCI entre la minuscula y la mayuscula.
                caracter = (char)(palabra.charAt(i) - 32);
            }
            else{
                caracter = (char)(palabra.charAt(i));
            }
            
            //armamos la palabra en mayusculas sumando letre por letra.
            palabraMayuscula += caracter;
        }

        return palabraMayuscula;
    }

}
