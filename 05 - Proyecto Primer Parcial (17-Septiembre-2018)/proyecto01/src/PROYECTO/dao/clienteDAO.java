/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.dao;

import PROYECTO.dt.clienteDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author jamon
 */
public class clienteDAO extends ConexionBD{
    private final static String insert="insert into cliente(idcliente, nombre, apaterno, amaterno, rfc, celular, fechanacimiento, correo, sexo)values(?,?,?,?,?,?,?,?,?)";
    private final static String update="update cliente set nombre=?, apaterno=?, amaterno=?, rfc=?, celular=?, fechanacimiento=?, correo=?, sexo=? where idcliente=?";
    private final static String delete="delete from cliente where idcliente=?";
    private final static String selectall="select * from cliente";
    private final static String select="select * from cliente where nombre=?";
    
    public clienteDAO() {
        super();
    }
    public void create(clienteDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(insert);
        ps.setInt(1, dto.getIdcliente());
        ps.setString(2, dto.getNombre());
        ps.setString(3, dto.getApaterno());
        ps.setString(4, dto.getAmaterno());
        ps.setString(5, dto.getRfc());
        ps.setInt(6, dto.getCelular());
        ps.setDate(7, dto.getFechanacimiento());
        ps.setString(8, dto.getCorreo());
        ps.setString(9, dto.getSexo());
        ps.executeUpdate();
        cerrar(ps);        
    }
    
    public void actualiza(clienteDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(update);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getApaterno());
        ps.setString(3, dto.getAmaterno());
        ps.setString(4, dto.getRfc());
        ps.setInt(5, dto.getCelular());
        ps.setDate(6, dto.getFechanacimiento());
        ps.setString(7, dto.getCorreo());
        ps.setString(8, dto.getSexo());
        ps.setInt(9, dto.getIdcliente());
        ps.executeUpdate();
        cerrar(ps);
    }
     public void borra(clienteDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(delete);
        ps.setInt(1, dto.getIdcliente());
        ps.executeUpdate();
        cerrar(ps);
     }
     
     public clienteDT select(clienteDT dto)throws Exception{
         PreparedStatement ps = null;
         ResultSet rs = null;
         ps=conn.prepareStatement(select);
         ps.setString(1, dto.getNombre());
         rs = ps.executeQuery();
         if (rs.next()){
             dto.setIdcliente(rs.getInt("idcliente"));
             dto.setApaterno(rs.getString("apaterno"));
             dto.setAmaterno(rs.getString("amaterno"));
             dto.setRfc(rs.getString("rfc"));
             dto.setCelular(rs.getInt("celular"));
             dto.setFechanacimiento(rs.getDate("fechanacimiento"));
             dto.setCorreo(rs.getString("correo"));
             dto.setSexo(rs.getString("sexo"));
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
         clienteDT dto;
         ps = conn.prepareStatement(selectall);
         rs = ps.executeQuery();
         while (rs.next()){
             dto = new clienteDT();
             dto.setIdcliente(rs.getInt("idcliente"));
             dto.setNombre(rs.getString("nombre"));
             dto.setApaterno(rs.getString("apaterno"));
             dto.setAmaterno(rs.getString("amaterno"));
             dto.setRfc(rs.getString("rfc"));
             dto.setCelular(rs.getInt("celular"));
             dto.setFechanacimiento(rs.getDate("fechanacimiento"));
             dto.setCorreo(rs.getString("correo"));
             dto.setSexo(rs.getString("sexo"));
             lista.add(dto);
         }
         return lista;
         
     }
}
