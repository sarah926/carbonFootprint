package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Question3 implements QuestionScreen {
    @FXML
    Button bus;
    @FXML
    Button car;
    @FXML
    Button walk;
    @FXML
    Button back;
    @FXML
    ImageView imageView;


    public void ask(ActionEvent e) throws Exception {

        if (e.getSource() == bus) {

            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.BUS);
            Main.switchScreens("busChosen", bus);

        } else if (e.getSource() == car) {

            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.CAR);
            Main.switchScreens("carChosen", car);

        } else {
            CarbonCalculator.setTransportation(CarbonCalculator.TransportationType.WALK);
            Main.switchScreens("totals", walk);

        }


    }

    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question2", walk);
        }
    }


}
