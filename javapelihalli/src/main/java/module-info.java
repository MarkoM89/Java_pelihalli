module com.github.javapelihalli {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.javapelihalli to javafx.fxml;
    exports com.github.javapelihalli;
}
