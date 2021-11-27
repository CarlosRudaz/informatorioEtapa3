package otros;


import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> dnis = new ArrayList<Integer>();
        List<String> nombres = new ArrayList<>();

        dnis.add(0, 34388698); dnis.add(1, 35266368); dnis.add(2, 24588796);

        cargar_nombres(nombres);
        
        System.out.println("Elementos en la lista dnis: " + dnis.size());
        System.out.println("Hay el mismo numero de elementos en las listas dnis y nombres?... " + (dnis.size() == nombres.size()));


        System.out.println("\n\nRecorremos la lista:");
        int contador = 0;

        for(String nombre: nombres){
            ++contador;
            System.out.println("nombre "+ contador +": "+nombre);
        }

        System.out.println("pregunto si existe 'Carlos Rudaz' en la lista... " + nombres.contains("Carlos Rudaz"));

        contador = 0;
        System.out.println("\n\n\n");
        nombres.remove("Carlos Rudaz");

        for(String nombre: nombres){
            ++contador;
            System.out.println("nombre "+ contador +": "+nombre);
        }

        System.out.println("vuelvo a preguntar ahora... " + nombres.contains("Carlos Rudaz"));



    }

    public static void cargar_nombres(List<String> lista){
        lista.add(0, "Carlos Rudaz"); 
        lista.add(1, "Ramon Segovia"); 
        lista.add(2, "noelia retamozo");
        lista.add("Adrian");
        lista.add("Jose");
        lista.add("Mauro");
        lista.add("Alan");
        lista.add("David");
        lista.add("Mario");
        lista.add("Lucio");
    }
}
