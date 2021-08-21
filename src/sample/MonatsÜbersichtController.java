package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MonatsÜbersichtController {
    @FXML
    private Button btnBackTagesübersicht;
    @FXML
    private AnchorPane MonatsÜbersichtPane;

    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Uebersicht.fxml"));
        MonatsÜbersichtPane.getChildren().setAll(newPane);
    }
}
