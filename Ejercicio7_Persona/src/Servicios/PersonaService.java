/*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class PersonaService {

    /*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
     */
    public Persona p1 = new Persona();
    Scanner read = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre de la persona:");
        p1.setNombre(read.next());
        System.out.println("Ingrese edad de la persona:");
        p1.setEdad(read.nextInt());
        System.out.println("Ingrese sexo: H=hombre,M=mujer,O=otro:");
        p1.setSexo(read.next());
        System.out.println("Ingrese el peso en kilogramos:");
        p1.setPeso(read.nextDouble());
        System.out.println("Ingrese la altura en metros:");
        p1.setAltura(read.nextDouble());

        return p1;

    }


    /* 
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
     */
    public int calcularIMC() {

        double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        int resultado = 0;

        if (imc < 20) {

            resultado = -1;

        } else if (imc >= 20 && imc <= 25) {

            resultado = 0;

        } else if (imc > 25) {
            resultado = 1;

        }

        return resultado;
    }

    /* 
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
     */
 /*
    public boolean esMayorDeEdad(){
    
        boolean resultado;
        
        resultado = p1.getEdad()>18;
      
    return resultado;
    }
     */

 /*
public boolean esMayorDeEdad(){
    
    boolean resultado=false;
    
    try{
    
        
        resultado = p1.getEdad()>18;
      
    }catch(Exception e){
    
        System.out.println(e.getMessage());
    }
    
    return resultado;
    }
    
     */
    public boolean esMayorDeEdad() throws Exception {

        if (p1 == null) {

            throw new Exception("Ta' todo mal");
        }

        if (p1.getEdad() < 0) {
            throw new Exception("Este ninio no nació");
        }
        boolean resultado;

        resultado = p1.getEdad() > 18;

        return resultado;
    }

}
