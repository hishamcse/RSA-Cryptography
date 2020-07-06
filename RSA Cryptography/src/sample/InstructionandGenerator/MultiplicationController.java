package sample.InstructionandGenerator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.math.BigInteger;

public class MultiplicationController {
    @FXML
    public TextArea a,b,modulo;
    @FXML
    public Button btn;

    public void initialize(){
        btn.setOnMouseClicked(event -> {
            process();
        });
    }

    public void process(){
        String num1=a.getText().trim();
        String num2=b.getText().trim();
        BigInteger p=new BigInteger(num1);
        BigInteger q=new BigInteger(num2);
        BigInteger r=p.multiply(q);
        modulo.setText(String.valueOf(r));
    }
}
