package sample.InstructMultGenerate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.math.BigInteger;
import java.security.SecureRandom;

public class GeneratorController {
    @FXML
    public Button gen;
    @FXML
    public TextArea tx;

    public void initialize(){
        gen.setOnMouseClicked(event -> {
            process();
        });
    }

    public void process(){
        SecureRandom random=new SecureRandom();
        BigInteger c=BigInteger.probablePrime(1024,random);
        System.out.println(c.bitLength());
        tx.setText(String.valueOf(c));
    }
}
