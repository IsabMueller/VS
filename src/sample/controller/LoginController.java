package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.File;
import java.util.ResourceBundle;
import java.net.URL;

public class LoginController{


    @FXML
    private Button btnCancel;
    @FXML
    private Button btnLogin;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private TextField tfUsername;
    @FXML
    private BorderPane loginPane;


    public TextField getTfUsername() {
        return tfUsername;
    }

    public PasswordField getTfPassword() {
        return tfPassword;
    }

    String Username;
    String Password;


    public void submitBtnLogin(ActionEvent event) {
    }

    public void handleBtnCancel(ActionEvent event) {
    }
}

