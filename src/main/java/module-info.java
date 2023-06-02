module com.example.cardplaying {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cardplaying to javafx.fxml;
    exports com.example.cardplaying;
}