/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.notaDT;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jamon
 */
public class SelectAll_Nota {
     public static void main(String[]args){
        notaDT dto = new notaDT();
        SistemaDelegate fc = new SistemaDelegate();
        //laptopDAO dao = new laptopDAO();
        List lista;
        try{
            lista = fc.seleccionarrtodoNOTA(dto);
            Iterator it=lista.iterator();
            System.out.println("DESPLEGANDO LISTA...");
            while(it.hasNext()){
                dto=(notaDT) it.next();
                System.out.println(" | " + dto.getIdnota() + 
                        " | " + dto.getIdcelular() + 
                        " | " + dto.getFechapago() + 
                        " | " + dto.getDetalleventa() + 
                        " | " + dto.getCantidadproductos() +
                        " | " + dto.getPreciototal() + " | ");
            }
            
        }
        catch (Exception e){
            
        }
        
        
    }
}
