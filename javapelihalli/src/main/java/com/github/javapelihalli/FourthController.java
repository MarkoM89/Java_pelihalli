package com.github.javapelihalli;

import java.io.IOException;
import javafx.fxml.FXML;

public class FourthController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

}
