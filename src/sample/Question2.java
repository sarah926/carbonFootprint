package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Question2 implements QuestionScreen {
    @FXML
    Button trash;
    @FXML
    Button recycle;
    @FXML
    Button back;
    @FXML
    ImageView imageView;

    public void ask(ActionEvent e) throws Exception {

        if (e.getSource() == trash) {
            CarbonCalculator.setWaste(CarbonCalculator.WasteType.TRASH);
        } else {
            CarbonCalculator.setWaste(CarbonCalculator.WasteType.RECYCLE);
        }
        Main.switchScreens("question3", trash);

    }

    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question1", trash);
        }
    }
}
