package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;

public class CarChosen {
    @FXML
    TextField answer1;
    @FXML
    TextField answer2;
    @FXML
    Button submit;



    public void submitNums(ActionEvent e) throws Exception{
        if(e.getSource() == submit){

            CarbonCalculator.setMiles(parseInt(answer1.getText()));
            CarbonCalculator.setMPG(parseInt(answer2.getText()));

            Stage stage;
            Parent root = FXMLLoader.load(getClass().getResource("totals.fxml"));
            stage = (Stage) submit.getScene().getWindow();
            Scene scene = new Scene(root,500,400);
            stage.setScene(scene);
            stage.show();
        }

    }
}
