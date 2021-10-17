package ejemplos_nivel_2;

import java.util.HashMap;
import java.util.HashSet;

public class ejercicio6 {
    public static void main(String[] args) {
        /* Se dispone de una colección de Empleados, de cada empleado se conoce:
        ○Nombre y Apellido
        ○DNI
        ○horasTrabajadas
        ○valorPorHoraTodos 
        los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas 
        x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la 
        clave (key) es el dni y el valor(value) es el sueldo calculado. */

        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleado.add(new Employee("Carlos Rudaz", 34388697, 8, 150));
        empleado.add(new Employee("Ana Maria Ramirez", 36752189, 7, 180));
        empleado.add(new Employee("Humberto Rodriguez", 30125849, 5, 230));
        empleado.add(new Employee("Gladys Lastape", 14069215, 5, 500));
        empleado.add(new Employee("Roberto Gomez Bolaneo", 7526325, 5, 200));

        System.out.println("Calculo del salario de los empleados");

        for (Employee lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee crearUnaTabla : empleado) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSalario percibido:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
    
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return (this.horasTrabajadas * this.valorPorHora);
    }
}
