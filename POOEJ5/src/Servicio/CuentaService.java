/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class CuentaService {

    public CuentaService() {
    }
    
    
    public Cuenta altadeCuenta(){
        Scanner read = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.print("Ingrese su numero de cuenta : ");
        cuenta.setNumeroCuenta(read.nextInt());
        System.out.print("Ingrese su DNI : ");
        cuenta.setDNI(read.nextLong());
        System.out.print("Ingrese su saldo : ");
        cuenta.setSaldo(read.nextInt());
        return cuenta ; 
    }
    
    public boolean comprobacion(Cuenta cuenta){
         int dato1=cuenta.getNumeroCuenta();
         long dato2 = cuenta.getNumeroCuenta();
         if (dato1 == -1 && dato2== -1 )  {
            return false ;
        }else{
            return true;
        }
    }
    
    public Cuenta EliminarCuenta(long validacion , Cuenta cuenta){
        long validacion1 = cuenta.getDNI();
        if (validacion == validacion1) {
           cuenta.setDNI(-1);
           cuenta.setNumeroCuenta(-1);
        }
        return cuenta;
    }
    public  void ingresar(double ingreso , Cuenta cuenta){
        double SaldoActual = cuenta.getSaldo();
        cuenta.setSaldo((SaldoActual+ingreso));
    } 
    
    public void retirar(double retiro , Cuenta cuenta){
        double  SaldoActual = cuenta.getSaldo();
        if (retiro >= SaldoActual) {
            cuenta.setSaldo(0);
        }else{
            cuenta.setSaldo((SaldoActual-retiro));
        }
    }
      public void ExtraccionRapida(double retiro ,Cuenta cuenta){
        double  SaldoActual = cuenta.getSaldo();
        double Interes = cuenta.getInteres();
        double Interes20 = SaldoActual *Interes;
        
          if (retiro<=Interes20) {
              cuenta.setSaldo((SaldoActual - retiro));
          }else{
              cuenta.setSaldo(0);  
          }
    }
      
      public void ConsultarSaldo(Cuenta cuenta){
          System.out.println("Su saldo actual es de : "+cuenta.getSaldo());
      }
      public void ConsultarDatos(Cuenta cuenta){
          
          System.out.println("Los datos de su cuenta son : "
                  + "N° de cuenta :  "+cuenta.getNumeroCuenta()
                  + "DNI :           "+cuenta.getDNI());
      }
}
