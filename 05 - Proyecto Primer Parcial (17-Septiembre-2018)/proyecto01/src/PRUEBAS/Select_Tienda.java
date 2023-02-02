package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.tiendaDT;

public class Select_Tienda {
    public static void main(String[] args) {
        tiendaDT dt = new tiendaDT();
        SistemaDelegate fc= new SistemaDelegate();
        dt.setNombre("elchido");
        tiendaDT dto;
        
        try {
            dto= fc.buscaTienda(dt);
            if(dto != null)
            {
                
            System.out.println("TIENDA ENCONTRADA");
            System.out.println(" | " + dto.getIdtienda() + " | " + dto.getNombre() + " | "
            + dto.getTelefono() + " | " + dto.getPais() + " | " + dto.getDireccion() + 
            " | " + dto.getCorreo() + " | " + dto.getHorario() + " | " + dto.getRfc()+ " | " );
            }
            else
            {
                System.out.println("TIENDA NO ENCONTRADA");
            } 
        }
        catch (Exception e)
        {
            
        }
    
}
    
}