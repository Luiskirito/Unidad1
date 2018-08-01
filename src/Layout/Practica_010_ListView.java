package Layout;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;



public class Practica_010_ListView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ObservableList<String> elementos = FXCollections.observableArrayList();
        elementos.add("Manzana");
        elementos.add("Pera");
        elementos.add("Sandia");
        elementos.add("Aguacate");

    }
}
