package coursework1.sportlife;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/*
Класс ClubManager:
- список membership хранит информацию об абонементах;
- метод addMembership принимает на вход параметры: вид абонемента (TypeOfMember)
и информацию о свойствах  абонемента (Membership);
- производится проверка на регистрацию.
*/

public class ClubManager{
    private List<Membership> memberships;//список абонементов

    public ClubManager(){
        this.memberships = new ArrayList<>();
    }

    public void addMembership(TypeOfMember typeOfMember, Membership membership){
        if (membership.getTypeOfMember() != null) {
            System.out.println("Абонемент уже зарегистрирован");
            return;
        }

        membership.setTypeOfMember(typeOfMember);
        memberships.add(membership);
    }

    public void printCurrentVisitors(){
        for (Membership membership : memberships){
            if (membership != null){
                System.out.println(membership.getOwner().getLastName() + " " + membership.getOwner().getFirstName());
                System.out.println("Дата и время посещения: " + LocalDate.now() + " " + LocalTime.now());
            }
        }
    }
}