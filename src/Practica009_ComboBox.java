import javafx.application.Application;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class Practica009_ComboBox  extends Application {

    public static void main (String args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ComboBox<String> ComboBox = new ComboBox<String>();
        ComboBox.getItems().add("Elemento 0");
        ComboBox.getItems().add("Elemento 1");
        ComboBox.getItems().add("Elemento 2");
        ComboBox.setPromptText("selecciona un Elemento");

        ComboBox.setOnAction(event -> {
            System.out.println(ComboBox.getValue());

            int id=ComboBox.getSelectionModel().getSelectedIndex();
            System.out.println("El indice es:"+ id);
            });
        CheckBox checkBox = new CheckBox("Mostrar opciones Avanzadas");

        checkBox.setSelected(true);
        checkBox.setOnAction(event -> {
            System.out.println(checkBox.isSelected());
        });



    }
}
