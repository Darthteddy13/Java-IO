package com.devmountain;

public class Gpu {
    String brand;
    String name;
    String chipset;
    String memory;
    String baseClock;
    String boostClock;
    String price;
    String amazonLink;

    @Override
    public String toString() {
        return "Gpu{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", chipset='" + chipset + '\'' +
                ", memory='" + memory + '\'' +
                ", baseClock='" + baseClock + '\'' +
                ", boostClock='" + boostClock + '\'' +
                ", price='" + price + '\'' +
                ", amazonLink='" + amazonLink + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(String baseClock) {
        this.baseClock = baseClock;
    }

    public String getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(String boostClock) {
        this.boostClock = boostClock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmazonLink() {
        return amazonLink;
    }

    public void setAmazonLink(String amazonLink) {
        this.amazonLink = amazonLink;
    }
}
