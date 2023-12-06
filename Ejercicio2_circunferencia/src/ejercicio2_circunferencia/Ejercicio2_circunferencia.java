/*
 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio2_circunferencia;

import CircunferenciaService.circunferenciaService;
import Entidad.Circunferencia;

/**
 *
 * @author Soso
 */
public class Ejercicio2_circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //creo un OBJETO DEL SERVICIO para poder usar los métodos del servicio
        circunferenciaService CS = new circunferenciaService();
        
        //lo que devuelve crearCircunferencia se va a guardar en la variable circulo1:
        Circunferencia circulo1 = CS.crearCircunferencia();
        
        System.out.println(circulo1.toString());
        
        int area =CS.calcularArea(circulo1);
        
        int perimetro = CS.calcularPerimetro(circulo1);
        
        System.out.println("Radio: " +circulo1+ " Area:" +area+ " Perimetro:"+perimetro);
        
        
        
        
    }
    
}
