/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tugrulcanmercan
 */
public class Test {
    public ArrayList<User> users = new ArrayList<User>();
    public ArrayList<Product> products = new ArrayList<Product>(); 
    public Test(){
        
    }
    
    public void createUser(String name,String surName,String username,String DateOfBirth,String Password,String EmailAdress
    ,String HomeAndWorkAdress){
       
        User newUser = new User();
        newUser.setUserName(username);
        newUser.setName(name);
        newUser.setSurName(surName);
        newUser.setDateOfBirth(DateOfBirth);
        newUser.setPassword(Password);
        newUser.setEmailAdress(EmailAdress);
        newUser.setHomeAndWorkAdress(HomeAndWorkAdress);
        newUser.setCreditCard(new CreditCard(0, newUser, 0, 0));
        users.add(newUser);
        
    }
    public void createProduct(String productName,String productColor,String ProductCategory,String ProductDesscriptionInformation
    ,int ProductStockInformation,int ProductWeight){
        Product newProduct = new Product();
        newProduct.setProductName(productName);
        newProduct.setProductColor(productColor);
        newProduct.setProductCategory(ProductCategory);
        newProduct.setProductDesscriptionInformation(ProductDesscriptionInformation);
        newProduct.setProductStockInformation(ProductStockInformation);
        newProduct.setProductWeight(ProductWeight);
        products.add(newProduct);
        
    }
    
    
    
}
