package pe.edu.epeu.sys_ventas.enums;

public enum TipoProducto {

    PRODUCTO("Producto"),
    PREPARADO("Preparado"),
    SERVICIO("Srevicio");

    String descripcion;
    TipoProducto(String descripcion){
        this.descripcion=descripcion;
    }
}
