package application;
/**
* Constructor con nombre y primer apellido
*
* @param firstName Nombre del contacto de la agenda
* @param lastName Primer apellido del contacto de la agenda
*/

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
import javafx.collections.ObservableList;

public class MenuController {
	
	// Pantalla principal en la que se anade o quita contenido
	private BorderPane rootLayout;
  
    @FXML
    private void initialize() {
        
    }
    
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/aplications2/Articulos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    private void abrirListado1(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/aplications2/Tabla.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    private void abrirListado2(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/aplications2/Ayuda.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    private void abrirGrafico1(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/aplications2/GraficaPieChart.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    private void abrirGrafico2(ActionEvent event) {    	
    	try {
						// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/aplications2/GraficaLineChar.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    private void abrirGrafico3(ActionEvent event) {    	
    	try {
						// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/aplications2/GraficaStackedAreaChart.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
    @FXML
    private void cerrarListado(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	try {
						// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/application/Menu2.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
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
