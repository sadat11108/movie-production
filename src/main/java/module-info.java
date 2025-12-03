module com.example.movieproductionhouse {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;


    opens com.example.movieproductionhouse to javafx.fxml;
    exports com.example.movieproductionhouse;
    exports com.example.movieproductionhouse.Sadat2420803.Audience;
    opens com.example.movieproductionhouse.Sadat2420803.Audience to javafx.fxml;
    exports com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;
    opens com.example.movieproductionhouse.Sadat2420803.SoundSystemManager to javafx.fxml;
}