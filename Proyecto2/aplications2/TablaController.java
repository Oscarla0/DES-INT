package aplications2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
public class TablaController  implements Initializable {
	



    @FXML
    public  TableView<User> table_info;

    public ObservableList<User> user;
   
    @FXML
    private TableColumn<User, String> column_name, column_codigo,column_grupo, column_familia;
    @FXML
    private TableColumn<User, Button> col_update;
    @FXML
    private TextField TextFieldCodigo;

    @FXML
    private TextField TextFieldFamilia;

    @FXML
    private TextField TextFieldGrupo;

    @FXML
    private TextField TextFieldNombre;
    
    @FXML
    private Button ADD;

    @FXML
    private Button Delete;

    @FXML
    private Button Edit;
        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
        	user = FXCollections.observableArrayList();

            this.column_name.setCellValueFactory(new PropertyValueFactory("Name"));
            this.column_codigo.setCellValueFactory(new PropertyValueFactory("Codigo"));
            this.column_grupo.setCellValueFactory(new PropertyValueFactory("Grupo"));
            this.column_familia.setCellValueFactory(new PropertyValueFactory("Familia"));
        }

        @FXML
        private void agregarDatos(ActionEvent event) {

            try {

                // Obtengo los datos del formulario
                String Nombre = this.TextFieldNombre.getText();
                String Codigo = this.TextFieldCodigo.getText();
                String Grupo = this.TextFieldGrupo.getText();
                String Familia = this.TextFieldFamilia.getText();

                // Creo una persona
                User u = new User(Nombre, Codigo, Grupo,Familia);

                // Compruebo si la persona esta en el lista
                if (!this.user.contains(u)) {
                    // Lo añado a la lista
                    this.user.add(u);
                    // Seteo los items
                    this.table_info.setItems(user);

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Info");
                    alert.setContentText("Persona añadida");
                    alert.showAndWait();
                } else {

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("La persona existe");
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Formato incorrecto");
                alert.showAndWait();
            }

        }

        @FXML
        private void seleccionar(MouseEvent event) {

            // Obtengo la persona seleccionada
            User u = this.table_info.getSelectionModel().getSelectedItem();

            // Sino es nula seteo los campos
            if (u != null) {
                this.TextFieldNombre.setText(u.getName());
                this.TextFieldCodigo.setText(u.getCodigo());
                this.TextFieldGrupo.setText(u.getGrupo());
                this.TextFieldFamilia.setText(u.getFamilia());
            }

        }

        @FXML
        private void modificar(ActionEvent event) {

            // Obtengo la persona seleccionada
            User u = this.table_info.getSelectionModel().getSelectedItem();

            // Si la persona es nula, lanzo error
            if (u == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Debes seleccionar una persona");
                alert.showAndWait();
            } else {

                try {
                    // Obtengo los datos del formulario
                	String Nombre = this.TextFieldNombre.getText();
                    String Codigo = this.TextFieldCodigo.getText();
                    String Grupo = this.TextFieldGrupo.getText();
                    String Familia = this.TextFieldFamilia.getText();

                    // Creo una persona
                    User ux = new User(Nombre, Codigo, Grupo,Familia);

                    // Compruebo si la persona esta en el lista
                    if (!this.user.contains(ux)) {

                        // Modifico el objeto
                        u.setName(ux.getName());
                        u.setCodigo(ux.getCodigo());
                        u.setGrupo(ux.getGrupo());
                        u.setFamilia(ux.getFamilia());

                        // Refresco la tabla
                        this.table_info.refresh();

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setTitle("Info");
                        alert.setContentText("Persona modificada");
                        alert.showAndWait();

                    } else {

                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText(null);
                        alert.setTitle("Error");
                        alert.setContentText("La persona existe");
                        alert.showAndWait();
                    }
                } catch (NumberFormatException e) {

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Formato incorrecto");
                    alert.showAndWait();
                }

            }

        }

        @FXML
        private void eliminar(ActionEvent event) {

            // Obtengo la persona seleccionada
            User u = this.table_info.getSelectionModel().getSelectedItem();

            // Si la persona es nula, lanzo error
            if (u == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Debes seleccionar una persona");
                alert.showAndWait();
            } else {

                // La elimino de la lista
                this.user.remove(u);
                // Refresco la lista
                this.table_info.refresh();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Info");
                alert.setContentText("Persona eliminada");
                alert.showAndWait();

            }

        }

    }