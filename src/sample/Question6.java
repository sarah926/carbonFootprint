package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Question6 implements QuestionScreen{
    @FXML
    Button yes;
    @FXML
    Button no;
    @FXML
    Button less;
    @FXML
    Button back;
    @FXML
    ImageView imageView;


    @Override
    public void ask(ActionEvent e) throws Exception {
        if(e.getSource() == yes){
            CarbonCalculator.setFuelOilType(CarbonCalculator.FuelOilType.YES);
        }
        else if(e.getSource()==less){
            CarbonCalculator.setFuelOilType(CarbonCalculator.FuelOilType.LESS);
        }
        else{
            CarbonCalculator.setFuelOilType(CarbonCalculator.FuelOilType.NO);
        }
        Main.switchScreens("question7",yes);
    }
    @Override
    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question5", yes);
        }
    }
}
