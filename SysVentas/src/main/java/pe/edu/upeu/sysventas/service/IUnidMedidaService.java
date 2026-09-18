package pe.edu.upeu.sysventas.service;

import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.model.UnidMedida;

import java.util.List;

public interface IUnidMedidaService extends ICrudGenericoService<UnidMedida,Long>{
    List<ComboBoxOption> listarCombobox();

}
