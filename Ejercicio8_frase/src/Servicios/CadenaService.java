/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class CadenaService {
    
    Scanner read = new Scanner(System.in);
    Cadena c1 = new Cadena();
    
// En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los
//siguientes métodos:
    public Cadena crearCadena(){
    
        System.out.println("Ingrese una palabra o frase:");
        c1.setFrase(read.nextLine());
        //lo que sigue es aplicar la función length al valor tomato por el get.
        c1.setLongitud(c1.getFrase().length());
    
        return c1;
    }
    
    
    
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
    
    public void mostrarVocales(){
    
        String frase=c1.getFrase();
        int longitud=c1.getLongitud();
        int sumaVocales=0,i;
        
       
        
        for(i=0;i<longitud;i++){
            
             String letra = frase.substring(i,i+1);
       
        if(letra.equalsIgnoreCase("a")
                ||letra.equalsIgnoreCase("e")
                ||letra.equalsIgnoreCase("i")
                ||letra.equalsIgnoreCase("o")
                ||letra.equalsIgnoreCase("u")){
        
            sumaVocales+=1;
                }
        
        }
    
        System.out.println("Cantidad de vocales: "+sumaVocales);
    }
    
    
    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(){
    
        String frase = c1.getFrase();
        int longitud= c1.getLongitud();
        int i;
        
        for(i=longitud; i>0; i--){
            
             String letra = frase.substring(i-1,i);
        
            System.out.print(letra);
           
        }
         System.out.println("");
    
    }
    
   
    
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    
     public void vecesRepetido(String letraInput) {
       String frase = c1.getFrase();
        int longitud= c1.getLongitud();
        int i,vecesRepetido=0;
         
        for(i=0; i<longitud;i++){
            
           String letra = frase.substring(i,i+1);
           
           if(letra.equalsIgnoreCase(letraInput)){
               
               vecesRepetido+=1;
           }

        
        }
        
         System.out.println("La letra: " +letraInput+ " se repite " +vecesRepetido+ " veces.");
     
     }
    

//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
     
     public void compararLongitud(String fraseInput){
     
         String frase = c1.getFrase();
         int longitud = c1.getLongitud();
         int longitudInput = fraseInput.length();
         
         int diferencia = Math.abs(longitud-longitudInput);
         
         System.out.println("Una de las frases tiene " +diferencia+ " carácteres más que la otra");
        
         
     
     }
     
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     
     public String unirFrases(String fraseInput){
     
         String fraseCompleta = c1.getFrase()+fraseInput;
         
         return fraseCompleta;
     
     }
     
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
     
     public void reemplazar(){
     
         String frase = c1.getFrase();
         int longitud = c1.getLongitud();
         int i;
         
          for(i=0; i<longitud;i++){
            
           String letra = frase.substring(i,i+1);
           
           if(letra.equalsIgnoreCase("a")){
      
               System.out.print("@");
           }else{
               System.out.print(letra);
           }
        }
          System.out.println("");
     }
     
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
     public void contiene(String letraInput){
         
      String frase = c1.getFrase();
         int longitud = c1.getLongitud();
         int i;
         boolean bandera = false;
      
         
          for(i=0; i<longitud;i++){
            
           String letra = frase.substring(i,i+1);
           
           if(letra.equalsIgnoreCase(letraInput)){
               
               bandera=true;
              
           }

        
        }
         
         System.out.println(bandera);
      
     
     }
    
    
    
    
    
    }
    
    

    

