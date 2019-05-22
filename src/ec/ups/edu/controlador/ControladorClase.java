/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.modelo.Clase;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class ControladorClase {
    private int codigo;
    private Set<Clase> lista;

    public ControladorClase() {
        codigo=1;
        lista=new HashSet<Clase>();
    }
    
     public void create(Clase clase){
        clase.setCodigo(codigo);
        codigo++;
        lista.add(clase);
    }
    
    public Clase read(int codigo){
        for (Clase clase : lista) {
            if(clase.getCodigo() == codigo){
                return clase;
            }
        }
        return null;
    }

    public void update(Clase clase){
    
        if (lista.contains(clase)){
        
            lista.remove(clase);
            lista.add(clase);
        }
    }
    
   public void remove(int codigo){
    
        for (Clase clase : lista) {
            
            if (clase.getCodigo()==codigo){
            
                lista.remove(clase);
                break;
            }
        }
    }
    
      public void printAll(){
    
        for (Clase clase : lista) {
            System.out.println(clase);
        }
    }
    
}   

