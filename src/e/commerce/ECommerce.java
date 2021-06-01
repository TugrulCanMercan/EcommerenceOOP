/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.Scene;

/**
 *
 * @author tugrulcanmercan
 */
public class ECommerce {

       static Test test1 = new Test();
    public static void main(String[] args) throws ParseException {
        boolean closed = false;
        
        test1.createUser("barbartut", "tugrul", "mercan", "19/10/1997", "1234", "ledzeppelin@gmail.com", "kıyıkışlacık","1231232112132","098","12/13/2025");
        test1.createUser("john123", "john ", "lennon", "19/10/1950", "12qwe", "john@gmail.co", "izmir","12334435436567","018","12/13/2030");
        test1.createUser("tesla123", "nikola ", "tesla", "10/07/1856", "12qwe", "testla@gmail.co", "muğla","1233958409154154","032","12/13/2022");
        test1.createProduct("ps5", "siyah", "konsol", "güncel oyun oynatır", 100, 5);
        test1.createProduct("porshe", "beyaz", "araba", "benzinli", 20, 2600);
        test1.createProduct("macbook", "gri", "bilgisayar", "en güncel programları çalıştırır", 30, 3);
        test1.createProduct("iphone", "beyaz", "telefon", "en iyi telefon", 50, 1);

for (int i = 0; i < test1.users.size(); i++) {
    System.out.println("kullanıcılar : "+ i +"  "+ test1.users.get(i).getName());
}

while (!closed) {
    
    System.out.println("kullanıcı seçin");
    //
    Scanner scanner = new Scanner(System.in);
    int selectUser = 0;
    boolean userSlctCheck = false;
    while (!userSlctCheck) {
        try {
            selectUser = Integer.parseInt(scanner.nextLine());
            if (selectUser>=test1.users.size()||selectUser<0) {
                System.out.println("kullanıcı bulunamadı");
            }else{
                userSlctCheck = true;
            }
        } catch (NumberFormatException e) {
            
            System.out.println("girilen değer yanlış tekrar dene");
        }
    }
    
    
    
    //
    System.out.println("satın alma için : 1 fav ekleme :2 çıkmak için 3 kullanıcı objesinin bilgileri için 4");
    Scanner choseScanner = new Scanner(System.in);
    String choose = choseScanner.nextLine();
    switch(choose){
        case "1":
            basket(test1.users.get(selectUser));
            break;
        case "2":
            addFavorite(test1.users.get(selectUser));
            break;
       
        case "3":
            closed = true;
            break;
        case "4":
            userInformationControl(test1.users.get(selectUser));
            break;
        default:
            System.out.println("yanlış seçim");
    }
}


    }
    public static void basket(User selectedUser) {
        boolean check = true;
        
        ArrayList<Product> handle = new ArrayList<Product>();
        for (int i = 0; i < test1.products.size(); i++) {
            System.out.println(test1.products.get(i).getProductName() + " ürün numarası " + i + " stok adetimiz " + test1.products.get(i).getProductStockInformation());
            
//           
        }
        while (check) {
            boolean basketCheck = true;
            System.out.println("ürün seçiniz");
            // çalışma alanı
            int selected = 0;
            boolean productSlctCheck = false;
            while (!productSlctCheck) {                
                Scanner slctScanner = new Scanner(System.in);
            
            try {
                selected = Integer.parseInt(slctScanner.nextLine());
                if (selected>=test1.products.size()||selected<0) {
                    System.out.println("ürün bulunamadı");
                }else{
                    productSlctCheck = true;
                }
            } catch (NumberFormatException e) {
           
                System.out.println("girilen değer yanlış tekrar dene");
            }
            
           }
            
            
            
            Product handleProduct = new Product(test1.products.get(selected));
            
            //
            System.out.println("kaç adet almak istersiniz ? ");
            while (basketCheck) {                
            Scanner basketCountScanner = new Scanner(System.in);
            int basketCount = basketCountScanner.nextInt();
                if (handleProduct.stockControl(basketCount)) {
                    basketCheck  = false;
                    handleProduct.setProductStockInformation(basketCount);
                }
            }
  
            handle.add(handleProduct);
            System.out.println("sepeti onaylamak için q ya basın sepete yani ürün eklemek için a ya basın");
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


            if (order.purchased(test1.products)) {
               selectedUser.setProductsOrdered(order);
            }
     
        
    }
    public static void addFavorite(User selectedUser) {
        ArrayList<Product> favoriteProducts = new ArrayList<Product>();
        boolean check = true;
        for (int i = 0; i < test1.products.size(); i++) {
            System.out.println(test1.products.get(i).getProductName() + " ürün numarası " + i + " stok adetimiz " + test1.products.get(i).getProductStockInformation());
    
        }
        while (check) {
            System.out.println("fav urunleri eklemek için no larını giriniz");
            //
            int selected = 0;
            boolean productSlctCheck = false;
            while (!productSlctCheck) {                
                Scanner slctScanner = new Scanner(System.in);
            
            try {
                selected = Integer.parseInt(slctScanner.nextLine());
                if (selected>=test1.products.size()||selected<0) {
                    System.out.println("ürün bulunamadı");
                }else{
                    productSlctCheck = true;
                }
            } catch (NumberFormatException e) {
           
                System.out.println("girilen değer yanlış tekrar dene");
            }
            
           }
          
           //
            favoriteProducts.add(test1.products.get(selected));
            System.out.println("çıkmak için q ya basın ürün eklemek için a ya basın");
            Scanner closeScanner = new Scanner(System.in);
            String close = closeScanner.nextLine();
            if (close.equals("q")) {
                check = false;
            }
        }
        for (int i = 0; i < favoriteProducts.size(); i++) {
            selectedUser.setFavoriteProducts(favoriteProducts.get(i));
        }
        
        System.out.println("başarıyla eklendi");
        System.out.println(selectedUser.getName() +" 'ın fav listesi " );
        for (int i = 0; i < selectedUser.getFavoriteProducts().size(); i++) {
            System.out.println(selectedUser.getFavoriteProducts().get(i).getProductName());
            
        }
        
    }
    public static void userInformationControl(User selectedUser){
        System.out.println("adı  "+selectedUser.getName());
        System.out.println("soyadı  " + selectedUser.getSurName());
        System.out.println("kullanıcı şifresi  " + selectedUser.getPassword());
        System.out.println("kullanıcı ev ve iş adresi  "+selectedUser.getHomeAndWorkAdress());
        System.out.println("kullanıcı email  "+selectedUser.getEmailAdress());
        System.out.println("kullanıcı doğu tarihi"+ selectedUser.getDateOfBirth());
        System.out.println("kullanıcı adı " + selectedUser.getUserName());
        System.out.println("");
        System.out.println("kredi kartı bilgileri");
        System.out.println("kullanıcı kredi kartı numarası  " + selectedUser.getCreditCard().getCreditCardNumber());
        System.out.println("kredi kartı kullanıcı ismi " + selectedUser.getCreditCard().getCreditCardUser().getName());
        System.out.println("kredi kartının son tarihi " + selectedUser.getCreditCard().getExpirationDateOfTheCreditCards());
        System.out.println("kredi kartı güvenlik nosu  "+selectedUser.getCreditCard().getSecurityCode());
        System.out.println("");
        System.out.println("sipariş listem : ");
        for (int i = 0; i < selectedUser.getProductsOrdered().size(); i++) {
            for (int j = 0; j < selectedUser.getProductsOrdered().get(i).getOrderedProduct().size(); j++) {
                System.out.println(selectedUser.getProductsOrdered().get(i).getOrderedProduct().get(j).getProductName());
                
            } 
        }
        System.out.println("fav listem");
        for (int i = 0; i < selectedUser.getFavoriteProducts().size(); i++) {
            System.out.println(selectedUser.getFavoriteProducts().get(i).getProductName());
        }
        
        
        
    }
    
}
