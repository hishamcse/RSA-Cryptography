package sample.RSAAttacks;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.CommonFunction;
import java.math.BigInteger;

public class simpleAttackController {
    @FXML
    public TextArea ciphertext,label;
    @FXML
    public TextField modulo,exponent,imagine1,imagine2,imagine3;
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
        String[] all=new String[3];
        all[0]=imagine1.getText().trim();
        all[1]=imagine2.getText().trim();
        all[2]=imagine3.getText().trim();
        String result= CommonFunction.decipherSimple(new BigInteger(c),new BigInteger(modu),new BigInteger(exp),all);
        if(result!=null){
            label.setText(result);
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Warning");
            alert.setContentText("Sorry,Wrong imagination.Please try again");
            alert.showAndWait();
        }
    }
}
