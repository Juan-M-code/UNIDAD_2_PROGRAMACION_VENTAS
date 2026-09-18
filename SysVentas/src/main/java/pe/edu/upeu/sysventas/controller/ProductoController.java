package pe.edu.upeu.sysventas.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.service.ICategoriaService;
import pe.edu.upeu.sysventas.service.IMarcaService;
import pe.edu.upeu.sysventas.service.IProductoService;
import pe.edu.upeu.sysventas.service.IUnidMedidaService;

@RequiredArgsConstructor

public class ProductoController {
    private final IMarcaService ms;
    private final ICategoriaService cs;
    private final IProductoService ps;
    private final IUnidMedidaService us;

    @FXML
    ComboBox <ComboBoxOption> cdxTipoProducto;
    @FXML ComboBox<ComboBoxOption>cbxMarca;
    @FXML ComboBox<ComboBoxOption>cbxCategoria,cbxUnidMedida;


    @FXML public void initialize(){
        cdxTipoProducto.getItems().addAll(ps.listarTipoProducto());
        cbxMarca.getItems().addAll(ms.listarCombobox());
        cbxCategoria.getItems().addAll(cs.listarCombobox());
       cbxUnidMedida.getItems().addAll(us.listarCombobox());

    }

}
