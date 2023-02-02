package PROYECTO.dao;
import PROYECTO.dao.ConexionBD;
import PROYECTO.dt.empleadoDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class empleadoDAO extends ConexionBD{
    private final static String insert="insert into empleado(idnumEmpleado,idtienda,nombre,cargo,celular,email,sexo)values(?,?,?,?,?,?,?)";
    private final static String update="update empleado set idtienda=?,nombre=?,cargo=?,celular=?,email=?,sexo=? where idnumEmpleado=?";
    private final static String delete="delete from empleado where idnumEmpleado=?";
    private final static String selectall="select *from empleado";
    private final static String select="select *from empleado where nombre=?";
     public empleadoDAO(){
        super();
    }
     public void create (empleadoDT dto)throws Exception{
        PreparedStatement ps=null;
        ps=conn.prepareStatement(insert);
        
        ps.setInt(1, dto.getIdnumEmpleado());
        ps.setInt(2, dto.getIdtienda());
        ps.setString(3, dto.getNombre());
        ps.setString(4, dto.getCargo());
        ps.setInt(5, dto.getCelular());
        ps.setString(6, dto.getEmail());
        ps.setString(7, dto.getSexo());
        ps.executeUpdate();
        cerrar(ps);
    }
     public void actualiza (empleadoDT dto)throws Exception{
        PreparedStatement ps=null;
        ps=conn.prepareStatement(update);
        ps.setInt(1, dto.getIdtienda());
        ps.setString(2, dto.getNombre());
        ps.setString(3, dto.getCargo());
        ps.setInt(4, dto.getCelular());
        ps.setString(5, dto.getEmail());
        ps.setString(6, dto.getSexo());
        ps.setInt(7, dto.getIdnumEmpleado());
        ps.executeUpdate();
        cerrar(ps);
    }
     public void borra(empleadoDT dto)throws Exception{
        PreparedStatement ps =null;
        ps =conn.prepareStatement(delete);
        ps.setInt(1, dto.getIdnumEmpleado());
        ps.executeUpdate();
        cerrar(ps);
    }
     public empleadoDT seleccionar(empleadoDT dto)throws Exception{
        PreparedStatement ps =null;
        ResultSet rs = null;
        ps=conn.prepareStatement(select);
        ps.setString(1, dto.getNombre());
        rs = ps.executeQuery();
        if(rs.next())
        {
            dto.setIdnumEmpleado(rs.getInt("idnumEmpleado"));
            dto.setIdtienda(rs.getInt("idtienda"));
            dto.setNombre(rs.getString("nombre"));
            dto.setCargo(rs.getString("cargo"));
            dto.setCelular(rs.getInt("celular"));
            dto.setEmail(rs.getString("email"));
            dto.setSexo(rs.getString("sexo"));
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
            empleadoDT dto;
            ps= conn.prepareStatement(selectall);
            rs = ps.executeQuery();
            while(rs.next())
            {
                dto=new empleadoDT();
                dto.setIdnumEmpleado(rs.getInt("idnumEmpleado"));
                dto.setIdtienda(rs.getInt("idtienda"));
                dto.setNombre(rs.getString("nombre"));
                dto.setCargo(rs.getString("cargo"));
                dto.setCelular(rs.getInt("celular"));
                dto.setEmail(rs.getString("email"));
                dto.setSexo(rs.getString("sexo"));
                lista.add(dto);
       
            }
            return lista;
            
            
        }
}