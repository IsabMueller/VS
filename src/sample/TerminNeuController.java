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

public class TerminNeuController {

    @FXML
    private ComboBox comboboxKategorie;
    @FXML
    private TextField tfBisMin;
    @FXML
    private TextField tfBisStd;
    @FXML
    private TextField tfVonStd;
    @FXML
    private TextField tfVonMin;
    @FXML
    private TextField textFieldName;
    @FXML
    private DatePicker dpTerminNeu;
    @FXML
    private AnchorPane terminNeuPane;
    @FXML
    private Button btnOK;
    @FXML
    private Button btnBack;





    //zurück zu Start.fxml//
    @FXML
    public void handleBtnBack(ActionEvent event) throws IOException{
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        terminNeuPane.getChildren().setAll(newPane);
    }

    public void handleBtnOK(ActionEvent actionEvent) {
    }
}
