package ejemplos_nivel_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ejercicio5 {
    public static void main(String[] args) {
        /*Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento 
        (con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map 
        será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del 
        alumno.
        La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su 
        funcionamiento.
        En ejemplo se muestra solo con 1 Alumno a modo de abreviar
        En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra 
        tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)*/

        //Creamos la lista con objetos de tipo "Alumnos"
        List<Alumno> alumnos = List.of(
                new Alumno("Lisa", "Simpson", LocalDate.now().minusYears(30)),
                new Alumno("Bart", "Simpson", LocalDate.now().minusYears(30)),
                new Alumno("Maggie", "Simpson", LocalDate.now().minusYears(30)),
                new Alumno("Marge", "Bouvier", LocalDate.now().minusYears(30)),
                new Alumno("Marvin", "Monroe", LocalDate.now().minusYears(30)),
                new Alumno("Abbe", "Simpson", LocalDate.now().minusYears(30))
        );

        
        Map<Object, Object> alumnosConEdades = alumnos.stream()
                        .collect(Collectors
                        .toMap(p-> (p.getNombre() + " " + p.getApellido()),
                                p -> ejercicio5.getEdad(p.getFechaNacimiento())));
        System.out.println(alumnosConEdades);
    }
    
    //Convertimos la fecha en años
    public static Integer getEdad(LocalDate fechaCumple){
        return Period.between(fechaCumple, LocalDate.now()).getYears();
    }


    //Creamos nuestra clase Alumno
    public static class Alumno{
        private String nombre;
        private String apellido;
        private LocalDate fechaNacimiento;
    
        //Contructor con argumentos
        public Alumno(String nombre, String apellido, LocalDate fecha){
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fecha;
        }
    
        //Constructor Vacío
        public Alumno(){
    
        }
    
        //Getters y Setters
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getApellido() {
            return apellido;
        }
    
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }
        
    }
}


    



