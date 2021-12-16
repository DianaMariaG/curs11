package ro.fasttrackit.curs11.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ana",33,"profesor"));
        persons.add(new Person("Bogdan",23,"student"));
        persons.add(new Person("Iulia", 33,"inginer"));

        Company company = new Company(persons);
        System.out.println(company.getEmployees());
        //REFERENCE ESCAPE

        persons.clear();
        persons.add(new Person("Eu",27,"Manager"));
        company.getEmployees().add(new Person("Eu",27,"Manager"));
        System.out.println(company.getEmployees());

        Company company2 = new Company(List.of(new Person("Ana",33,"profesor")));
        //List.of creeaza o lista cu un singur element
        company.employ(new Person("Maria",33,"profesor"));

    }

}
