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
public class RcCliente {
    public void validaDatos(String sClave,String sNombre,String sApaterno,String sAmaterno,String sRfc,String sCelular){
        if( sClave.equals("") || sNombre.equals("") || sApaterno.equals("") || sAmaterno.equals("") || sRfc.equals("") || sCelular.equals("") )
        {
            JOptionPane.showMessageDialog(null, "No Puede dejar espacios en blanco", "Error al Registrar", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Bien echo", "Enviado Registrar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
