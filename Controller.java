package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private ChoiceBox<String> choicebox1;

    @FXML
    private TextField textfield1;

    @FXML
    private TextField textfield2;

    @FXML
    private Label label1;

    @FXML
    private TextField textfield3;

    @FXML
    private Button button1;
    @FXML
    public void initialize(){
        choicebox1.getItems().add("+");
        choicebox1.getItems().add("-");
        choicebox1.getItems().add("*");
        choicebox1.getItems().add("/");
        choicebox1.setValue(choicebox1.getItems().get(0));
        button1.setOnAction(actionEvent -> {
            double d1=Double.parseDouble(textfield1.getText());
            double d2=Double.parseDouble(textfield2.getText());
            double d3=0;
            switch ((String)choicebox1.getValue())
            {
                case "+"->d3=d1+d2;
                case "-"->d3=d1-d2;
                case "*"->d3=d1*d2;

                case "/"-> {
                    if (d2 != 0) {
                        d3 = d1 / d2;
                    }

                else {
                        Alert alert1 = new Alert(Alert.AlertType.ERROR);
                        alert1.setTitle("error");
                        alert1.setContentText("div by 0");
                        alert1.showAndWait();
                    }
                }
            }
            textfield3.setText(String.valueOf(d3));
        });
    }
}

