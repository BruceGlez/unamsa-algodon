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
    
       
    public void registrarCliente(String nombre, String direccion, int codigoPostal, String RFC, int idRegimenFiscal, int idCuentaBancaria, String telefono, String correo, int idContador){
        PreparedStatement ps;
        String sql;
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setCodigoPostal(codigoPostal);
        cliente.setRFC(RFC);
        cliente.setIdRegimenFiscal(idRegimenFiscal);
        cliente.setIdCuentaBancaria(idCuentaBancaria);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);
        cliente.setIdContador(idContador);
        
     
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO clientes(nombre, direccion, codigoPostal, RFC, fkRegimen, fkCuentaBancaria, telefono, correo, fkContador) values(?,?,?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDireccion());
            ps.setInt(3, cliente.getCodigoPostal());
            ps.setString(4, cliente.getRFC());
            ps.setInt(5, cliente.getIdRegimenFiscal());
            ps.setInt(6, cliente.getIdCuentaBancaria());
            ps.setString(7, cliente.getTelefono());
            ps.setString(8, cliente.getCorreo());
            ps.setInt(9, cliente.getIdContador());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
