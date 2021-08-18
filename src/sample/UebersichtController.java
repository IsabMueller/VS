package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UebersichtController {
    @FXML
    private AnchorPane uebersichtPane;
    @FXML
    private Button btnBackUebersicht;

    public void handleBtnBackUebersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }
}
