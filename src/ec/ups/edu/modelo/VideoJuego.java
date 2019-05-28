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
public class VideoJuego extends Stock{
    
    private int codigoJ;

    public VideoJuego(int codigoJ, int codigo, String nombre, double costo, int cantidad, Date fechaExpedicion) {
        super(codigo, nombre, costo, cantidad, fechaExpedicion);
        this.codigoJ = codigoJ;
    }

    public int getCodigoJ() {
        return codigoJ;
    }

    public void setCodigoJ(int codigoJ) {
        this.codigoJ = codigoJ;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigoJ=" + codigoJ + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigoJ;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VideoJuego other = (VideoJuego) obj;
        if (this.codigoJ != other.codigoJ) {
            return false;
        }
        return true;
    }

   
    
}
