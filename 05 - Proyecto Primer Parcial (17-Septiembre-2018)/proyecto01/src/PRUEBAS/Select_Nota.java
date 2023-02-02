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
public class Select_Nota {
      public static void main(String[] args) {
        notaDT dt = new notaDT();
        SistemaDelegate fc = new SistemaDelegate();
        dt.setIdnota(100);
        
        notaDT dto;
        
        try {
            dto=fc.seleccionarrNOTA(dt);
            if(dto != null)
            {
                fc.seleccionarrNOTA(dto);
                System.out.println("NOTA ENCONCTRADA");
                System.out.println(" | " + dto.getIdnota() + 
                        " | " + dto.getIdcelular() + 
                        " | " + dto.getFechapago()  +
                        " | " + dto.getDetalleventa() + 
                        " | " + dto.getCantidadproductos() +
                        " | " + dto.getPreciototal() + " | ");
            }
            else {
                fc.seleccionarrNOTA(dto);
                System.out.println("NOTA NO ENCONTRADA");
            }
        }
        catch (Exception e){
        
        }
    }
}
