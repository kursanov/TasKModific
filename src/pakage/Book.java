package pakage;

import java.time.LocalDate;

public class Book extends Product {

    private String authorFullName;

    public Book(String name, int price, LocalDate cratedAt, String authorFullName) {
        super(name, price, cratedAt);
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "pakage.Book{" +
                "authorFullName='" + authorFullName + '\'' +
                "} " + super.toString();
    }
}
