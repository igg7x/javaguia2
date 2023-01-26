/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Service.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class RecService {
    
    
    public Rectangulo crearRectangulo(){
        Rectangulo R1 = new Rectangulo();
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo :  ");
        R1.setBase(read.nextInt());
        System.out.print("Ingrese la altura del rectangulo : ");
        R1.setAltura(read.nextInt());
        return R1; 
    }
    
    public int area(Rectangulo R1){
         int Base=R1.getBase(),Altura=R1.getAltura() ; 
        
        return Base*Altura ;
    }
    
    public int per(Rectangulo R1){
         int Base=R1.getBase(),Altura=R1.getAltura() ; 
        
        return (Base+Altura)*2 ;
    }
    
    public void asteriscos (Rectangulo R1){
         int Base=R1.getBase(),Altura=R1.getAltura() ; 
        
          for (int i = 0; i < Base ; i++) {
              for (int j = 0 ; j < Altura ; j++) {
                  System.out.print("*");
              }
              System.out.println(" ");
        }
    }
}
