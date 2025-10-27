package LLD_principles.Lecture3.AbstractClassDemo;

public class MacBook extends Product{

    @Override
    public double calculateDiscount() {
        return 0;
    }

    public void sayHi(){
        System.out.println("hi from macbook");
    }
}
