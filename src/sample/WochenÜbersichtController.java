package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class WochenÜbersichtController {
    @FXML
    private AnchorPane WochenÜbersichtPane;
    @FXML
    private Button btnBackTagesübersicht;

    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Uebersicht.fxml"));
        WochenÜbersichtPane.getChildren().setAll(newPane);
    }
}
