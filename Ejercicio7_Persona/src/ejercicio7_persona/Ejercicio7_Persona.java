/*
 Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package ejercicio7_persona;

import Servicios.PersonaService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soso
 */
public class Ejercicio7_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*    PersonaService ps1 = new PersonaService();
        PersonaService ps2 = new PersonaService();
        PersonaService ps3 = new PersonaService();
        PersonaService ps4 = new PersonaService(); */
            /*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
      /*      
        ps1.crearPersona();
        ps2.crearPersona();
        ps3.crearPersona();
        ps4.crearPersona();
        
         int vectorIMC [] = new int [4]; 
         
        vectorIMC[0] = ps1.calcularIMC();
        vectorIMC[1] = ps2.calcularIMC();
        vectorIMC[2] = ps3.calcularIMC();
        vectorIMC[3] = ps4.calcularIMC();
        
       int contadorBajoPeso=0,contadorPesoNormal=0, contadorSobrePeso=0;
      int i;
      
      for(i=0;i<4;i++){
      
          
         if(vectorIMC[i]==-1){
             System.out.println("Persona " +i+ " tiene bajo peso.");
             contadorBajoPeso+=1;
             
         } if(vectorIMC[i]==0){
             System.out.println("Persona " +i+ " tiene peso normal.");
             contadorPesoNormal+=1;
         } else{
          System.out.println("Persona " +i+ " tiene sobrepeso.");
          contadorSobrePeso+=1;
         }

      }
        
       boolean vectorMayorEdad [] = new boolean [4]; 
         
        vectorMayorEdad[0] = ps1.esMayorDeEdad();
        vectorMayorEdad[1] = ps2.esMayorDeEdad();
        vectorMayorEdad[2] = ps3.esMayorDeEdad();
        vectorMayorEdad[3] = ps4.esMayorDeEdad();
        
        int contadorMayorEdad=0,contadorMenorEdad=0;
        
      for(i=0;i<4;i++){
      
          
         if(vectorMayorEdad[i]==true){
             System.out.println("Persona " +i+ " es mayor de edad");
             contadorMayorEdad+=1;
         } else{
             System.out.println("Persona " +i+ " NO es mayor de edad");
             contadorMenorEdad+=1;
         }
         
      }
        
        
      double porcentajeBajoPeso= (contadorBajoPeso*100)/4;
      double porcentajePesoIdeal= (contadorPesoNormal*100)/4;
      double porcentajeSobrePeso= (contadorSobrePeso*100)/4;
      
      double porcentajeMayorEdad =(contadorMayorEdad*100)/4;
      double porcentajeMenorEdad=(contadorMenorEdad*100)/4;
      
        System.out.println("Hay " +porcentajeBajoPeso+ "% de personas con BAJO PESO.");
        System.out.println("Hay "+porcentajePesoIdeal+"% de personas con PESO IDEAL.");
        System.out.println("Hay "+porcentajeSobrePeso+ "% de personas con SOBREPESO.");
        
        System.out.println(porcentajeMayorEdad+ "% son mayores de edad y " +porcentajeMenorEdad+ "% son menores de edad.");
      
      */
      PersonaService ps5 = new PersonaService();
      
      
      
      ps5.p1 = null;
      /*
      try{
     
      ps5.esMayorDeEdad();
          System.out.println("Mira mamá");
      }catch(Exception e){
          System.out.println("El objeto es null");
          System.out.println(e.getMessage());
      }*/
      
      //este trae el mensaje de la expeción creada en el servicio por el throw en el método esMayorEdad
      ps5.p1.setEdad(-3);
        try {
            ps5.esMayorDeEdad();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
      
    }
    
}
