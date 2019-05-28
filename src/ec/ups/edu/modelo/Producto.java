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
private String path;
    public Producto(int codigo, String nombre, double costo, int cantidad, Date fechaExpedicion) {
        super(codigo, nombre, costo, cantidad, fechaExpedicion);
    }

    public Producto() {
        
    }
    

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    
}
