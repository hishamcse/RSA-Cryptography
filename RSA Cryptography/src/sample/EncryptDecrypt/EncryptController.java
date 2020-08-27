package sample.EncryptDecrypt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.CommonFunction;

import java.math.BigInteger;

public class EncryptController {
    @FXML
    public TextArea textarea;
    @FXML
    public TextArea p, q, exponent;
    @FXML
    public Button btn;
    @FXML
    public TextArea label;

    public void initialize() {
        btn.setOnMouseClicked(event -> process());
    }

    public void process() {
        String message = textarea.getText().trim();
        String privateP = p.getText().trim();
        String privateQ = q.getText().trim();
        BigInteger modu = new BigInteger(privateP).multiply(new BigInteger(privateQ));
        String exp = exponent.getText().trim();
        System.out.println(CommonFunction.encrypt(message, modu, new BigInteger(exp)));
        label.setText(String.valueOf(CommonFunction.encrypt(message, modu, new BigInteger(exp))));
    }
}
