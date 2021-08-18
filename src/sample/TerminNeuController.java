package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TerminNeuController {

    @FXML
    private AnchorPane terminNeuPane;
    @FXML
    private Button btnOK;
    @FXML
    private Button btnBack;
    @FXML
    private TextField textFieldName;


    //Textfield Name geben

    private String Terminname;

        public void name(ActionEvent event) {
            Terminname = textFieldName.getText();
        }

    //zurück zu Start.fxml//
    @FXML
    public void handleBtnBack(ActionEvent event) throws IOException{
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        terminNeuPane.getChildren().setAll(newPane);
    }

    public void handleBtnOK(ActionEvent actionEvent) {
    }
}
