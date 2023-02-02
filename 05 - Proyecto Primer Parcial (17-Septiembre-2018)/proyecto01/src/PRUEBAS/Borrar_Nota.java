/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.notaDT;

/**
 *
 * @author jamon
 */
public class Borrar_Nota {
    public static void main(String[]args){
        notaDT dto =new notaDT();
        SistemaDelegate fc = new SistemaDelegate();
        dto.setIdnota(200);
        try {
            fc.eliminarrNOTA(dto);
            System.out.println("NOTA ELIMINADA CORRECTAMENTE");
        } catch (Exception e) {
        }
    
    }
}
