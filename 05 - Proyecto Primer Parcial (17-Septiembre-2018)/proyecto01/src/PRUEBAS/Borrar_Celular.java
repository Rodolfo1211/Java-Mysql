/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.celularDT;

/**
 *
 * @author jamon
 */
public class Borrar_Celular {
    public static void main(String[]args){
        celularDT dto=new celularDT();
        SistemaDelegate fc = new SistemaDelegate();
        dto.setIdcelular(1);
        try {
            fc.eliminarrCELULAR(dto);
            System.out.println("CELULAR ELIMINADO CORRECTAMENTE");
        } catch (Exception e) {
        }
    }
}
