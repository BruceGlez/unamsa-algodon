/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author bruce
 */
public class castigos {
    int idCastigos;
    String nombre;
    float cantidad;
    int idCompraRelacionada;

    public castigos(String nombre, float cantidad, int idCompraRelacionada) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.idCompraRelacionada = idCompraRelacionada;
    }
    

    public int getIdCastigos() {
        return idCastigos;
    }

    public void setIdCastigos(int idCastigos) {
        this.idCastigos = idCastigos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdCompraRelacionada() {
        return idCompraRelacionada;
    }

    public void setIdCompraRelacionada(int idCompraRelacionada) {
        this.idCompraRelacionada = idCompraRelacionada;
    }
    
    
}
