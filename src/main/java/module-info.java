module com.example.testgitwworkflow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testgitwworkflow to javafx.fxml;
    exports com.example.testgitwworkflow;
}