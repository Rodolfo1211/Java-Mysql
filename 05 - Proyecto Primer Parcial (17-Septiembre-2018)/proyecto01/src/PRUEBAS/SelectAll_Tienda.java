package PRUEBAS;

import PROYECTO.dt.tiendaDT;
import java.util.Iterator;
import java.util.List;
import PROYECTO.delegate.SistemaDelegate;

public class SelectAll_Tienda {
    public static void main(String[]args){
        tiendaDT dto=new tiendaDT();
        SistemaDelegate fc= new SistemaDelegate();
        List lista;
        try {
            lista = fc.ListasTienda(dto);
            Iterator it=lista.iterator();
            System.out.println("DEPLGANDO LISTA...");
            while(it.hasNext())
            {
                dto=(tiendaDT) it.next();
                
                System.out.println(" | " + dto.getIdtienda() + " | " + dto.getNombre() + " | "
            + dto.getTelefono() + " | " + dto.getPais() + " | " + dto.getDireccion() + 
            " | " + dto.getCorreo() + " | " +dto.getHorario() + " | " + dto.getRfc()+ " | " );
            }
            
        } catch (Exception e) {
        }
        
    }
    
}