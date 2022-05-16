package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

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
                    .title("Login FXML")
                    .text("Login efetuado com sucesso!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.CENTER)
                    .darkStyle()
                    .title("Login FXML")
                    .text("Usuário e/ou senha inválido")
                    .showError();
        }

        System.out.println("Usuário: " + campoEmail.getText());
        System.out.println("Senha: " + campoSenha.getText() + "\n");
    }

}
