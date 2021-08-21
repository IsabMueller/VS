package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TagesÜbersichtController {
    @FXML
    private AnchorPane TagesÜbersichtPane;
    @FXML
    private Button btnBackTagesübersicht;

    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Uebersicht.fxml"));
        TagesÜbersichtPane.getChildren().setAll(newPane);
    }
}
