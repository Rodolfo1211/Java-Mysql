package PRUEBAS;

import PROYECTO.delegate.SistemaDelegate;
import PROYECTO.dt.tiendaDT;
import java.sql.Date;

public class Crear_Tienda {
    public static void main(String[] args){
        tiendaDT dto= new tiendaDT();
        SistemaDelegate fc= new SistemaDelegate();
        dto.setIdtienda(1);
        dto.setNombre("donpagalon");
        dto.setTelefono(550449213);
        dto.setPais("Mexico");
        dto.setDireccion("Av cuaetemoc");
        dto.setCorreo("donpq@gmail.com");
        dto.setHorario("de 8 a 8");
        dto.setRfc("alias el coppel");
        try {
            fc.agregaTienda(dto);
            System.out.println("TIENDA AGREGADA CORRECTAMENTE");
        } catch (Exception e) {
        }
     }
    
}
