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
public class detalles {
    
    int idDetalles;
    String clase;
    int pacas;
    int kilogramos;
    float quintales;
    float precio;
    int compraRelacionada;

    public detalles(String clase, int pacas, int kilogramos, float quintales, float precio, int compraRelacionada) {
        this.clase = clase;
        this.pacas = pacas;
        this.kilogramos = kilogramos;
        this.quintales = quintales;
        this.precio = precio;
        this.compraRelacionada = compraRelacionada;
    }
    
    

    public int getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(int idDetalles) {
        this.idDetalles = idDetalles;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getPacas() {
        return pacas;
    }

    public void setPacas(int pacas) {
        this.pacas = pacas;
    }

    public int getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(int kilogramos) {
        this.kilogramos = kilogramos;
    }

    public float getQuintales() {
        return quintales;
    }

    public void setQuintales(float quintales) {
        this.quintales = quintales;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCompraRelacionada() {
        return compraRelacionada;
    }

    public void setCompraRelacionada(int compraRelacionada) {
        this.compraRelacionada = compraRelacionada;
    }

  
}
