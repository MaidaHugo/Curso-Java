package controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    public void entrar() {
        boolean emailValido = campoEmail.getText().equals("teste");
        boolean senhaValida = campoSenha.getText().equals("1234");

        if (emailValido && senhaValida) {
            Notifications.create()
                    .position(Pos.CENTER)
                    .darkStyle()
                    .title("Login")
                    .text("Login efetuado com sucesso!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.CENTER)
                    .darkStyle()
                    .title("Login")
                    .text("Usuário e/ou senha inválido")
                    .showError();
        }
    }

    public void abrirLink() {
        System.out.println("Clicado");
        try {
            Desktop.getDesktop().browse(
                    new URL("https://github.com").toURI());
        } catch (IOException | URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }
}
