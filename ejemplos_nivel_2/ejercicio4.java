package ejemplos_nivel_2;

import java.util.ArrayList;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {
        /* Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
        en 3 cursos (3 arrayList) e imprimir dichos cursos. */

        List<String> estudiantes = new ArrayList<String>();

        estudiantes.add("Carlos"); estudiantes.add("Adrian"); estudiantes.add("Jose");
        estudiantes.add("Camila"); estudiantes.add("Maria"); estudiantes.add("Alberto");
        estudiantes.add("Gladys"); estudiantes.add("Ana"); estudiantes.add("Norma");
        estudiantes.add("Jorge"); estudiantes.add("Hernan"); estudiantes.add("Humberto");

        List<String> clase1 = estudiantes.subList(0, 4);

        System.out.println("\n==========================================================");
        System.out.println("Alumnos Divison 1: ");
        for (String alumnos1 : clase1) {
            System.out.print(alumnos1 + " - ");
        }


        System.out.println("\n\n==========================================================");
        System.out.println("Alumnos Divison 2: ");
        List<String> clase2 = estudiantes.subList(4, 8);
        for (String alumnos2 : clase2) {
            System.out.print(alumnos2 + " - ");
        }


        System.out.println("\n\n==========================================================");
        System.out.println("Alumnos Divison 3: ");
        List<String> clase3 =estudiantes.subList(8, 12);
        for (String alumnos3 : clase3) {
            System.out.print(alumnos3 + " - ");
        }
        
    }
}
