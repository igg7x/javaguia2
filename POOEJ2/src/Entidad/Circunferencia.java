/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class Circunferencia {

    private double radio ;

    public Circunferencia(){}
   /* public Circunferencia(double radio) {
        this.radio = radio;
    }*/
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public Circunferencia crearCircunferencia() {
  
        Scanner read = new  Scanner(System.in); 
        System.out.println("Ingrese el radio : ");
        radio = read.nextDouble();
        Circunferencia circun =  new Circunferencia();
        circun.setRadio(radio);
        return circun ; 
    }
    
    public void  area()
    {
        double area  ;
        area = Math.PI*radio;
        System.out.println("El area del circulo es  : " +area);
    }
    public void perimetro (){
        
        double perimetro ; 
        perimetro = 2*Math.PI*radio ;
           System.out.println("El perimtro  del circulo es  : " +perimetro);
    }
}