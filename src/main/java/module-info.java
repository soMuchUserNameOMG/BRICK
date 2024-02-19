module com.example.brick {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brick to javafx.fxml;
    exports com.example.brick;
    exports com.example.brick.Untils;
    opens com.example.brick.Untils to javafx.fxml;
    exports com.example.brick.Objects;
}