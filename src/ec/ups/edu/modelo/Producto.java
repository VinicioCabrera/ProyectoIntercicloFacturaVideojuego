/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Producto extends Stock{
private Clase clase;
    public Producto(int codigo, String nombre, double costo, String descripcion, Date fechaExpedicion) {
        super(codigo, nombre, costo, descripcion, fechaExpedicion);
    }

    public Producto() {
        
    }
    

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
    
    
    
}
