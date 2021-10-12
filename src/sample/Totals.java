package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class Totals {
    @FXML
    Text totalNum;
    @FXML
    Button restart;
    @FXML
    Button moreInfo;

    public Totals(){

    }
    @FXML
    private void initialize(){
        calc(CarbonCalculator.dietCarbon, CarbonCalculator.wasteCarbon, CarbonCalculator.transportationCarbon);
    }
    public double calc(double eat, double waste, double transport){
        double carbon = eat + waste + transport;
        totalNum.setText(String.valueOf(carbon));
        System.out.println(carbon);
        return carbon;
    }

    public void clicked(ActionEvent e) throws Exception{
        if(e.getSource() == restart){
            Stage stage;
            Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
            stage = (Stage) restart.getScene().getWindow();
            Scene scene = new Scene(root,500,400);
            stage.setScene(scene);
            stage.show();
        }
        else if(e.getSource() == moreInfo){

        }
    }
}
