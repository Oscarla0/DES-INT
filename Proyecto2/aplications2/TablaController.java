package aplications2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class TablaController implements Initializable {
    public static TableView<User> table_info_app;
    public static ObservableList<User> data_table;
    @FXML
    private TableView<User> table_info;
    @FXML
    private TableColumn<User, String> column_id, column_name, column_codigo,column_grupo, column_familia;
    @FXML
    private TableColumn<User, Button> col_update;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        table_info_app = table_info;

        initializeCols();
        loadData();
    }

    private void initializeCols() {
        

        column_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        column_name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        column_codigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        column_grupo.setCellValueFactory(new PropertyValueFactory<>("Grupo"));
        column_familia.setCellValueFactory(new PropertyValueFactory<>("Familia"));
        col_update.setCellValueFactory(new PropertyValueFactory<>("update"));
        editableCols();
    }

    private void editableCols() {
        column_id.setCellFactory(TextFieldTableCell.forTableColumn());
        column_id.setOnEditCommit(e -> e.getTableView().getItems().get(e.getTablePosition().getRow()).setId(e.getNewValue()));

        column_name.setCellFactory(TextFieldTableCell.forTableColumn());
        column_name.setOnEditCommit(e -> e.getTableView().getItems().get(e.getTablePosition().getRow()).setName(e.getNewValue()));

        column_codigo.setCellFactory(TextFieldTableCell.forTableColumn());
        column_codigo.setOnEditCommit(e -> e.getTableView().getItems().get(e.getTablePosition().getRow()).setCodigo(e.getNewValue()));

        column_grupo.setCellFactory(TextFieldTableCell.forTableColumn());
        column_grupo.setOnEditCommit(e -> e.getTableView().getItems().get(e.getTablePosition().getRow()).setGrupo(e.getNewValue()));
        column_familia.setCellFactory(TextFieldTableCell.forTableColumn());
        column_familia.setOnEditCommit(e -> e.getTableView().getItems().get(e.getTablePosition().getRow()).setFamilia(e.getNewValue()));

        table_info.setEditable(true);
    }

    private void loadData() {
    	int x = 0;
        data_table = FXCollections.observableArrayList(
        new User(String.valueOf(x)+1,"Cocacola", "4894x1564", "Bebida","Refresco con Gas","Refresco con Gas", new Button("Actualizar")),
	    new User(String.valueOf(x)+2,"Bezoya", "x16461894", "Bebida","Agua","Agua", new Button("Actualizar")),
	    new User(String.valueOf(x)+3,"Danone", "1564623148", "Bebida","Yogurt","Yogurt", new Button("Actualizar")),
	    new User(String.valueOf(x)+4,"Actumel", "24861w6841", "Bebida","Yogurt","Yogurt", new Button("Actualizar")),
	    new User(String.valueOf(x)+5,"CampoFrio", "a654831s5", "Embutidos","Chopet","Chopet", new Button("Actualizar")),
	    new User(String.valueOf(x)+6,"Lays", "a654831s5", "Alimentacion","Fritos","Fritos", new Button("Actualizar")),
	    new User(String.valueOf(x)+7,"Pringles", "a654831s5", "Alimentacion","Fritos","Fritos", new Button("Actualizar")),
	    new User(String.valueOf(x),"", "", "","","", new Button("Añadir")),
        new User(String.valueOf(x),"", "", "","","", new Button("Añadir")),
        new User(String.valueOf(x),"", "", "","","", new Button("Añadir")));
        
        table_info.setItems(data_table);
    }
}