package aplications2;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;

public class User {

    /*Add the strings and buttons to be used in the application*/
    String id, name, codigo, grupo,cantidad,familia;

    Button update;

    /* Constructors */
    public User(String id, String name, String codigo, String grupo,String familia, String string, Button update) {
        this.id = id;
        this.name = name;
        this.codigo = codigo;
        this.grupo = grupo;
        this.familia=familia;
        this.update = update;

        update.setOnAction(e -> {
            ObservableList<User> users = TablaController.table_info_app.getSelectionModel().getSelectedItems();

            for (User user : users) {
                if (user.getUpdate() == update) {
                    System.out.println("id: " + user.getId());
                    System.out.println("Nombre: " + user.getName());
                    System.out.println("Codigo: " + user.getCodigo());
                    System.out.println("Grupo: " + user.getGrupo());
                    System.out.println("Familia: " + user.getFamilia());
                    
                }
            }
        });
    }


	/* Getters and setters */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public String getCantidad() {
		return cantidad;
	}


	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}


	public String getFamilia() {
		return familia;
	}


	public void setFamilia(String familia) {
		this.familia = familia;
	}


	public Button getUpdate() {
        return update;
    }
}
