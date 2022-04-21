/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisisalgoritmos.proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author garroakion
 */
public class Main {
    public static Arreglos creadorArreglos = new Arreglos();
    public static FuerzaBruta metodoFuerzaBruta = new FuerzaBruta();
    public static dinamico metodoDinamico = new dinamico();
    
    public static void ejecutarMetodos(int n){
        int [] arreglo = creadorArreglos.arregloQuemado(n);
        int [] aleatorio = creadorArreglos.arregloAleatorio(n);
        
        ArrayList<Integer> listaArreglo = (ArrayList<Integer>) Arrays.stream(arreglo).boxed().collect(Collectors.toList());
        ArrayList<Integer> listaAleatorio = (ArrayList<Integer>) Arrays.stream(aleatorio).boxed().collect(Collectors.toList());
        
        System.out.println("Fuerza Bruta ---  Arreglo Quemado");
        metodoFuerzaBruta.aplicarFB(arreglo);
        System.out.println("Fuerza Bruta ---  Arreglo Aleatorio");
        metodoFuerzaBruta.aplicarFB(aleatorio);
        System.out.println("--------------------------------------------------------------------------"); 
        
        System.out.println("Programción Dinamica ---  Arreglo Quemado");
        metodoDinamico.aplicarMetodoDinamico(listaArreglo);
        System.out.println("Programción Dinamica ---  Arreglo Aleatorio");
        metodoDinamico.aplicarMetodoDinamico(listaAleatorio);
        System.out.println("--------------------------------------------------------------------------"); 
        
        
    
    }
    
    public static void main(String[] args) {
      
  
       int tamaño = 4;
  
     
       while (tamaño <= 7) {            
            ejecutarMetodos(tamaño);
            tamaño++;
        }
        tamaño += 2;
        while (tamaño <= 15) {            
            ejecutarMetodos(tamaño);
            tamaño++;
        }
        tamaño += 4;
        ejecutarMetodos(tamaño);
        tamaño += 10;
        ejecutarMetodos(tamaño);
        
  
  
    
        
        
        
        
        
        
    }
    
    
    
}