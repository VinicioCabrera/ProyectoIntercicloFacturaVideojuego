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
public class Cliente extends Persona{

    public Cliente(int codigo, String nombre, String cedula, String direccion, String telefono, String email) {
        super(codigo, nombre, cedula, direccion, telefono, email);
    }

    public Cliente() {
        
    }

    
}
