package com.techlabs.inventoryMangement.test;

import java.util.List;
import java.util.Scanner;

import com.techlabs.inventoryMangement.model.Inventory;
import com.techlabs.inventoryMangement.model.Product;
import com.techlabs.inventoryMangement.model.Supplier;
import com.techlabs.inventoryMangement.model.Transaction;

public class InventoryTest {
	private static Inventory inventory = new Inventory();
	
	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Inventory Management System");
            System.out.println("1. Product Management");
            System.out.println("2. Supplier Management");
            System.out.println("3. Transaction Management");
            System.out.println("4. Save Data");
            System.out.println("5. Load Data");
            System.out.println("6. Generate Reports");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        manageProducts(scanner);
                        break;
                    case 2:
                        manageSuppliers(scanner);
                        break;
                    case 3:
                        manageTransactions(scanner);
                        break;
                    case 4:
                        inventory.saveData();
                        System.out.println("Data saved successfully.");
                        break;
                    case 5:
                        inventory = Inventory.loadData();
                        System.out.println("Data loaded successfully.");
                        break;
                    case 6:
                        generateReports();
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void manageProducts(Scanner scanner) throws Exception {
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("4. View Product Details");
        System.out.println("5. View All Products");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter product ID: ");
                String productId = scanner.nextLine();
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter product description: ");
                String description = scanner.nextLine();
                System.out.print("Enter product quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                inventory.addProduct(new Product(productId, name, description, quantity, price));
                System.out.println("Product added successfully.");
                break;
            case 2:
                System.out.print("Enter product ID: ");
                productId = scanner.nextLine();
                System.out.print("Enter new product name: ");
                name = scanner.nextLine();
                System.out.print("Enter new product description: ");
                description = scanner.nextLine();
                System.out.print("Enter new product quantity: ");
                quantity = scanner.nextInt();
                System.out.print("Enter new product price: ");
                price = scanner.nextDouble();
                scanner.nextLine();
                inventory.updateProduct(productId, name, description, quantity, price);
                System.out.println("Product updated successfully.");
                break;
            case 3:
                System.out.print("Enter product ID: ");
                productId = scanner.nextLine();
                inventory.deleteProduct(productId);
                System.out.println("Product deleted successfully.");
                break;
            case 4:
                System.out.print("Enter product ID: ");
                productId = scanner.nextLine();
                Product product = inventory.viewProduct(productId);
                System.out.println(product);
                break;
            case 5:
                for (Product p : inventory.viewAllProducts()) {
                    System.out.println(p);
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        
    }

    private static void manageSuppliers(Scanner scanner) throws Exception {
        System.out.println("1. Add Supplier");
        System.out.println("2. Update Supplier");
        System.out.println("3. Delete Supplier");
        System.out.println("4. View Supplier Details");
        System.out.println("5. View All Suppliers");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter supplier ID: ");
                String supplierId = scanner.nextLine();
                System.out.print("Enter supplier name: ");
                String name = scanner.nextLine();
                System.out.print("Enter supplier contact info: ");
                String contactInfo = scanner.nextLine();
                inventory.addSupplier(new Supplier(supplierId, name, contactInfo));
                System.out.println("Supplier added successfully.");
                break;
            case 2:
                System.out.print("Enter supplier ID: ");
                supplierId = scanner.nextLine();
                System.out.print("Enter new supplier name: ");
                name = scanner.nextLine();
                System.out.print("Enter new supplier contact info: ");
                contactInfo = scanner.nextLine();
                inventory.updateSupplier(supplierId, name, contactInfo);
                System.out.println("Supplier updated successfully.");
                break;
            case 3:
                System.out.print("Enter supplier ID: ");
                supplierId = scanner.nextLine();
                inventory.deleteSupplier(supplierId);
                System.out.println("Supplier deleted successfully.");
                break;
            case 4:
                System.out.print("Enter supplier ID: ");
                supplierId = scanner.nextLine();
                Supplier supplier = inventory.viewSupplier(supplierId);
                System.out.println(supplier);
                break;
            case 5:
                for (Supplier s : inventory.viewAllSuppliers()) {
                    System.out.println(s);
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        
    }

    private static void manageTransactions(Scanner scanner) throws Exception {
        System.out.println("1. Add Stock");
        System.out.println("2. Remove Stock");
        System.out.println("3. View Transaction History");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter product ID: ");
                String productId = scanner.nextLine();
                System.out.print("Enter quantity to add: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                inventory.addStock(productId, quantity);
                System.out.println("Stock added successfully.");
                break;
            case 2:
                System.out.print("Enter product ID: ");
                productId = scanner.nextLine();
                System.out.print("Enter quantity to remove: ");
                quantity = scanner.nextInt();
                scanner.nextLine();
                inventory.removeStock(productId, quantity);
                System.out.println("Stock removed successfully.");
                break;
            case 3:
                System.out.print("Enter product ID: ");
                productId = scanner.nextLine();
                List<Transaction> transactions = inventory.viewTransactionHistory(productId);
                for (Transaction t : transactions) {
                    System.out.println(t);
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        
    }

    private static void generateReports() {
        System.out.println("Total number of products: " + inventory.viewAllProducts().size());
        System.out.println("Total number of suppliers: " + inventory.viewAllSuppliers().size());
        double totalStockValue = 0;
        for (Product p : inventory.viewAllProducts()) {
            totalStockValue += p.getQuantity() * p.getPrice();
        }
        System.out.println("Total stock value: " + totalStockValue);
    }
    
}