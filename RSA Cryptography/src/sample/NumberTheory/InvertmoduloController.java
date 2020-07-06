package sample.NumberTheory;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.CommonFunction;

import java.math.BigInteger;

public class InvertmoduloController {
    @FXML
    public TextArea textarea;
    @FXML
    public TextField modulo;
    @FXML
    public Button btn;
    @FXML
    public TextArea label;

    public void initialize(){
        btn.setOnMouseClicked(event -> {
            process();
        });
    }

    public void process(){
        String a=textarea.getText().trim();
        String n=modulo.getText().trim();
        System.out.println(CommonFunction.InvertModulo(new BigInteger(a),new BigInteger(n)));
        label.setText(String.valueOf(CommonFunction.InvertModulo(new BigInteger(a),new BigInteger(n))));
    }
}
