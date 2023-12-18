/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11_date;

import java.util.Calendar;

import java.util.Scanner;

/*
 *
 * @author Soso
 */
public class Ejercicio11_date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        
        -------VERSIÓN DE UN COMPAÑERO:----------------
        Scanner leer = new Scanner(System.in);
        
        int dia;
        int mes;
        int año;
        
        System.out.println("Ingrese año");    
        año = leer.nextInt();
        System.out.println("Ingrese mes");    
        mes = leer.nextInt();
        System.out.println("Ingrese dia");    
        dia = leer.nextInt();
        
        LocalDate fecha = LocalDate.of(año, mes, dia);
        LocalDate hoy  = LocalDate.now();
        
        int años = Period.between(fecha, hoy).getYears();
        int meses = Period.between(fecha, hoy).getMonths();
        int dias = Period.between(fecha, hoy).getDays();
        
        
        
        System.out.println(años + " " + meses + " " + dias + "" + Period.between(fecha, hoy).toString());
        
    */
        
        
        /*
-------------MI VERSIÓN:-----------------------
 */
        
        Scanner read = new Scanner(System.in);
   
           Calendar fechaIngresada = Calendar.getInstance();
         Calendar fechaActual =Calendar.getInstance();
        
        System.out.println("Ingrese un día:");
        int dia = read.nextInt();
        System.out.println("Ingrese un mes:");
        int mes =read.nextInt();
        System.out.println("Ingrese un año:");
        int anio=read.nextInt();
        
  fechaIngresada.set(Calendar.DAY_OF_MONTH,dia);
  fechaIngresada.set(Calendar.YEAR,anio);
  fechaIngresada.set(Calendar.MONTH, mes);
        
        System.out.println(dia+ "/" +mes+ "/" +anio);
        
         int dia1 = fechaActual.get(Calendar.DAY_OF_MONTH);  
         int mes1 = fechaActual.get(Calendar.MONTH)+1;
         int anio1 = fechaActual.get(Calendar.YEAR);
         
         System.out.println(dia1+ "/" +mes1+ "/" +anio1);
         
         int aniosEntre = Math.abs(anio1-anio);
         
         System.out.println("Hay "+aniosEntre+ " años de diferencia entre una fecha y otra." );
         
        
        
        
        
    }
    
}
