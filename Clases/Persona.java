package Clases;
public class Persona {
    private String nombre;
    private Double sueldo;
    private Boolean eliminado;
    private int idPersona;
    /* Podemos agregar un contador en la clase, tiene que ser estático para que 
    los objetos no puedan acceder a él */
    private static int contador;


    public Persona(String nombre, Double sueldo, Boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;

        /* aumentamos el contador para ver cuantos objetos se 
        crean... se utiliza el nombre de la clase, ya que los atributos
        estáticos hacen referencia a la clase, y no a los objetos*/
        this.idPersona = Persona.contador++;
        
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean isEliminado() {
        return this.eliminado;
    }
    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Double getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
