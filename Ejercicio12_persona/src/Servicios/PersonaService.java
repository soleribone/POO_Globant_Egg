/*
 12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class PersonaService {
    
    Scanner read = new Scanner(System.in);
    Persona p1 = new Persona();
    
    public Persona crearPersona(){
    
        
        System.out.println("Ingrese nombre de la persona:");
        p1.setNombre(read.next());
        System.out.println("Ingrese una fecha de nacimiento como dd/mm/aaaa:");
        
        //como no puedo leer fechas directamente, la ingresamos como string, la guardamos en una variables
        //y después le damos un formato con DateTimeFormatter
        //finalmente la "parseamos" osea:
        /*"Parsear" se refiere al proceso de convertir una representación de datos en una estructura 
         de datos específica o en un objeto de un tipo determinado. En el contexto de fechas y cadenas 
         de caracteres, "parsear" implica tomar una cadena que contiene una fecha en un formato determinado 
          y convertirla en un objeto de fecha válido.*/
        String fechaAux=read.next();
        
        //lo siguiente le indicas que ingresás primero el dia, despues el mes y despues el año:
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate fechaDeNacimiento = LocalDate.parse(fechaAux,formatoFecha);
        
        /*tmb se puede usar esta función, haciendo tres variables:
        int dia = read.nextInt();
        int mes = read.nextInt();
        int año = read.nextInt();
        LocalDate.of(dia,mes,año);
        */
       
        
          
        p1.setFechaDeNacimiento(fechaDeNacimiento);
        
        /*
        OTRA FORMA:
        System.out.println("Ingrese la fecha de nacimiento (formato dd/MM/yyyy)");
        String fechaStr = leer.nextLine();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
           Date fechaNacimiento = formatoFecha.parse(fechaStr);
           p.setNacimiento(fechaNacimiento);
        } catch (ParseException e) {
           System.out.println("Error al analizar la fecha de nacimiento");
        }
        */
        
        
        
        return p1;
    
    }

    //German recomienda hacer siempre un imprimirPersona.
 public void imprimirPersona(){
 
    // System.out.println(p1.toString());
    //German recomienda poner cada atributo en un sout separado y no usar el toString.
     System.out.println(p1.getNombre());
     System.out.println(p1.getFechaDeNacimiento());
 }
    /*
     Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
 
 public void calcularEdad(){
 
     LocalDate fechaActual = LocalDate.now();
    
     LocalDate fechaDeNacimiento = p1.getFechaDeNacimiento();
     
    // int edad = fechaActual.compareTo(fechaDeNacimiento);
     
    //otra forma con la funcion between, con "getYears()" me devuelve solo el año de la fechas:
    
    int edad = Period.between(fechaDeNacimiento,fechaActual).getYears();
    
    //Period.between me devuelve la cantidad de años, meses y dias de diferencia, por ejemplo:30Y-6M-23D
    //uso "getYears()" para sacar los años.
     
     System.out.println("La persona tiene " +edad+ " años.");
     
     p1.setEdad(edad);
 
 }
 
 
 
 
 /*
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
*/
 
 public boolean menorQue(int edadPersona2){
 
     int edadPersona1=p1.getEdad();
     boolean bandera;
             
     if(Integer.compare(edadPersona1,edadPersona2)>0){
        bandera=true;
     }else{
        bandera=false;
     }
 
     return bandera;
 }
    
    
    
}
