package Layout;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Evaluacion001 extends Application implements EventHandler{
    public static double n1;
    public static double n2;
    public static double r;
    public static double r1;
    public static char ope;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField display = new TextField("0");
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setEditable(false);

        Button botonLimpiarTodo = new Button("Limpiar todo");
        Button botonLimpiar = new Button("Limpiar");
        Button boton0 = new Button("0");
        Button boton1 = new Button("1");
        Button boton2 = new Button("2");
        Button boton3 = new Button("3");
        Button boton4 = new Button("4");
        Button boton5 = new Button("5");
        Button boton6 = new Button("6");
        Button boton7 = new Button("7");
        Button boton8 = new Button("8");
        Button boton9 = new Button("9");
        Button botonSuma = new Button("+");
        Button botonResta = new Button("-");
        Button botonMultiplicacion = new Button("*");
        Button botonDivision = new Button("/");
        Button botonPunto = new Button(".");
        Button botonResultado = new Button("=");

        display.setPrefSize(300,30);
        botonLimpiarTodo.setPrefSize(170,50);
        botonLimpiar.setPrefSize(80,50);
        botonDivision.setPrefSize(80,50);
        boton0.setPrefSize(170,50);
        boton1.setPrefSize(80,50);
        boton2.setPrefSize(80,50);
        boton3.setPrefSize(80,50);
        boton4.setPrefSize(80,50);
        boton5.setPrefSize(80,50);
        boton6.setPrefSize(80,50);
        boton7.setPrefSize(80,50);
        boton8.setPrefSize(80,50);
        boton9.setPrefSize(80,50);
        botonSuma.setPrefSize(80,50);
        botonResta.setPrefSize(80,50);
        botonMultiplicacion.setPrefSize(80,50);
        botonPunto.setPrefSize(80,50);
        botonResultado.setPrefSize(80,50);

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(20));
        layout.setVgap(10);
        layout.setHgap(10);

        layout.add(display,0,0,4,1);
        layout.add(botonLimpiarTodo,0,1,2,1);
        layout.add(botonLimpiar,2,1);
        layout.add(botonDivision,3,1);
        layout.add(boton7,0,2);
        layout.add(boton8,1,2);
        layout.add(boton9,2,2);
        layout.add(botonMultiplicacion,3,2);
        layout.add(boton4,0,3);
        layout.add(boton5,1,3);
        layout.add(boton6,2,3);
        layout.add(botonResta,3,3);
        layout.add(boton1,0,4);
        layout.add(boton2,1,4);
        layout.add(boton3,2,4);
        layout.add(botonSuma,3,4);
        layout.add(boton0,0,5,2,1);
        layout.add(botonPunto,2,5);
        layout.add(botonResultado,3,5);

        boton0.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("0");
            }else {
                display.setText(display.getText()+"0");
            }
        });
        boton1.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("1");
            }else {
                display.setText(display.getText()+"1");
            }
        });
        boton2.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("2");
            }else {
                display.setText(display.getText()+"2");
            }
        });
        boton3.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("3");
            }else {
                display.setText(display.getText()+"3");
            }
        });
        boton4.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("4");
            }else {
                display.setText(display.getText()+"4");
            }
        });
        boton5.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("5");
            }else {
                display.setText(display.getText()+"5");
            }
        });
        boton6.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("6");
            }else {
                display.setText(display.getText()+"6");
            }
        });
        boton7.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("7");
            }else {
                display.setText(display.getText() + "7");
            }
        });
        boton8.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("8");
            }else {
                display.setText(display.getText()+"8");
            }
        });
        boton9.setOnAction(event ->
        {
            if (Double.parseDouble(display.getText())==0)
            {
                display.setText("9");
            }else {
                display.setText(display.getText()+"9");
            }
        });
        botonPunto.setOnAction(event ->
        {
            if (display.getText().contains(".")==false)
            {
                display.setText(display.getText()+".");
            }
        });
        botonLimpiar.setOnAction(event ->
        {
            display.setText("0");
        });
        botonLimpiarTodo.setOnAction(event -> {
            display.setText("0");
            n1 = Double.valueOf(0);
        });
        botonSuma.setOnAction(event -> {
            ope = '+';
            n1 = Double.parseDouble(display.getText());
            display.setText("0");
        });
        botonResta.setOnAction(event -> {
            ope = '-';
            n1 = Double.parseDouble(display.getText());
            display.setText("0");
        });
        botonMultiplicacion.setOnAction(event -> {
            ope = '*';
            n1 = Double.parseDouble(display.getText());
            display.setText("0");
        });
        botonDivision.setOnAction(event -> {
            ope = '/';
            n1 = Double.parseDouble(display.getText());
            display.setText("0");
        });
        botonResultado.setOnAction(event -> {
            switch (ope){
                case '+':
                    n2 = Double.valueOf(display.getText());
                    r = n1 + n2;
                    r1 = (int) r;
                    if(r==r1)
                        display.setText(""+(int)r1);
                    else display.setText(""+r);
                    break;
                case '-':
                    n2 = Double.valueOf(display.getText());
                    r = n1 - n2;
                    r1 = (int) r;
                    if(r==r1)
                        display.setText(""+(int)r1);
                    else display.setText(""+r);
                    break;
                case '*':
                    n2 = Double.valueOf(display.getText());
                    r = n1 * n2;
                    r1 = (int) r;
                    if(r==r1)
                        display.setText(""+(int)r1);
                    else display.setText(""+r);
                    break;
                case '/':
                    n2 = Double.valueOf(display.getText());
                    r = n1 / n2;
                    r1 = (int) r;
                    if(r==r1)
                        display.setText(""+(int)r1);
                    else display.setText(""+r);
                    break;
            }
        });

        Scene escena = new Scene(layout);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Calculadora Básica");
        primaryStage.show();

    }

    @Override
    public void handle(Event event) {

    }
}
