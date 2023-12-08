/*
3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package ejercicio3_operaciones;

import Entidades.Operacion;
import Servicios.OperacionServicio;

/**
 *
 * @author Soso
 */
public class Ejercicio3_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        OperacionServicio os = new OperacionServicio();
        
        //tengo que crear una variable operacion, osea un objeto operacion, en donde alojar la operacion con sus atributos llenos:
        //el metodo crearOperacion retorna un objeto operacion con sus atributos llenos, y tenermos que alojarlo en el objeto
        Operacion op1 =os.crearOperacion();
        
        //ahora puedo usar como parámetro a OP1 en los métodos de la clase Servicio.
        
        int resultadoSuma= os.suma(op1);
        int resultadoResta=os.resta(op1);
        
        System.out.println("Suma: "+resultadoSuma);
        System.out.println("Resta:" +resultadoResta);
        
        
       int resultadoMultiplicacion = os.multiplicacion(op1);
        System.out.println("Multiplicacion: " +resultadoMultiplicacion);
        
        double resultadoDivision= os.division(op1);
        System.out.println("Division: "+resultadoDivision);
       
        
        
        
        
    }
    
}
