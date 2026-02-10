package com.github.javapelihalli;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToLukuarvaus() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToVisailu() throws IOException {
        App.setRoot("third");
    }

    @FXML
    private void switcToKiviPaperiSakset() throws IOException {
        App.setRoot("fourth");
    }

        @FXML
    private void switchTohedelmapeli() throws IOException {
        App.setRoot("fifth");
    }

        @FXML
    private void switchToNoppaArvonta() throws IOException {
        App.setRoot("sixth");
    }

        @FXML
    private void switchToHirttopuu() throws IOException {
        App.setRoot("seventh");
    }
}
