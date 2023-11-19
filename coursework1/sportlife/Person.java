package coursework1.sportlife;
//Класс Personality - это владелец абонемента с личными данными,
// имя, фамилия и год рождения.
//Накинул проверок на 4ку
/*
Класс Person:
- хранит информацию о владельце абонемента (И.О. и год рождения);
- производит проверку на соответствие имени, фамилии и года рождения;
- добавлены геттеры и сетткры;
 */
public class Person{
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear){
        if (firstName == null || firstName.length() < 2)
            throw new IllegalArgumentException("У вас интересное имя или Вы его некорректно ввели?");
        if (lastName == null || lastName.length() < 2)
            throw new IllegalArgumentException("У вас интересная фамилия или Вы её некорректно ввели?");
        if (birthYear < 2006)
            throw new IllegalArgumentException("Необходимо разрешение родителей");
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
}