package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class TerminBearbeitenController {


    @FXML
    private DatePicker dpTerminEdit;
    @FXML
    private Button btnOK;
    @FXML
    private Button btnBack;
    @FXML
    private AnchorPane TerminBearbeitenPane;

    public void handleBtnBack(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        TerminBearbeitenPane.getChildren().setAll(newPane);
    }
}
