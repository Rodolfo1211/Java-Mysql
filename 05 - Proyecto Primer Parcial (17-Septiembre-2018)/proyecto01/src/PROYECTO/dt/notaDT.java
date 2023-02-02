/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.dt;

import java.sql.Date;

/**
 *
 * @author jamon
 */
public class notaDT {
    private int idnota;
    private int idcelular;
    private Date fechapago;
    private String detalleventa;
    private int cantidadproductos;
    private Double preciototal;

    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
    }

    public int getIdcelular() {
        return idcelular;
    }

    public void setIdcelular(int idcelular) {
        this.idcelular = idcelular;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getDetalleventa() {
        return detalleventa;
    }

    public void setDetalleventa(String detalleventa) {
        this.detalleventa = detalleventa;
    }

    public int getCantidadproductos() {
        return cantidadproductos;
    }

    public void setCantidadproductos(int cantidadproductos) {
        this.cantidadproductos = cantidadproductos;
    }

    public Double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(Double preciototal) {
        this.preciototal = preciototal;
    }
    
    
}
