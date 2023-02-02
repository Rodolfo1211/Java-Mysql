package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.empleadoDT;
import java.sql.Date;

public class Actualizar_Empleado {
    public static void main(String[] args){
        empleadoDT dto= new empleadoDT();
        SistemaDelegate fc= new SistemaDelegate();
        dto.setIdtienda(1);
        dto.setNombre("el javis chente");
        dto.setCargo("robo");
        dto.setCelular(560149922);
        dto.setEmail("javi@gmail.com");
        dto.setSexo("masculino");
        dto.setIdnumEmpleado(1);
        try {
            fc.cambiaEmpleado(dto);
            System.out.println("EMPLEADO ACTUALIZADO CORRECTAMENTE");
        } catch (Exception e) {
        }
     }
}