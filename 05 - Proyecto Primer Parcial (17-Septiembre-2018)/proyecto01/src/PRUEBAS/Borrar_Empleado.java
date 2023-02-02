package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.empleadoDT;

public class Borrar_Empleado {
    public static void main(String[] args){
        empleadoDT dto= new empleadoDT();
        SistemaDelegate fc= new SistemaDelegate();
         dto.setIdnumEmpleado(1);
        try {
            fc.borraEmpleado(dto);
            System.out.println("EMPLEADO ELIMINADO CORRECTAMENTE");
        } catch (Exception e) {
        }
    }
}