package LLD_principles.builder_designPattern.betterCode.v1;

public class Builder {
    private int price;
    private String color;
    private double rating;
    private String description;
    private String brandName;
    private String createdAt;
    private String updatedAt;

    void setPrice(int price){
        this.price=price;
    }
    void setColor(String color){
        this.color=color;
    }
    void setRating(double rating){
        this.rating=rating;
    }
    void setDescription(String description){
        this.description=description;
    }
    void setBrandName(String brandName){
        this.brandName=brandName;
    }
    void setCreatedAt(String createdAt){
        this.createdAt=createdAt;
    }
    void setUpdatedAt(String updatedAt){
        this.updatedAt=updatedAt;
    }
    int getPrice(){
        return price;
    }
    String getColor(){
        return color;
    }
    String getDescription(){
        return description;
    }
    String getBrandName(){
        return brandName;
    }
    String getCreatedAt(){
        return createdAt;
    }
    String getUpdatedAt(){
        return updatedAt;
    }
}
