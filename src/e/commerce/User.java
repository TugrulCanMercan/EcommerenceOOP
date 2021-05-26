/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.util.ArrayList;
import java.util.List;


public class User {

    
    private String userName;
    private String name;
    private String surName;
    private String dateOfBirth;      
    private String password;       
    private String emailAdress;       
    private String homeAndWorkAdress;       
    private ArrayList<Product> productsOrdered; 
    private ArrayList<Product> favoriteProducts;
    private CreditCard creditCard;
    public User(){
        
    }
    
//    public User(String userName,String name,String surName,String dateOfBirth,String password,String emailAdress,
//            String homeAndWorkAdress,List<Product> productsOrdered,List<Product> favoriteProducts,CreditCard creditCard){
//        this.userName = userName;
//        this.name = name;
//        this.surName = surName;
//        this.dateOfBirth = dateOfBirth;
//        this.password = password;
//        this.emailAdress = emailAdress;
//        this.homeAndWorkAdress = homeAndWorkAdress;
//        this.productsOrdered = productsOrdered;
//        this.favoriteProducts = favoriteProducts;
//        this.creditCard = creditCard;
//        
//    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the emailAdress
     */
    public String getEmailAdress() {
        return emailAdress;
    }

    /**
     * @param emailAdress the emailAdress to set
     */
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    /**
     * @return the homeAndWorkAdress
     */
    public String getHomeAndWorkAdress() {
        return homeAndWorkAdress;
    }

    /**
     * @param homeAndWorkAdress the homeAndWorkAdress to set
     */
    public void setHomeAndWorkAdress(String homeAndWorkAdress) {
        this.homeAndWorkAdress = homeAndWorkAdress;
    }

    /**
     * @return the productsOrdered
     */
    public List<Product> getProductsOrdered() {
        return productsOrdered;
    }

    /**
     * @param productsOrdered the productsOrdered to set
     */
    public void setProductsOrdered(ArrayList<Product> productsOrdered) {
        this.productsOrdered = productsOrdered;
    }

    /**
     * @return the favoriteProducts
     */
    public List<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    /**
     * @param favoriteProducts the favoriteProducts to set
     */
    public void setFavoriteProducts(ArrayList<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    /**
     * @return the creditCard
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * @param creditCard the creditCard to set
     */
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    

   
}
