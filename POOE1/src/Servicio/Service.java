/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libros;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class Service {
    
    public Libros CargadeLibro(){
        Libros L1 = new Libros() ; 
        Scanner read = new Scanner(System.in);
         Scanner read1 = new Scanner(System.in);
        System.out.println("Ingrese el ISBN(codigo) del libro");
        L1.setISBN(read1.nextInt());
        System.out.println("Ingrese el nombre del libro  : ");
        L1.setTitulo(read.nextLine());
        System.out.println("Ingrese el autor del libro : ");
        L1.setAutor(read.next());
        System.out.println("Ingrese la canr¿tidad de paginas del libro : ");
        L1.setPaginas(read1.nextInt());
        return L1 ;
    }
}
