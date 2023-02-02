/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.clienteDT;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jamon
 */
public class SelectAll_Cliente {
      public static void main(String[]args){
        clienteDT dto = new clienteDT();
        SistemaDelegate fc = new SistemaDelegate();
        List lista;
        try{
            lista = fc.seleccionarrtodoCLIENTE(dto);
            Iterator it=lista.iterator();
            System.out.println("DESPLEGANDO LISTA...");
            while(it.hasNext()){
                dto=(clienteDT) it.next();
                System.out.println(" | " + dto.getIdcliente() + 
                        " | " + dto.getNombre() + 
                        " | " + dto.getApaterno() + 
                        " | " + dto.getAmaterno() + 
                        " | " + dto.getRfc() + 
                        " | " + dto.getCelular() + 
                        " | " + dto.getFechanacimiento()  +
                        " | " + dto.getCorreo()  +
                        " | " + dto.getSexo() + " | ");
            }
            
        }
        catch (Exception e){
            
        }
        
        
    }
}
