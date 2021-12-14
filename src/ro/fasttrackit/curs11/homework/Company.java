package ro.fasttrackit.curs11.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    private final List<Person> employees;
    //private final = imutabil
    //final adica se pot adauga/sterge angajati, dar cutia in care ii tinem e aceeasi
    //field imutabil  in care se poate modifica
    private final Person manager = new Person("eu",30,"manager");

    public Company(){ //creeaza o lista goala (daca creez o companie goala si adaug employees pe parcurs)
        this(new ArrayList<>());
        //SAU: this.employees = new ArrayList<>();
    }

    public Company(List<Person> employees) { //construieste un ArrayList si employees poate fi doar asa, iar ca sa iau input-ul,
        // are un constrcutor care accepta orice colectie si se creeaza o noua lista si se ad. toate elm pe care mi le-ai dat
        this.employees = new ArrayList<>(employees);
        //creez eu instanta de arraylist si iau doar ce ma intereseaza, adica continutul

    }

    public void employ(Person person) {
        this.employees.add(person);

    }

    public List<Person> getEmployees(){ //returneaza toti employees, in cazul in care searchPos = null la metoda 2
        return getEmployees(null); //a creat alta metoda ce apeleaza pe alta, in loc sa faca una noua
        //dau o lista modificabila
        //ca sa protejam referinta nu o sam in afara ci construim alta peste
    }
    //Overloading
    public List<Person> getEmployees(String searchPos) { //ofera posibilitati in plus fata de primul care ofera 1 singura
        List<Person>  result = new ArrayList<>();
        if (searchPos != null) {
            for (Person employee : employees) {
                if (employee.getPosition().equalsIgnoreCase(searchPos)) {
                result.add(employee);
                }
            }
        } else {
            result.addAll(this.employees);
        }
        return result;
    }
}
//sa protejam referintele!!!

