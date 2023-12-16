/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematicas;

/**
 *
 * @author Soso
 */
public class MatematicaService {
    
        Matematicas m1 = new Matematicas();
    
        public Matematicas crearMate(){
     
            m1.setNum1((int)(Math.random()*10));
            m1.setNum2((int)(Math.random()*10));
        
            return m1;
        }
        
        
// a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
        
        public void devolverMayor(){
        
            if(m1.getNum1()>m1.getNum2()){
                System.out.println("El primer atributo es mayor");
            
            }else{
                System.out.println("El segundo atributo es mayor");
            }
        
        }
        
        
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
        
        public void calcularPotencia(){
            
            int potenciaMayor;
            int num1 = m1.getNum1();
            int num2 = m1.getNum2();
        
            if(num1>num2){
            potenciaMayor= (int)Math.pow(num1,num2);
                System.out.println(num1+ " es más grande que " +num2);
            }else{
                System.out.println(num2+ " es más grande que " +num1);
            potenciaMayor= (int)Math.pow(num2,num1);
            }
            
            System.out.println(potenciaMayor);
        }
        
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
        
        public void calcularRaiz(){
            double raizMenor;
            int num1 = m1.getNum1();
            int num2 = m1.getNum2();
        
            if(num1<num2){
            raizMenor=Math.abs(Math.sqrt(num1));
                System.out.println(num1+ " es más chico que " +num2);
            }else{
                System.out.println(num2+ " es más chico que " +num1);
            raizMenor=Math.abs(Math.sqrt(num2));
            }
            
            System.out.println(raizMenor);
        
        }
        
        
    
}
