package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFxml extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String arquivoCss = getClass().getResource("/fxml/Login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
        GridPane raiz = FXMLLoader.load(arquivoFXML);
        // raiz.setGridLinesVisible(true);

        Scene cena = new Scene(raiz, 350, 400);
        cena.getStylesheets().add(arquivoCss);
        cena.getStylesheets().add("https://fonts.googleapis.com/css2?family=Poppins");

        primaryStage.setResizable(false); // Impede que a tela seja maximizada
        primaryStage.setTitle("Tela de Login");
        primaryStage.setScene(cena);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
