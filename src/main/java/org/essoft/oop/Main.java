package org.essoft.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("hello from turkcell");

        int number = 0;
        int number1 = 1;

        System.out.println(number);
        System.out.println(number1);

        String name = "Osman";

        {
            System.out.println(number);
            int scopeVariable = 1;
        }

//        System.out.println(scopeVariable); // Compile-Time Error

        String[] names = new String[3];
        names[0] = "Osman";
        names[1] = "Eren";
        names[2] = "Merve";

        int[] ages = {10, 20, 30};

        System.out.println(names[0]);
        System.out.println(ages[0]);

        List<String> namesList = new ArrayList<>();
        namesList.add("Osman");
        namesList.add("Eren");
        namesList.add("Merve");

        System.out.println(namesList);

        List<Integer> agesList = new ArrayList<>();
        agesList.add(10);
        agesList.add(20);
        agesList.add(30);

        System.out.println(agesList);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String s : namesList) {
            System.out.println(s);
        }

        while (number < ages.length) {
            System.out.println(ages[number]);
            number++;
        }

        do {
            System.out.println(ages[number1]);
            number1++;
        } while (number1 < ages.length);

        int age = 19;

        if (age > 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        int number2 = 50;

        if (number2 > 0) {
            System.out.println("Number is positive");
        } else if (number2 < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        sendEmail("email");
        sendEmail("email2");
        sendEmail("email3");

        
        System.out.println(calculateTax(10, 0.1));
        System.out.println(calculateTax(10, 0.2));

        sayHello("Halit","Engin","Çınar");

//        Product product1 = new Product(); // yeni bir ürün
//        product1.name = "Kulaklık";
//        product1.stock = 500;
//        product1.price = 1000;
//        product1.makeDiscount();
        Product product2 = new Product(
                "Laptop",
                5000,
                50);

        TaxCalculator.CalculateKdv(200);
        TaxCalculator.CalculateKdv(300);
        TaxCalculator.CalculateKdv(500);
        TaxCalculator.CalculateKdv(700);

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCustomerNo("ABC123");
        corporateCustomer.buy();

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setCustomerNo("GHJ456");
        individualCustomer.buy();

        ProductRepository productRepository = new PgProductRepository();
        productRepository.getAllProducts();

        ProductRepository productRepository2 = new MssqlProductRepository();
        productRepository2.getAllProducts();


    }

    public static void sendEmail(String email) {
        System.out.println("Email sent" + email);
    }

    public static double calculateTax(double number1, double number2) {
        return number1 * number2;
    }

    // varargs
    public static void sayHello(String... names) {
        for(int i=0; i<names.length; i++) {
            System.out.println("Hello " + names[i]);
        }
    }


}