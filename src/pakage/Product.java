package pakage;

import java.time.LocalDate;

public class Product {

    private String name;



    private int price;

    private LocalDate cratedAt;

    public Product(String name,  int price, LocalDate cratedAt) {
        this.name = name;
        this.price = price;
        this.cratedAt = cratedAt;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(LocalDate cratedAt) {
        this.cratedAt = cratedAt;
    }


    @Override
    public String toString() {
        return "pakage.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cratedAt=" + cratedAt +
                '}';
    }
}
