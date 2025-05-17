package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;

import java.util.ArrayList;

public class ProductService {

    public ArrayList<Product> getProduct(){

        Product appleProduct=new Product("Apple","100","Red");
        Product orangeProduct =new Product("Orange","200","orange");

        ArrayList<Product> productsList=new ArrayList();
        productsList.add(appleProduct);
        productsList.add(orangeProduct);

        return productsList;
    }
}
