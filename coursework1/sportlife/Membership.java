package coursework1.sportlife;


import java.time.LocalDate;


class Membership{

    /*
    Membership хранит общие свойства абонемента
     */
    private String id;
    private Person owner;
    private LocalDate expirationDate;
    private TypeOfMember typeOfMember;

    public Membership(String id, Person owner){
        this.id = id;
        this.owner = owner;
    }

    public String getId(){
        return id;
    }

    public Person getOwner(){
        return owner;
    }

    public LocalDate getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate){ //срок действия до "даты"
        this.expirationDate = expirationDate;
    }

    public TypeOfMember getTypeOfMember(){
        return typeOfMember;
    }

    public void setTypeOfMember(TypeOfMember typeOfMember){
        this.typeOfMember = typeOfMember;
    }
}