module com.main.escalasproyect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.escalasproyect to javafx.fxml;
    exports com.main.escalasproyect;
}