/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

/**
 *
 * @author USER
 */
public class Empleado extends Persona{
    private double sueldo;

    public Empleado(double sueldo, int codigo, String nombre, String cedula, String direccion, String telefono, String email) {
        super(codigo, nombre, cedula, direccion, telefono, email);
        this.sueldo = sueldo;
    }

    public Empleado() {
    }
    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

  

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
}
