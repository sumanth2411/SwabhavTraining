package com.techlabs.inventoryMangement.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Inventory implements Serializable{
	private static final long serialVersionUID = 1L;
    private Map<String, Product> products;
    private Map<String, Supplier> suppliers;
    private List<Transaction> transactions;

    public Inventory() {
        products = new HashMap<>();
        suppliers = new HashMap<>();
        transactions = new ArrayList<>();
    }

    public void addProduct(Product product) throws Exception {
        if (products.containsKey(product.getProductId())) {
            throw new Exception("Product with this ID already exists.");
        }
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String name, String description, int quantity, double price) throws Exception {
        Product product = products.get(productId);
        if (product == null) {
            throw new Exception("Product not found.");
        }
        product.setName(name);
        product.setDescription(description);
        product.setQuantity(quantity);
        product.setPrice(price);
    }

    public void deleteProduct(String productId) throws Exception {
        if (!products.containsKey(productId)) {
            throw new Exception("Product not found.");
        }
        products.remove(productId);
    }

    public Product viewProduct(String productId) throws Exception {
        Product product = products.get(productId);
        if (product == null) {
            throw new Exception("Product not found.");
        }
        return product;
    }

    public Collection<Product> viewAllProducts() {
        return products.values();
    }

    public void addSupplier(Supplier supplier) throws Exception {
        if (suppliers.containsKey(supplier.getSupplierId())) {
            throw new Exception("Supplier with this ID already exists.");
        }
        suppliers.put(supplier.getSupplierId(), supplier);
    }

    public void updateSupplier(String supplierId, String name, String contactInfo) throws Exception {
        Supplier supplier = suppliers.get(supplierId);
        if (supplier == null) {
            throw new Exception("Supplier not found.");
        }
        supplier.setName(name);
        supplier.setContactInfo(contactInfo);
    }

    public void deleteSupplier(String supplierId) throws Exception {
        if (!suppliers.containsKey(supplierId)) {
            throw new Exception("Supplier not found.");
        }
        suppliers.remove(supplierId);
    }

    public Supplier viewSupplier(String supplierId) throws Exception {
        Supplier supplier = suppliers.get(supplierId);
        if (supplier == null) {
            throw new Exception("Supplier not found.");
        }
        return supplier;
    }

    public Collection<Supplier> viewAllSuppliers() {
        return suppliers.values();
    }

    public void addStock(String productId, int quantity) throws Exception {
        Product product = products.get(productId);
        if (product == null) {
            throw new Exception("Product not found.");
        }
        product.setQuantity(product.getQuantity() + quantity);
        transactions.add(new Transaction(generateUniqueId(), productId, "ADD", quantity, new Date()));
    }

    public void removeStock(String productId, int quantity) throws Exception {
        Product product = products.get(productId);
        if (product == null) {
            throw new Exception("Product not found.");
        }
        if (product.getQuantity() < quantity) {
            throw new Exception("Insufficient stock.");
        }
        product.setQuantity(product.getQuantity() - quantity);
        transactions.add(new Transaction(generateUniqueId(), productId, "REMOVE", quantity, new Date()));
    }

    public List<Transaction> viewTransactionHistory(String productId) {
        List<Transaction> productTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getProductId().equals(productId)) {
                productTransactions.add(transaction);
            }
        }
        return productTransactions;
    }

    public void saveData() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("inventory.dat"))) {
            oos.writeObject(this);
        }
    }

    public static Inventory loadData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("inventory.dat"))) {
            return (Inventory) ois.readObject();
        }
    }

    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

}
