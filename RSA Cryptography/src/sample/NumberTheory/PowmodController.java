package sample.NumberTheory;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.CommonFunction;

import java.math.BigInteger;

public class PowmodController {

    @FXML
    public TextArea textarea;
    @FXML
    public TextField power,modulo;
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
        String a=textarea.getText().trim();
        String n=power.getText().trim();
        String modu=modulo.getText().trim();
        System.out.println(CommonFunction.powMod(new BigInteger(a),new BigInteger(n),new BigInteger(modu)));
        label.setText(String.valueOf(CommonFunction.powMod(new BigInteger(a),new BigInteger(n),new BigInteger(modu))));
    }
}
