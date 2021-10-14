package ejemplos_nivel_2;

public class ejercicio1 {
    public static void main(String[] args) {
        /*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
        luegoimprimir por pantalla el ranking*/

        String[] ciudades = {"Machagai", "Mendoza", "Córdoba", "Corrientes", "San Martin"};
        int contador = 1;
        
        System.out.println("\n===========================================");
        for (String i : ciudades) {
            System.out.println("#" + contador++ + " - " + i);
        }
        System.out.println("===========================================\n");

    }    
}
