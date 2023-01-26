/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidad.Cuenta;
import Servicio.CuentaService;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class POOEJ5 {

    /**
     * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner read = new Scanner(System.in);
        Scanner read1 = new Scanner(System.in);
        CuentaService Cs= new CuentaService();
        Cuenta cuenta = new Cuenta();
        Opciones1();
        op = read.nextInt();
        while(op!= 0 ){ 
            switch(op)
            {   
                case 1 : {
                     cuenta = Cs.altadeCuenta();
                     break;
                }
                case 2 : {
                    if (Cs.comprobacion(cuenta)) {
                        Opciones();
                        op = read.nextInt();
                        while(op!=0){
                            switch(op){
                                case 1 :{
                                    System.out.println("Ingresar el monto a ingresar : ");
                                    Cs.ingresar(read.nextDouble(), cuenta);
                                    break;
                                }
                                case 2 :{
                                    System.out.println("Ingresar el monto a retirar : ");
                                    Cs.ingresar(read.nextDouble(), cuenta);
                                    break;
                                }
                                case  3 :{
                                    System.out.println("Ingresar el monto a retirar : ");
                                    Cs.ingresar(read.nextDouble(), cuenta);
                                    break;
                                }
                                case 4 :{
                                   Cs.ConsultarSaldo(cuenta);
                                   break;
                                }
                                case 5  :{
                                   Cs.ConsultarDatos(cuenta);
                                   break;
                                }
                                default : {
                                    System.out.println("Opcion invalida ,Ingrese una opcion correcta : ");
                                }
                            }
                            Opciones();
                            op = read.nextInt(); 
                        }
                        
                    }else{
                        System.out.println("Debe Crear una cuenta pata acceder a las funcionalidades.");
                    }
                    break;
                }
                case 9 : {
                    String Op;
                    System.out.println("Esta seguro que desea eliminar su cuenta ? ");
                    Op = read1.nextLine();
                    if (Op.equals("Si")||Op.equals("SI")||Op.equals("si")) {
                        System.out.println("Para eliminar su cuenta ingrese el nunmero de DNI asociado a esta cuenta :");
                        Cs.EliminarCuenta(read.nextInt(), cuenta);
                    }
                   break;
                }
           }
           Opciones1();
           op = read.nextInt(); 
        }
    }
    
    
    public static void Opciones1(){
         System.out.println("MENU");
         System.out.println("1-Alta de la cuenta :  ");
         System.out.println("2-Funciones de la cuenta  : ");
         System.out.println("9-Eliminar Cuenta : ");
         System.out.println("0-SALIR");
         System.out.println("");
         System.out.print("Ingrese opcion :  ");
    }
    public static void Opciones (){
        System.out.println("MENU");
        System.out.println("1-Ingresar saldo ");
        System.out.println("2-Retirar  saldo ");
        System.out.println("3-Extraccion rapida de  saldo ");
        System.out.println("4-Consultar saldo  de mi cuenta ");
        System.out.println("5-Consultar datos  de mi cuenta ");
        System.out.println("0-SALIR");
        System.out.println("");
        System.out.print("Ingrese opcion :  ");
        
    }
}
