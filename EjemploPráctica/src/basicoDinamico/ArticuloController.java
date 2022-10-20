package basicoDinamico;

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
    
     // Lista auxiliar para TableView
    private ObservableList<Person> data = FXCollections.observableArrayList(
    	    new Person("Jacob", "Smith", "jacob.smith@example.com", 30),
    	    new Person("Isabella", "Johnson", "isabella.johnson@example.com", 40),
    	    new Person("Ethan", "Williams", "ethan.williams@example.com", 50),
    	    new Person("Emma", "Jones", "emma.jones@example.com", 61),
    	    new Person("Michael", "Brown", "michael.brown@example.com", 34)
    	);

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se añaden directamente los items 
    	// Ítems del ChoiceBox
    	ChoiceDptTpv.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9");      
    	ChoiceFamilia.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	ChoiceGrupos.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	ChoiceImptoCompra.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	ChoiceImptoVenta.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	ChoiceSeccion.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	ChoiceUCom.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	ChoiceUVenta.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9"); 
    	
    	
        
        // Ítems del ComboBox
               
    }
    
}
