/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreramaraton;

/**
 *
 * @author santy
 */
public class Competidor {

   
    
    
     private String sexo;
    private float distancia;
    private float tiempo;
    private float velocidad; 
    private String nombre;
    private int id;
     
    
    public Competidor(){
    sexo="";
    distancia=0;
    tiempo=0;
   velocidad=0;
   nombre="";
    id=0;
    
    
    
    
    }
    
        public Competidor(String s,float d,float t,float v,String n,int dd ){
    sexo=s;
    distancia=d;
    tiempo=t;
   velocidad=v;
   nombre=n;
    id=dd;
    
    
    
    
    }
    
    
    
    
    
    
 
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
}
