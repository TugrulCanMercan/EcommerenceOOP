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
class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStockInformation;
    private int productWeight;
    private String productDesscriptionInformation;
    public Product(Product newProduct){
        this.productName = newProduct.getProductName();
        this.productColor = newProduct.getProductColor();
        this.productCategory = newProduct.getProductCategory();
//        this.productDesscriptionInformation = newProduct.getProductDesscriptionInformation();
        this.productStockInformation = newProduct.getProductStockInformation();
        this.productWeight = newProduct.getProductWeight();
    }
    
    public Product(){
        
    }
    
//    public Product(String productName,String productColor,String productCategory,int productStockInformation
//    ,int productWeight,String productDesscriptionInformation){
//        this.productName = productName;
//        this.productColor = productColor;
//        this.productCategory = productCategory;
//        this.productStockInformation = productStockInformation;
//        this.productWeight = productWeight;
//        this.productDesscriptionInformation = productDesscriptionInformation;
//    }
    
//    products purchased and controls the stock 

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productColor
     */
    public String getProductColor() {
        return productColor;
    }

    /**
     * @param productColor the productColor to set
     */
    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    /**
     * @return the productCategory
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * @param productCategory the productCategory to set
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * @return the productStockInformation
     */
    public int getProductStockInformation() {
        return productStockInformation;
    }

    /**
     * @param productStockInformation the productStockInformation to set
     */
    public void setProductStockInformation(int productStockInformation) {
        this.productStockInformation = productStockInformation;
    }

    /**
     * @return the productWeight
     */
    public int getProductWeight() {
        return productWeight;
    }

    /**
     * @param productWeight the productWeight to set
     */
    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    /**
     * @return the productDesscriptionInformation
     */
    public String getProductDesscriptionInformation() {
        return productDesscriptionInformation;
    }

    /**
     * @param productDesscriptionInformation the productDesscriptionInformation to set
     */
    public void setProductDesscriptionInformation(String productDesscriptionInformation) {
        
        this.productDesscriptionInformation = productDesscriptionInformation;
    }
    
    
    //methot  here
//   that reduces the number of stocks as much as the number of products purchased and controls the stock number.
    public String stockControl(){
        if (getProductStockInformation()==0) {
         
            return "stoklarımızda bulunamamıştır en kısa sürede stokalarımız yenilenecektir";
        }
        return "ürünlerimiz "+ getProductName() +" Kalan stok adetimiz : " + getProductStockInformation();
     
    }
    public void stockReduce(int orderCount){
        if (getProductStockInformation()>=orderCount) {
            int currentStock = getProductStockInformation() - orderCount;
            setProductStockInformation(currentStock);
            
            return;
        }
        System.out.println("stok adetinizi karşılayamıyoruz");
        
    }
    
}
