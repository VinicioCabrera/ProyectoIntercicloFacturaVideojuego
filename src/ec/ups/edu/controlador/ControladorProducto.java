/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.modelo.Producto;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author USER
 */
public class ControladorProducto {
      private int codigo;
    private Set<Producto> lista;

    public ControladorProducto() {
        codigo=1;
        lista=new HashSet<Producto>();
    }
    
     public void create(Producto producto){
        producto.setCodigo(codigo);
        codigo++;
        lista.add(producto);
    }
    
    public Producto read(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigo() == codigo){
                return producto;
            }
        }
        return null;
    }

    public void update(Producto producto){
    
        if (lista.contains(producto)){
        
            lista.remove(producto);
            lista.add(producto);
        }
    }
    
   public void remove(int codigo){
    
        for (Producto producto : lista) {
            
            if (producto.getCodigo()==codigo){
            
                lista.remove(producto);
                break;
            }
        }
    }
    
      public void printAll(){
    
        for (Producto producto : lista) {
            System.out.println(producto);
        }
    }
    
}
