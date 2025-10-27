package LLD_principles.builder_designPattern.betterCode.v2;


public class Main {
    public static void main(String[] args) {
        Product p=Product.getBuilder()
                .setBrandName("samsung")
                .setColor("yellow")
                .setPrice(70000)
                .setCreatedAt("27/10/2025")
                .build();







        // don't give user access to send builder obj, as user can mistake
//        Product p=new Product(b);
    }
}
