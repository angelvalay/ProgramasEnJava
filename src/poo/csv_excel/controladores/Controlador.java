package poo.csv_excel.controladores;

import archivos.Archivo;
import archivos.ArchivoCSV;
import archivos.ArchivoPDF;
import archivos.ArchivoXLSX;
import com.itextpdf.text.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.Window;
import modelos.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;


public class Controlador implements Initializable {
    private ListaAlumnos alumnos;
    private ListaMaterias materias;
    private ListaEvaluaciones evaluaciones;
    private ListaOrdenada listaOrdenada;
    private ObservableList<Alumno> alumnosObservable;
    @FXML
    private TableView<Alumno> tablaDatos;
    @FXML
    public TableColumn<Alumno, Integer> colMatricula;
    @FXML
    public TableColumn<Alumno, String> colNombre;
    @FXML
    public TableColumn<Alumno, String> colApePat;
    @FXML
    public TableColumn<Alumno, String> colApeMat;
    @FXML
    public TableColumn<Alumno, Integer> colCantMaterias;
    @FXML
    public TableColumn<Alumno, Integer> colCantApro;
    @FXML
    public TableColumn<Alumno, Double> colPromedio;

    @FXML
    public void onClickBtnCargarCSV(ActionEvent actionEvent) throws Exception {
        abrVentana(actionEvent, Archivo.FILE_CSV);
    }

    private void abrVentana(ActionEvent actionEvent, int tipArchive) throws Exception {
        // capturar el evento de la ventana
        Node source = (Node) actionEvent.getSource();
        Window stagePrincipal = source.getScene().getWindow();
        FileChooser ventArch = new FileChooser();
        ventArch.setTitle("Cargar datos de un archivo");
        if (tipArchive == Archivo.FILE_CSV)
            ventArch.getExtensionFilters().addAll(
                    new ExtensionFilter("Archivos .csv", "*.csv"));
        else if (tipArchive == Archivo.FILE_XLSX)
            ventArch.getExtensionFilters().addAll(
                    new ExtensionFilter("Archivos .xlsx", "*.xlsx"));
        File archSel = ventArch.showOpenDialog(stagePrincipal);
        this.tablaDatos.setItems(FXCollections.observableArrayList());
        this.tablaDatos.refresh();
        this.alumnos.clear();
        this.materias.clear();
        if (archSel != null) {
            switch (tipArchive) {
                case Archivo.FILE_CSV:
                    ArchivoCSV archivoCSV = new ArchivoCSV(archSel.getAbsolutePath(), Archivo.L);
                    this.alumnos.addAll(archivoCSV.obtenerDatos(true));
                    this.materias.addAll(archivoCSV.obtenerDatos(true));
                    this.evaluaciones.clear();

                    this.evaluaciones = new ListaEvaluaciones(alumnos, materias);
                    this.evaluaciones.addAll(archivoCSV.obtenerDatos(true));
                    this.listaOrdenada = new ListaOrdenada(alumnos, evaluaciones);
                    this.alumnosObservable = FXCollections.observableArrayList(this.listaOrdenada.getAlumnos());
                    this.tablaDatos.setItems(this.alumnosObservable);
                    break;
                case Archivo.FILE_XLSX:
                    ArchivoXLSX archivoXLSX = new ArchivoXLSX(archSel.getAbsolutePath());
//                    archivoXLSX.visualizarDatos();
                    this.alumnos.addAll(archivoXLSX.obtenerDatos(true));
                    this.materias.addAll(archivoXLSX.obtenerDatos(true));
                    this.evaluaciones.clear();
                    this.evaluaciones = new ListaEvaluaciones(alumnos, materias);
                    System.out.println(archivoXLSX.getPath());
                    this.evaluaciones.addAll(archivoXLSX.obtenerDatos(true));
                    this.listaOrdenada = new ListaOrdenada(alumnos, evaluaciones);

                    this.alumnosObservable = FXCollections.observableArrayList(this.listaOrdenada.getAlumnos());
                    this.tablaDatos.setItems(this.alumnosObservable);
                    break;
                default:
                    throw new Exception("No puedes abrir otro tipo de archivo");
            }
        }
    }

    public void abrVentanaAgregarDatosDelAlumno(ActionEvent actionEvent) {
        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("vista_agregar.fxml")));
            Stage stage = new Stage();
            stage.setTitle("Agregar alumno");
            stage.setScene(new Scene(root));
            stage.show();
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onClickBtnCargarXLSX(ActionEvent actionEvent) throws Exception {
        abrVentana(actionEvent, Archivo.FILE_XLSX);
    }

    @FXML
    public void onClickBtnOrdenarMergeSort() throws Exception {
        this.listaOrdenada = new ListaOrdenada(alumnos, evaluaciones);
        this.alumnos = this.listaOrdenada.ordenarMergeSort(this.listaOrdenada.getAlumnos());
        this.alumnosObservable = FXCollections.observableArrayList(this.listaOrdenada.getAlumnos());
        this.tablaDatos.setItems(this.alumnosObservable);
    }

    @FXML
    public void onClickBtnOrdernarQuickSort() throws Exception {
        this.listaOrdenada = new ListaOrdenada(alumnos, evaluaciones);
        this.alumnos = this.listaOrdenada.ordenarQuickSort(this.listaOrdenada.getAlumnos());
        this.alumnosObservable = FXCollections.observableArrayList(this.listaOrdenada.getAlumnos());
        this.tablaDatos.setItems(this.alumnosObservable);
    }

    @FXML
    public void onClickBtnOrdenarBurbuja() throws Exception {
        this.listaOrdenada = new ListaOrdenada(alumnos, evaluaciones);
        this.alumnos = this.listaOrdenada.ordenarBurbuja(this.listaOrdenada.getAlumnos());
        this.alumnosObservable = FXCollections.observableArrayList(this.listaOrdenada.getAlumnos());
        this.tablaDatos.setItems(this.alumnosObservable);
    }

    @FXML
    public void onClickBtnBusquedaBinaria() {
        ListaAlumnos alumnosOrdenados = this.escogerOrdenamiento(this.alumnos);
        if (alumnosOrdenados != null) {
//            for (Alumno al: alumnosOrdenados) {
//                System.out.println(al.getMatricula());
//            }
//            System.out.println("");
//            System.out.println(alumnosOrdenados);
            BusqBinariaAlumno binAlu = new BusqBinariaAlumno();
            int matr = mostrarVentanaMatricula("Busqueda binaria");
            Alumno alumno = binAlu.buscar(
                    alumnosOrdenados, new Alumno(matr), 0, alumnosOrdenados.size() - 1);
            if (alumno != null) {
                this.mostrarVentanaInfoAlumn(alumno);
            } else {
                this.mostrarVentanaMensaje("Busqueda binaria", "No encontrado", Alert.AlertType.WARNING);
            }
        }
    }

    @FXML
    public void onClickBtnBusquedaArbolBinario() {
        int matr = mostrarVentanaMatricula("Busqueda por Arbol Binario");
        ArbolAlumnos arbolAlumnos = new ArbolAlumnos();
        for (Alumno alumno :
                this.alumnos) {
            arbolAlumnos.anadir(alumno);
        }
        Alumno buscado = arbolAlumnos.buscarNodo(arbolAlumnos.getRaiz(), matr);
        if (buscado != null)
            this.mostrarVentanaInfoAlumn(buscado);
        else
            this.mostrarVentanaMensaje("Busqueda por arbol binario", "Alumno no encontrado", Alert.AlertType.WARNING);
//        arbolAlumnos.traverseInOrder(arbolAlumnos.getRaiz());
    }

    @FXML
    public void onClickBtnExportarPDF() throws DocumentException, IOException {
        ArchivoPDF archivoPDF = new ArchivoPDF("datos.pdf");
        archivoPDF.abrir();
        archivoPDF.anadirTexto("Datos\n");
        archivoPDF.insertarTabla("Matricula", "Nombre completo", "Promedio del cuatrimestre anterior");
        for (Alumno a : this.alumnos) {
            archivoPDF.insertarFilaATabla(String.valueOf(a.getMatricula()),
                    a.getNombre() + " " + a.getApellidoPaterno() + " " + a.getApellidoMaterno(),
                    String.valueOf(a.getPromedioGeneral()));
        }
        archivoPDF.agregarTabla();
        archivoPDF.cerrar();
        this.mostrarVentanaMensaje("Exportar PDF", "PDF actualizado", Alert.AlertType.INFORMATION);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.colMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colApePat.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
        this.colApeMat.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
        this.colCantMaterias.setCellValueFactory(new PropertyValueFactory<>("materiasTomadas"));
        this.colCantApro.setCellValueFactory(new PropertyValueFactory<>("materiasAprobadas"));
        this.colPromedio.setCellValueFactory(new PropertyValueFactory<>("promedioGeneral"));
        this.alumnos = new ListaAlumnos();
        this.materias = new ListaMaterias();
        this.evaluaciones = new ListaEvaluaciones(alumnos, materias);
        this.alumnosObservable = FXCollections.observableArrayList();
    }

    private int mostrarVentanaMatricula(String titulo) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(titulo);
        dialog.setContentText("Ingresa la matricula:");
        final int[] matricula = new int[1];
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> matricula[0] = Integer.parseInt(name));
        return matricula[0];
    }

    public static void mostrarVentanaMensaje(String titulo, String texto, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setContentText(texto);
        alert.showAndWait();
    }

    private ListaAlumnos escogerOrdenamiento(ListaAlumnos alumnos) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Algoritmo de ordenamiento");
        alert.setHeaderText("Escoge una metodo de ordenamiento para la busqueda");
        alert.setContentText("Escoge una opcion");

        ButtonType btnQuickSort = new ButtonType("QuickSort");
        ButtonType btnMergeSort = new ButtonType("MergeSort");
        ButtonType btnBurbuja = new ButtonType("Burbuja");
        ButtonType btnCancelar = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(btnQuickSort, btnMergeSort, btnBurbuja, btnCancelar);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == btnQuickSort) {
            try {
                return ListaOrdenada.ordenarQuickSortSinRestriccion(alumnos);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (result.get() == btnMergeSort) {
            try {
                return ListaOrdenada.ordenarMergeSortSinRestriccion(alumnos);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (result.get() == btnBurbuja) {
            try {
                return ListaOrdenada.ordenarBurbujaSinRestriccion(alumnos);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            return null;
        }
        return null;
    }

    private void mostrarVentanaInfoAlumn(Alumno alumno) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alumno encontrado");
        alert.setHeaderText(alumno.getNombre() + " " + alumno.getApellidoPaterno() + " " + alumno.getApellidoMaterno());
        alert.setContentText("Promedio general: " + alumno.getPromedioGeneral() + "\n" +
                "Matricula: " + alumno.getMatricula() + "\n" +
                "Materias aprobadas: " + alumno.getMateriasAprobadas() + "\n" +
                "Materias tomadas: " + alumno.getMateriasTomadas());

        alert.showAndWait();
    }
}
