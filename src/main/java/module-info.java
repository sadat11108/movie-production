module com.example.movieproductionhouse {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.movieproductionhouse to javafx.fxml;
    exports com.example.movieproductionhouse;
}