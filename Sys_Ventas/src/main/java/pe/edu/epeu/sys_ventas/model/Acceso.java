package pe.edu.epeu.sys_ventas.model;

import lombok.Data;
import pe.edu.epeu.sys_ventas.enums.Menus;
import pe.edu.epeu.sys_ventas.enums.TipoTab;




@Data
public class Acceso {
    String idAccceso;
    String urlAcceso;
    String menuItemNombre;
    Menus nemuNombre;
    TipoTab nombreTab;
}
