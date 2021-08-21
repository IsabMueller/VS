package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TrackerController {
    @FXML
    private Button btnBackSettings;
    @FXML
    private AnchorPane TrackerPane;
    @FXML
    private javafx.scene.control.Button btnZeitenÜbersicht;
    @FXML
    private javafx.scene.control.Button btnBackTagesübersicht;
    @FXML
    private javafx.scene.control.Button BtnStartTracker;
    @FXML
    private javafx.scene.control.Button BtnEndTracker;

    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        TrackerPane.getChildren().setAll(newPane);
    }
}
