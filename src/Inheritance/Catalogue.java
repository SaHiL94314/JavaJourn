package Inheritance;

public  abstract class Catalogue {
    protected String name;
    protected double price;

    Catalogue(String name,double price){
        this.name=name;
        this.price=price;
    }

     abstract double calculateDiscount();
     abstract double calculateTax();
     abstract double calcualteShipping();
}
