module com.anindya.cricket_club {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anindya.cricket_club to javafx.fxml;
    exports com.anindya.cricket_club;
}