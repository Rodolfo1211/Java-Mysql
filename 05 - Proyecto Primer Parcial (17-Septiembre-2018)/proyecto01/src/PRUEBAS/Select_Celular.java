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
public class Select_Celular {
    public static void main(String[] args) {
        celularDT dt = new celularDT();
        SistemaDelegate fc = new SistemaDelegate();
        dt.setNombre("Samsung Galaxy Note 7");
        celularDT dto;
        
        try {
            dto=fc.seleccionarrCELULAR(dt);
            if(dto != null)
            {
                fc.seleccionarrCELULAR(dto);
                System.out.println("CELULAR ENCONTRADO");
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
            else {
                fc.seleccionarrCELULAR(dto);
                System.out.println("CELULAR NO ENCONTRADO");
            }
        }
        catch (Exception e){
        
        }
    }
}
