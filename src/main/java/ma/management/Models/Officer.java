package ma.management.Models;

import ma.management.Enums.EGrade;

public class Officer extends Person {

    EGrade grade;
    public Officer(int idPerson, String lastName, String firstName, EGrade grade) {
        super(idPerson, lastName, firstName);
        this.grade = grade;
    }

    public EGrade getGrade() {
        return grade;
    }
    public void setGrade(EGrade grade) {
        this.grade = grade;
    }  
}
