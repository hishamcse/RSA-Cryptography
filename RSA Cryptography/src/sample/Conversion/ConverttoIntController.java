package sample.Conversion;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.CommonFunction;


public class ConverttoIntController {
    @FXML
    public TextArea textarea;
    @FXML
    public TextArea label;
    @FXML
    public Button btn;

    public void initialize(){
        btn.setOnMouseClicked(event -> {
            process();
        });
    }

    @FXML
    public void process(){
        String s=textarea.getText().trim();
        System.out.println(CommonFunction.ConvertToBigInt(s));
        label.setText(CommonFunction.ConvertToBigInt(s).toString());
    }
}
