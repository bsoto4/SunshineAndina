package com.fisi.sushineandina.data.entity;

/**
 * Created by Bryam Soto on 27/06/2017.
 */

public class Producto {

    private int productoId;
    private String productoNombre;
    private String productoDescripcion;
    private double productoPrecio;
    private double productoPrecioNormal;
    private int productoDescuento;
    private int productoImagen;
    private int productoStock;
    private int productoCantidad;
    private int categoriaId;

    public Producto(){

    }

    public Producto(int productoId, String productoNombre, String productoDescripcion, double productoPrecio, double productoPrecioNormal, int productoDescuento, int productoImagen, int productoStock, int categoriaId) {
        this.productoId = productoId;
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoPrecio = productoPrecio;
        this.productoPrecioNormal = productoPrecioNormal;
        this.productoDescuento = productoDescuento;
        this.productoImagen = productoImagen;
        this.productoStock = productoStock;
        this.categoriaId = categoriaId;
    }

    public Producto(int productoId, String productoNombre, String productoDescripcion, double productoPrecio, double productoPrecioNormal, int productoDescuento, int productoImagen, int productoStock, int productoCantidad, int categoriaId) {
        this.productoId = productoId;
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoPrecio = productoPrecio;
        this.productoPrecioNormal = productoPrecioNormal;
        this.productoDescuento = productoDescuento;
        this.productoImagen = productoImagen;
        this.productoStock = productoStock;
        this.productoCantidad = productoCantidad;
        this.categoriaId = categoriaId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    public double getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(double productoPrecio) {
        this.productoPrecio = productoPrecio;
    }

    public double getProductoPrecioNormal() {
        return productoPrecioNormal;
    }

    public void setProductoPrecioNormal(double productoPrecioNormal) {
        this.productoPrecioNormal = productoPrecioNormal;
    }

    public int getProductoDescuento() {
        return productoDescuento;
    }

    public void setProductoDescuento(int productoDescuento) {
        this.productoDescuento = productoDescuento;
    }

    public int getProductoImagen() {
        return productoImagen;
    }

    public void setProductoImagen(int productoImagen) {
        this.productoImagen = productoImagen;
    }

    public int getProductoStock() {
        return productoStock;
    }

    public void setProductoStock(int productoStock) {
        this.productoStock = productoStock;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public int getProductoCantidad() {
        return productoCantidad;
    }

    public void setProductoCantidad(int productoCantidad) {
        this.productoCantidad = productoCantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "productoId=" + productoId +
                ", productoNombre='" + productoNombre + '\'' +
                ", productoDescripcion='" + productoDescripcion + '\'' +
                ", productoPrecio=" + productoPrecio +
                ", productoPrecioNormal=" + productoPrecioNormal +
                ", productoDescuento=" + productoDescuento +
                ", productoImagen='" + productoImagen + '\'' +
                ", productoStock=" + productoStock +
                ", productoCantidad=" + productoCantidad +
                ", categoriaId=" + categoriaId +
                '}';
    }
}