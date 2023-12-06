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
package CircunferenciaService;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class circunferenciaService {
    
    Scanner read = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
    
        System.out.println("Ingrese el valor del radio:");
        double radio = read.nextInt();
        
        return new Circunferencia(radio);
    }
    
    
    public int calcularArea(Circunferencia r){
        
    
        int area = (int) ((Math.PI)*r.getRadio()*r.getRadio());
        return area;
    }
    
    public int calcularPerimetro(Circunferencia r){
        int perimetro=(int) (2*Math.PI*r.getRadio());
        return perimetro;
    
    }
    
}
