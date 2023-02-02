/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.delegate;

import PROYECTO.dt.celularDT;
import PROYECTO.dt.clienteDT;
import PROYECTO.dt.empleadoDT;
import PROYECTO.dt.notaDT;
import PROYECTO.dt.tiendaDT;
import PROYECTO.facade.SistemaFacade;
import java.util.List;

/**
 *
 * @author jamon
 */
public class SistemaDelegate {
     public void crearrCLIENTE(clienteDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); /*Instancia*/
        fc.crearCLIENTE(dto);
    }
    public void eliminarrCLIENTE(clienteDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.eliminarCLIENTE(dto);
    }
    public void actualizarrCLIENTE(clienteDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.actualizarCLIENTE(dto);
    }
    public clienteDT seleccionarrCLIENTE(clienteDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); 
        fc.seleccionarCLIENTE(dto);
        return fc.seleccionarCLIENTE(dto);
    }
    public List seleccionarrtodoCLIENTE(clienteDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); 
        fc.seleccionartodoCLIENTE();
        return fc.seleccionartodoCLIENTE();
    }
    
    /**             Aqui empiezan los delegates de la nota                  **/
    
    public void crearrNOTA(notaDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.crearNOTA(dto);
    }
    public void eliminarrNOTA(notaDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.eliminarNOTA(dto);
    }
    public void actualizarrNOTA(notaDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.actualizarNOTA(dto);
    }
    public notaDT seleccionarrNOTA(notaDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); 
        fc.seleccionarNOTA(dto);
        return fc.seleccionarNOTA(dto);
    }
    public List seleccionarrtodoNOTA(notaDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); 
        fc.seleccionartodoNOTA();
        return fc.seleccionartodoNOTA();
    }
    
    /**             Aqui empiezan los delegates de la tienda        **/
    
    
    public void agregaTienda(tiendaDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.crearTienda(dto);
    }
     public void cambiaTienda(tiendaDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        fc.modificaTienda(dto);
    }
     public void borraTienda(tiendaDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        fc.eliminaTienda(dto);
    }
      public tiendaDT buscaTienda(tiendaDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        fc.busquedaTienda(dto);
        return fc.busquedaTienda(dto);
    }
      public List ListasTienda(tiendaDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        return fc.listaTienda();
    }
      
    /**             Aqui empiezan los delegates del empleado                 **/ 
      
      public void agregaEmpleado(empleadoDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.crearEmpleado(dto);
    }
     public void cambiaEmpleado(empleadoDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        fc.modificaEmpleado(dto);
    }
     public void borraEmpleado(empleadoDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        fc.eliminaEmpleado(dto);
    }
      public empleadoDT buscaEmpleado(empleadoDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        fc.busquedaEmpleado(dto);
        return fc.busquedaEmpleado(dto);
    }
      public List ListasEmpleado(empleadoDT dto)throws Exception{
        SistemaFacade fc= new SistemaFacade();
        return fc.listaEmpleado();
    } 
      
    /**            Aqui empiezan los delegates del celular                   **/
      
      public void crearrCELULAR(celularDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); 
        fc.crearCELULAR(dto);
    }
      public void eliminarrCELULAR(celularDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.eliminarCELULAR(dto);
    }
      public void actualizarrCELUlAR(celularDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade();
        fc.actualizarCELULAR(dto);
    }
      public celularDT seleccionarrCELULAR(celularDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); 
        fc.seleccionarCELULAR(dto);
        return fc.seleccionarCELULAR(dto);
    }
      public List seleccionarrtodoCELULAR(celularDT dto)throws Exception{
        SistemaFacade fc = new SistemaFacade(); 
        fc.seleccionartodoCELULAR();
        return fc.seleccionartodoCELULAR();
    }
      
    public Object[] numeros(int inicio, int fin){
    Object[] num = new Object[(fin-inicio+1)];
    int y=0;
    for(int i = inicio; i<= fin; i++){
    num[y]=i;
    y++;
    }
       return num;
    }
}
