package LLD_principles.builder_designPattern.problematicCode;

public class Product {
    private int price;
    private String color;
    private double rating;
    private String description;
    private String brandName;
    private String createdAt;
    private String updatedAt;

    Product(int price,String color,double rating,String description,String brandName,String createdAt,String updatedAt){
        this.price=price;
        this.color=color;
        this.rating=rating;
        this.description=description;
        this.brandName=brandName;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

}
