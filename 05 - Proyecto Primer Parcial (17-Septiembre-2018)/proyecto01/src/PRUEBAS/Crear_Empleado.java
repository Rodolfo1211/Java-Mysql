package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.empleadoDT;
import java.sql.Date;


public class Crear_Empleado {
     public static void main(String[] args){
        empleadoDT dto= new empleadoDT();
        SistemaDelegate fc= new SistemaDelegate();
        dto.setIdnumEmpleado(1);
        dto.setIdtienda(1);
        dto.setNombre("Ruben tovar");
        dto.setCargo("compra");
        dto.setCelular(550149922);
        dto.setEmail("Rub@gmail.com");
        dto.setSexo("masculino");
        try {
            fc.agregaEmpleado(dto);
            System.out.println("EMPLEADO AGREGADO CORRECTAMENTE");
        } catch (Exception e) {
        }
     }
}