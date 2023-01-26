/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class OperacionService {
    
    public Operacion CrearOperaciones(){
       
       Operacion Op1 = new Operacion();
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero : ");
        Op1.setNum1(read.nextInt());
        System.out.println("Ingrese el segundo  numero : ");
        Op1.setNum2(read.nextInt());
        return Op1 ; 
    }

     public void suma(Operacion Op1){
         int num1,num2;
         num1 = Op1.getNum1();
         num2 = Op1.getNum2();
         System.out.println("La suma de los numero es : "+(num1+num2));
     }
      public void resta(Operacion Op1){
         int num1,num2;
         num1 = Op1.getNum1();
         num2 = Op1.getNum2();
         System.out.println("La suma de los numero es : "+(num1-num2));
     }
       public void mult(Operacion Op1){
         int num1,num2;
         num1 = Op1.getNum1();
         num2 = Op1.getNum2();
           if (num1!= 0 && num2!= 0 ) {
                System.out.println("La multiplicacion de los numero es : "+(num1*num2));
           }else{
               
               System.out.println("ERROR");
               System.out.println("Multiplicacion por 0 ");
           }
     }
       
       public void div (Operacion Op1){
         int num1,num2;
         num1 = Op1.getNum1();
         num2 = Op1.getNum2();
          
           if (num2!= 0 ) {
               System.out.println("La division  de los numero es : "+(num1/num2));
           }else{
               System.out.println("Error ");
               System.out.println("Division por 0 ");
           }
       }
}
