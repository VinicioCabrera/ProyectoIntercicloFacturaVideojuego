/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class ControladorFactura {
      private int codigo;
    private Set<Factura> lista;

    public ControladorFactura() {
        codigo=1;
        lista=new HashSet<Factura>();
    }
    
     public void create(Factura factura){
        factura.setCodigo(codigo);
        codigo++;
        lista.add(factura);
    }
    
    public Factura read(int codigo){
        for (Factura factura : lista) {
            if(factura.getCodigo() == codigo){
                return factura;
            }
        }
        return null;
    }

    public void update(Factura factura){
    
        if (lista.contains(factura)){
        
            lista.remove(factura);
            lista.add(factura);
        }
    }
    
   public void remove(int codigo){
    
        for (Factura factura : lista) {
            
            if (factura.getCodigo()==codigo){
            
                lista.remove(factura);
                break;
            }
        }
    }
    
      public void printAll(){
    
        for (Factura factura : lista) {
            System.out.println(factura);
        }
    }
}
