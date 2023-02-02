package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.empleadoDT;
import java.util.Iterator;
import java.util.List;


public class SelectAll_Empleado {
    public static void main(String[]args){
        empleadoDT dto=new empleadoDT();
        SistemaDelegate fc= new SistemaDelegate();
        List lista;
        try {
            lista = fc.ListasEmpleado(dto);
            Iterator it=lista.iterator();
            System.out.println("DESPLEGANDO LISTA...");
            while(it.hasNext())
            {
                dto=(empleadoDT) it.next();
                
                System.out.println(" | " + dto.getIdnumEmpleado() + " | " + dto.getIdtienda() + " | "
            + dto.getNombre() + " | " + dto.getCargo() + " | " + dto.getCelular() + 
            " | " + dto.getEmail() + " | " +dto.getSexo()+ " | " );
            }
            
        } catch (Exception e) {
        }
        
    }
}
