package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdressbuchController {
    @FXML
    private AnchorPane neuerKalenderPane;
    @FXML
    private Button btnBackNeuerKalender;

    public void handleBtnNeuerKalender(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        neuerKalenderPane.getChildren().setAll(newPane);
    }
}
