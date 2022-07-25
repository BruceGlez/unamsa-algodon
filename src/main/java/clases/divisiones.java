/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author bruce
 */
public class divisiones {
    
    int id;
    String noDivision;
    int pacas;
    float total;
    int idCompra;
    int idCliente;

    public divisiones(String noDivision, int pacas, float total, int idCompra, int idCliente) {
        this.noDivision = noDivision;
        this.pacas = pacas;
        this.total = total;
        this.idCompra = idCompra;
        this.idCliente = idCliente;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoDivision() {
        return noDivision;
    }

    public void setNoDivision(String noDivision) {
        this.noDivision = noDivision;
    }

    public int getPacas() {
        return pacas;
    }

    public void setPacas(int pacas) {
        this.pacas = pacas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    

}
