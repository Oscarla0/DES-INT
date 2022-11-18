package aplications2;

import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTreeCell;

public class TreeviewController {

    @FXML
    private TreeView<String> AyudaTree;
	 @FXML
	    private void initialize() {   
	              
	        // Ítems para el TreeView
	        // Ítem raíz
	        TreeItem<String> rootItem = new TreeItem<String>("Uso de la aplicacion");

	        // Ítem de primer nivel
	        TreeItem<String> Listado = new TreeItem<String>("Listado");
	        rootItem.getChildren().add(Listado);
	        Listado.setExpanded(true);
	        
	        // Otro ítem de primer nivel
	        TreeItem<String> Tabla = new TreeItem<String>("Tabla");
	        Tabla.getChildren().add(new TreeItem<String>("Muestra los datos que introduzcas."));
	        Listado.getChildren().add(Tabla);
	        
	        //Nombre
	        TreeItem<String> Nombre = new TreeItem<String>("Nombre");
	        Nombre.getChildren().add(new TreeItem<String>("Nombre del producto."));
	        Tabla.getChildren().add(Nombre);
	        
	        //Codigo
	        TreeItem<String> Codigo = new TreeItem<String>("Codigo");
	        Codigo.getChildren().add(new TreeItem<String>("Codigo de barras para buscarlo con facilidad al scanearlo."));
	        Tabla.getChildren().add(Codigo);
	        
	        //Grupo
	        TreeItem<String> Grupo = new TreeItem<String>("Grupo");
	        Grupo.getChildren().add(new TreeItem<String>("Para agrupar al diferenciar con otros productos."));
	        Tabla.getChildren().add(Grupo);
	        
	        //Familia
	        TreeItem<String> Familia = new TreeItem<String>("Familia");
	        Familia.getChildren().add(new TreeItem<String>("Dentro de los grupos para diferenciar con otros productos."));
	        Tabla.getChildren().add(Familia);
	        
	        
	        //Button
	        TreeItem<String> Botones = new TreeItem<String>("Botones");
	        Botones.getChildren().add(new TreeItem<String>("Se diferencian en tres botones , Añadir, Eliminar y Editar."));
	        rootItem.getChildren().add(Botones);
	        // Para que sea editable necesitamos especificar un CellFactory con el tipo que corresponda
	        AyudaTree.setCellFactory(TextFieldTreeCell.forTreeView());
	        
	        // Expadimos por defecto el ítem raíz
	        rootItem.setExpanded(true); 
	        AyudaTree.setRoot(rootItem);     
	        System.out.println(AyudaTree.getExpandedItemCount());
	    }
	    
	}


