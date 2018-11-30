module cameronbeeler.exploring.ui {
    requires javafx.controls;
    requires javafx.fxml;
    requires cameronbeeler.exploring.data;

    exports cameronbeeler.exploring.ui to javafx.graphics;
    opens cameronbeeler.exploring.ui to javafx.fxml;

}