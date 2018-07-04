import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Practica008_EventoBoton extends Application{

    public static void main (String [] args){
      launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label labelvalor1 = new Label("Valor 1");
        Label labelvalor2 = new Label("Valor 1");
        Label labelResultado = new Label("Resultado");

        TextField textFieldValor1 = new TextField();
        TextField textFieldValor2 = new TextField();
        TextField textFieldResultado = new TextField();

        Button botonSumar = new Button("sumar");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10));
        layout.setVgap(10);
        layout.setHgap(5);

        layout.add(labelvalor1,0, 0);
        layout.add(textFieldValor1,1,0);

        layout.add(labelvalor2,0, 1);
        layout.add(textFieldValor2,1,1);

        layout.add(botonSumar,0, 2, 2,1);
        botonSumar.setAlignment(Pos.CENTER);

        botonSumar.setOnAction(e ->{

            int v1 = Integer.valueOf(textFieldValor1.getText());
            int v2 = Integer.valueOf(textFieldValor2.getText());

            int r = v1 +v2;
            textFieldResultado.setText(String.valueOf(r));

        }
        );

        layout.add(labelResultado,0, 3);
        layout.add(textFieldResultado,1, 3);
        Scene escena = new Scene(layout);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Sumador");
        primaryStage.show();

    }
}
// sumador - eventos -
