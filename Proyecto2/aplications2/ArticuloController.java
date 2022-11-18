package aplications2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTreeCell;

public class ArticuloController {

	 @FXML
	    private ChoiceBox<String> ChoiceDptTpv;

	    @FXML
	    private ChoiceBox<String> ChoiceFamilia;

	    @FXML
	    private ChoiceBox<String> ChoiceGrupos;

	    @FXML
	    private ChoiceBox<String> ChoiceImptoCompra;

	    @FXML
	    private ChoiceBox<String> ChoiceImptoVenta;

	    @FXML
	    private ChoiceBox<String> ChoiceSeccion;

	    @FXML
	    private ChoiceBox<String> ChoiceUCom;

	    @FXML
	    private ChoiceBox<String> ChoiceUVenta;

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se añaden directamente los items 
    	// Ítems del ChoiceBox
    	ChoiceDptTpv.getItems().addAll("","Alimentacion", "Bazar", "Bebidas", "Bodega", "Bolleria", 
        		"Carniceria", "Cerveza");      
    	ChoiceFamilia.getItems().addAll("","Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	ChoiceGrupos.getItems().addAll("","Mercaria", "Panaderia y Pasteleria ", "Pescado y Moriscos", "Queso", "Cerrajeria Herrajes", 
        		"Peleteria", "Completos"); 
    	ChoiceImptoCompra.getItems().addAll("","4%", "10%", "15%"); 
    	ChoiceImptoVenta.getItems().addAll("","10%", "15%", "21%"); 
    	ChoiceSeccion.getItems().addAll("","Aceites", "Alimentos Animales", "Aperitivos", "Azucar y edulcorante", "Cacao", 
        		"Arroces", "Galletas", "Choice8", "Choice9"); 
    	ChoiceUCom.getItems().addAll("","1", "2", "3", "4"); 
    	ChoiceUVenta.getItems().addAll("","1", "2", "3", "4", "5", 
        		"6", "7", "8"); 
               
    }
    
}
