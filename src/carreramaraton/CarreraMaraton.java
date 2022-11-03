/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carreramaraton;

import java.util.Scanner;

/**
 Se desea un sofware que  calcule N numeros de personas que participan en los 
 * juegos de la olimpiadas donde el software le pida la distancia recorrida en 
 * km y el tiempo que se tardo en recorrerla y el software pedira nombre del 
 * deportista,sexo,identificacion El software debera imprimir 
Desplasamiento km ,el tiempo que le tomo llegar,calcular la velocidad y por 
* ultimo imprimir las posiciones de cada jugador donde el que menos se demoro 
* tiene el primer puesto y el que mas se demoro tiene el ultimo puesto se parando
* mujeres y hombres, cada jugador debera aparecer con su nombre identificacion 
* sexo y decir en que puesto quedo
 * @author santy
 d/t            */
public class CarreraMaraton {

    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner (System.in);
//se defininen los tipos de datos
        





        int n,id;
String nombre,sexo;
float distancia,tiempo,velocidad; 


//Se ponen los datos de entrada
        System.out.println("Digite el numero de atletas que corrieron en la maraton");
        n=leer.nextInt();
 Competidor a[]=new Competidor[n];
    
   sexo="";
    distancia=0;
    tiempo=0;
   
   nombre="";
    id=0;
    
    
    
    
    

        for (int i = 0; i < a.length ; i++) {
         
            
            System.out.println("Digite su sexo");
            
            sexo=leer.next();
            
            System.out.println("Digite la distncia recorrida  ");
            distancia=leer.nextFloat();
            
            
             System.out.println("Digite cuanto tiempo  se demoro en recorrer en horas");
             tiempo=leer.nextFloat();
             velocidad=distancia/tiempo;
             
            
            System.out.println("Digite su nombre");
            nombre=leer.next();
            System.out.println("Digite su numero de identificacion");
            id=leer.nextInt();
            
          
            
            
           
         a[i] = new Competidor(sexo,distancia,tiempo,velocidad,nombre,id);


        }
        
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("su sexo es "+" "+a[i].getSexo()+" "+"La distancia recorrida es "+a[i].getDistancia()+" "+"el tiempo que se tardo es "+a[i].getTiempo()+"h"+" "+"su velocidad es de "+a[i].getVelocidad()+" "+"km/h "+" "+a[i].getNombre()+" "+" su id es el "+" "+a[i].getId());
        }
        
        
        
        
        
        
    }
    
}
