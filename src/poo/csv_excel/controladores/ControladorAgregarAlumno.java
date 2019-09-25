package poo.csv_excel.controladores;

import archivos.ArchivoXLSX;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import modelos.ListaMaterias;
import modelos.Materia;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class ControladorAgregarAlumno implements Initializable {
    ListaMaterias materias;
    private ObservableList<Materia> materiaObservableList;
    private ArchivoXLSX archivoXLSX;
    @FXML
    public TextField txtAsis;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnRegresar;
    @FXML
    private TextField txtApellidoPaterno;
    @FXML
    private TextField txtApellidoMaterno;
    @FXML
    private TextField txtMatricula;
    @FXML
    private ComboBox comboMaterias;
    @FXML
    private TextField txtUnidad1;
    @FXML
    private TextField txtUnidad2;
    @FXML
    private TextField txtUnidad3;
    @FXML
    private TextField txtUndad4;
    @FXML
    private Button btnSelArchivo;
    @FXML
    private TextField txtNombre;

    public void onClickBtnRegistrar(ActionEvent actionEvent) {
        Object materiaSel = this.comboMaterias.getSelectionModel().getSelectedItem();
        if (materiaSel != null) {
            if (materiaSel.getClass().equals(Materia.class))
                this.agregarAlumno((Materia) materiaSel);
            else
                Controlador.mostrarVentanaMensaje("Seleccione una materia",
                        "Despliegue la lista y seleccione una materia", Alert.AlertType.INFORMATION);
        } else {
            Controlador.mostrarVentanaMensaje("Seleccione archivo fuente",
                    "Haz click en seleccionar archivo fuente", Alert.AlertType.INFORMATION);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.materias = new ListaMaterias();
        this.archivoXLSX = new ArchivoXLSX("");
        this.materiaObservableList = FXCollections.observableArrayList();
        reiniciarControladores(false);
        ocultarUnidades();
        borrarCampos();
        this.btnSelArchivo.setOnAction(actionEvent -> {
            Node source = (Node) actionEvent.getSource();
            Window stagePrincipal = source.getScene().getWindow();
            FileChooser ventArch = new FileChooser();
            ventArch.setTitle("Cargar datos de un archivo");
            ventArch.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Archivos .xlsx", "*.xlsx"));
            File archSel = ventArch.showOpenDialog(stagePrincipal);
            this.archivoXLSX = new ArchivoXLSX(archSel.getAbsolutePath());
            try {
                this.materias.addAll(archivoXLSX.obtenerDatos(true));
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.reiniciarControladores(true);
            this.materiaObservableList.addAll(this.materias);
            this.comboMaterias.setItems(this.materiaObservableList);
        });
        this.comboMaterias.getSelectionModel().selectedItemProperty().addListener((observableValue, o, t1) -> {
            ocultarUnidades();
            if (t1.getClass().equals(Materia.class))
                this.mostrarUnidades(((Materia) t1).getCantUnidadesMax());
        });
        this.btnGuardar.setOnAction(this::onClickBtnRegistrar);
    }

    public void onClickBtnRegresar(javafx.event.ActionEvent actionEvent) {
        Parent ventanaPadre;
        try {
            ventanaPadre = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("vista.fxml")));
            Stage stage = new Stage();
            stage.setTitle("Ventana principal");
            stage.setScene(new Scene(ventanaPadre));
            stage.show();
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void reiniciarControladores(boolean mostrar) {
        this.txtNombre.setEditable(mostrar);
        this.txtMatricula.setEditable(mostrar);
        this.txtApellidoMaterno.setEditable(mostrar);
        this.txtApellidoPaterno.setEditable(mostrar);
        this.comboMaterias.setDisable(!mostrar);
        this.txtAsis.setEditable(mostrar);
    }

    private void borrarCampos() {
        this.txtUnidad1.setText("");
        this.txtUnidad2.setText("");
        this.txtUnidad3.setText("");
        this.txtUndad4.setText("");
        this.txtNombre.setText("");
        this.txtMatricula.setText("");
        this.txtApellidoMaterno.setText("");
        this.txtApellidoPaterno.setText("");
        this.txtAsis.setText("");
    }

    private void ocultarUnidades() {
        this.txtUnidad1.setVisible(false);
        this.txtUnidad2.setVisible(false);
        this.txtUnidad3.setVisible(false);
        this.txtUndad4.setVisible(false);
    }

    private void mostrarUnidades(int max) {
        switch (max) {
            case 4:
                this.txtUndad4.setVisible(true);
            case 3:
                this.txtUnidad3.setVisible(true);
            case 2:
                this.txtUnidad2.setVisible(true);
            case 1:
                this.txtUnidad1.setVisible(true);
                break;
        }
    }

    private void agregarAlumno(Materia materia) {
        try {
            Integer matriculaA = Integer.parseInt(this.txtMatricula.getText());
            String nombreA = this.txtNombre.getText();
            String apePat = this.txtApellidoPaterno.getText();
            String apeMat = this.txtApellidoMaterno.getText();
            Integer porAsis = Integer.parseInt(this.txtAsis.getText());
            int cal1, cal2, cal3, cal4 = 0;
            cal1 = Integer.parseInt(this.txtUnidad1.getText());
            cal2 = this.txtUnidad2.getText().equals("") ? 0 : Integer.parseInt(this.txtUnidad2.getText());
            cal3 = this.txtUnidad3.getText().equals("") ? 0 : Integer.parseInt(this.txtUnidad3.getText());
            cal4 = this.txtUndad4.getText().equals("") ? 0 : Integer.parseInt(this.txtUndad4.getText());
//            Evaluacion evaluacion = new Evaluacion(materia);
            ArrayList<String> datosNuevoExcel = new ArrayList<>();
            datosNuevoExcel.add(nombreA);
            datosNuevoExcel.add(apePat);
            datosNuevoExcel.add(apeMat);
            datosNuevoExcel.add(matriculaA.toString());
            datosNuevoExcel.add(materia.getNombre());
            datosNuevoExcel.add(materia.getCodigo());
            datosNuevoExcel.add(porAsis.toString());
            switch (materia.getCantUnidadesMax()) {
                case 1:
                    datosNuevoExcel.add(String.valueOf(cal1));
                    break;
                case 2:
                    datosNuevoExcel.add(String.valueOf(cal1));
                    datosNuevoExcel.add(String.valueOf(cal2));
                    break;
                case 3:
                    datosNuevoExcel.add(String.valueOf(cal1));
                    datosNuevoExcel.add(String.valueOf(cal2));
                    datosNuevoExcel.add(String.valueOf(cal3));
                    break;
                case 4:
                    datosNuevoExcel.add(String.valueOf(cal1));
                    datosNuevoExcel.add(String.valueOf(cal2));
                    datosNuevoExcel.add(String.valueOf(cal3));
                    datosNuevoExcel.add(String.valueOf(cal4));
                    break;
            }
            this.archivoXLSX.asignarConjuntoDatos(datosNuevoExcel);
            Controlador.mostrarVentanaMensaje("Datos agregados al archivo",
                    "Agregado correcamente", Alert.AlertType.INFORMATION);
            this.borrarCampos();
        } catch (Exception e) {
            System.err.println(e.toString());
            Controlador.mostrarVentanaMensaje("Datos no validos", "Intentalo nuevamente", Alert.AlertType.WARNING);
        }


    }
}
