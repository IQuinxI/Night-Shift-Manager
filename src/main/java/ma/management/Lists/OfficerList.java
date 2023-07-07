package ma.management.Lists;

import java.util.ArrayList;
import java.util.List;

import ma.management.Models.Person;

public class OfficerList {
    private List<Person> officerList =  new ArrayList<>();

    public void addOfficer(Person officer) {
        officerList.add(officer);
    }
}
