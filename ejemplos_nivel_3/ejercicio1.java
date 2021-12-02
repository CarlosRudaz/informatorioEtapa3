package ejemplos_nivel_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
  
public class ejercicio1 {
    public static void main(String[] args) {

        /*Dada una lista que contiene valores de tipo String, se deberá filtrar todos los 
        valores que NO sean null o vacío ("").*/

        //Inicializo una lista de cadenas.
        List<String> lista = new ArrayList<String>();

        //Cargamos palabras a la lista.
        lista.add("Hola");
        lista.add(null);
        lista.add("Informatorio");
        lista.add("");

        //A partir de la lista "lista", creamos la lista que no contenga ni null ni valores vacíos
        List<String> filtroLista = lista.stream()
                        .filter(Objects::nonNull).filter(p -> p.equals("")).collect(Collectors.toList());

        //Imprimimos la nueva lista.
        System.out.println(filtroLista);
    }

}
