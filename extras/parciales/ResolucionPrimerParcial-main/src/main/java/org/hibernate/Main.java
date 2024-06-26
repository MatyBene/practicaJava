package org.hibernate;

import org.hibernate.models.Chair;
import org.hibernate.models.Desk;
import org.hibernate.models.Notebook;
import org.hibernate.models.Printer;
import org.hibernate.models.Product;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Chair chair = new Chair(2, "chair", 500D, true);
        Desk desk = new Desk(10, "desk", 10000D, 100D, 90D);
        Notebook notebook = new Notebook(5, "notebook", 6000D, "acer", 256);
        Printer printer = new Printer(3, "printer", 1200D, "HP", 18.2);


        List<Product> listedProducts = new ArrayList<>();
        listedProducts.add(chair);
        listedProducts.add(desk);
        listedProducts.add(notebook);
        listedProducts.add(printer);


        for (Product product : listedProducts) {
            if (product instanceof Chair) {
                System.out.println("Printing a " + product.getClass().getSimpleName() + " " + product);
            } else if (product instanceof Desk) {
                System.out.println("Printing a " + product.getClass().getSimpleName() + " " + product);
            } else if (product instanceof Notebook) {
                System.out.println("Printing a " + product.getClass().getSimpleName() + " " + product);
            } else {
                System.out.println("Printing a " + product.getClass().getSimpleName() + " " + product);
            }
        }


        System.out.println("Chair price before discount: " + chair.getPrice());
        System.out.println("Chair price after discount: " + chair.applyDiscount(0.5));
        System.out.println("check that the interface does not set a new price: " + chair.getPrice());


        System.out.println("Printer price before discount: " + printer.getPrice());
        System.out.println("Printer price after discount: " + printer.applyDiscount(0.5));
        System.out.println("Check that the interface does not set a new price: " + printer.getPrice());

        for (Product product : listedProducts) {
            if (product instanceof Chair) {
                System.out.println(product.getClass().getSimpleName() + " price before increment: " + product.getPrice());
                product.incrementPrice(0.05);
                System.out.println(product.getClass().getSimpleName() + " price after increment: " + product.getPrice());
            } else if (product instanceof Desk) {
                System.out.println(product.getClass().getSimpleName() + " price before increment: " + product.getPrice());
                product.incrementPrice(0.10);
                System.out.println(product.getClass().getSimpleName() + " price after increment: " + product.getPrice());
            } else if (product instanceof Notebook) {
                System.out.println(product.getClass().getSimpleName() + " price before increment: " + product.getPrice());
                product.incrementPrice(0.20);
                System.out.println(product.getClass().getSimpleName() + " price after increment: " + product.getPrice());
            } else {
                System.out.println(product.getClass().getSimpleName() + " price before increment: " + product.getPrice());
                product.incrementPrice(0.15);
                System.out.println(product.getClass().getSimpleName() + " price after increment: " + product.getPrice());
            }
        }

    }
}