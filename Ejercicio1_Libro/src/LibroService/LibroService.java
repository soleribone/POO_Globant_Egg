/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroService;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class LibroService {
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    //NO ES LÓGICO QUE UN LIBRO SE CREE A SÍ MISMO, por eso es más efectivo que la creación la haga el servicio.
    Libro libro1 = new Libro();
    //el siguiente es un MÉTODO específico para CREAR LIBROS:
    public Libro crearLibro (){
    
        //necesito declarar las variables para ingresarlas como dato al objeto:
        System.out.println("Introduzca el ISBN:");
        String ISBN =read.next();
        
        System.out.println("Introduzca el título del libro:");
        String titulo =read.next();
        
        System.out.println("Introduzca el autor:");
         String autor =read.next();
        
        
        System.out.println("Introduzca el número de páginas:");
        int numeroDePaginas =read.nextInt();
        
        //Libro libro1 = new Libro(ISBN, titulo, autor, numeroDePaginas);
        
        //return libro1;
        
        //tmb podemos directamente retornar la creación del objeto:
        return new Libro(ISBN, titulo, autor, numeroDePaginas);
        
    }
    
}
