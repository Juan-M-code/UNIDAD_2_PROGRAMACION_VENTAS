package pe.edu.upeu.sysventas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.script.ScriptContext;
import java.io.IOException;

public class SysVentas extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Screen screen=Screen.getPrimary();
        FXMLLoader fxmlLoader = new FXMLLoader(SysVentas.class.getResource("/view/main_producto.fxml"));
        Rectangle2D dimencion=screen.getBounds();
        Scene scene = new Scene(fxmlLoader.load(),dimencion.getWidth(),dimencion.getHeight());
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        stage.setTitle("SysVentas");
        stage.setScene(scene);
        stage.show();
    }
}
