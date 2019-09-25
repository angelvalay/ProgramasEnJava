package poo.csv_excel.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class app extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        URL fxml = getClass().getClassLoader()
                .getResource("vista.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(fxml);
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}