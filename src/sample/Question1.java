package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Question1 extends Parent implements QuestionScreen {
    @FXML
    Button vegan;
    @FXML
    Button vegetarian;
    @FXML
    Button meat;

    @FXML
    GridPane grid;
    @FXML
    ImageView imageView;

    Text t = new Text("hello");


    public void ask(ActionEvent e) throws Exception {

        if (e.getSource() == vegan) {
            CarbonCalculator.setDiet(CarbonCalculator.DietType.VEGAN);
        } else if (e.getSource() == vegetarian) {
            CarbonCalculator.setDiet(CarbonCalculator.DietType.VEGETARIAN);
        } else {
            CarbonCalculator.setDiet(CarbonCalculator.DietType.MEAT);
        }

        Main.switchScreens("question2", vegan);

    }

    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("startScreen", vegan);
        }
    }


}
