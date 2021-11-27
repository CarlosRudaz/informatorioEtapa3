package otros;


import java.util.HashSet;
import java.util.Set;
 
public class hashSet {
   public static void main(String[] args) {
 
       //Inicializar HashSets (Ejemplo de Constructores)
       Set<Long> dnis = new HashSet<Long>(); //version tradicional
       Set<String> nombres = new HashSet<>(); //versión abreviada
      
       // Operaciones de Inserción
       dnis.add(Long.valueOf(2131231312));
       dnis.add(Long.valueOf(987654321));
 
       nombres.add("Sr. Calamardo");
       nombres.add("Bob Esponja");
       nombres.add("Patricio");
       nombres.add("Patricio"); //agregamos un repetido para comprobar luego el size()
      
       System.out.println("Elementos en la Lista dnis: " + dnis.size());
       System.out.println("Elementos en la Lista nombres: " + nombres.size());
       System.out.println(dnis.size() == nombres.size());  //Preguntamos si ambas listas tienen la misma cantidad de elementos
 
       //Operaciones de Acceso - Al ser Set no tendremos índices. ¿Cómo accedemos? Iterando
       for (String nombre: nombres) { //Recorremos
           System.out.println(nombre); //nombre es la variable que tiene el valor asignado del elemento en un instante dado
       }
 
       //Operaciones de Eliminar
       nombres.remove("Patricio");
       System.out.println("Elementos en la Lista: " + nombres.size()); //Comparar el tamaño luego de remover
   }
}
