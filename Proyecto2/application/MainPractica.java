package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class MainPractica extends Application {
	private BorderPane rootLayout;	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Carga el diseño del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainPractica.class.getResource("Menu.fxml"));
			rootLayout = (BorderPane) loader.load();
	
			// Pasamos al controlador de menu el objeto con el BorderPane principal
			MenuController menuController = loader.getController();
			menuController.setRootLayout(rootLayout);

			// Mostramos la escena del BorderPane de la variable rootLayot
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setTitle("BBDD");
			primaryStage.setResizable(false);
			primaryStage.show();
			
			primaryStage.setOnCloseRequest(event -> {
				event.consume();
				logout(primaryStage);	
		});
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Boton de Cerrar la aplicacion con dialogos.
		public void logout(Stage stage){	
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Cerrar");
			alert.setHeaderText("Cerrando Aplicación");
			alert.setContentText("Quieres guardar antes de cerrar?");
			
			if (alert.showAndWait().get() == ButtonType.OK){
				System.out.println("Cerrado correctamente");
				stage.close();
			} 
		}
		
		
	public static void main(String[] args) {
		launch(args);
	}

	
}
