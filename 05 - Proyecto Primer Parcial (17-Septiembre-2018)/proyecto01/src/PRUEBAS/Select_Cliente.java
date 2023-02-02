/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.clienteDT;

/**
 *
 * @author jamon
 */
public class Select_Cliente {
    public static void main(String[] args) {
        clienteDT dt = new clienteDT();
        SistemaDelegate fc = new SistemaDelegate();
        dt.setNombre("Benitooo");
        clienteDT dto;
        
        try {
            dto=fc.seleccionarrCLIENTE(dt);
            if(dto != null)
            {
                fc.seleccionarrCLIENTE(dto);
                System.out.println("CLIENTE ENCONTRADO");
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
            else {
                fc.seleccionarrCLIENTE(dto);
                System.out.println("CLIENTE NO ENCONTRADO");
            }
        }
        catch (Exception e){
        
        }
    }
}
