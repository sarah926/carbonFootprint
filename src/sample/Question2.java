package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Question2 {
    @FXML
    Button trash;
    @FXML
    Button recycle;


    public void askTrash(ActionEvent e) throws Exception {

        if(e.getSource()==trash){
            CarbonCalculator.setWaste(CarbonCalculator.WasteType.TRASH);
        }
        else{
            CarbonCalculator.setWaste(CarbonCalculator.WasteType.RECYCLE);
        }

        Stage stage;
        Parent root = FXMLLoader.load(getClass().getResource("question3.fxml"));
        stage = (Stage) trash.getScene().getWindow();
        Scene scene = new Scene(root,500,400);
        stage.setScene(scene);
        stage.show();
    }
}
