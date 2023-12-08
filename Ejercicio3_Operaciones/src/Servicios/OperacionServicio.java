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
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class OperacionServicio {
    
    Scanner read = new Scanner(System.in);
    //crearOperacion: le pide al usuario los datos de los numeros y los GUARDA EN LOS ATRIBUTOS:
    public Operacion crearOperacion(){
        
        Operacion operacion1 = new Operacion();
      
        
        System.out.println("Ingrese un número:");
        operacion1.setNum1(read.nextInt());
        
        System.out.println("Ingrese otro número:");
        operacion1.setNum2(read.nextInt());
        
        return operacion1;
    }
    
    
    //paso por parrámetro un OBJETO de tipo operacion sobre el que quiero que se realicen los cálculos:
    public int suma(Operacion operacion1){
    
     int suma= operacion1.getNum1()+operacion1.getNum2();
             
             return suma;
    }
    
    
    public int resta(Operacion operacion1){
    
        int num1 = operacion1.getNum1();
        int num2=operacion1.getNum2();
        int resta;
        
      if (num1>num2){
      resta = num1-num2;
      }else{
      resta = num2-num1;
      }
      
      return resta;
    }
    
    public int multiplicacion(Operacion operacion1){
    
        
     int resultado=operacion1.getNum1()*operacion1.getNum2();
     
     if (resultado==0){
         System.out.println("Error el resultado es 0");
     }
//     else{
//         System.out.println(resultado);
//     }
     
     return resultado;
     
    }
    
    
    public double division(Operacion operacion1){
        
    double resultado=0;
        
    if(operacion1.getNum1()==0 || operacion1.getNum2()==0){
        System.out.println("Error: el resultado es 0");
    }else{
         resultado = operacion1.getNum1()/operacion1.getNum2();
    }
    
    
     
     
    return resultado;
    
  
    }
    
}
