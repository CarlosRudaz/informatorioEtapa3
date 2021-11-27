package otros;
import java.util.Scanner;

public class tarea1_curso {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre del libro: ");
        var nombreLibro = consola.nextLine();
        
        System.out.println("Ingrese el ID: ");
        var id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingrese precio del libro: ");
        var precio = Float.parseFloat(consola.nextLine());
        

        System.out.println("¿Es con envío gratis?");
        System.out.println("1- Si \n2- No");
        var envio = Integer.parseInt(consola.nextLine());

        if (envio != 1 && envio != 2){
            
            System.out.println("La opción de envío seleccionada es incorrecta. Vuelva a intentarlo...");
        } else {
            System.out.println("\n\n=========================================================================");
            System.out.println("Nombre del Libro: " + nombreLibro + ", #" + id);
            System.out.println("Precio: $" + precio);
            if(envio == 1){
                System.out.println("Envío gratis: SI");
            }else{
                System.out.println("Envío gratis: NO");
            }
            System.out.println("=========================================================================\n\n");
        }

        consola.close();
        
    }
}
