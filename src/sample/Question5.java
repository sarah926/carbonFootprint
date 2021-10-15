package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Question5 implements QuestionScreen{
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
            CarbonCalculator.setNaturalGasType(CarbonCalculator.NaturalGasType.YES);
        }
        else if(e.getSource()==less){
            CarbonCalculator.setNaturalGasType(CarbonCalculator.NaturalGasType.LESS);
        }
        else{
            CarbonCalculator.setNaturalGasType(CarbonCalculator.NaturalGasType.NO);
        }
        Main.switchScreens("question6",yes);
    }

    @Override
    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question4", yes);
        }
    }


}
