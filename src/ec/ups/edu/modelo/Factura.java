/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class Factura {
 private int Codigo;
 private Cliente cliente;
 private Empleado empleado;
 private Date fecha;
 private double subtotal;
 private double total;
 private double iva;
 private Set<DetalleFactura> detalleFactura;

    public Factura() {
        
    }

    public Factura(Cliente cliente, Empleado empleado, Date fecha, double subtotal, double total, double iva,int Codigo) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
        this.Codigo = Codigo;
        detalleFactura=new HashSet<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getCodigo() {
        return Codigo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public double getIva() {
        return iva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Set<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void addDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura.add(detalleFactura);
    }
    

    @Override
    public String toString() {
        return "Factura{" + "Codigo=" + Codigo + ", cliente=" + cliente + ", empleado=" + empleado + ", fecha=" + fecha + ", subtotal=" + subtotal + ", total=" + total + ", iva=" + iva + '}';
    }

   
 
}
