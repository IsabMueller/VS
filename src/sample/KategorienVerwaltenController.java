package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class KategorienVerwaltenController {
    @FXML
    private Button btnBackKategorienVerwalten;
    @FXML
    private AnchorPane KategorienVerwaltenPane;

    public void handleBtnBackKategorienVerwalten(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Einstellungen.fxml"));
        KategorienVerwaltenPane.getChildren().setAll(newPane);
    }
}