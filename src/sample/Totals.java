package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
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
    @FXML
    Button back;

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
            Main.switchScreens("startScreen",restart);
        }
        else if(e.getSource() == moreInfo){

        }
    }
    public void back(ActionEvent e) throws Exception{
        if(e.getSource()==back){
            Main.switchScreens("question3",back);
        }
    }

}
