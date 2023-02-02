/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.dao;
import PROYECTO.dt.celularDT;
import PROYECTO.dt.clienteDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jamon
 */
public class celularDAO extends ConexionBD{    
    private final static String insert="insert into celular(idcelular, idnumEmpleado, idcliente, nombre, sisoperativo, marca, memoria, precio, compañia, color, cantidadcamaras, pulgadas, fechaventa, pixeles)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private final static String update="update celular set idnumEmpleado=?, idcliente=?, nombre=?, sisoperativo=?, marca=?, memoria=?, precio=?, compañia=?, color=?, cantidadcamaras=?, pulgadas=?, fechaVenta=?, pixeles=? where idcelular=?";
    private final static String delete="delete from celular where idcelular=?";
    private final static String selectall="select *from celular";
    private final static String select="select *from celular where nombre=?";
    
    public celularDAO(){
        super();
    }
    public void create (celularDT dto)throws Exception{
        PreparedStatement ps=null;
        ps=conn.prepareStatement(insert);
        ps.setInt(1, dto.getIdcelular());
        ps.setInt(2, dto.getIdnumEmpleado());
        ps.setInt(3, dto.getIdcliente());
        ps.setString(4, dto.getNombre());
        ps.setString(5, dto.getSisoperativo());
        ps.setString(6, dto.getMarca());
        ps.setString(7, dto.getMemoria());
        ps.setDouble(8, dto.getPrecio());
        ps.setString(9, dto.getCompañia());
        ps.setString(10, dto.getColor());
        ps.setInt(11, dto.getCantidadcamaras());
        ps.setInt(12, dto.getPulgadas());
        ps.setDate(13, dto.getFechaventa());
        ps.setString(14, dto.getPixeles());
        ps.executeUpdate();
        cerrar(ps);
        
    }
    public void actualiza (celularDT dto)throws Exception{
        PreparedStatement ps=null;
        ps=conn.prepareStatement(update);
        ps.setInt(1, dto.getIdnumEmpleado());
        ps.setInt(2, dto.getIdcliente());
        ps.setString(3, dto.getNombre());
        ps.setString(4, dto.getSisoperativo());
        ps.setString(5, dto.getMarca());
        ps.setString(6, dto.getMemoria());
        ps.setDouble(7, dto.getPrecio());
        ps.setString(8, dto.getCompañia());
        ps.setString(9, dto.getColor());
        ps.setInt(10, dto.getCantidadcamaras());
        ps.setInt(11, dto.getPulgadas());
        ps.setDate(12, dto.getFechaventa());
        ps.setString(13, dto.getPixeles());
        ps.setInt(14, dto.getIdcelular());
        ps.executeUpdate();
        cerrar(ps);
    }
    public void borra(celularDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(delete);
        ps.setInt(1, dto.getIdcelular());
        ps.executeUpdate();
        cerrar(ps);
    }
    
    public celularDT seleccionar(celularDT dto)throws Exception{
        PreparedStatement ps =null;
        ResultSet rs = null;
        ps=conn.prepareStatement(select);
        ps.setString(1, dto.getNombre());
        rs = ps.executeQuery();
        if(rs.next())
        {
            dto.setIdcelular(rs.getInt("idcelular"));
            dto.setIdnumEmpleado(rs.getInt("idnumEmpleado"));
            dto.setIdcliente(rs.getInt("idcliente"));
            dto.setSisoperativo(rs.getString("sisoperativo"));
            dto.setMarca(rs.getString("marca"));
            dto.setMemoria(rs.getString("memoria"));
            dto.setPrecio(rs.getInt("precio"));
            dto.setCompañia(rs.getString("compañia"));
            dto.setColor(rs.getString("color"));
            dto.setCantidadcamaras(rs.getInt("cantidadcamaras"));
            dto.setPulgadas(rs.getInt("pulgadas"));
            dto.setFechaventa(rs.getDate("fechaVenta"));
            dto.setPixeles(rs.getString("pixeles"));
        } 
        else 
        {
            return null;
        }
        return dto;
     }
    
    public List selectall() throws Exception {
         List lista = new ArrayList();
         PreparedStatement ps = null;
         ResultSet rs = null;
         celularDT dto;
         ps = conn.prepareStatement(selectall);
         rs = ps.executeQuery();
         while (rs.next()){
             dto = new celularDT();
             dto.setIdcelular(rs.getInt("idcelular"));
             dto.setIdnumEmpleado(rs.getInt("idnumEmpleado"));
             dto.setIdcliente(rs.getInt("idcliente"));
             dto.setNombre(rs.getString("nombre"));
             dto.setSisoperativo(rs.getString("sisoperativo"));
             dto.setMarca(rs.getString("marca"));
             dto.setMemoria(rs.getString("memoria"));
             dto.setPrecio(rs.getInt("precio"));
             dto.setCompañia(rs.getString("compañia"));
             dto.setColor(rs.getString("color"));
             dto.setCantidadcamaras(rs.getInt("cantidadcamaras"));
             dto.setPulgadas(rs.getInt("pulgadas"));
             dto.setFechaventa(rs.getDate("fechaVenta"));
             dto.setPixeles(rs.getString("pixeles"));
             lista.add(dto);
         }
         return lista;
         
     }
    
}
