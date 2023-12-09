/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package RectanguloServicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class RectanguloServicio {
    
    Scanner read = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo rect1 = new Rectangulo();
        
        System.out.println("Ingrese valor de la base:");
        rect1.setBase(read.nextInt());
        System.out.println("Ingrese valor de la altura:");
        rect1.setAltura(read.nextInt());
        
        
        
        return rect1;
    }
    
    
    public int superficieRectangulo(Rectangulo rect1){
     
        int superficie=rect1.getBase()*rect1.getAltura();
        
        
        return superficie;
    }
    
    //recordemos que lo que declaremos como parametro en el metodo puede ser cualquier cosa, como rect1, "r",etc
    public int perimetroRectangulo(Rectangulo r){
    
        int perimetro=(r.getBase()+r.getAltura())*2;
                
     return perimetro;
    }
    
    
    public void dibujarRectangulo(Rectangulo r){
    
        for (int i = 0; i < r.getAltura(); i++) {
            
            for (int j = 0; j <r.getBase(); j++) {
                
                System.out.print("*");
                
                
            }
            System.out.println("");
        }
    }
    
}
