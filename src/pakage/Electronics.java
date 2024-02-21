package pakage;

import java.time.LocalDate;

public class Electronics  extends Product {
    private String brand;
    private String color;

    private boolean isNew;

    private int memory;

    public Electronics(String name, int price, LocalDate cratedAt, String brand, String color, boolean isNew, int memory) {
        super(name, price, cratedAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public Electronics() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "pakage.Electronics{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                ", memory=" + memory +
                "} " + super.toString();
    }
}
