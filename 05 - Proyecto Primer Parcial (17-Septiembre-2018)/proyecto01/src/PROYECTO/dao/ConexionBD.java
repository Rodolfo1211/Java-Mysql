/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
        protected Connection conn;
    protected void cerrar(PreparedStatement stm)throws Exception{
        stm.close();
    }
    protected void cerrar(ResultSet rst)throws Exception{
        rst.close();
    }
    public ConexionBD() {
        String driver="org.gjt.mm.mysql.Driver";
        String user="root";
        String pwd="";
        String bd="proyecto01";
        String url="jdbc:mysql://localhost/"+bd;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,pwd);
            
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
