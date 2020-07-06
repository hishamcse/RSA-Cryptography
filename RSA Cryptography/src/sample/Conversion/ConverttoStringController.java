package sample.Conversion;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.CommonFunction;

import java.math.BigInteger;

public class ConverttoStringController {
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

    public void process(){
        String s=textarea.getText().trim();
        System.out.println(CommonFunction.ConverttoString(new BigInteger(s)));
        label.setText(CommonFunction.ConverttoString(new BigInteger(s)));
    }

}
