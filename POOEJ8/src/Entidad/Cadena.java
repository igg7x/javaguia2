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
public class Cadena {
    String Cadena ; 
    int Long ;
    public Cadena() {
    }
    public Cadena(String Cadena, int Long) {
        this.Cadena = Cadena;
        this.Long = Long;
    }
  
    public String getCadena() {
        return Cadena;
    }

    public int getLong() {
        return Long;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }

    public void setLong(int Long) {
        this.Long = Long;
    }
 
    
    
    
}
