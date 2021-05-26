/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tugrulcanmercan
 */
public class ECommerce {

       static Test test1 = new Test();
    public static void main(String[] args) {
        
        test1.createUser("barbar", "tugrul", "mercan", "19/10/1997", "1234", "led@gmail.co", "kıyıkışlacık");
        test1.createUser("tartar", "tolga", "mercan", "19/10/1991", "1234", "tol@gmail.co", "kıyıkışlacık");
        test1.createProduct("ps5", "siyah", "konsol", "güncel oyun oynatır", 100, 5);
        test1.createProduct("iphone", "beyaz", "telefon", "en iyi telefon", 50, 1);
        ArrayList<Product> selectedProducts = new ArrayList<Product>();
        selectedProducts.add(test1.products.get(0));
        selectedProducts.add(test1.products.get(1));
        basket(test1.users.get(0));
//        
//        Order newOrder = new Order();
//        newOrder.setOrderedCreditCard(test1.users.get(0).getCreditCard());
//        newOrder.setOrderingUser(test1.users.get(0));
//        Product handle = new Product(test1.products.get(0));
//        handle.setProductStockInformation(5);
//        
//        newOrder.setOrderedProduct(handle);
//        
        
        
    }
    public static void basket(User selectedUser) {
        boolean check = true;
        ArrayList<Product> handle = new ArrayList<Product>();
        for (int i = 0; i < test1.products.size(); i++) {
            System.out.println(test1.products.get(i).stockControl() + " ürün numarası " + i);
            ;
//            System.out.println("ürünlerimizi seçmek için numaralarını giriniz "+"ürünlerimiz : " + test1.products.get(i).stockControl() + " no " + i);
        }
        while (check) {
            System.out.println("yeni ürün seçiniz");
            Scanner slctScanner = new Scanner(System.in);
            int selected = slctScanner.nextInt();
            Product handleProduct = new Product(test1.products.get(selected));
            System.out.println("kaç adet almak istersiniz ? ");
            Scanner basketCountScanner = new Scanner(System.in);
            int basketCount = basketCountScanner.nextInt();
            handleProduct.setProductStockInformation(basketCount);
            handle.add(handleProduct);
            System.out.println("sepeti onaylamak için q ya basın");
            Scanner closeScanner = new Scanner(System.in);
            String cloString = closeScanner.nextLine();
            if (cloString.equals("q")) {
                check = false;
            }
            
        }
            for (int i = 0; i < handle.size(); i++) {
                System.out.println("sepetimiz "+ handle.get(i).getProductName()+" " + handle.get(i).getProductStockInformation());
        }
            Order order = new Order();
            order.setOrderedCreditCard(selectedUser.getCreditCard());
            order.setOrderingUser(selectedUser);
            order.setOrderedProduct(handle);
//            System.out.println( test1.products.get(0).getProductName().equals(order.getOrderedProduct().get(0).getProductName()));
//           
            order.purchased(test1.products);
            selectedUser.setProductsOrdered(order.getOrderedProduct());

        
        
    }
    
}
