package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.tiendaDT;

public class Borrar_Tienda {
     public static void main(String[]args){
        tiendaDT dto=new tiendaDT();
        SistemaDelegate fc= new SistemaDelegate();
        dto.setIdtienda(1);
        try {
            fc.borraTienda(dto);
            System.out.println("TIENDA ELIMINADA CORRECTAMENTE");
        } catch (Exception e) {
        }
    }
    
}