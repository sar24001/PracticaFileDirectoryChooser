package com.tuempresa.practicafiledirectorychooser;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import javax.swing.*;

public class RegistroProyectosController {
    @FXML
    private TextField txtProyecto;
    @FXML
    private TextField txtResponsable;
    @FXML
    private TextField txtDescripcionProyecto;
    @FXML
    private TextField txtArchivoRequerimiento;
    @FXML
    private TextField txtDirectorioProyecto;
    @FXML
    private Button btnSeleccionarArchivo;

    @FXML
    private void seleccionarArchivo
            FileChooser fc = new FileChooser();
            fc.setTitle("Selccionar Archivo");
            fc.getExtensionsFilters().addAll()

    @FXML
    private void seleccionarDirectorio(){
                DirectoryChooser dc = new DirectoryChooser();
                dc.setTitle("Seleccionar Directorio");
                dc.setInitialDirectory();
    }


}
