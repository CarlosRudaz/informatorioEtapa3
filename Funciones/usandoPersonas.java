package Funciones;

import Clases.Persona;

public class usandoPersonas {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", 15500.00, true);
        System.out.println(persona1.getNombre());

        persona1.setNombre("Rodolfo");

        System.out.println(persona1.toString());
        System.out.println(persona1);

        System.out.println(persona1.getIdPersona());

        Persona persona2 = new Persona("Adrian", 15200.0, false);

        System.out.println(persona2.getIdPersona());

    }

}
