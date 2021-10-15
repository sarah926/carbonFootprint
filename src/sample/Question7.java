package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Question7 implements QuestionScreen{
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
            CarbonCalculator.setPropaneType(CarbonCalculator.PropaneType.YES);
        }
        else if(e.getSource()==less){
            CarbonCalculator.setPropaneType(CarbonCalculator.PropaneType.LESS);
        }
        else{
            CarbonCalculator.setPropaneType(CarbonCalculator.PropaneType.NO);
        }
        Main.switchScreens("totals",yes);
    }
    @Override
    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question6", yes);
        }
    }
}
