/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import clases.*;
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
    
    conexionBD conectar;
    clientes cliente;
    contadores contador;
    regimenFiscal regFiscal;
    compras compras;
    compradores comprador;
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

        public void registrarRegimenFiscal(regimenFiscal objRegimen){
        PreparedStatement ps;
        String sql;
       
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO regimenfiscal(nombre, retencion) values(?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, objRegimen.getNombre());
            ps.setFloat(2, objRegimen.getRetencionISR());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }

 
    public void consultaClientes(JComboBox cboxCompraCliente) {
        PreparedStatement ps;
        String sql;
        ResultSet result = null;
        
        try{
            con = conectar.getConexion();
            sql = "SELECT nombre, idclientes FROM clientes ORDER BY nombre ASC";
            
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            
                  
           while(result.next()){
                cboxCompraCliente.addItem(result.getString("idclientes")+"-"+result.getString("nombre"));
                
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

    public void consultaCompradores(JComboBox cboxComprasComprador) {
        PreparedStatement ps;
        String sql;
        ResultSet result = null;
        
        try{
            con = conectar.getConexion();
            sql = "SELECT nombre, idcompradores FROM compradores ORDER BY nombre ASC";
            
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            
                  
           while(result.next()){
                cboxComprasComprador.addItem(result.getString("idcompradores")+"-"+result.getString("nombre"));
                
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
    
    public void registrarCompra(compras constCompras){
        PreparedStatement ps;
        String sql;
        
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO compras(noCompra, fechaLiquidacion, fechaPago, fkCliente, pacas, total, fkClienteComprador) values(?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, constCompras.getCompra());
            ps.setString(2, constCompras.getFechaLiquidacion());
            ps.setString(3, constCompras.getFechaPago());
            ps.setInt(4, constCompras.getCliente());
            ps.setInt(5, constCompras.getPacas());
            ps.setFloat(6, constCompras.getTotal());
            ps.setInt(7, constCompras.getComprador());
            
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public void registrarComprador(compradores objComprador){
        PreparedStatement ps;
        String sql;
        
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO compradores(nombre, direccion, telefono, RFC, codigoPostal) values(?,?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, objComprador.getNombre());
            ps.setString(2, objComprador.getDireccion());
            ps.setString(3, objComprador.getTelefono());
            ps.setString(4, objComprador.getTelefono());
            ps.setInt(5, objComprador.getCodigoPostal());
            
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }

    public void registrarCuentaBancaria(cuentaBancaria cuenta) {
        PreparedStatement ps;
        String sql;
        
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO cuentaBancaria(banco, noCuenta, fkClienteCuenta, moneda, clabeBancaria) values(?,?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, cuenta.getIdBanco());
            ps.setString(2, cuenta.getNoCuenta());
            ps.setInt(3, cuenta.getIdCliente());
            ps.setString(4, cuenta.getMoneda());
            ps.setString(5, cuenta.getClabeBancaria());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }

    public void registrarPago(pagos pago) {
        PreparedStatement ps;
        String sql;
        
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO pagos(fkCompraRelacionada, montoPagado, fkFacturaRelacionada, fechaPago, moneda, tipoCambio, montoDLS) values(?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, pago.getIdCompra());
            ps.setFloat(2, pago.getMontoPagado());
            ps.setInt(3, pago.getIdFactura());
            ps.setString(4, pago.getFechaPago());
            ps.setString(5, pago.getMoneda());
            ps.setFloat(6, pago.getTipoCambio());
            ps.setFloat(7, pago.getMontoDLS());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }

    public void consultaCompras(JComboBox cboxPagosCompra) {
        PreparedStatement ps;
        String sql;
        ResultSet result = null;
        
        try{
            con = conectar.getConexion();
            sql = "SELECT noCompra, idcompras FROM compras ORDER BY noCompra ASC";
            
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            
                  
           while(result.next()){
                cboxPagosCompra.addItem(result.getString("idcompras")+"-"+result.getString("noCompra"));
                
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

    public void consultaFacturas(JComboBox cboxPagosFactura) {
       PreparedStatement ps;
        String sql;
        ResultSet result = null;
        
        try{
            con = conectar.getConexion();
            sql = "SELECT folioFactura, idfactura FROM factura ORDER BY fkClienteRelacionado ASC";
            
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            
                  
           while(result.next()){
                cboxPagosFactura.addItem(result.getString("idfactura")+"- No. Factura: "+result.getString("folioFactura"));
                
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

    public void registrarFactura(facturas factura) {
        PreparedStatement ps;
        String sql;
        
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO factura(folioFactura, total, fkClienteRelacionado, fkCompraRelacionada) values(?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, factura.getFolio());
            ps.setFloat(2, factura.getTotal());
            ps.setInt(3, factura.getIdCliente());
            ps.setInt(4, factura.getIdCompra());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public void consultaFacturasCliente(JComboBox cboxPagosFactura) {
       PreparedStatement ps;
        String sql;
        ResultSet result = null;
        
        try{
            con = conectar.getConexion();
            sql = "SELECT factura.folioFactura,factura.idfactura, clientes.nombre, clientes.idclientes FROM factura INNER JOIN clientes ON factura.fkClienteRelacionado = clientes.idclientes";
            
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            
                  
           while(result.next()){
                cboxPagosFactura.addItem(result.getString("idfactura")+"- Folio Fac: "+result.getString("folioFactura")+"- Cliente: "+ result.getString("clientes.nombre"));
                
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

    public void registrarComplemento(complementoPago compl) {
        
        PreparedStatement ps;
        String sql;
        
        
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO complementopago(folioComplemento, fkFacturaRelacionada) values(?,?)";
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, compl.getFolio());
            ps.setInt(2, compl.getIdFactura());

            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
        
    }
}

