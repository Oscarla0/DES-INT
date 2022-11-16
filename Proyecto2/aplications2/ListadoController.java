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

public class ListadoController {

    @FXML
    private TableView<Person> table1;
    
    @FXML
    private TableColumn<Person, String> firstNameCol;

    @FXML
    private TableColumn<Person, String> lastNameCol;

    @FXML
    private TableColumn<Person, String> emailCol;
    
    @FXML
    private TableColumn<Person, Integer> ageColumn; 
    @FXML
    private TableColumn<Person, String> famColumn; 
     // Lista auxiliar para TableView
    int x =0;
    private ObservableList<Person> data = FXCollections.observableArrayList(
    	    new Person("Cocacola", "4894x1564", "Bebida", 30,"Refresco con Gas"),
    	    new Person("Bezoya", "x16461894", "Bebida", 40,"Agua"),
    	    new Person("Danone", "1564623148", "Bebida", 50,"Yogurt"),
    	    new Person("Actumel", "24861w6841", "Bebida", 61,"Yogurt"),
    	    new Person("CampoFrio", "a654831s5", "Embutidos", 34,"Chopet"),
    	    new Person("Lays", "a654831s5", "Alimentacion", 34,"Fritos"),
    	    new Person("Pringles", "a654831s5", "Alimentacion", 34,"Fritos")
    	    
    	);

    @FXML
    private void initialize() {   
         // Asociamos cada columna del TableView a una propiedad de la clase Person 
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person,String>("FirstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Person,String>("LastName"));
        emailCol.setCellValueFactory(new PropertyValueFactory<Person,String>("Email"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person,Integer>("Age"));
        famColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("Familia"));
        // Se rellena la tabla con objetos de la clase Person
        table1.setItems(data);               
    }
    
}
