package entity;

import authService.AuthUser;
import db.DB;
import enums.Role;
import util.Input;

import java.util.ArrayList;
import java.util.UUID;

public class Category {
    private final String name;
    private final ArrayList<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public static void removeProduct() {
        if (AuthUser.currentUser.getRole().equals(Role.User)){
            System.out.println("You are not allowed to change warehouse");
            return;
        }
        showCategories();
        int indexCat = Input.inputInt("choose category:")-1;
        showProducts(indexCat);
        int indexToRemove = Input.inputInt("choose product to remove:")-1;
        DB.CATEGORIES.get(indexCat).getProducts().remove(indexToRemove);
        System.out.println("Product has been successfully removed!");

    }
    public static void showProducts(int index){
        for (int i = 0; i < DB.CATEGORIES.get(index).getProducts().size(); i++) {
            System.out.println(i+1+". "+DB.CATEGORIES.get(index).getProducts().get(i).name());

        }
    }


    public static void addProduct() {
        if (AuthUser.currentUser.getRole().equals(Role.User)){
            System.out.println("You are not allowed to change warehouse");
            return;
        }
        if (DB.CATEGORIES.size() == 0) {
            System.out.println("Please, add category first!");
            return;
        } else
            showCategories();
        int index = Input.inputInt("Choose category to add prosuct:") - 1;
        DB.CATEGORIES.get(index).getProducts().add(new Product(UUID.randomUUID(),
                Input.inputStr("Enter product name"),
                Input.inputDouble("Enter price"),
                Input.inputInt("Enter quantity of product")));
        System.out.println("-------------");
        System.out.println("Product has been successfully added!");
    }


    public static void showCategories() {
        for (int i = 0; i < DB.CATEGORIES.size(); i++) {
            System.out.println(i + 1 + ". " + DB.CATEGORIES.get(i).getName());
        }
    }

    public static void addCategory() throws InterruptedException {
        if (AuthUser.currentUser.getRole().equals(Role.User)){
            System.out.println("You are not allowed to change warehouse");
            return;
        }
        Category category = new Category(Input.inputStr("Enter category name"));
        DB.CATEGORIES.add(category);
        System.out.println("Category has been added successfully!");
        Thread.sleep(1000);
    }

}
