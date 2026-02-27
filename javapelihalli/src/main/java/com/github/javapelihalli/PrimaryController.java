package com.github.javapelihalli;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToLukuarvaus() throws IOException {
        App.setRoot("luvunarvaus");
    }

    @FXML
    private void switchToVisailu() throws IOException {
        App.setRoot("visailu");
    }

    @FXML
    private void switcToKiviPaperiSakset() throws IOException {
        App.setRoot("kivipaperisakset");
    }

        @FXML
    private void switchTohedelmapeli() throws IOException {
        App.setRoot("hedelmapeli");
    }

        @FXML
    private void switchToNoppaArvonta() throws IOException {
        App.setRoot("nopallaarvonta");
    }

        @FXML
    private void switchToHirttopuu() throws IOException {
        App.setRoot("hirttopuu");
    }
}
