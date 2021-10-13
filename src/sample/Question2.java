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
    @FXML
    Button back;

    public void askTrash(ActionEvent e) throws Exception {

        if(e.getSource()==trash){
            CarbonCalculator.setWaste(CarbonCalculator.WasteType.TRASH);
        }
        else{
            CarbonCalculator.setWaste(CarbonCalculator.WasteType.RECYCLE);
        }
        Main.switchScreens("question3",trash);

    }
    public void back(ActionEvent e) throws Exception{
        if(e.getSource()==back){
            Main.switchScreens("question1",back);
        }
    }
}
