package LLD_principles.builder_designPattern.betterCode.v1;

public class Main {
    public static void main(String[] args) {
        Builder b=new Builder();
        b.setColor("yellow");
        b.setBrandName("apple");
        b.setPrice(70000);

        Product p=new Product(b);
    }
}
