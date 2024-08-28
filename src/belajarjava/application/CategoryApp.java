package belajarjava.application;

import belajarjava.data.Category;

public class CategoryApp {

    public static void main(String[] args) {
        var category = new Category();
        category.setId("001");
        // category.id = "002"; // ERROR : id is private

        System.out.println(category.getId());
    }
}
