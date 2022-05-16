package view;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL arquivoFXML = getClass().getResource("/view/Login.fxml");
        Scene cenaLogin = FXMLLoader.load(arquivoFXML);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Tela de Login");
        primaryStage.setScene(cenaLogin);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}