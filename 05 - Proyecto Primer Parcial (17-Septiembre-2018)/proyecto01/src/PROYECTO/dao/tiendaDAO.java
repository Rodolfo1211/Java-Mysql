package PROYECTO.dao;
//import proyecto01.dto.tiendaDT;
import PROYECTO.dt.tiendaDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class tiendaDAO extends ConexionBD{
     private final static String insert="insert into tienda(idtienda,nombre,telefono,pais,direccion,correo,horario,rfc)values(?,?,?,?,?,?,?,?)";
    private final static String update="update tienda set nombre=?,telefono=?,pais=?,direccion=?,correo=?,horario=?,rfc=? where idtienda=?";
    private final static String delete="delete from tienda where idtienda=?";
    private final static String selectall="select *from tienda";
    private final static String select="select *from tienda where nombre=?";
     public tiendaDAO(){
        super();
    }
      public void create (tiendaDT dto)throws Exception{
        PreparedStatement ps=null;
        ps=conn.prepareStatement(insert);        
        ps.setInt(1, dto.getIdtienda());
        ps.setString(2, dto.getNombre());
        ps.setInt(3, dto.getTelefono());
        ps.setString(4, dto.getPais());
        ps.setString(5, dto.getDireccion());
        ps.setString(6, dto.getCorreo());
        ps.setString(7, dto.getHorario());
        ps.setString(8, dto.getRfc());
        ps.executeUpdate();
        cerrar(ps);
    }
      public void actualiza (tiendaDT dto)throws Exception{
        PreparedStatement ps=null;
        ps=conn.prepareStatement(update);
        ps.setString(1, dto.getNombre());
        ps.setInt(2, dto.getTelefono());
        ps.setString(3, dto.getPais());
        ps.setString(4, dto.getDireccion());
        ps.setString(5, dto.getCorreo());
        ps.setString(6, dto.getHorario());
        ps.setString(7, dto.getRfc());
        ps.setInt(8, dto.getIdtienda());
        ps.executeUpdate();
        cerrar(ps);
    }
      public void borra(tiendaDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(delete);
        ps.setInt(1, dto.getIdtienda());
        ps.executeUpdate();
        cerrar(ps);
    }
    public tiendaDT seleccionar(tiendaDT dto)throws Exception{
        PreparedStatement ps =null;
        ResultSet rs = null;
        ps=conn.prepareStatement(select);
        ps.setString(1, dto.getNombre());
        rs = ps.executeQuery();
        if(rs.next())
        {
            dto.setIdtienda(rs.getInt("idtienda"));
            dto.setNombre(rs.getString("nombre"));
            dto.setTelefono(rs.getInt("telefono"));
            dto.setPais(rs.getString("pais"));
            dto.setDireccion(rs.getString("direccion"));
            dto.setCorreo(rs.getString("correo"));
            dto.setHorario(rs.getString("horario"));
            dto.setRfc(rs.getString("rfc"));
        } 
        else 
        {
            return null;
        }
        return dto;
     }
     public List selectall()throws Exception{
            List lista= new ArrayList();
            PreparedStatement ps=null;
            ResultSet rs = null;
            tiendaDT dto;
            ps= conn.prepareStatement(selectall);
            rs = ps.executeQuery();
            while(rs.next())
            {
                dto=new tiendaDT();
                dto.setIdtienda(rs.getInt("idtienda"));
                dto.setNombre(rs.getString("nombre"));
                dto.setTelefono(rs.getInt("telefono"));
                dto.setPais(rs.getString("pais"));
                dto.setDireccion(rs.getString("direccion"));
                dto.setCorreo(rs.getString("correo"));
                dto.setHorario(rs.getString("horario"));
                dto.setRfc(rs.getString("rfc"));
                lista.add(dto);
       
            }
            return lista;
            
            
        }
}