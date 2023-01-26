/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;

import Entidad.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class POOEJ8 {

    /**
     * 
     * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra),deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        CadenaService Cs = new CadenaService();
        Cadena cadena =  Cs.ingresarCadena();
        String A ; 
        System.out.println("La cant de vocales que tiene la frase son : "+Cs.Mostrarvocales());
        System.out.print("La frase invertida es : ");
        Cs.darVuelta();
        System.out.println("");
        System.out.println("Ingrese una letra para saber cuantas veces se repite : ");
        A = read.nextLine();
        System.out.println("La letra se repite : "+Cs.vecesRepetido(A));
        System.out.println("Ingrese una cadena para saber si son iguales : ");
        A= read.nextLine();
        if (Cs.CompararLong(A)) {
            System.out.println("Las cadenas son iguales ");
        }else{
            System.out.println("Las cadenas no son iguales");
        }
        System.out.println("Ingrese  una frase para concatenarla : ");
        A=read.nextLine();
        System.out.println(Cs.Concatenar(A));
        System.out.println("Ingrese una letra para remplazar por la letra 'a' : ");
        A=read.nextLine();
        System.out.println(Cs.reemplazar(A));
        System.out.println("Ingrese una letra para saber cuantas si esta en la frase : ");
        A=read.nextLine();
        System.out.println(Cs.contntiene(A));
    }
    
}
