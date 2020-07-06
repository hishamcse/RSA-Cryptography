package sample.RSAAttacks;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.CommonFunction;
import java.math.BigInteger;

public class CommonDivisorAttackController {
    @FXML
    public TextArea ciphertext1,modulo1,exponent1,ciphertext2,modulo2,exponent2,label1,label2;
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
        BigInteger e1=new BigInteger(exponent1.getText().trim());
        BigInteger c2=new BigInteger(ciphertext2.getText().trim());
        BigInteger m2=new BigInteger(modulo2.getText().trim());
        BigInteger e2=new BigInteger(exponent2.getText().trim());
        String[] result= CommonFunction.decipherCommonDivisor(c1,m1,e1,c2,m2,e2);
        if(result[0]!=null && result[1]!=null){
            label1.setText(result[0]);
            label2.setText(result[1]);
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Warning");
            alert.setContentText("sorry,can’t determine the original message");
            alert.showAndWait();
        }
    }
}
