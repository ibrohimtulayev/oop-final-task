# oop-final-task

Certainly, creating documentation for a project is crucial for understanding its structure, functionality, and usage. Below is a template for a simple documentation document. You can customize it based on your project's specifics.

Project Documentation: Warehouse Service
Table of Contents
Overview
Project Structure
Classes and Methods
3.1 AuthUser Class
3.2 Category Class
3.3 User Class
3.4 Product Class
Enumerations
Interfaces
Database (DB Interface)
Main Class
Testing
1. Overview
The Warehouse Service project is designed to manage categories, products, and user authentication within a warehouse system. Users can register, log in, add categories, add products to categories, and perform other warehouse-related tasks based on their roles.

2. Project Structure
The project is organized into the following packages:

authService: Contains classes related to user authentication.
db: Defines the database interface and storage.
entity: Includes entity classes like Category, User, and Product.
enums: Contains the Role enum.
util: Houses the Input interface for user input handling.
Main: The entry point of the application.
3. Classes and Methods
3.1 AuthUser Class
The AuthUser class handles user authentication and role management.

Methods:
displayMenu(): Display the login and register menu.
promote(): Promote a user to an admin if they request it.
authenticate(): Handle user authentication.
registerUser(): Register a new user.
loginUser(): Log in an existing user.
assignAdmin(): Assign admin role to requested users.
3.2 Category Class
The Category class represents product categories.

Methods:
removeProduct(): Remove a product from a category.
showProducts(int index): Display products in a category.
addProduct(): Add a new product to a category.
showCategories(): Display existing categories.
addCategory(): Add a new category.
3.3 User Class
The User class represents a user in the system.

Fields:
name: User's name.
email: User's email.
password: User's password.
role: User's role (enum).
Methods:
setRole(Role role): Set the user's role.
3.4 Product Class
The Product class represents a product.

Fields:
id: Unique identifier for the product.
name: Product name.
price: Product price.
quantity: Product quantity.
4. Enumerations
4.1 Role Enum
User: Regular user.
Admin: Admin user.
5. Interfaces
5.1 Input Interface
The Input interface handles user input.

Methods:
inputInt(String msg): Get an integer input from the user.
inputDouble(String msg): Get a double input from the user.
inputStr(String msg): Get a string input from the user.
6. Database Interface
6.1 DB Interface
The DB interface defines the database structure.

Lists:
CATEGORIES: List of categories.
USERS: List of registered users.
REQUESTED_USERS: List of users who requested admin access.
7. Main Class
The Main class is the entry point of the application.

Methods:
main(String[] args): Start the warehouse service.
8. Testing
The testing section includes JUnit tests for the AuthUser class. These tests cover scenarios like promoting a user, authenticating users, and registering new users.

[](url)
