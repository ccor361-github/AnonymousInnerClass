package es.ieslosmontecillos.anonymousinnerclass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AnonymousInnerClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Button btnNuevo = new Button("Nuevo");
        Button btnAbrir = new Button("Abrir");
        Button btnGuardar = new Button("Guardar");
        Button btnImprimir = new Button("Imprimir");

        //Manejadores de los botones
        btnNuevo.setOnAction(actionEvent -> System.out.println("Nuevo proceso"));
        btnAbrir.setOnAction(actionEvent -> System.out.println("Abrir proceso"));
        btnGuardar.setOnAction(actionEvent -> System.out.println("Guardar proceso"));
        btnImprimir.setOnAction(actionEvent -> System.out.println("Imprimir proceso"));

        HBox root = new HBox(10);
        root.setPadding(new Insets(30, 30, 30, 30));
        root.getChildren().addAll(btnNuevo, btnAbrir, btnGuardar, btnImprimir);


        Scene scene = new Scene(root, 300, 90);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}