package ejemplos_nivel_3;

import java.util.List;
import java.util.stream.Collectors;

public class ejercicio4 {
    public static void main(String[] args) {
        /*Se dispone de una lista de Integer, de la cual queremos obtener otra lista 
        aplicando la operación de factorial pero no se desean valores repetidos.*/

        //inicializamos la lista
        List<Integer> enteros = List.of(1, 2, 4, 4, 4);

        List<Integer> factorial = enteros.stream()
                /*.map(p -> factorial(p)) */
                .map(p -> ejercicio4.factorial(p))
                .distinct()
                .collect(Collectors.toList());

        //Mostramos el resultado
        System.out.println("Factoriales no repetidos de la lista: " + factorial);
    }

    //Función que nos da el factorial de cualquier número
    static Integer factorial(Integer numero) {
        if (numero == 1 || numero == 0){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }
    }
}
