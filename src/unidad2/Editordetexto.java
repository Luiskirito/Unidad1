package unidad2;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Editordetexto  extends Application {
    private String nombreArchivo="";
    private boolean modificado;
    private static Stage stage;

    @FXML
    private TextArea textArea;


    @FXML
    void manuAbrir(ActionEvent event) {FileChooser fc = new FileChooser();
        File f = fc.showOpenDialog(stage);

        if( f != null) { this.nombreArchivo = f.getAbsolutePath();

            try {
                textArea.setText(new String(
                Files.readAllBytes(Paths.get(this.nombreArchivo))
                ));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @FXML
    void menuCerrar(ActionEvent event) {

        this.nombreArchivo = "";
        textArea.setText("");
    }

    @FXML
    void menuGuardar(ActionEvent event) {
     if( this.nombreArchivo.isEmpty()){
         FileChooser fc = new FileChooser();
         File f = fc.showSaveDialog(this.stage);
         if( f !=null) {
             this.nombreArchivo = f.getAbsolutePath();
         }
     }

        try {
            Files.write(Paths.get(this.nombreArchivo), textArea.getText().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void menuGuuardarcomo(ActionEvent event) {

            FileChooser fc = new FileChooser();
            File f = fc.showSaveDialog(this.stage);
            if( f !=null) {
                this.nombreArchivo = f.getAbsolutePath();
            }

        try {
            Files.write(Paths.get(this.nombreArchivo), textArea.getText().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void menuNuevo(ActionEvent event) {

        this.nombreArchivo = "";
        textArea.setText("");

    }

    @FXML
    void menuSalir(ActionEvent event) {

        Platform.exit();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent layout = FXMLLoader.load(getClass().getResource("Editordetexto.fxml"));

        Scene scene = new Scene(layout);
        primaryStage.setScene((scene));
        primaryStage.show();
        this.stage = primaryStage;
        this.stage.setTitle("Editordetexto");
    }
}
