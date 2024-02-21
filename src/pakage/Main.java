package pakage;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        final int MASSIV_SIZE = 10000;

        User user = new User();
        Product[] products = new Product[MASSIV_SIZE];
        int productCount = 0;

        while (true) {
            System.out.println("""
                    1.Register
                    2.Login
                    3.Exit
                    """);
            int sa = scanner.nextInt();

            scanner.nextLine();
            switch (sa) {
                case 1 -> {
                    if (true) {
                        System.out.println("Write first name: ");
                        user.setFirstName(scanner.nextLine());

                        System.out.println("Write last name: ");
                        user.setLastName(scanner.nextLine());

                        System.out.println("Write email: ");
                        user.setEmail(scanner.nextLine());
                        System.out.println("Write password: ");
                        user.setPassword(scanner.nextLine());
                        System.out.println("Register Success!");

                    }
                }
                case 2 -> {
                    System.out.println("Write email: ");
                    String email = scanner.nextLine();
                    System.out.println("Write password: ");
                    String password = scanner.nextLine();
                    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                        boolean loggedIn = true;
                        if (loggedIn) {
                            boolean returnToMainMenu = false;
                            while (!returnToMainMenu) {
                        System.out.println("""
                                1.Add new product
                                2.Get all products
                                3.Get all books
                                4.Get all electronics
                                5.Menu
                                """);

                        switch (scanner.nextInt()) {
                            case 1 -> {
                                System.out.println("Choose product type:");
                                System.out.println("1. Book");
                                System.out.println("2. Electronics");
                                int s = scanner.nextInt();
                                scanner.nextLine();
                                switch (s) {
                                    case 1 -> {
                                        System.out.println("Title book: ");
                                        String bookTitle = scanner.nextLine();

                                        System.out.println("Enter book price:");
                                        int bookPrice = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.println("Enter publication date (YYYY-MM-DD):");
                                        String publicationDateStr = scanner.nextLine();
                                        LocalDate publicationDate = LocalDate.parse(publicationDateStr);


                                        System.out.println("Enter author:");
                                        String author = scanner.nextLine();

                                        Book newBook = new Book(bookTitle, bookPrice, publicationDate, author);

                                        if (productCount == products.length) {
                                            products = Arrays.copyOf(products, products.length * 2);
                                        }
                                        products[productCount] = newBook;
                                        productCount++;

                                        System.out.println("Book added successfully!");
                                    }
                                    case 2 -> {

                                        System.out.println("Enter electronic product name:");
                                        String electronicName = scanner.nextLine();

                                        System.out.println("Enter electronic product price:");
                                        int electronicPrice = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.println("Enter production date (YYYY-MM-DD):");
                                        String productionDateStr = scanner.nextLine();
                                        LocalDate productionDate = LocalDate.parse(productionDateStr);

                                        System.out.println("Enter brand:");
                                        String brand = scanner.nextLine();

                                        System.out.println("Enter color:");
                                        String color = scanner.nextLine();

                                        System.out.println("Is it portable? (true/false):");
                                        boolean portable = scanner.nextBoolean();

                                        System.out.println("Enter storage capacity:");
                                        int storageCapacity = scanner.nextInt();
                                        scanner.nextLine();

                                        Electronics newElectronics = new Electronics(electronicName, electronicPrice, productionDate, brand, color, portable, storageCapacity);
                                        if (productCount == products.length) {
                                            products = Arrays.copyOf(products, products.length * 2);
                                        }
                                        products[productCount] = newElectronics;
                                        productCount++;

                                        System.out.println("Electronics added successfully!");
                                    }
                                }


                            }case 2 ->{
                                System.out.println(Arrays.toString(products));
                            }
                            case 3 ->{
                                for (Product product : products) {
                                    if (product instanceof Book) {
                                        Book[] books = new Book[]{(Book) product};
                                        System.out.println(Arrays.toString(books));
                                    }
                                }
                            }
                            case 4 ->{
                                for (Product product : products) {
                                    if (product instanceof Electronics){
                                        Electronics[] electronics = new Electronics[]{(Electronics) product};
                                        System.out.println(Arrays.toString(electronics));
                                    }

                                }

                            }
                            case 5 ->{
                                returnToMainMenu = true;

                            }


                        }
                        }
                        }


                        System.out.println("""
                                1.Add new product
                                2.Get all products
                                3.Get all books
                                3.Get all electronics
                                """);
                    }

                }case 3 ->{
                    return;
                }
            }


        }


    }
    }

