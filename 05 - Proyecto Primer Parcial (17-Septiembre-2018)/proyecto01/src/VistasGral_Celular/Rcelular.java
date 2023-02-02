/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGral_Celular;

import javax.swing.JOptionPane;

/**
 *
 * @author Chuy
 */
public class Rcelular {
    
    public void validaDatos(String sIdcelular,String sIdnumEmpleado,String sIdcliente,String sNombre,String sSisoperativo,String sMarca,String sMemoria,String sPrecio,String sCompañia,String sColor,String sCantidadcamaras,String sPulgadas,String sPixeles){
        if( sIdcelular.equals("") || sIdnumEmpleado.equals("") || sIdcliente.equals("") || sNombre.equals("") || sSisoperativo.equals("") || sMarca.equals("") || sMemoria.equals("") || sPrecio.equals("") || sCompañia.equals("") || sColor.equals("") || sCantidadcamaras.equals("") || sPulgadas.equals("") || sPixeles.equals(""))
        {
            JOptionPane.showMessageDialog(null, "No Puede dejar espacios en blanco", "Error al Registrar", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Bien echo", "Enviado Registrar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
     public void validaDatosNOTA(String sIdnota,String sIdcelular,String sDetalleventa,String sCantidadproductos,String sPreciototal){
        if( sIdcelular.equals("") || sIdnota.equals("") || sIdcelular.equals("") || sDetalleventa.equals("") || sCantidadproductos.equals("") || sPreciototal.equals("") )
        {
            JOptionPane.showMessageDialog(null, "No Puede dejar espacios en blanco", "Error al Registrar", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Bien Hecho(¿?)", "Enviado Registrar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     public void validaDatosEMPLEADO(String sIdnumEmpleado,String sIdtienda,String sNombre,String sCargo,String sCelular,String sEmail, String sSexo){
        if( sIdnumEmpleado.equals("") || sIdtienda.equals("") || sNombre.equals("") || sCargo.equals("") || sCelular.equals("") || sEmail.equals("") || sSexo.equals("") )
        {
            JOptionPane.showMessageDialog(null, "No Puede dejar espacios en blanco", "Error al Registrar", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Bien Hecho(¿?)", "Enviado Registrar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
