/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;


import ec.ups.edu.modelo.Empleado;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class ControladorEmpleado {
 private int codigo;
    private Set<Empleado> lista;

    public ControladorEmpleado() {
        codigo=1;
        lista=new HashSet<Empleado>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Set<Empleado> getLista() {
        return lista;
    }
    
    
     public void create(Empleado empleado){
        empleado.setCodigo(codigo);
        codigo++;
        lista.add(empleado);
    }
    
    public Empleado read(int codigo){
        for (Empleado empleado : lista) {
            if(empleado.getCodigo() == codigo){
                return empleado;
            }
        }
        return null;
    }
    public Empleado readC(String cedula){
        for (Empleado empleado : lista) {
            if(empleado.getCedula().equals(cedula)){
                return empleado;
            }
        }
        return null;
    }

    public void update(Empleado empleado){
    
        if (lista.contains(empleado)){
        
            lista.remove(empleado);
            lista.add(empleado);
        }
    }
    
   public void remove(int codigo){
    
        for (Empleado empleado : lista) {
            
            if (empleado.getCodigo()==codigo){
            
                lista.remove(empleado);
                break;
            }
        }
    }
    
      public void printAll(){
    
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }     
}
