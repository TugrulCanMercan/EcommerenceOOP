/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    ,String HomeAndWorkAdress,String creditCardNumber,String securityCode,String expirationDateOfTheCreditCards) throws ParseException{
       
        User newUser = new User();
        newUser.setUserName(username);
        newUser.setName(name);
        newUser.setSurName(surName);
        Date Dateofbirth = new SimpleDateFormat("dd/MM/yyyy").parse(DateOfBirth);
        newUser.setDateOfBirth(Dateofbirth);
       
      
        newUser.setPassword(Password);
        newUser.setEmailAdress(EmailAdress);
        newUser.setHomeAndWorkAdress(HomeAndWorkAdress);
        newUser.setCreditCard(new CreditCard(creditCardNumber, newUser, securityCode, expirationDateOfTheCreditCards));
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
