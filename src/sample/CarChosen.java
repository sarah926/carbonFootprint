package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import static java.lang.Integer.parseInt;

public class CarChosen {
    @FXML
    TextField answer1;
    @FXML
    TextField answer2;
    @FXML
    Button submit;
    @FXML
    Button back;
    @FXML
    ImageView imageView;


    public void submitNums(ActionEvent e) throws Exception {
        if (e.getSource() == submit) {

            CarbonCalculator.setMiles(parseInt(answer1.getText()));
            CarbonCalculator.setMPG(parseInt(answer2.getText()));
            Main.switchScreens("question4", submit);
            CarbonCalculator.calcTransportation();

        }

    }

    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question3", submit);
        }
    }
}
