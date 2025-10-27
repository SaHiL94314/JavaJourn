package LLD_principles.builder_designPattern.betterCode.v1;

public class Product {
    private int price;
    private String color;
    private double rating;
    private String description;
    private String brandName;
    private String createdAt;
    private String updatedAt;

    Product(Builder b){
        price=b.getPrice();
        color=b.getColor();
    }

}
