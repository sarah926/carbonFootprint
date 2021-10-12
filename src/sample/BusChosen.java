package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;

public class BusChosen {
    @FXML
    Text Question2;
    @FXML
    TextField answer1;
    @FXML
    Button submit;


    public void submitNums(ActionEvent e) throws Exception{
        if(e.getSource() == submit){
            CarbonCalculator.setMiles(parseInt(answer1.getText()));

            Stage stage;
            Parent root = FXMLLoader.load(getClass().getResource("totals.fxml"));
            stage = (Stage) submit.getScene().getWindow();
            Scene scene = new Scene(root,500,400);
            stage.setScene(scene);
            stage.show();
        }

    }
}
