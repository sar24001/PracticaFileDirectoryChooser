package com.tuempresa.practicafiledirectorychooser;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.io.File;

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
    private Button btnRequerimiento;


    @FXML
    private void seleccionarRequerimiento() {
        FileChooser fc = new FileChooser();
        fc.setTitle("Seleccionar Archivo");
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Archivo TXT", "*.txt"),
                new FileChooser.ExtensionFilter("Archivos PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Archivos xlsx", "*.xlsx"),
                new FileChooser.ExtensionFilter("Archivos docx", "*.docx"));

        File f = fc.showOpenDialog(btnRequerimiento.getScene().getWindow());
        if (f != null) {
            txtArchivoRequerimiento.setText(f.getAbsolutePath());
        }
    }

    @FXML
    private void seleccionarDirectorio(){
                DirectoryChooser dc = new DirectoryChooser();
                dc.setTitle("Seleccionar Directorio");
                dc.setInitialDirectory(new File(System.getProperty("C:\\")));
                File f = dc.showDialog(btnSeleccionarArchivo.getScene().getWindow());

                if (f != null) {
                    txtDirectorioProyecto.setText(f.getAbsolutePath());
                }
    }
    @FXML
    private void guardarProyecto() {
        if (!validarFormulario()){

        }
    }


    private boolean validarFormulario() {
        if (txtProyecto.getText().isEmpty() || txtDescripcionProyecto.getText().isEmpty() ||
                txtArchivoRequerimiento.getText().isEmpty() || txtDirectorioProyecto.getText().isEmpty() ||
                txtResponsable.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de validación");
            alert.setHeaderText(null);
            alert.setContentText("Todos los campos son obligatorios.");
            alert.showAndWait();
            return false;
        } else {
            return true;
        }
    }

    @FXML
    private void limpiarProyecto(){
        txtProyecto.setText("");
        txtResponsable.setText("");
        txtDescripcionProyecto.setText("");
        txtArchivoRequerimiento.setText("");
        txtDirectorioProyecto("");

    }

    @FXML
    private void guardarDatos() {
        if (!validarFormulario()) {
            Alert confirmacion = new Alert(Alert.AlertType.CONFIRMATION);
            confirmacion.setTitle("Confirmación");
            confirmacion.setHeaderText("¿Seguro que quiere guardar el proyecto?");
            confirmacion.setContentText("Proyecto: " +  txtProyecto.getText());

            Optional<ButtonType> respuesta = confirmacion.showAndWait();
            if(respuesta.isPresent() && respuesta.get() == ButtonType.OK){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Proyecto guardado");
                alert.setHeaderText("Proyecto guardado");
                alert.setContentText("Proyecto guardado");
                limpiarProyecto();
            }
        }
    }


}
