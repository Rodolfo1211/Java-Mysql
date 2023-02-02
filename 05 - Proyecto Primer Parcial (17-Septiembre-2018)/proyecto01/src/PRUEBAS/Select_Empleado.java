package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.empleadoDT;

public class Select_Empleado {
     public static void main(String[] args) {
        empleadoDT dt = new empleadoDT();
        SistemaDelegate fc= new SistemaDelegate();
        dt.setNombre("el javis chente");
        empleadoDT dto;
        
        try {
            dto= fc.buscaEmpleado(dt);
            if(dto != null)
            {
                
            System.out.println("EMPLEADO ENCONTRADO");
            System.out.println(" | " + dto.getIdnumEmpleado() + " | " + dto.getIdtienda() + " | "
            + dto.getNombre() + " | " + dto.getCargo() + " | " + dto.getCelular() + 
            " | " + dto.getEmail() + " | " + dto.getSexo() + " | " );
            }
            else
            {
                System.out.println("EMPLEADO NO ENCONTRADO");
            } 
        }
        catch (Exception e)
        {
            
        }
    
}
}