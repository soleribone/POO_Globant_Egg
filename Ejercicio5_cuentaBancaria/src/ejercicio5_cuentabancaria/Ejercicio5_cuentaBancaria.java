/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
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
package ejercicio5_cuentabancaria;

import Entidades.CuentaBancaria;
import Servicios.CuentaServicio;

/**
 *
 * @author Soso
 */
public class Ejercicio5_cuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaServicio cs = new CuentaServicio();
        
        CuentaBancaria cuenta1 = cs.crearCuenta();
        
        //Ingresamos dinero:
        double saldoConIngreso=cs.ingresar(cuenta1, 1000);
        
        System.out.println("Después del ingreso usted tiene: "+saldoConIngreso);
        System.out.println("============================");
        
        //Retiramos dinero:
        double saldoConRetiro=cs.retirar(cuenta1, 500);

        System.out.println("Después del retiro usted tiene: "+saldoConRetiro);
        System.out.println("============================");
        
        //consultar saldo:
        cs.consultarSaldo(cuenta1);
        System.out.println("============================");
        
        //extracción rápida:
        double saldoConER=cs.extraccionRapida(cuenta1, 3000);
        
        
        System.out.println("Su saldo luego de la extracción rápida es: "+saldoConER);
        System.out.println("============================");
        
        //mostrar datos:
        cs.mostrarDatos(cuenta1);
        
        
        
        
    }
    
}
