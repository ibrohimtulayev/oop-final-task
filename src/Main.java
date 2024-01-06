import authService.AuthUser;
import entity.Category;
import enums.Role;
import util.Input;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the warehouse service program!");
        Thread.sleep(500);

        label1:
        while (true) {
            AuthUser.authenticate();

            while (AuthUser.currentUser != null) {
                displayMainMenu();
                int choice = Input.inputInt("choose :");


                switch (choice) {
                    case 1:
                        Category.addCategory();
                        break;
                    case 2:
                        Category.addProduct();
                        break;
                    case 3:
                        Category.removeProduct();
                        break;
                    case 4:
                        AuthUser.currentUser = null;
                        continue label1;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("""
                -----------------
                1.Add new category
                2.Add new product
                3.Remove product
                4.Logout and Re-authenticate
                -----------------
                """);
    }
}
