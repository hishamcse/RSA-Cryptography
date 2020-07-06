package sample.InstructionandGenerator;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class InstructionController {
    @FXML
    public Hyperlink hp,test;

    public void initialize(){
        hp.setOnMouseClicked(event -> {
            try{
            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
        }catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }
        });

        test.setOnMouseClicked(event -> {
            try {
                Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
            }catch (IOException | URISyntaxException e){
                e.printStackTrace();
            }
        });
    }
}
