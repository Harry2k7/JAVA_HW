public class Laptop {
    String brand;
    String model;
    String os;
    String color;
    int RAM;
    int SSD;
    int diagonal;
    double price;

    public Laptop(String brand, String model, String os) {
        this.brand = brand;
        this.model = model;
        this.os = os;
    }

    public Laptop(String brand, String model, String os, String color, int RAM, int SSD,  int diagonal, double price) {
        this(brand, model, os);
        this.color = color;
        this.RAM = RAM;
        this.SSD = SSD;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }   

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int ram) {
        RAM = ram;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int ssd) {
        SSD = ssd;
    }

    @Override
    public String toString() {
        return String.format("- %s %s, ОС: %s, ОЗУ: %dГБ, SSD: %dГБ, экран: %d, цвет: %s, цена: %.2f\n",
                brand, model, os, RAM, SSD, diagonal, color, price);
    }

}