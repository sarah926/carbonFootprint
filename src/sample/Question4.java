package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Question4 implements QuestionScreen{
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
           CarbonCalculator.setElectricityType(CarbonCalculator.ElectricityType.YES);
       }
       else if(e.getSource()==less){
           CarbonCalculator.setElectricityType(CarbonCalculator.ElectricityType.LESS);
       }
       else{
           CarbonCalculator.setElectricityType(CarbonCalculator.ElectricityType.NO);
       }
       Main.switchScreens("question5",yes);
    }
    @Override
    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question3", yes);
        }
    }

}
