/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGral_Celular;

import javax.swing.JOptionPane;

/**
 *
 * @author mysto
 */
public class RcTienda {
    public void validaDatos(String sClave,String sNombre,String sTelefono,String sPais,String sDireccion,String sCorreo,String sHorario,String sRfc){
        if( sClave.equals("") || sNombre.equals("") || sTelefono.equals("") || sPais.equals("") || sDireccion.equals("") || sCorreo.equals("") || sHorario.equals("") || sRfc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "No Puede dejar espacios en blanco", "Error al Registrar", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Bien echo", "Enviado Registrar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

