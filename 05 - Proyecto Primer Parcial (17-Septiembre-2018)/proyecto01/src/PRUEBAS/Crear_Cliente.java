/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.clienteDT;
import java.sql.Date;

/**
 *
 * @author jamon
 */
public class Crear_Cliente {
    public static void main(String[] args) {
        clienteDT dto= new clienteDT();
        SistemaDelegate fc = new SistemaDelegate();
        dto.setIdcliente(1);
        dto.setNombre("Armando");
        dto.setApaterno("Alvarez");
        dto.setAmaterno("Aguilar");
        dto.setRfc("abcdefghijk123");
        dto.setCelular(554005538);
        dto.setFechanacimiento(Date.valueOf("1991-01-01"));
        dto.setCorreo("elonedollars@yahoo.com");
        dto.setSexo("Masculino");
        try {
            fc.crearrCLIENTE(dto);
            System.out.println("CLIENTE AGREGADO CORRECTAMENTE");
            
        } catch (Exception e) {
        }
        
    }
}
