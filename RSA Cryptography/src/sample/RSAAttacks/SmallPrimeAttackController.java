package sample.RSAAttacks;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.CommonFunction;

import java.math.BigInteger;

public class SmallPrimeAttackController {
    @FXML
    public TextArea ciphertext,label;
    @FXML
    public TextField modulo,exponent;
    @FXML
    public Button btn;

    public void initialize(){
        btn.setOnMouseClicked(event -> {
            process();
        });
    }

    public void process(){
        String c=ciphertext.getText().trim();
        String modu=modulo.getText().trim();
        String exp=exponent.getText().trim();
        String result= CommonFunction.deciphersmallprime(new BigInteger(c),new BigInteger(modu),new BigInteger(exp));
        if(result!=null){
            label.setText(result);
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Warning");
            alert.setContentText("sorry,can’t determine the original message ");
            alert.showAndWait();
        }
    }
}
