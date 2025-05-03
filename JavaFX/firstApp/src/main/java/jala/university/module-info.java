module jala.university {
    requires javafx.controls;
    requires javafx.fxml;

    opens jala.university to javafx.fxml;
    exports jala.university;
}