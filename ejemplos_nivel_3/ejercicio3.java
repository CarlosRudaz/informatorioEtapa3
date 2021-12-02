package ejemplos_nivel_3;

import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {
        /*Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen 
        con la letra B (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).*/

        //Inicializamos la lista con las palabras recomendadas.
        List<String> strings = List.of("Batman", "Aquaman", "Flash", "Batgirl", "WonderWoman", "brainiac", "benedicto");
        Long contador = strings.stream()
                        .filter(p -> p.startsWith("B") || p.startsWith("b")) //startsWhit tomará la palabra si comienza con "b" o "B"
                        .count(); //Cuentas los casos verdaderos de la sentencia anterior

        //Mostramos el resultado
        System.out.println("Cantidad de palabras de la lista 'string' que comienzan con 'b' o 'B': " + contador);
    }
}
