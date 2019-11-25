package de.htw.Outfittery.entities;

public class Trader extends Person{

    private Clothing[] clothes;

    public Trader(String firstName, String lastName, String address, String email){
        super(firstName, lastName, address, email);
    }

    public Trader(String firstName, String lastName, String address, String email, Clothing[] clothes){
        super(firstName, lastName, address, email);
        this.clothes = clothes;
    }

    public Clothing[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothing[] clothes) {
        this.clothes = clothes;
    }
}
