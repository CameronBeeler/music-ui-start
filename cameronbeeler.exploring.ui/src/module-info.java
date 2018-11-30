module cameronbeeler.exploring.ui {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires cameronbeeler.exploring.common;
    requires cameronbeeler.exploring.data;

    exports cameronbeeler.exploring.ui to javafx.graphics;
    opens cameronbeeler.exploring.ui to javafx.fxml;

}