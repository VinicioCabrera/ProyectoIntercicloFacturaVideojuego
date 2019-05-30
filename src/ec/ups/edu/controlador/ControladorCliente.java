/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class ControladorCliente {
    private int codigo;
    private Set<Cliente> lista;

    public ControladorCliente() {
        codigo=1;
        lista=new HashSet<Cliente>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Set<Cliente> getLista() {
        return lista;
    }
    
    
     public void create(Cliente cliente){
        cliente.setCodigo(codigo);
        codigo++;
        lista.add(cliente);
    }
    
    public Cliente read(int codigo){
        for (Cliente cliente : lista) {
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }
        return null;
    }

    public void update(Cliente cliente){
    
        if (lista.contains(cliente)){
        
            lista.remove(cliente);
            lista.add(cliente);
        }
    }
    
   public void remove(int codigo){
    
        for (Cliente cliente : lista) {
            
            if (cliente.getCodigo()==codigo){
            
                lista.remove(cliente);
                break;
            }
        }
    }
    
      public void printAll(){
    
        for (Cliente cliente : lista) {
            System.out.println(cliente);
        }
    }
    
}   

