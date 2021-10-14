package ejemplos_nivel_I;


import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        /*Realizar un programa que calcule el factorial de un número:
        n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.*/

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el valor que desea conocer su factorial: ");
        int factorial = consola.nextInt();
        var aux = 1;
        
        for(int i=1; i<=factorial; i++){
           aux *= i;  
        }

        System.out.println("\n================================================================");
        System.out.println("El factorial de " + factorial + " es: " + aux);
        System.out.println("================================================================\n");

        consola.close();
    }
}