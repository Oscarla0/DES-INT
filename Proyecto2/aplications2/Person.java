package aplications2;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 
 * Clase auxiliar que se emplear� para el modelo de datos del TableView
 * 
 * @author SBF
 * 
 */
public class Person {
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final SimpleIntegerProperty age;
    private final SimpleStringProperty familia;
 
    public Person(String fName, String lName, String email, Integer age,String family) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
        this.age = new SimpleIntegerProperty(age);
		this.familia = new SimpleStringProperty(family);
    }
 
    public String getFirstName() {
        return firstName.get();
    }
    
    public void setFirstName(String fName) {
        firstName.set(fName);
    }
        
    public String getLastName() {
        return lastName.get();
    }
    public void setLastName(String fName) {
        lastName.set(fName);
    }
    
    public String getEmail() {
        return email.get();
    }
    public void setEmail(String fName) {
        email.set(fName);
    }

	public Integer getAge() {
		return age.get();
	}
	public void setAge(Integer fAge) {
		age.set(fAge);
    }        
        
    public String getFamilia() {
		return familia.get();
	}
	public void setFamilia(String family) {
		familia.set(family);
	}
}