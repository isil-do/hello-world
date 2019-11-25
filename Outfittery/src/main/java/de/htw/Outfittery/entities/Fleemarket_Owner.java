package de.htw.Outfittery.entities;

public class Fleemarket_Owner extends Person{

    private Fleemarket fleemarket;

    public Fleemarket_Owner(String firstName, String lastName, String address, String email){
        super(firstName, lastName, address, email);
    }

    public Fleemarket_Owner(String firstName, String lastName, String address, String email, Fleemarket fleemarket){
        super(firstName, lastName, address, email);
        this.fleemarket = fleemarket;
    }

    public Fleemarket getFleemarket() {
        return fleemarket;
    }

    public void setFleemarket(Fleemarket fleemarket) {
        this.fleemarket = fleemarket;
    }
}
