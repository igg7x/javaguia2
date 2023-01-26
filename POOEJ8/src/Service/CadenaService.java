/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class CadenaService {

    Cadena cadena  = new Cadena() ; 
    public Cadena ingresarCadena(){ 
        Scanner read  = new Scanner(System.in);
        System.out.println("Ingrese frase : ");
        cadena.setCadena(read.nextLine());
        cadena.setLong(cadena.getCadena().length());
        return cadena; 
    }
    public int Mostrarvocales(){
         int cont =0 ;  
         
          for (int i = 0; i <cadena.getLong(); i++) {
            if ((cadena.getCadena().charAt(i) == 'a') || (cadena.getCadena().charAt(i) == 'e') || (cadena.getCadena().charAt(i) == 'i')
                    || (cadena.getCadena().charAt(i) == 'o') || (cadena.getCadena().charAt(i) == 'u')) {
                cont++;

            }

        
    }
           return cont ; 
    }
    public void darVuelta(){
        String cade = null ; 
        for (int i = cadena.getLong()-1; i>=0; i--) {
            System.out.print(cadena.getCadena().charAt(i));
        }
        
    }

    public int vecesRepetido(String letra){
        int cont = 0 ;
      
          for (int i = 0; i <cadena.getLong(); i++) {
            
              if (letra.equalsIgnoreCase(cadena.getCadena().substring(i, i+1))) {
                  cont++;
              }
        }
        
       return cont ;
    }
    public boolean CompararLong(String frase){
        int A = frase.length();
        if (cadena.getLong()==A) {
            return true ;
        }else{
            return false ;
        }  
    }
    public  String Concatenar(String frase){
        return cadena.getCadena().concat(frase);
    }
    public String reemplazar( String caracter ){
         String nueva = cadena.getCadena();
        for (int i = 0; i < cadena.getLong(); i++) {
            if (nueva.contains("a")){
                nueva = nueva.replace("a", caracter);
            }
        }
        return nueva;
    }
    public boolean contntiene(String caracter){
        
        for (int i = 0; i < cadena.getLong(); i++) {
            if (cadena.getCadena().contains(caracter)){
               return true ;
            }
        }
        return false;
    }
}
