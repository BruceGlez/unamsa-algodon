/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author bruce
 */
public class cuentaBancaria {
    
    int id;
    String idBanco;
    int idCliente;
    String noCuenta;
    String moneda;
    String clabeBancaria;

    public cuentaBancaria(String idBanco, int idCliente, String noCuenta, String moneda, String clabeBancaria) {
        this.idBanco = idBanco;
        this.idCliente = idCliente;
        this.noCuenta = noCuenta;
        this.moneda = moneda;
        this.clabeBancaria = clabeBancaria;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(String idBanco) {
        this.idBanco = idBanco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getClabeBancaria() {
        return clabeBancaria;
    }

    public void setClabeBancaria(String clabeBancaria) {
        this.clabeBancaria = clabeBancaria;
    }
    
       
   
}
