/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_rectángulo;

import Entidad.Rectangulo;
import RectanguloServicio.RectanguloServicio;

/**
 *
 * @author Soso
 */
public class Ejercicio4_Rectángulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RectanguloServicio SR = new RectanguloServicio();
        
        Rectangulo rectangulo1 = SR.crearRectangulo();
        
        int superficie = SR.superficieRectangulo(rectangulo1);
                
        int perimetro=  SR.perimetroRectangulo(rectangulo1);
        
        System.out.println("Superficie: "+superficie);
        System.out.println("Perimetro: "+perimetro);
        
        SR.dibujarRectangulo(rectangulo1);
        
        
        
        
    }
    
}
