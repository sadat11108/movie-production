module com.example.movieproductionhouse {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.movieproductionhouse to javafx.fxml;
    opens com.example.movieproductionhouse.Delowar_2420208.Director to javafx.fxml;
    opens com.example.movieproductionhouse.Delowar_2420208.Producer to javafx.fxml;
    exports com.example.movieproductionhouse;
}