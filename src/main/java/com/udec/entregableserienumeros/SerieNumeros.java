/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.entregableserienumeros;

/**
 *
 * @author Michael Cardenas
 * clase que contiene el metodo principal donde arranca el programa
 */
public class SerieNumeros {
    
    /**
     * constructor de la clase inicializa el objeto de la clase
     */
    public SerieNumeros(){
        
    }
    
    
    /**
     * 
     * @param args recibe un arreglo de string de n tamaño
     * metodo estatico donde comienza el programa
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numero numero = new Numero();
        numero.llenar();
    }
}
