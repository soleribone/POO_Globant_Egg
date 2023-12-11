/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class CafeteraServicio {
    
    Scanner read = new Scanner(System.in);
    
    
    //     Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
    
    public Cafetera llenarCafetera(){
    
        Cafetera cafe1 = new Cafetera();
        
        System.out.println("Ingrese la cantidad de café:");
        cafe1.setCantMaxima(read.nextDouble());
        
        //en esta linea le asigno al atributo cantidad Actual, la cantidad del atributo cant maxima,
        //así igualo el valor de ambos atributos.
       cafe1.setCantActual(cafe1.getCantMaxima());
        
        
        return cafe1;
    }
    
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    
    public void servirTaza(Cafetera cafe,int tamanoTaza){
        
        
        
    
        
    }
    
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
            
            
    
    
}
