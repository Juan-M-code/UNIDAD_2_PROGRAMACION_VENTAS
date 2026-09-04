package pe.edu.epeu.sys_ventas.model;

import lombok.Getter;
import lombok.Setter;
import pe.edu.epeu.sys_ventas.enums.TipoDocumento;

@Getter
@Setter
public class Cliente {

    String DniRuc;
    String nombres;
    String repLegal;
    String direccion;
    TipoDocumento yipoDocumento;

}
