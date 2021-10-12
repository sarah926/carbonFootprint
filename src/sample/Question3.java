package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;

public class Question3 {
    @FXML
    Button bus;
    @FXML
    Button car;
    @FXML
    Button walk;


    public void askTransportation(ActionEvent e) throws Exception {

        if(e.getSource()==bus){

            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.BUS);
            Stage stage;
            Parent root = FXMLLoader.load(getClass().getResource("busChosen.fxml"));
            stage = (Stage) bus.getScene().getWindow();
            Scene scene = new Scene(root,500,400);
            stage.setScene(scene);
            stage.show();
        }
        else if(e.getSource()==car){

            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.CAR);
            Stage stage;
            Parent root = FXMLLoader.load(getClass().getResource("carChosen.fxml"));
            stage = (Stage) bus.getScene().getWindow();
            Scene scene = new Scene(root,500,400);
            stage.setScene(scene);
            stage.show();
        }
        else{
            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.WALK);
            Stage stage;
            Parent root = FXMLLoader.load(getClass().getResource("totals.fxml"));
            stage = (Stage) bus.getScene().getWindow();
            Scene scene = new Scene(root,500,400);
            stage.setScene(scene);
            stage.show();
        }


    }



}
