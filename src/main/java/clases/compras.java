/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author bruce
 */
public class compras {
    

    
    public String fechaPago;
    public String fechaLiquidacion;
    public String compra;
    public int pacas;
    public float total;
    public int cliente;
    public int comprador;
    
    
    public compras(String compra, String fechaLiquidacion, String fechaPago, int cliente, int pacas, float total, int comprador) {
        this.fechaPago = fechaPago;
        this.fechaLiquidacion = fechaLiquidacion;
        this.compra = compra;
        this.pacas = pacas;
        this.total = total;
        this.cliente = cliente;
        this.comprador = comprador;
    }
    
    

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(String fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
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

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getComprador() {
        return comprador;
    }

    public void setComprador(int comprador) {
        this.comprador = comprador;
    }          
}

