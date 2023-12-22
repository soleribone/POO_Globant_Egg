/*
 14. Una tienda que vende teléfonos móviles quiere tener registro de 
cada producto que posee en un sistema computacional. Para ello, 
crearemos un programa donde se pueda almacenar cada producto con su información. 
Crear una entidad Movil con los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo. 
El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número 
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicios;

import Entidades.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class MovilService {
   
    /*
     Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa.
    */
    Movil cel1 = new Movil();
    
    public Movil cargarCelular(){
    
        Scanner read = new Scanner(System.in);
        
        System.out.println("Marca del celular:");
        cel1.setMarca(read.next());
        
        System.out.println("Ingresa el precio:");
        cel1.setPrecio(read.nextDouble());
        
        System.out.println("Ingrese modelo:");
        cel1.setModelo(read.next());
        
        System.out.println("Ingrese memoriaRam:");
        cel1.setMemoriaRam(read.nextInt());
        
        System.out.println("Ingresa almacenamiento:");
        cel1.setAlmacenamiento(read.nextInt());
        
        
       ingresarCodigo();
   
       return cel1;
    }
    
    /*
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
    public int[] ingresarCodigo(){
    
        Scanner read = new Scanner(System.in);
        
        int[] codigo = new int[7];
        
        
        
        for(int i=0;i<codigo.length; i++){
        
            System.out.println("Ingrese el digito "+i+" del codigo.");
        codigo[i]=read.nextInt();
            
        }
        
        cel1.setCodigo(codigo);
   
    
        return codigo;
    }
    
    
   public void mostrarDatos(){
       
      /* precio, modelo, memoriaRam, almacenamiento y codigo. 
El atributo código*/
        //print marca:
       String marca = cel1.getMarca();
       
       System.out.println("Marca: "+marca);
       
       //print modelo:
       
       String modelo = cel1.getModelo();
       
       System.out.println("Modelo: " +modelo);
       
       //print precio:
       double precio=cel1.getPrecio();
       System.out.println("Precio: $"+precio);
       
       //print memoriaRam:
       int memoriaRam =cel1.getMemoriaRam();
       
       System.out.println("Memoria RAM: "+memoriaRam);

       //print almacenamiento:
       int almacenamiento = cel1.getAlmacenamiento();
       
       System.out.println("Almacenamiento: "+almacenamiento);
       
       //print codigo:
       
       int[] arregloCodigo = cel1.getCodigo();
       
       System.out.println("Código: "+Arrays.toString(arregloCodigo));
       
       
   
   }
    
    
    
}
