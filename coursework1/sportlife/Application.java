package coursework1.sportlife;

import java.time.LocalDate;

class Application {
    public static void main(String[] args) {
        ClubManager clubManager = new ClubManager();

        Person person1 = new Person("Peter", "Parker", 2001);
        Person person2 = new Person("Steve", "Rogers", 1918);
        Person person3 = new Person("Antony Edward", "Stark", 1970);

        Membership gymMembership1 = new Membership("01", person1);
        gymMembership1.setExpirationDate(LocalDate.of(2023, 01, 11));

        Membership dayMembership1 = new Membership("02", person2);
        dayMembership1.setExpirationDate(LocalDate.of(2024, 05, 31));

        Membership fullMembership1 = new Membership("03", person3);
        fullMembership1.setExpirationDate(LocalDate.of(2023, 02, 06));

        clubManager.addMembership(TypeOfMember.GYM, gymMembership1);
        clubManager.addMembership(TypeOfMember.GYM, gymMembership1);
        /*
        Will be rejected as the membership
        is already registered in the gym
        */

        clubManager.addMembership(TypeOfMember.POOL, dayMembership1);
        clubManager.addMembership(TypeOfMember.POOL, fullMembership1);
        /*
        Will be rejected as the full membership
        does not provide access to the pool
        */

        clubManager.printCurrentVisitors();
    }
}