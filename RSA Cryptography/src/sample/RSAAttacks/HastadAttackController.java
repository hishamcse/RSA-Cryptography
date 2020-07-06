package sample.RSAAttacks;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.CommonFunction;
import java.math.BigInteger;

public class HastadAttackController {
    @FXML
    public TextArea ciphertext1,modulo1,ciphertext2,modulo2,label;
    @FXML
    public Button btn;

    public void initialize(){
        btn.setOnMouseClicked(event -> {
            process();
        });
    }

    public void process(){
        BigInteger c1=new BigInteger(ciphertext1.getText().trim());
        BigInteger m1=new BigInteger(modulo1.getText().trim());
        BigInteger c2=new BigInteger(ciphertext2.getText().trim());
        BigInteger m2=new BigInteger(modulo2.getText().trim());
        label.setText(CommonFunction.decipherHastad(c1,m1,c2,m2));
    }
}
