module com.tuempresa.practicafiledirectorychooser {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.tuempresa.practicafiledirectorychooser to javafx.fxml;
    exports com.tuempresa.practicafiledirectorychooser;
}