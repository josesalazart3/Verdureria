/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.verdureria;

/**
 *
 * @author josesalazar
 */
public class Venta implements umg.verdureria.CalculoVenta{
    private int identificador;
    private String CantidadVenta;
    private String PrecioVenta;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCantidadVenta() {
        return CantidadVenta;
    }

    public void setCantidadVenta(String CantidadVenta) {
        this.CantidadVenta = CantidadVenta;
    }

    public String getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(String PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    @Override
    public void CalcularVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void CalcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ValidarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
