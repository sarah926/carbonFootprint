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
    @FXML
    Button back;


    public void askTransportation(ActionEvent e) throws Exception {

        if(e.getSource()==bus){

            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.BUS);
            Main.switchScreens("busChosen",bus);

        }
        else if(e.getSource()==car){

            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.CAR);
            Main.switchScreens("carChosen",car);

        }
        else{
            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.WALK);
            Main.switchScreens("totals",walk);

        }


    }
    public void back(ActionEvent e) throws Exception{
        if(e.getSource()==back){
            Main.switchScreens("question2",back);
        }
    }



}
