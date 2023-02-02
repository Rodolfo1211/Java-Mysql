/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.celularDT;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jamon
 */
public class SelectAll_Celular {
     public static void main(String[]args){
        celularDT dto = new celularDT();
        SistemaDelegate fc = new SistemaDelegate();
        List lista;
        try{
            lista = fc.seleccionarrtodoCELULAR(dto);
            Iterator it=lista.iterator();
            System.out.println("DESPLEGANDO LISTA...");
            while(it.hasNext()){
                dto=(celularDT) it.next();
                System.out.println(" | " + dto.getIdcelular() + 
                        " | " + dto.getIdnumEmpleado() + 
                        " | " + dto.getIdcliente() + 
                        " | " + dto.getNombre() + 
                        " | " + dto.getSisoperativo() + 
                        " | " + dto.getMarca() + 
                        " | " + dto.getMemoria() +
                        " | " + dto.getPrecio() +
                        " | " + dto.getCompañia() +
                        " | " + dto.getColor() +
                        " | " + dto.getCantidadcamaras() +
                        " | " + dto.getPulgadas() + 
                        " | " + dto.getFechaventa()  +
                        " | " + dto.getPixeles() + " | ");
            }
            
        }
        catch (Exception e){
            
        }
        
        
    }
}
