/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Servicios;

import Entidades.Arreglos;
import static java.lang.Math.random;
import java.util.Arrays;

/**
 *
 * @author Soso
 */
public class ArregloService {
    
   Arreglos a1 = new Arreglos();
   Arreglos a2 = new Arreglos();
   
     double[] array1 = new double[50];
     double[] array2 = new double[20];
    
     
    public Arreglos crearArreglo(){
  
   
        for (int i=0;i<50;i++){
        
            array1[i] = (Math.random()*10);
            //lleno el arreglo con una variable de arreglo auxiliar.

        }

        a1.setArreglo(array1);
      
        //set solo puedo tomar un arreglo entero, no elemento por elemento.
        
    
      return a1;
    }
    
    
    public void mostrarArreglo(){
        
        System.out.println(Arrays.toString(a1.getArreglo()));
    
    }
    
//    10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    
    public void ordenarArreglo(){
        
        //ordeno y seteo el arreglo con los objetos ordenados:
        Arrays.sort(a1.getArreglo());
        a1.setArreglo(array1);
        
        //OBSERVÁ que para imprimirlos se usa "toString", porque si ponés solo a.getArreglo se imprime el lugar en memoria.
        System.out.println("Vector 1 ordenado:" +Arrays.toString(a1.getArreglo()));
        
        
    }
    
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.
    
    public void obtenerArregloB(){
    
      
        for(int i=0; i<20;i++){
            
           if(i<10){
          array2[i]=array1[i];
          a2.setArreglo(array2);
           }else if(i>10){
         
           Arrays.fill(array2,9,20,0.5);
           }
    }
        System.out.println("Vector 2:" +Arrays.toString(a2.getArreglo()));
    }
  
    
    
            
            
            
    
    
}
