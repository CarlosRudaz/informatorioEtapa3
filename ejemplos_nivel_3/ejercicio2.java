package ejemplos_nivel_3;

import java.util.List;
import java.util.stream.Collectors;

public class ejercicio2 {
    public static void main(String[] args) {
 
        /*Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá
         el resultado de aplicar la operación de potencia a 2.*/

         //Inicializamos la lista de enteros.
        List<Integer> bases = List.of(1, 2, 3, 4, 5); //Con el método .of cargamos directo los valores.
        Integer exponente = 2;
        List<Integer> resultados = bases.stream()
                        .map(p-> ejercicio2.potencia(p, exponente))
                        .collect(Collectors.toList());
        
        //Mostramos resultados.
        System.out.println("Lista de bases de potencia: \n" + bases);
        System.out.println("\nLista de resultados con exponente 2: \n" + resultados);
    }
    
    //Función para hayar el cuadrado de cualquier número
    public static Integer potencia(Integer base, Integer exponente) {
        if (exponente == 0){
            return 1;
        }else {
            return base * potencia(base, exponente-1);
        }
    }
}
