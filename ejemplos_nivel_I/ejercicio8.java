package ejemplos_nivel_I;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        /*Crear una aplicación que solicite de entrada los datos de una persona en este
        orden:
        Nombre y Apellido
        Edad
        Dirección
        Ciudad
        Luego imprimirá el siguiente mensaje:
        {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

        String nombre, apellido, direccion, ciudad;
        int edad;
        Scanner consola = new Scanner(System.in);

        System.out.println("\nIngrese datos personales que son solicitados.");
        System.out.println("\nNombre: ");
        nombre = primeraEnMayuscula(consola.nextLine());
        
        System.out.println("\nApellido: ");
        apellido = primeraEnMayuscula(consola.nextLine());

        System.out.println("\nEdad: ");
        edad = consola.nextInt();
        consola.nextLine();

        System.out.println("\nDireccion: ");
        direccion = primeraEnMayuscula(consola.nextLine());

        System.out.println("\nCiudad: ");
        ciudad = primeraEnMayuscula(consola.nextLine());

        System.out.println("\n=========================================================");
        System.out.println(String.format("%s - %s - %d - %s, %s", ciudad, direccion, edad, apellido, nombre));
        System.out.println("=========================================================\n");

        consola.close();

    }

    //creamos una función para que ponga en mayusculas la primera letra de una palabra.
    public static String primeraEnMayuscula(String palabra) {
        char[] listaCaracteres = palabra.toCharArray(); //pasamos cada caracter a una lista
        listaCaracteres[0] = Character.toUpperCase(listaCaracteres[0]); //ponemos en mayusculas el primer caracter
        return new String(listaCaracteres);
     }
}
