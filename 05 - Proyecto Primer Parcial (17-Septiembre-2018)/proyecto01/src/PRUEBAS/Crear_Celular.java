/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRUEBAS;

import PROYECTO.dao.celularDAO;
import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.celularDT;
import java.sql.Date;

/**
 *
 * @author jamon
 */
public class Crear_Celular {
    public static void main(String[] args){
        celularDT  dto= new celularDT();
        SistemaDelegate fc = new SistemaDelegate();
        dto.setIdcelular(1);
        dto.setIdnumEmpleado(1);
        dto.setIdcliente(1);
        dto.setNombre("Samsung Galaxy Note 7");
        dto.setSisoperativo("Android Explosivo :v");
        dto.setMarca("Samsung");
        dto.setMemoria("16 Gb");
        dto.setPrecio(5000.00);
        dto.setCompañia("Telcel");
        dto.setColor("Negro");
        dto.setCantidadcamaras(2);
        dto.setPulgadas(5);
        dto.setFechaventa(Date.valueOf("2018-09-17"));
        dto.setPixeles("12 mp");
        try {
            fc.crearrCELULAR(dto);
            System.out.println("CELULAR AGREGADO CORRECTAMENTE");
        } catch (Exception e) {
        }
        
    }
}
