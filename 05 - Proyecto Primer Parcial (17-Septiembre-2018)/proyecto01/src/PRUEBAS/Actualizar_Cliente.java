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
public class Actualizar_Cliente {
    public static void main(String[]args){
        clienteDT dto =new clienteDT();
        SistemaDelegate fc = new SistemaDelegate();
        dto.setNombre("Benitooo");
        dto.setApaterno("Bimbrera");
        dto.setAmaterno("Benitez");
        dto.setRfc("abcdefghijk456");
        dto.setCelular(554005539);
        dto.setFechanacimiento(Date.valueOf("1992-02-02"));
        dto.setCorreo("elsegundo@yahoo.com");
        dto.setSexo("Masculino");
        dto.setIdcliente(100);
        try {
            fc.actualizarrCLIENTE(dto);
            System.out.println("CLIENTE ACTUALIZADO CORRECTAMENTE");
        } catch (Exception e) {
        }
    }
}
