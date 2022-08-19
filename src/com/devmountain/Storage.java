package com.devmountain;

public class Storage {
    String brand;
    String name;
    String capacity;
    String type;
    String formFactor;
    String price;
    String amazonLink;

    public Storage(String[] values)
    {
        this.brand = values[0];
        this.name = values[1];
        this.capacity = values [2];
        this.type = values[3];
        this.formFactor = values[4];
        this.price = values[5];
        this.amazonLink = values[6];
    }

    @Override
    public String toString() {
        return "Storage{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", price='" + price + '\'' +
                ", amazonLink='" + amazonLink + '\'' +
                '}';
    }
}
