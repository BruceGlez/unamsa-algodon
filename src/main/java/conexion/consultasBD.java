/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import clases.clientes;
import clases.contadores;
import clases.regimenFiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class consultasBD {
    
    private conexionBD conectar;
    private clientes cliente;
    private contadores contador;
    private regimenFiscal regFiscal;
    private Connection con;
    
    public consultasBD(){
        conectar = new conexionBD();
        cliente = new clientes();
        contador = new contadores();
    }
    
       
    public void registrarCliente(String nombre, String direccion, int codigoPostal, String RFC, int idRegimenFiscal, String telefono, String correo, int idContador){
        PreparedStatement ps;
        String sql;
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setCodigoPostal(codigoPostal);
        cliente.setRFC(RFC);
        cliente.setIdRegimenFiscal(idRegimenFiscal);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);
        cliente.setIdContador(idContador);
        
     
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO clientes(nombre, direccion, codigoPostal, RFC, fkRegimen, telefono, correo, fkContador) values(?,?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDireccion());
            ps.setInt(3, cliente.getCodigoPostal());
            ps.setString(4, cliente.getRFC());
            ps.setInt(5, cliente.getIdRegimenFiscal());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getCorreo());
            ps.setInt(8, cliente.getIdContador());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public void consultarContadores(JComboBox cboxContadores){
        PreparedStatement ps;
        String sql;
        ResultSet result = null;
        
        try{
            con = conectar.getConexion();
            sql = "SELECT nombre, idcontadores FROM contadores ORDER BY nombre ASC";
            
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            
                  
           while(result.next()){
                cboxContadores.addItem(result.getString("idcontadores")+"-"+result.getString("nombre"));
                
            }
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        } finally {
            if(con!=null){
                try{
                    con.close();
                    result.close();
                    
                    con = null;
                    result = null;
                }catch (SQLException e){
                    JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
                }
            }
        }
    }
    
    public void consultarRegimenFiscal(JComboBox cboxContadores){
        PreparedStatement ps;
        String sql;
        ResultSet result = null;
        
        try{
            con = conectar.getConexion();
            sql = "SELECT nombre, idregimenfiscal FROM regimenfiscal ORDER BY nombre ASC";
            
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            
                  
           while(result.next()){
                cboxContadores.addItem(result.getString("idregimenfiscal")+"-"+result.getString("nombre"));
                
            }
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        } finally {
            if(con!=null){
                try{
                    con.close();
                    result.close();
                    
                    con = null;
                    result = null;
                }catch (SQLException e){
                    JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
                }
            }
        }
    }
    
     public void registrarContador(String nombre, String telefono, String correo){
        PreparedStatement ps;
        String sql;
        contador.setNombre(nombre);
        contador.setTelefono(telefono);
        contador.setCorreo(correo);
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO contadores(nombre, telefono, correo) values(?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, contador.getNombre());
            ps.setString(2, contador.getTelefono());
            ps.setString(3, contador.getCorreo());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }   

        public void registrarRegimenFiscal(String nombre, Float retencionISR){
        PreparedStatement ps;
        String sql;
        
        regFiscal.setNombre(nombre);
        regFiscal.setRetencionISR(retencionISR);
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO regimenfiscal(nombre, retencion) values(?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, regFiscal.getNombre());
            ps.setFloat(2, regFiscal.getRetencionISR());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
