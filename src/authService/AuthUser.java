package authService;

import db.DB;
import entity.User;
import enums.Role;
import util.Input;

public class AuthUser {
    public static User currentUser;
    static {
        User sampleUser = new User("123","123","123");
        sampleUser.setRole(Role.Admin);
        DB.USERS.add(sampleUser);
    }
    public static void displayMenu() {
        System.out.println("""
                1 - Login
                2 - Register""");
    }
    public static void authenticate() throws InterruptedException {
        displayMenu();
        switch (Input.inputInt("choose:")){
            case 1->loginUser();
            case 2->registerUser();
        }
    }

    private static void registerUser() {
        User user = new User(
                Input.inputStr("Enter your name:"),
                Input.inputStr("Enter your email:"),
                Input.inputStr("Enter your password:")
        );
        DB.USERS.add(user);
        System.out.println("You have been successfully registered!");
        System.out.println("Getting back to the login page");
    }


    private static void loginUser() throws InterruptedException {
        String email = Input.inputStr("Enter your email:");
        String password = Input.inputStr("Enter your password");
        for (User user : DB.USERS) {
            if (user.getEmail().equals(email)&&user.getPassword().equals(password)){
                currentUser = user;

                System.out.println("Successfully logged as a "+user.getRole()+" role");
                Thread.sleep(1000);
            }
        }
    }



}
