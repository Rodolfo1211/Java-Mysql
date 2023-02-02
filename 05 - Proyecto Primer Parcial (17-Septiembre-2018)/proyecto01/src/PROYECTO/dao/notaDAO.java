/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.dao;

import PROYECTO.dt.notaDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author jamon
 */
public class notaDAO extends ConexionBD{
     private final static String insert="insert into nota(idnota, idcelular, fechapago, detalleventa, cantidadproductos, preciototal)values(?,?,?,?,?,?)";
     private final static String update="update nota set idcelular=?, fechapago=?, detalleventa=?, cantidadproductos=?, preciototal=? where idnota=?";
     private final static String delete="delete from nota where idnota=?";
     private final static String selectall="select * from nota";
     private final static String select="select * from nota where detalleventa=?";
    
    public notaDAO() {
        super();
    }
    public void create (notaDT dto)throws Exception{
        PreparedStatement ps =null;
        ps=conn.prepareStatement(insert);        
        ps.setInt(1, dto.getIdnota());
        ps.setInt(2, dto.getIdcelular());
        ps.setDate(3, dto.getFechapago());
        ps.setString(4, dto.getDetalleventa());
        ps.setInt(5, dto.getCantidadproductos());
        ps.setDouble(6, dto.getPreciototal());
        ps.executeUpdate();
        cerrar(ps);        
    }
    
    public void actualiza(notaDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(update);
        ps.setInt(1, dto.getIdcelular());
        ps.setDate(2, dto.getFechapago());
        ps.setString(3, dto.getDetalleventa());
        ps.setInt(4, dto.getCantidadproductos());
        ps.setDouble(5, dto.getPreciototal());
        ps.setInt(6, dto.getIdnota());
        ps.executeUpdate();
        cerrar(ps);
    }
     public void borra(notaDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(delete);
        ps.setInt(1, dto.getIdnota());
        ps.executeUpdate();
        cerrar(ps);
     }
     
     public notaDT select(notaDT dto)throws Exception{
         PreparedStatement ps = null;
         ResultSet rs = null;
         ps=conn.prepareStatement(select);
         ps.setString(1, dto.getDetalleventa());
         rs = ps.executeQuery();
         if (rs.next()){
             dto.setIdcelular(rs.getInt("idcelular"));
             dto.setFechapago(rs.getDate("fechapago"));
             dto.setDetalleventa(rs.getString("detalleventa"));
             dto.setCantidadproductos(rs.getInt("cantidadproductos"));
             dto.setPreciototal(rs.getDouble("preciototal"));
         }
         else {
             return null;
         }
         return dto;
     }
     public List selectall() throws Exception {
         List lista = new ArrayList();
         PreparedStatement ps = null;
         ResultSet rs = null;
         notaDT dto;
         ps = conn.prepareStatement(selectall);
         rs = ps.executeQuery();
         while (rs.next()){
             dto = new notaDT();
             dto.setIdnota(rs.getInt("idnota"));
             dto.setIdcelular(rs.getInt("idcelular"));
             dto.setFechapago(rs.getDate("fechapago"));
             dto.setDetalleventa(rs.getString("detalleventa"));
             dto.setCantidadproductos(rs.getInt("cantidadproductos"));
             dto.setPreciototal(rs.getDouble("preciototal"));
             lista.add(dto);
         }
         return lista;
         
     }
}
