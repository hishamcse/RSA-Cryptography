package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    public BorderPane borderPane;

    @FXML
    public Button describe,ran,big,conversionint,conversionstring,powmod,invert,
            encryption,decryption,simple,smallprime,smalldiff,commondivisor,hastad;

    public void initialize(){

        describe.setOnMouseClicked(event -> {
            description();
        });

        ran.setOnMouseClicked(event -> {
            generate();
        });

        big.setOnMouseClicked(event -> {
            multiplication();
        });

        conversionint.setOnMouseClicked(event -> {
            conversiontoint();
        });

        conversionstring.setOnMouseClicked(event -> {
            conversiontostring();
        });

        powmod.setOnMouseClicked(event -> {
            powmodprocess();
        });

        invert.setOnMouseClicked(event -> {
            invertmodulo();
        });

        encryption.setOnMouseClicked(event -> {
            encrypt();
        });

        decryption.setOnMouseClicked(event -> {
            decrypt();
        });

        simple.setOnMouseClicked(event -> {
            deciphersimple();
        });

        smallprime.setOnMouseClicked(event -> {
            deciphersmallprime();
        });

        smalldiff.setOnMouseClicked(event -> {
            deciphersmalldifference();
        });

        commondivisor.setOnMouseClicked(event -> {
            deciphercommondivisor();
        });

        hastad.setOnMouseClicked(event -> {
            decipherHastad();
        });

    }

    public void description(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Instruction");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("InstructionandGenerator/instruction.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void generate(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Random Prime Generator");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("InstructionandGenerator/generator.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }
    }

    public void multiplication(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Big Multiplication");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("InstructionandGenerator/multiplication.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }
    }

    public void conversiontoint(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Conversion to ASCII");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Conversion/ConverttoInt.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void conversiontostring(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Conversion to Message");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Conversion/ConverttoString.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void powmodprocess(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("PowMod Function");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("NumberTheory/powmod.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void invertmodulo(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("InvertModulo Function");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("NumberTheory/invert.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void encrypt(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Encryption");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("EncryptDecrypt/encrypt.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void decrypt(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Decryption");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("EncryptDecrypt/decrypt.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void deciphersimple(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Decipher Simple");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("RSAAttacks/simpleAttack.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }

    }

    public void deciphersmallprime(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Decipher Small Prime");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("RSAAttacks/smallPrimeAttack.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }
    }

    public void deciphersmalldifference(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Decipher Small Difference");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("RSAAttacks/smallDifferenceAttack.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }
    }

    public void deciphercommondivisor(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Decipher Common Divisor");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("RSAAttacks/commonDivisorAttack.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }
    }

    public void decipherHastad(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(borderPane.getScene().getWindow());
        dialog.setTitle("Decipher Hastad");
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("RSAAttacks/hastadAttack.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> o = dialog.showAndWait();

        if(o.isPresent() && o.get()==ButtonType.OK) {
            dialog.close();
        }
    }
}
