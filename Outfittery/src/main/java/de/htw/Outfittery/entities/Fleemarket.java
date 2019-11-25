package de.htw.Outfittery.entities;

public class Fleemarket {

    private String nameOfFleemarket;
    private String street;
    private String streetnumber;
    private String city;
    private String country;

    public Fleemarket(String nameOfFleemarket, String street, String streetnumber, String city, String country){
        this.nameOfFleemarket = nameOfFleemarket;
        this.street = street;
        this.streetnumber = streetnumber;
        this.city = city;
        this.country = country;
    }

    public String getNameOfFleemarket() {
        return nameOfFleemarket;
    }

    public void setNameOfFleemarket(String nameOfFleemarket) {
        this.nameOfFleemarket = nameOfFleemarket;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
