module pe.edu.epeu.sys_ventas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens pe.edu.epeu.sys_ventas to javafx.fxml;
    exports pe.edu.epeu.sys_ventas;
}