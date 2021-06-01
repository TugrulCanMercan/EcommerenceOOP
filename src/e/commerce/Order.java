/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private User orderingUser;
    private ArrayList<Product> orderedProduct;
    private CreditCard orderedCreditCard;
    
//   public Order(User orderingUser,List<Product> orderedProduct,CreditCard orderedCreditCard){
//       this.orderingUser = orderingUser;
//       this.orderedProduct = orderedProduct;
//       this.orderedCreditCard = orderedCreditCard;
//   }
    public Order(Order newOrder){
        this.orderedProduct = newOrder.getOrderedProduct();
        this.orderingUser = newOrder.getOrderingUser();
        this.orderedCreditCard = newOrder.getOrderedCreditCard();
        
    }
    public Order(){
        this.orderedProduct = new ArrayList<Product>();
    }

    
    public User getOrderingUser() {
        return orderingUser;
    }

    /**
     * @param orderingUser the orderingUser to set
     */
    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    /**
     * @return the orderedProduct
     */
    public ArrayList<Product> getOrderedProduct() {
        return orderedProduct;
    }

    /**
     * @param orderedProduct the orderedProduct to set
     *///burayı değiştirdim
    public void setOrderedProduct(ArrayList<Product> orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    /**
     * @return the orderedCreditCard
     */
    public CreditCard getOrderedCreditCard() {
        return orderedCreditCard;
    }

    /**
     * @param orderedCreditCard the orderedCreditCard to set
     */
    public void setOrderedCreditCard(CreditCard orderedCreditCard) {
        this.orderedCreditCard = orderedCreditCard;
    }
    
     public boolean purchased(ArrayList<Product> products){
         
        for (int i = 0; i < products.size() ; i++) {
            for (int j = 0; j < getOrderedProduct().size(); j++) {
                if (products.get(i).getProductName().equals(getOrderedProduct().get(j).getProductName())) {
                    if (!products.get(i).stockReduce(getOrderedProduct().get(j).getProductStockInformation())) {
                        System.out.println("başarısız işlem");
                        return false;
                    }
                    
                }
                
            }
          
        }
         System.out.println("iyi günlerde kullanın");
        return true;
        
       
    }

 
}
//Ek olarak, burada Ürün sınıfının ürün stok bilgilerini 
//kontrol eden ve User sınıfının satın alma yöntemine erişen yönteme erişen bir yöntem kullanılmalıdır.