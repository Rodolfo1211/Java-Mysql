/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.notaDT;
import java.sql.Date;

/**
 *
 * @author jamon
 */
public class Crear_Nota {
     public static void main(String[] args) {
        notaDT dto= new notaDT();
        SistemaDelegate fc = new SistemaDelegate();
        dto.setIdnota(100);
        dto.setIdcelular(1);
        dto.setFechapago(Date.valueOf("2018-09-17"));
        dto.setDetalleventa("Estuvo chida");
        dto.setCantidadproductos(1);        
        dto.setPreciototal(100.00);
        try {
            fc.crearrNOTA(dto);
            System.out.println("NOTA AGREGADA CORRECTAMENTE");
            
        } catch (Exception e) {
        }
        
    }
}
