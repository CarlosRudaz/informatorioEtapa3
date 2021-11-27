package otros;

public class anotaciones {
    public static void main(String[] args) {
        //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println(edad);
        

        //comparamos dos string usando la función equals

        String cadena1 = "hola", cadena2 = "hola";

        var booleano = (cadena1.equals(cadena2));

        System.out.println("si cadena1 y cadena2 son la misma palabra tendría que dar true, sino false. es: " + booleano);

        //guardar un valor u otro dependiendo el valor de verdad de la expresión
        int a = 20, b = 25;
        
        var resultado = (a>b) ? "verdadero" : "falso";

        System.out.println(resultado);



    }
    
}
