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
public class DetalleFactura extends Stock {
  private int CodigoFD;
  private VideoJuego videojuego;
  private int Cantidad; 

    public DetalleFactura() {
    }

    public DetalleFactura(int CodigoFD, VideoJuego videojuego, int Cantidad) {
        this.CodigoFD = CodigoFD;
        this.videojuego = videojuego;
        this.Cantidad = Cantidad;
    }

    public DetalleFactura(int CodigoFD, VideoJuego videojuego, int Cantidad, int codigo, String nombre, double costo, String descripcion, Date fechaExpedicion) {
        super(codigo, nombre, costo, descripcion, fechaExpedicion);
        this.CodigoFD = CodigoFD;
        this.videojuego = videojuego;
        this.Cantidad = Cantidad;
    }

    public int getCodigoFD() {
        return CodigoFD;
    }

    public VideoJuego getVideojuego() {
        return videojuego;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCodigoFD(int CodigoFD) {
        this.CodigoFD = CodigoFD;
    }

    public void setVideojuego(VideoJuego videojuego) {
        this.videojuego = videojuego;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "CodigoFD=" + CodigoFD + ", videojuego=" + videojuego + ", Cantidad=" + Cantidad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.CodigoFD;
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
        final DetalleFactura other = (DetalleFactura) obj;
        if (this.CodigoFD != other.CodigoFD) {
            return false;
        }
        return true;
    }
  
  
}
