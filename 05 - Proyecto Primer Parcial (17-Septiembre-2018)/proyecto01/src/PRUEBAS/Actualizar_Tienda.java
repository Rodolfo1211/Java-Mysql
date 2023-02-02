package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.tiendaDT;
import java.sql.Date;

public class Actualizar_Tienda {
     public static void main(String[] args){
        tiendaDT dto= new tiendaDT();
        SistemaDelegate fc= new SistemaDelegate();
        dto.setNombre("elchido");
        dto.setTelefono(550449213);
        dto.setPais("EUA");
        dto.setDireccion("Av cuaetemoc");
        dto.setCorreo("donpa@gmail.com");
        dto.setHorario("de 6 a 8");
        dto.setRfc("no se");
        dto.setIdtienda(1);
        try {
            fc.cambiaTienda(dto);
            System.out.println("TIENDA ACTUALIZADA CORRECTAMENTE");
        } catch (Exception e) {
        }
     }
    
}