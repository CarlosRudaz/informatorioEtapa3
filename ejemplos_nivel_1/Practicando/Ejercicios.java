package ejemplos_nivel_I.Practicando;


import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Ejercicios{
    public static void main(String[] args) {
        
        /*Ejercicio 1  */
        Stream<String> stream1 = Stream.empty();
        System.out.println(stream1);

        /*Ejercicio 2 */
        Collection<String> vocales = Arrays.asList("a", "e", "i", "o", "u");
        Stream<String> vocalesStream = vocales.stream();
        System.out.println(vocalesStream);

        /* Ejercicio 3 */
        Stream<Integer> numeros1 = Stream.iterate(40, n -> n + 2).limit(20);
        numeros1.forEach(n -> System.out.println(n));
        System.out.println(numeros1);




    }
}
