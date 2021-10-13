package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;


public class Totals {
    @FXML
    Text totalNum;
    @FXML
    Button restart;
    @FXML
    Button moreInfo;

    @FXML
    ImageView imageView;

    public Totals() {

    }

    @FXML
    private void initialize() {
        calc(CarbonCalculator.dietCarbon, CarbonCalculator.wasteCarbon, CarbonCalculator.transportationCarbon);
    }

    public double calc(double eat, double waste, double transport) {
        double carbon = eat + waste + transport;
        totalNum.setText(carbon + " kg of CO2");
        System.out.println(carbon);
        return carbon;
    }

    public void clicked(ActionEvent e) throws Exception {
        if (e.getSource() == restart) {
            Main.switchScreens("startScreen", restart);
        } else if (e.getSource() == moreInfo) {

        }
    }

    public void back(MouseEvent e) throws Exception {
        if (e.getSource() == imageView) {
            Main.switchScreens("question3", restart);
        }
    }

}
