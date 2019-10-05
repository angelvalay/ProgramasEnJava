package poo.interfaces.dragonball;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ControladorVista implements Initializable {
    public Button btnKrilin;
    public Button btnRoshi;
    public Button btnGoku;
    public Button btnVegeta;
    public Button btnGogetta;
    public Button btnVegito;
    public Button btnTrunks;
    public Button btnGohan;
    public Button btnFrezeer;
    public Button btnKingCols;
    public Button btnAndroide18;
    public Button btnCell;
    public ImageView imagenMostrar;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.btnKrilin.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent ->
                        imagenMostrar.setImage(Fabrica.getPersonaje(Personajes.KRILIN).mostrarPersonaje()));
        this.btnRoshi.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent ->
                        imagenMostrar.setImage(Fabrica.getPersonaje(Personajes.ROSHI).mostrarPersonaje()));
        this.btnGoku.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent ->
                        imagenMostrar.setImage(this.escogerSaiyain(Personajes.GOKU).mostrarPersonaje()));
        this.btnVegeta.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(this.escogerSaiyain(Personajes.VEGETTA).mostrarPersonaje()));
        this.btnGogetta.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                imagenMostrar.setImage(this.escogerSaiyain(Personajes.GOGETTA).mostrarPersonaje()));
        this.btnVegito.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(this.escogerSaiyain(Personajes.VEGITTO).mostrarPersonaje()));

        this.btnGohan.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(this.escogerSaiyain(Personajes.GOHAN).mostrarPersonaje())
                );
        this.btnTrunks.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(this.escogerSaiyain(Personajes.TRUNKS).mostrarPersonaje()));
        this.btnFrezeer.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(this.escogerSaiyain(Personajes.FREZER).mostrarPersonaje()));
        this.btnKingCols.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(Fabrica.getPersonaje(Personajes.KING_COLD).mostrarPersonaje()));
        this.btnAndroide18.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(Fabrica.getPersonaje(Personajes.ANDROIDE_18).mostrarPersonaje()));
        this.btnCell.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> imagenMostrar.setImage(this.escogerSaiyain(Personajes.CELL).mostrarPersonaje()));
    }
    public Personaje escogerSaiyain(Personajes personaje){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Transformaciones");
        alert.setHeaderText("Transformaciones disponibles");
        alert.setContentText("Escoge una opcion.");
        ButtonType btnBase = new ButtonType("Base");
        ButtonType btnForma2 = new ButtonType("Forma 2");
        ButtonType btnFormaDorado = new ButtonType("Dorado");
        ButtonType btnFormaDoradoAun = new ButtonType("Dorado Auntentica");
        ButtonType btnForma3 = new ButtonType("Forma 3");
        ButtonType btnSaiyain1 = new ButtonType("Saiyain 1");
        ButtonType btnSaiyain2 = new ButtonType("Saiyain 2");
        ButtonType btnSaiyain3 = new ButtonType("Saiyain 3");
        ButtonType btnOzaru = new ButtonType("Ozaru");
        ButtonType btnFase1Dios = new ButtonType("Fase 1 Dios");
        ButtonType btnFase2Dios = new ButtonType("Fase Blue Dios");
        ButtonType btnUltraInst = new ButtonType("Fase Ultrainstinto");
        ButtonType btnMistico = new ButtonType("Mistico");
        ButtonType btnFormaMecha = new ButtonType("Forma Mecha");
        ButtonType btnFormaFinal = new ButtonType("Formal final");
        ButtonType btnEmbrion = new ButtonType("Embrionario");
        ButtonType btnInsecto = new ButtonType("Forma insectoide");
        ButtonType btn1eraForma = new ButtonType("1era forma");
        ButtonType btnPerfecto = new ButtonType("Perfecto");
        ButtonType buttonCancelar = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        switch (personaje){
            case GOKU:
                alert.getButtonTypes().setAll(btnBase, btnSaiyain1, btnSaiyain2, btnSaiyain3,
                        btnOzaru,btnFase1Dios, btnFase2Dios, btnUltraInst, buttonCancelar);
                break;
            case VEGETTA:
                alert.getButtonTypes().setAll(btnBase, btnSaiyain1, btnSaiyain2,
                        btnOzaru,btnFase1Dios, btnFase2Dios, buttonCancelar);
                break;
            case GOGETTA:
            case VEGITTO:
                alert.getButtonTypes().setAll(btnBase, btnSaiyain1, btnFase2Dios, buttonCancelar);
                break;
            case GOHAN:
                alert.getButtonTypes().setAll(btnBase,btnSaiyain1,btnSaiyain2,btnMistico,buttonCancelar);
                break;
            case TRUNKS:
                alert.getButtonTypes().setAll(btnBase,btnSaiyain1,btnSaiyain2,buttonCancelar);
                break;
            case FREZER:
                alert.getButtonTypes().setAll(btnBase, btnForma2, btnForma3, btnFormaDorado,
                        btnFormaDoradoAun, btnFormaMecha, btnFormaFinal,buttonCancelar);
                break;
            case KING_COLD:
                alert.getButtonTypes().setAll(btnBase,buttonCancelar);
                break;
            case CELL:
                alert.getButtonTypes().setAll(btnBase,btn1eraForma,
                        btnForma2, btnForma3, btnInsecto, btnEmbrion, btnPerfecto,buttonCancelar);
                break;
            default:
                alert.getButtonTypes().setAll(btnBase, buttonCancelar);
        }
        Optional<ButtonType> resultado = alert.showAndWait();
        if (resultado.get() == btnBase) {
            return Fabrica.getPersonaje(personaje, Tranformaciones.FORMA_BASE);
        }else if (resultado.get() == btnSaiyain1){
            return Fabrica.getPersonaje(personaje, Tranformaciones.SUPER_SAIYAIN_1);
        }else if (resultado.get() == btnSaiyain2){
            return Fabrica.getPersonaje(personaje, Tranformaciones.SUPER_SAIYAIN_2);
        }else if (resultado.get() == btnSaiyain3){
            return Fabrica.getPersonaje(personaje, Tranformaciones.SUPER_SAIYAIN_3);
        }else if (resultado.get() == btnOzaru){
            return Fabrica.getPersonaje(personaje, Tranformaciones.OZARU);
        }else if (resultado.get() == btnFase1Dios){
            return Fabrica.getPersonaje(personaje, Tranformaciones.SUPER_SAIYAIN_DIOS);
        }else if (resultado.get() == btnFase2Dios){
            return Fabrica.getPersonaje(personaje, Tranformaciones.SUPER_SAIYAIN_BLUE);
        }else if (resultado.get() == btnUltraInst){
            return Fabrica.getPersonaje(personaje, Tranformaciones.SUPER_ULTRA_INSTINTO);
        }else if(resultado.get() == btnMistico){
            return Fabrica.getPersonaje(personaje, Tranformaciones.MISTICO);
        }else if(resultado.get() == btnForma2){
            return Fabrica.getPersonaje(personaje, Tranformaciones.FORMA_2);
        }else if(resultado.get() == btnForma3){
            return Fabrica.getPersonaje(personaje, Tranformaciones.FORMA_3);
        }else if(resultado.get() == btnFormaDorado){
            return Fabrica.getPersonaje(personaje, Tranformaciones.DORADO);
        }else if(resultado.get() == btnFormaDoradoAun){
            return Fabrica.getPersonaje(personaje, Tranformaciones.DORADO_AUNTENTICO);
        }else if(resultado.get() == btnFormaMecha){
            return Fabrica.getPersonaje(personaje, Tranformaciones.MECHA);
        }else if(resultado.get() == btnFormaFinal){
            return Fabrica.getPersonaje(personaje, Tranformaciones.FORMA_FINAL);
        }else if(resultado.get() == btnEmbrion){
            return Fabrica.getPersonaje(personaje, Tranformaciones.EMBRIONARIO);
        }else if(resultado.get() == btn1eraForma){
            return Fabrica.getPersonaje(personaje, Tranformaciones.FORMA_1);
        }else if(resultado.get() == btnInsecto){
            return Fabrica.getPersonaje(personaje, Tranformaciones.INSECTOIDE);
        }else if(resultado.get() == btnPerfecto){
            return Fabrica.getPersonaje(personaje, Tranformaciones.PERFECTA);
        }else{
            return Fabrica.getPersonaje(personaje, Tranformaciones.FORMA_BASE);
        }
    }
}
