package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class RegisterController {

    @FXML
    private BorderPane registrierenPane;
    @FXML
    private Button btnAbbrechen;


    //zurück zur willkommen.fxml
    @FXML
    public void handleBtnAbbrechen(ActionEvent actionEvent){
        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("Willkommen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        registrierenPane.getChildren().setAll(newPane);
    }
}