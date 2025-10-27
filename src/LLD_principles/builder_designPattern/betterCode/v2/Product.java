package LLD_principles.builder_designPattern.betterCode.v2;



public class Product {
    private int price;
    private String color;
    private double rating;
    private String description;
    private String brandName;
    private String createdAt;
    private String updatedAt;

    private Product(Builder b){
        price=b.getPrice();
        color=b.getColor();
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int price;
        private String color;
        private double rating;
        private String description;
        private String brandName;
        private String createdAt;
        private String updatedAt;

        Product build(){
            return new Product(this);
        }
        Builder setPrice(int price){
            this.price=price;
            return this;
        }
        Builder setColor(String color){
            this.color=color;
            return this;
        }
        Builder setRating(double rating){
            this.rating=rating;
            return this;
        }
        Builder setDescription(String description){
            this.description=description;
            return this;
        }
        Builder setBrandName(String brandName){
            this.brandName=brandName;
            return this;
        }
        Builder setCreatedAt(String createdAt){
            this.createdAt=createdAt;
            return this;
        }
        Builder setUpdatedAt(String updatedAt){
            this.updatedAt=updatedAt;
            return this;
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
}
