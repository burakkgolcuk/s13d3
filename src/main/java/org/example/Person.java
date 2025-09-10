package org.example;

public class Person {
    // Zorunlu istenen alanlar
    private String firstName;
    private String lastName;
    private int age;

    // Eklediğim 3 alan
    private String email;
    private String country;
    private boolean active;

    // 1) firstName, lastName, age alan constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

    // 2) Overloaded constructor (constructor chaining ile 1.'i çağırıyor)
    public Person(String firstName, String lastName, int age,
                  String email, String country, boolean active) {
        this(firstName, lastName, age); // chaining
        this.email   = email;
        this.country = country;
        this.active  = active;
    }

    // İstenen 4 metod
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // 13-19 (dahil) ise true
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    // İstersek görsel çıktı için
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", active=" + active +
                '}';
    }
}
