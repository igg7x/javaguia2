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
public class Cafetera {
    
    
    double  capacidadMAX = 2 ; //litros 
    double  CapacidadActual ; 

    public Cafetera() {
    }
    
    public Cafetera(double CapacidadActual) {
        this.CapacidadActual = CapacidadActual;
    }

    public double getCapacidadMAX() {
        return capacidadMAX;
    }

    public double  getCapacidadActual() {
        return CapacidadActual;
    }

    public void setCapacidadMAX(double  capacidadMAX) {
        this.capacidadMAX = capacidadMAX;
    }

    public void setCapacidadActual(double  CapacidadActual) {
        this.CapacidadActual = CapacidadActual;
    }
    
    
}
