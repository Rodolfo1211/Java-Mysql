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
public class Actualizar_Nota {
    public static void main(String[]args){
         notaDT dto =new notaDT();
         SistemaDelegate fc = new SistemaDelegate();
         dto.setIdcelular(1);
         dto.setFechapago(Date.valueOf("2018-09-18"));
         dto.setDetalleventa("Si estuvo tan chida");
         dto.setCantidadproductos(2);
         dto.setPreciototal(200.00);
         dto.setIdnota(100);
         try {
             fc.actualizarrNOTA(dto);
             System.out.println("NOTA ACTUALIZADA CORRECTAMENTE");
        }catch (Exception e) {
           }
    }
}
