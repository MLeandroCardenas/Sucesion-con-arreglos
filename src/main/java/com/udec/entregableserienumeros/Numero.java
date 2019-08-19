/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.entregableserienumeros;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Michael Cardenas
 * clase que contiene los metodos necesarios para resolver el problema
 */
public class Numero {
    
    /**
     * variable que almacena un conjunto de numeros dados por el usuario
     */
    private byte []numeros;
    
    
    /**
     * metodo usado para llenar el arreglo de numeros que el usuario digita
     * 
     */
    public void llenar(){
        
            Scanner entrada = new Scanner(System.in);
            System.out.println("Cantidad de numeros: ");
            byte tamanio = entrada.nextByte();
            numeros = new byte[tamanio];    
        
            for(byte i=0;i<tamanio;i++){
                System.out.print("Numero: ");
                numeros[i] = entrada.nextByte();
            }
            Arrays.sort(numeros);
            eliminarRepetidos(numeros);
            
            System.out.println("Arreglo ordenado");
            for(byte i=0;i<tamanio;i++){
                if(numeros[i]!=0)
                    System.out.print("  " + numeros[i]);
            }
            System.out.println();
            completarSerie(numeros);
    }
    
    /**
     * 
     * @param arreglo recibe el arreglo lleno 
     * metodo que elimina los numeros repetidos de arreglo
     */
    public void eliminarRepetidos(byte[]arreglo){
        
        byte aux = (byte)arreglo.length;
        byte []arregloAux = new byte[aux];
        
        for(byte i=0;i<arreglo.length;i++){
            for(byte j=0;j<arreglo.length-1;j++){
                if(i!=j){
                    if(arreglo[i]==arreglo[j]){
                        arreglo[i]=0;
                        
                    }
                }
            }
            
            for(byte k=0;k<=aux-1;k++){
                     if(arreglo[k]!=0)
                        arregloAux[k] = arreglo[k];   
            }
        }
    }
    
    /**
     * 
     * @param arreglo recibe el arreglo lleno y sin numeros repetidos
     * se encarga de hallar los numeros faltantes de la serie de numeros
     */
    private void completarSerie(byte[]arreglo){
        byte suma = 0;
        byte menor=0,mayor=0;
        byte []arregloAux;
        System.out.println("Numeros faltantes");
        
        byte aux = (byte) (arreglo.length-1);
        menor = arreglo[0];
        mayor = (byte) (arreglo[aux]);
        
        suma = menor;
        arregloAux = new byte[mayor];
        
        for(byte i=1;i<mayor;i++){
            arregloAux[i] = suma++;
        }
        
        for(byte i=0;i<arregloAux.length;i++){
            boolean bandera = true;
            for(int j=0;j<arreglo.length;j++){
                if(arreglo[j]==arregloAux[i]){
                    bandera=false;
                }
            }
            if(bandera){
                System.out.print("  " + arregloAux[i]);
            }
        }
    }
}

