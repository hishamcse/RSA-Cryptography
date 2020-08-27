package sample.EncryptDecrypt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.CommonFunction;

import java.math.BigInteger;

public class DecryptController {
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
        String c = textarea.getText().trim();
        String privateP = p.getText().trim();
        String privateQ = q.getText().trim();
        String e = exponent.getText().trim();
        label.setText(CommonFunction.decrypt(new BigInteger(c), new BigInteger(privateP), new BigInteger(privateQ), new BigInteger(e)));
    }

}
