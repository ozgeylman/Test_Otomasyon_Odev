package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Singleton örneği
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton Test:");
        System.out.println(singleton1.getMessage());
        System.out.println("Is singleton1 same as singleton2? " + (singleton1 == singleton2 ? "Yes" : "No"));

        // Builder örneği
        Product product = new Product.Builder()
                .setName("Laptop")
                .setPrice(1500.00)
                .build();
        System.out.println("\nBuilder Test:");
        System.out.println(product);
    }
}
