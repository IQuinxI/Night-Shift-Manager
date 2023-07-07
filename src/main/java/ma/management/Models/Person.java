package ma.management.Models;

public class Person {
    private int idPerson;
    private String lastName;
    private String firstName;

    public Person(int idPerson, String lastName, String firstName) {
        this.idPerson = idPerson;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getIdPerson() {
        return idPerson;
    }
    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
