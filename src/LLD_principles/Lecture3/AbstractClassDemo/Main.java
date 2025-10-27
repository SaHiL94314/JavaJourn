package LLD_principles.Lecture3.AbstractClassDemo;
interface A{
    void sayHello();
}
class B implements A{
    public void sayHello(){
        System.out.println("hello");
    }
    public void print(){
        System.out.println("print");
    }
}
public class Main {
    public static void main(String[] args) {
        MacBook p=new MacBook();
        p.calculateDiscount();
        p.displayTerms();
        p.sayHi();

        A obj=new B();
        obj.sayHello();
//        obj.print();
    }
}
