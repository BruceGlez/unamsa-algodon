/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author bruce
 */
public class clientes {
    
    int id;
    String nombre;
    String direccion;
    int codigoPostal;
    String RFC;
    int idRegimenFiscal;
    int idCuentaBancaria;
    String telefono;
    String correo;
    int idContador;

    public clientes(int id, String nombre, String direccion, String RFC, int idRegimenFiscal, String telefono, String correo, int idContador) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.RFC = RFC;
        this.idRegimenFiscal = idRegimenFiscal;
        this.telefono = telefono;
        this.correo = correo;
        this.idContador = idContador;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getIdRegimenFiscal() {
        return idRegimenFiscal;
    }

    public void setIdRegimenFiscal(int idRegimenFiscal) {
        this.idRegimenFiscal = idRegimenFiscal;
    }

    public int getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(int idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdContador() {
        return idContador;
    }

    public void setIdContador(int idContador) {
        this.idContador = idContador;
    }
    
    
           
}
