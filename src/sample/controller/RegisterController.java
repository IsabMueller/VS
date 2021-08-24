package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class RegisterController {

    @FXML
    private TextField tfRegVorname;
    @FXML
    private TextField tfRegNachname;
    @FXML
    private TextField tfRegUsername;
    @FXML
    private TextField tfRegMail;
    @FXML
    private TextField tfRegPw;
    @FXML
    private TextField tfRegPwConfirm;
    @FXML
    private Button registrierenButton;
    @FXML
    private BorderPane registrierenPane;
    @FXML
    private Button btnAbbrechen;


    /**
     *  zurück zum GUI Willkommen
     */
    @FXML
    public void handleBtnAbbrechen(ActionEvent actionEvent){
        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("view/Willkommen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        registrierenPane.getChildren().setAll(newPane);
    }

    //public void handleBtnReg(ActionEvent actionEvent) {
    //}
}
