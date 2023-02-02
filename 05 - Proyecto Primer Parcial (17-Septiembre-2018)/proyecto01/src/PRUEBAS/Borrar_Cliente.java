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
public class Borrar_Cliente {
    public static void main(String[]args){
        clienteDT dto =new clienteDT();
        SistemaDelegate fc = new SistemaDelegate();
        dto.setIdcliente(200);
        try {
            fc.eliminarrCLIENTE(dto);
            System.out.println("CLIENTE ELIMINADO CORRECTAMENTE");
        } catch (Exception e) {
        }
    
    }
}
