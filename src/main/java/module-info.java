module cs112.ud3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cs112.ud3 to javafx.fxml;
    exports cs112.ud3;
}