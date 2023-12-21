/*
13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicios;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class CursoService {
    
 /*    método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.*/
    
    Curso c1 = new Curso();
    String[] alumnos = new String[5];
    //el scanner no se debe definir como un atributo de la clase
    //Scanner read = new Scanner(System.in);
 
    
    public Curso cargarAlumnos(){
        
   //piso al escaner con otro scanner declarado globalmente
     Scanner read = new Scanner(System.in);
       
     
        for(int i=0; i<alumnos.length; i++){
    
            System.out.println("Ingrese el nombre del alumno numero: "+i);
            alumnos[i]=read.nextLine();

         }
        
        c1.setAlumnos(alumnos);
        
        return c1;
    
    }
    
    public void mostrarAlumnos(){
    
        //para mostrar arreglos se usa el metodo Arrays.toString
        System.out.println("Lista de alumnos:");
        System.out.println(Arrays.toString(c1.getAlumnos()));
    
    }
    
 /*   
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos*/
    
    
    public void crearCurso(){
    
   Scanner read = new Scanner(System.in);
 
        System.out.println("Ingrese nombre del curso: ");
        String nombreCurso=read.nextLine();
        c1.setNombreCurso(nombreCurso);
        
        System.out.println("Ingrese cantidad de horas del curso por dia del curso: ");
        // int horasPorDia = Integer.parseInt(read1.nextLine());
        int horasPorDia = read.nextInt();
        c1.setCantidadDeHorasPorDia(horasPorDia);
        
        System.out.println("Ingrese cantidad de días por semana del curso:");
     c1.setCantidadDiasPorSemana(read.nextInt());
        
        System.out.println("Ingrese el turno del curso:");
        c1.setTurno(read.next());
        
        System.out.println("Ingrese el precio por hora del curso: ");
        c1.setPrecioPorHora(read.nextInt());
        
      
        //en esta función está el set con el que llené el vector de alumnos
        cargarAlumnos();
        //usamos mostrarCurso para que apenas terminemos de cargar los datos se muestren sin tener que llamarla en el main:
        mostrarCurso();
    }
 
    
    /*
    public Curso crearCurso(){
    
        System.out.println("");
        
       return new Curso();
        
    }
    */
    
    public void mostrarCurso(){
    
        //mostrar nombre del curso:
        System.out.println("Nombre del curso: " +c1.getNombreCurso());
        //mostrar cantidad de horas por día del curso:
        System.out.println("El curso son " +c1.getCantidadDeHorasPorDia()+ " horas por día.");
        //mostrar turno:
        System.out.println("El curso es turno: " +c1.getTurno());
        //mostrar precio por hora del curso:
        System.out.println("Cuesta " +c1.getPrecioPorHora()+ " la hora.");
        
        mostrarAlumnos();
    
    }
    
    
  /*  
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
    public void calcularGananciaSemanal(){
    
        int horasPorDia = c1.getCantidadDeHorasPorDia();
        int precioPorHora = c1.getPrecioPorHora();
        int cantAlumnos = alumnos.length;
        int cantDiasSemana = c1.getCantidadDiasPorSemana();
        
        int resultado = horasPorDia*precioPorHora*cantAlumnos*cantDiasSemana;
        
        System.out.println("La ganancia total es de :"+resultado);
        
    
    }
    
    
}
