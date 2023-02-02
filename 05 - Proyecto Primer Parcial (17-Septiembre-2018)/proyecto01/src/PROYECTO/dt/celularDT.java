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
public class celularDT {
    private int idcelular;
    private int idnumEmpleado;
    private int idcliente;
    private String nombre;
    private String sisoperativo;
    private String marca;
    private String memoria;
    private double precio;
    private String compañia;
    private String color;
    private int cantidadcamaras;
    private int pulgadas;
    private Date fechaventa;
    private String pixeles;

    public int getIdcelular() {
        return idcelular;
    }

    public void setIdcelular(int idcelular) {
        this.idcelular = idcelular;
    }

    public int getIdnumEmpleado() {
        return idnumEmpleado;
    }

    public void setIdnumEmpleado(int idnumEmpleado) {
        this.idnumEmpleado = idnumEmpleado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSisoperativo() {
        return sisoperativo;
    }

    public void setSisoperativo(String sisoperativo) {
        this.sisoperativo = sisoperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadcamaras() {
        return cantidadcamaras;
    }

    public void setCantidadcamaras(int cantidadcamaras) {
        this.cantidadcamaras = cantidadcamaras;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getPixeles() {
        return pixeles;
    }

    public void setPixeles(String pixeles) {
        this.pixeles = pixeles;
    }
    
    
}
