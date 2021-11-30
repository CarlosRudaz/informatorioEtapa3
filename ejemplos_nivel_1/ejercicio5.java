package ejemplos_nivel_1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        /*Se desea una aplicación que solicite 2 números enteros y realice la operación
        de multiplicación por sumas sucesivas (sin uso de librerías).*/

        Scanner consola = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("\nIngrese dos número para ver su producto, como sumas sucesivas: ");
        System.out.println("\n# Numero 1: ");
        numero1 = consola.nextInt();

        System.out.println("\n# Numero 2: ");
        numero2 = consola.nextInt();

        System.out.println("\n========================================================================\nSumas sucesivas:\n");
        for(int i=1; i<=numero1; i++){
            if(i == numero1){
                System.out.println("" + numero2 + " = " + (numero1*numero2));
            }else{
                System.out.print("" + numero2 + " + ");
            }
        }
        System.out.println("========================================================================\n");

        consola.close();
    }
}
