package pe.edu.epeu.sys_ventas.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Perfil {
    Long idPerfil;
    String nombre;
    String codigo;
    List<Acceso> acceso;
}
