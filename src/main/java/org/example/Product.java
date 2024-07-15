package org.example;

public class Product {
    private String name;
    private double price;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public static class Builder {
        private String name;
        private double price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product(Name: " + name + ", Price: " + price + ")";
    }
}
