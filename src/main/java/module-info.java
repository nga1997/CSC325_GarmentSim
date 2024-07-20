module com.example.garmentsim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.garmentsim to javafx.fxml;
    exports com.example.garmentsim;
}