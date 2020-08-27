module RSA.Cryptography {
    requires javafx.fxml;
    requires javafx.controls;
    requires AnimateFX;
    requires java.desktop;

    opens sample;
    opens sample.Conversion;
    opens sample.InstructMultGenerate;
    opens sample.NumberTheory;
    opens sample.EncryptDecrypt;
    opens sample.RSAAttacks;
}