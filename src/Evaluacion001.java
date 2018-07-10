import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Evaluacion001 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
        public static double n1;
            public static char ope;
            public static double n2;
            public static double r;
            public static double r1;
            TextField display = new TextField("0");
            @Override
            public void start (Stage primaryStage) throws Exception {

            GridPane layout = new GridPane();
            layout.setPadding(new Insets(10));
            layout.setHgap(15);
            layout.setVgap(20);

            Button botonlimpt = new Button("Limpiar Todo");
            Button botonlimpiar = new Button("Limpiar");
            Button botondivi = new Button("/");
            Button boton7 = new Button("7");
            Button boton8 = new Button("8");
            Button boton9 = new Button("9");
            Button boton4 = new Button("4");
            Button boton5 = new Button("5");
            Button boton6 = new Button("6");
            Button boton1 = new Button("1");
            Button boton2 = new Button("2");
            Button boton3 = new Button("3");
            Button boton0 = new Button("0");
            Button botonmulti = new Button("*");
            Button botonresta = new Button("-");
            Button botonsuma = new Button("+");
            Button botonigual = new Button("=");
            Button botondeci = new Button(".");

            boton7.setPrefSize(60, 30);
            boton0.setPrefSize(70, 30);
            boton8.setPrefSize(60, 30);
            boton9.setPrefSize(60, 30);
            botonlimpt.setPrefSize(137, 30);
            boton4.setPrefSize(60, 30);
            boton5.setPrefSize(60, 30);
            boton6.setPrefSize(60, 30);
            botondivi.setPrefSize(60, 30);
            botonmulti.setPrefSize(60, 30);
            boton1.setPrefSize(60, 30);
            boton2.setPrefSize(60, 30);
            boton3.setPrefSize(60, 30);
            boton0.setPrefSize(137, 30);
            botondeci.setPrefSize(60, 30);
            botonigual.setPrefSize(60, 30);
            botonlimpiar.setPrefSize(60, 30);
            botonresta.setPrefSize(60, 30);
            botonsuma.setPrefSize(60, 30);


            TextField textFieldResultado = new TextField();

            layout.add(textFieldResultado, 0, 0, 4, 1);
            layout.add(botonlimpt, 0, 1, 2, 1);
            layout.add(botondivi, 3, 1);
            layout.add(boton7, 0, 2);
            layout.add(botonlimpiar, 2, 1);
            layout.add(boton8, 1, 2);
            layout.add(boton9, 2, 2);
            layout.add(botonmulti, 3, 2);
            layout.add(boton4, 0, 3);
            layout.add(boton5, 1, 3);
            layout.add(boton6, 2, 3);
            layout.add(botonresta, 3, 3);
            layout.add(boton1, 0, 4);
            layout.add(boton2, 1, 4);
            layout.add(boton3, 2, 4);
            layout.add(botonsuma, 3, 4);
            layout.add(boton0, 0, 5, 2, 1);
            layout.add(botondeci, 2, 5);
            layout.add(botonigual, 3, 5);

            boton1.setOnAction(e -> {

                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("1");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "1");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton0.setOnAction(e ->
            {
                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("0");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "0");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton2.setOnAction(e ->
            {
                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("2");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "2");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton3.setOnAction(e ->
            {

                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("3");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "3");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton4.setOnAction(e ->
            {
                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("4");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "4");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton5.setOnAction(e -> {

                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("5");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "5");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton6.setOnAction(e -> {

                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("6");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "6");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton7.setOnAction(e ->
            {
                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("7");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "7");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            boton8.setOnAction(e ->
            {
                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("8");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "8");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });
            boton9.setOnAction(e ->
            {
                if (textFieldResultado.getText().equalsIgnoreCase("0")) {
                    textFieldResultado.setText("9");
                } else {
                    textFieldResultado.setText(textFieldResultado.getText() + "9");
                }

                textFieldResultado.setAlignment(Pos.CENTER_RIGHT);
                textFieldResultado.setEditable(false);
            });

            botonsuma.setOnAction(e -> {
                ope = '+';
                n1 = Double.parseDouble(display.getText());
                display.setText("0");
            });
                botonresta.setOnAction(e -> {

                            ope = '-';
                            n1 = Double.parseDouble(display.getText());
                            display.setText("0");
                        });
                botonmulti.setOnAction(e -> {

                    ope = '*';
                    n1 = Double.parseDouble(display.getText());
                    display.setText("0");
                });
                botondivi.setOnAction(e -> {

                    ope = '/';
                    n1 = Double.parseDouble(display.getText());
                    display.setText("0");
                });

                botonigual.setOnAction(event -> {
                    switch (ope){
                        case '+':
                        n2 = Double.valueOf(display.getText());
                        r =  n1 + n2;
                        r1 = (int) r;
                        if (r==r1)
                            display.setText(""+(int)r1);
                        else display.setText(""+r);
                        break;
                        case '-':
                            n2 = Double.valueOf(display.getText());
                            r =  n1 - n2;
                            r1 = (int) r;
                            if (r==r1)
                                display.setText(""+(int)r1);
                            else display.setText(""+r);
                            break;
                        case '*':
                            n2 = Double.valueOf(display.getText());
                            r =  n1 * n2;
                            r1 = (int) r;
                            if (r==r1)
                                display.setText(""+(int)r1);
                            else display.setText(""+r);
                            break;
                        case '/':
                            n2 = Double.valueOf(display.getText());
                            r =  n1 / n2;
                            r1 = (int) r;
                            if (r==r1)
                                display.setText(""+(int)r1);
                            else display.setText(""+r);
                            break;

                    }
                });

                Scene escena = new Scene(layout);
            primaryStage.setScene(escena);
            primaryStage.show();
        }
        }




