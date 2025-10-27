package Inheritance;

public class Electronics extends Catalogue{
    Electronics(String name,double price){
        super(name,price);
    }
    @Override
    double calculateDiscount() {
        return 1;
    }


    @Override
    double calculateTax() {
        return price*0.15;
    }

    @Override
    double calcualteShipping() {
        return 10;
    }

    public static void main(String[] args) {
        Electronics obj=new Electronics("iphone",150000);

    }
}
