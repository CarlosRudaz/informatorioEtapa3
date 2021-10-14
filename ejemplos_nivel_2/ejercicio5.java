package ejemplos_nivel_2;

import java.util.ArrayList;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {
        /* Dados 2 ArrayList que contienen horas-trabajadas (array1) yvalor-por-hora(array2) 
        del resumen de carga de horas semanal de unempleado. Se debe generar otra lista que contenga 
        los totales y luegoimprimir el total final a cobrar. */

        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> listaTotales = new ArrayList<>();
        
        int gananciaXDia = 0, gananciaSemanal = 0;

        //CARGAMOS HORAS TRABAJADAS
        horasTrabajadas.add(6); horasTrabajadas.add(7); horasTrabajadas.add(8);
        horasTrabajadas.add(4); horasTrabajadas.add(5);

        //CARGAMOS VALOR POR HORA
        valorPorHora.add(350); valorPorHora.add(345); valorPorHora.add(550);
        valorPorHora.add(600); valorPorHora.add(320);

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            gananciaXDia = horasTrabajadas.get(i) * valorPorHora.get(i);
            listaTotales.add(i, gananciaXDia);
        }

        
        for (Integer total : listaTotales) {
            gananciaSemanal += total;

        }

        System.out.println("\n===========================================");
        System.out.println(listaTotales);
        System.out.println("Total Final: $" + gananciaSemanal);
        System.out.println("===========================================\n");
    }
}
