/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.celularDT;
import java.sql.Date;

/**
 *
 * @author jamon
 */
public class Actualizar_Celular {
    public static void main(String[]args){
        celularDT dto = new celularDT();
        SistemaDelegate fc = new SistemaDelegate();
         dto.setIdnumEmpleado(1);
        dto.setIdcliente(100);
        dto.setNombre("iPhone Xs");
        dto.setSisoperativo("iOS");
        dto.setMarca("Apple");
        dto.setMemoria("64 Gb");
        dto.setPrecio(36000.00);
        dto.setCompañia("AT&T");
        dto.setColor("Negro Black");
        dto.setCantidadcamaras(3);
        dto.setPulgadas(7);
        dto.setFechaventa(Date.valueOf("2018-09-18"));
        dto.setPixeles("21 mp");
        dto.setIdcelular(1);
        try {
            fc.actualizarrCELUlAR(dto);
            System.out.println("CELULAR ACTUALIZADO");
        } catch (Exception e) {
        }
    }
}
