/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author bruce
 */
public class pagos {
    
    int id;
    int idCompra;
    float montoPagado;
    int idFactura;
    String fechaPago;
    String moneda;
    float tipoCambio;
    float montoDLS;

    public pagos(int idCompra, float montoPagado, int idFactura, String fechaPago, String moneda, float tipoCambio, float montoDLS) {
        this.idCompra = idCompra;
        this.montoPagado = montoPagado;
        this.idFactura = idFactura;
        this.fechaPago = fechaPago;
        this.moneda = moneda;
        this.tipoCambio = tipoCambio;
        this.montoDLS = montoDLS;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public float getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(float montoPagado) {
        this.montoPagado = montoPagado;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public float getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(float tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public float getMontoDLS() {
        return montoDLS;
    }

    public void setMontoDLS(float montoDLS) {
        this.montoDLS = montoDLS;
    }


    
    
}
