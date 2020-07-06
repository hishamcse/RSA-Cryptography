module RSA.Cryptography {
    requires javafx.fxml;
    requires javafx.controls;
    requires AnimateFX;
    requires java.desktop;

    opens sample;
    opens sample.Conversion;
    opens sample.InstructionandGenerator;
    opens sample.NumberTheory;
    opens sample.EncryptDecrypt;
    opens sample.RSAAttacks;
}