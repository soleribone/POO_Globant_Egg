/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Entidades;

/**
 *
 * @author Soso
 */
public class Arreglos {
    
    
    private int dimension;
    private double[] arreglo;
    
    //el tipo de dato tiene que ser de tipo arreglo porque no voy a crear el tipo array de 0, no me da el desarrollo para eso.
    //atributos del arreglo: dimension, tipo de datos, 
    //que no hace falta esto útlimo porque el tipo de dato es el mismo para ambos array
    //pero podés pedir que el tipo de dato sea diferente con atributos

    public Arreglos() {
    }

    public Arreglos(int dimension, double[] arreglo) {
        this.dimension = dimension;
        this.arreglo = arreglo;
    }
    
    

    public int getDimension() {
        return dimension;
    }

    public double[] getArreglo() {
        return arreglo;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }
    


    
    
    
    
}
