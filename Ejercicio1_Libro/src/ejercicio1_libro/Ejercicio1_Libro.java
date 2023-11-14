/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ejercicio1_libro;

import Entidades.Libro;
import LibroService.LibroService;



/**
 *
 * @author Soso
 */
public class Ejercicio1_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ahora necesito conectarme al servicio, para eso CREO UN OBJETO correspondiente al servicio de la misma manera que cree un libro:
        LibroService ls = new LibroService(); //recordar el import
        //ls es el nombre de la variable.
        
        // de esta manera tenemos acceso a los MÉTODOS de este servicio.
        
        Libro libro1 = ls.crearLibro(); 
        //lo que devuelva la función crearLibro se va a guardar en la variable "libro1"
        
        
        //luego, muestro por pantalla lo que tiene la variable "libro1":
        System.out.println(libro1.toString());
        
        
        Libro libro2 = ls.crearLibro();
        Libro libro3 = ls.crearLibro();
        
        System.out.println(libro2.toString()+ "," +libro3.toString());
        
    }
    
}
