/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import clases.clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class consultasBD {
    
    private conexionBD conectar;
    private clientes cliente;
    private Connection con;
    
    public consultasBD(){
        conectar = new conexionBD();
        cliente = new clientes();
        
    }
    
    public void registrarCliente(String nombre, String apellidos, String telefono, String direccion){
        PreparedStatement ps;
        String sql;
        cliente.setNombre(nombre);
        cliente.setApellidos(apellidos);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        
        
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO clientes(nombre, apellidos, telefono, direccion) values(?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getTelefono());
            ps.setString(4, cliente.getDireccion());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }

    public consultasBD(clientes cliente) {
        this.cliente = cliente;
    }
}
