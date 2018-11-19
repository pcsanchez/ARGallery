package com.example.pcsanchez.argalery;

import android.widget.ImageView;

public class Painting {

    private String nombre;
    private double precio;
    private double largo;
    private double ancho;
    private String material;
    private String descripcion;
    private int paint;
    private String proveedor;

    public Painting() {
    }

    public Painting(String nombre, double precio, double largo, double ancho, String material, String descripcion, int paint,String proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.largo = largo;
        this.ancho = ancho;
        this.material = material;
        this.descripcion = descripcion;
        this.paint = paint;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public String getMaterial() {
        return material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPaint() {
        return paint;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPaint(int paint) {
        this.paint = paint;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
