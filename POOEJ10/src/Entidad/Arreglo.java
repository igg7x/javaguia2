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
public class Arreglo {

     double []ArrayA= new double[50];
     double []ArrayB= new double[20];
     public Arreglo() {
    }
     
    public double[] getArrayA() {
        return ArrayA;
    }

    public double[] getArrayB() {
        return ArrayB;
    }

    public void setArrayA(double[] ArrayA) {
        this.ArrayA = ArrayA;
    }

    public void setArrayB(double[] ArrayB) {
        this.ArrayB = ArrayB;
    }
}
