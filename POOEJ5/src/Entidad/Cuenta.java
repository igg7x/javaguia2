/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ignacio González
 */
public class Cuenta {
    
    int numeroCuenta;
    long DNI ; 
    double saldo , interes = 0.20 ; 

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldo, long DNI) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public long getDNI() {
        return DNI;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    
    
}
