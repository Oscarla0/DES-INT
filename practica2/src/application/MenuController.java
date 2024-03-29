package application;

import java.io.Closeable;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MenuController {
	
	// Pantalla principal en la que se a�ade o quita contenido
	private BorderPane rootLayout;
  
    @FXML
    private void initialize() {
        
    }
    
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/Articulos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    private void abrirListado1(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/Tabla.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    private void abrirListado2(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/Sobre.fxml"));
			AnchorPane listadoControles = (AnchorPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
    @FXML
    private void cerrarListado(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/application/Menu2.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}	
    
}
