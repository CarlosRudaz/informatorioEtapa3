package ejemplos_nivel_1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*Realizar un programa que solicite por consola 2 números enteros. Para luego
    imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
    de la división) de ambos números.*/

        Scanner consola = new Scanner(System.in);

        float a, b;

        System.out.println("Ingrese un número (valor de 'a'): ");
        a = consola.nextFloat();

        System.out.println("\nIngrese otro número (valor de 'b'):");
        b = consola.nextFloat();

        System.out.println("\n=============================================================================");
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a % b = "+(a%b));
        System.out.println("=============================================================================\n");

        consola.close();

    }
    
}
