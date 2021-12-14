package ro.fasttrackit.curs11.homework;

import java.util.Objects;

public final class Person { //final la clasa ==> nu mai poate fi mostenita
    private final String name;
    private final int age;
    private final String position;

    //daca initializez aici field-urile, nu le mai pot da valori initiale in constructor

    //pe durata aplicatiei, un field imutabil in boecte diferite poate avea
    //valori diferite, dar acea valoare nu si-o schimba

    public Person(String name, int age, String pos) {
        this.name = name;
        this.age = age;
        this.position = pos;
        //dupa asta, orice modificare e interzisa, deci nu fac setteri
    }
    //public Person(String name) --- creez un constrctor ce nu da valori finale la 2 variabile == incorect pt final
    public Person(String name){
        this(name, 20, "somer");
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPosition() {
        return position;
    }

    @Override //de citit; verifica referinta; compara 2 persoane comparand toate cele 3 atribute
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age
                && Objects.equals(name, person.name) && Objects.equals(position, person.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, position);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
