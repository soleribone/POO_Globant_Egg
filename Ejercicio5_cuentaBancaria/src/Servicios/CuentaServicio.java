/*
 c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class CuentaServicio {
    
    Scanner read = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
    
        //creo un nuevo objeto al que llenar sus atributos en este método:
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        System.out.println("Ingrese el numero de cuenta:");
        cuenta1.setNumeroCuenta(read.nextInt());
        System.out.println("Ingrese el numero de DNI:");
        cuenta1.setDni(read.nextInt());
        System.out.println("Ingrese su saldo:");
        cuenta1.setSaldoActual(read.nextInt());
        
            return cuenta1;
    }
    
    //notar que este método recibe un objeto de CuentaBancaria, que atraves del get nos damos cuenta de que es el atributo SaldoActual, y un tipo double.
    public double ingresar(CuentaBancaria saldo,double ingreso){
    
        
       double saldoTotal;
       saldoTotal=saldo.getSaldoActual()+ingreso;
        
       saldo.setSaldoActual(saldoTotal);
       
     return saldoTotal;
    }
    
    
//    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
    
    public double retirar (CuentaBancaria saldo, double retiro){
    
        double saldoTotal=0;
        if(retiro>saldo.getSaldoActual()){
            System.out.println("El saldo actual es 0");
        }else {
        saldoTotal=saldo.getSaldoActual()-retiro;
//            System.out.println("Su saldo actual es: "+saldoTotal);
        }
        
        saldo.setSaldoActual(saldoTotal);
      
       return saldoTotal;
        
    }
    
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
    
    public double extraccionRapida(CuentaBancaria saldo, double retiro){
    
    double saldoLimite=(saldo.getSaldoActual())*0.2;
    double saldoActual=0;
  
    if(retiro>saldoLimite){
        System.out.println("Está excediendo el saldo a extraer permitido");
    }
    else {
    saldoActual= saldo.getSaldoActual()-retiro;
    }
    
    saldo.setSaldoActual(saldoActual);
    return saldoActual;
    
    }
    
    
    
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    
    public void consultarSaldo(CuentaBancaria saldo){
        System.out.println("Su saldo actual es: " +saldo.getSaldoActual());
    }
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    
    public void mostrarDatos(CuentaBancaria datos){
    
        System.out.println("Número de cuenta: "+datos.getNumeroCuenta());
        System.out.println("DNI: "+datos.getDni());
        System.out.println("Saldo Actual: "+datos.getSaldoActual());
    
    }
    
    
}
