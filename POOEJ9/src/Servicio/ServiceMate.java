/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Ignacio González
 */
public class ServiceMate {
    Matematica mate ; 
    
    
    public void Mostrar(Matematica mate){
        System.out.println(mate.getNum1());
        System.out.println(mate.getNum2());
    }
    public double mayor(Matematica mate){
        if (mate.getNum1()>mate.getNum2()) {
            return mate.getNum1();
        }else if(mate.getNum2()>mate.getNum1()){
            return mate.getNum2();
        }else{
            return 0;
        }
    }
    
    public double potencia(Matematica mate){
        double a  = Math.round(mate.getNum1());
        double b = Math.round(mate.getNum2());
        if (a>b) {
            return Math.pow(a, b);
        }else{
            return Math.pow(b, a);
        }
    }
    
        public double raiz(Matematica mate){
            double a  = Math.abs(mate.getNum1());
            double b = Math.abs(mate.getNum2());
            if (a>b) {
                return Math.sqrt(b);
            }else{
                return Math.sqrt(a);
            }
        }
    
}
