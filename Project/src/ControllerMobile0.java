import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.fxml.Initializable;

public class ControllerMobile0 {
   @FXML
   private Button PMobile;
   @FXML
   private Button JMobile;
   @FXML
   private Button CMobile;
   
    
   @FXML
   private void handlePMobileClick(ActionEvent event) {
       // Este método se ejecutará cuando se haga clic en el botón PMobile
       System.out.println("Botón PMobile clickeado");
       try {
        // Cargar el archivo FXML de ControllerMobile1
        FXMLLoader loader = new FXMLLoader(getClass().getResource("assets/layout_mobile_1.fxml"));
        Parent root = loader.load();
        
        // Crear una nueva escena con el contenido de ControllerMobile1
        Scene scene = new Scene(root);
        
        // Obtener el escenario actual y establecer la nueva escena en él
        Stage stage = (Stage) PMobile.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
        
    } catch (Exception e) {
        e.printStackTrace();
    }

   }

   @FXML
   private void handleJMobileClick(ActionEvent event) {
       // Este método se ejecutará cuando se haga clic en el botón JMobile
       System.out.println("Botón JMobile clickeado");
       // Agrega aquí el código que deseas ejecutar cuando se hace clic en el botón JMobile
   }

   @FXML
   private void handleCMobileClick(ActionEvent event) {
       // Este método se ejecutará cuando se haga clic en el botón CMobile
       System.out.println("Botón CMobile clickeado");
       // Agrega aquí el código que deseas ejecutar cuando se hace clic en el botón CMobile
   }
}
