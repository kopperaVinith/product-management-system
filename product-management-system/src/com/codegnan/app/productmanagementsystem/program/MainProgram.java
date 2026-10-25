package com.codegnan.app.productmanagementsystem.program;

import com.codegnan.app.productmanagementsystem.operations.ProductOperations;
import com.codegnan.app.productmanagementsystem.product.Product;

import static java.lang.System.out;

public class MainProgram {
    public static void main(String[] args) {
        ProductOperations productOperations = new ProductOperations();

        Product[] products = productOperations.getProducts();

        for(Product product: products)
        {
            out.println(product);

        }
        out.println();
        Product product6 = new Product(6,"Webcam ",3200.00 );

       boolean isProductAdded = productOperations.addProduct(product6);
       if(isProductAdded)
       {
           out.println("Product added successfully.");
       }
       else
       {
           out.println("Product not added successfully");
       }

        Product product1 = new Product(1,"Laptop",55000.00);
        Product product2 = new Product(2,"Wireless Mouse",750.00);
        Product product3 = new Product(3,"Mechanical Keyboard",2500.00);
        Product product4 = new Product(4,"Monitor",12500.00 );
        Product product5 = new Product(5,"USB-C Hub",1800.00);
        Product product7 = new Product(7," Headphones", 1500.00 );
        Product product8 = new Product(8,"External SSD,",6500.00 );
        Product product9 = new Product(9,"Samsung TV",50000.00);
        Product product10 = new Product(10,"Mi Earphones",4000.00);

        productOperations.addProducts(product1,product2,product3,product4,product5,product6,product7,product8,product9,product10);

        products = productOperations.getProducts();

        for(Product product: products)
        {
            out.println(product);

        }
        out.println();

        Product product11 = new Product(11,"Tele Phone", 5500.00);
        isProductAdded = productOperations.addProduct(product11);
        if(isProductAdded)
        {
            out.println("Product is Added successfully");
        }
        else {
            out.println("Product not added successfully");
        }
        out.println();
        boolean isProductPriceUpdated = productOperations.updateProductPrice(2, 850.00);

        if(isProductPriceUpdated)
        {
            out.println("Product price is updated");
        }
        else {
            out.println("Product price not updated");
        }
        out.println();

        Product productId = productOperations.findProductById(3);
        if(productId == null)
        {
            out.println("Product not found");
        }
        else {
            out.println("Product found");
            out.println("Product id: " +productId.id());
            out.println("Product name: " + productId.name());
            out.println("Product price: " +productId.price());
        }
        out.println();

        boolean isProductDeleted = productOperations.deleteProduct(4);

        if(isProductDeleted)
        {
            out.println("Product deleted successfully.");
        }
        else
        {
            out.println(("Product not deleted successfully."));
        }
        out.println();
        products = productOperations.getProducts();

        for(Product product: products)
        {
            out.println(product);

        }
    }
}
