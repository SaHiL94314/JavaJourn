package LLD_principles.Lecture3.AbstractClassDemo;

public abstract class Product {
    Product(){
        System.out.println("constructor");
    }
    public abstract double calculateDiscount();
    public  void displayTerms(){
        System.out.println("some terms");
    }
}
