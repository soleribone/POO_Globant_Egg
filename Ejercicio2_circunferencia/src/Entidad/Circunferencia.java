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
package Entidad;

/**
 *
 * @author Soso
 */
public class Circunferencia {
    
    private double radio;

//esta funcion pide el radio y lo GUARDA como atributo del objeto.
    public Circunferencia(double radio) {
        this.radio = radio;
    }

   

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //esta funcion permite TOMAR un atributo, en este caso el valor del radio.
    public double getRadio() {
        return radio;
    }


    
    
    
    
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
  
    
    
}
