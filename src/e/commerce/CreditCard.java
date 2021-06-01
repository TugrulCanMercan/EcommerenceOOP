/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tugrulcanmercan
 */
class CreditCard {
    private String creditCardNumber;
    private User creditCardUser;
    private String securityCode;
    private Date expirationDateOfTheCreditCards;
    
    public CreditCard(String creditCardNumber,User creditCardUser,String securityCode,String expirationDateOfTheCreditCards) throws ParseException{
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        
        Date expirationDateOfTheCreditCard = new SimpleDateFormat("dd/MM/yyyy").parse(expirationDateOfTheCreditCards);
        
        this.expirationDateOfTheCreditCards = expirationDateOfTheCreditCard;
    }
    public CreditCard(){
        
    }

    /**
     * @return the creditCardNumber
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber the creditCardNumber to set
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * @return the creditCardUser
     */
    public User getCreditCardUser() {
        return creditCardUser;
    }

    /**
     * @param creditCardUser the creditCardUser to set
     */
    public void setCreditCardUser(User creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    /**
     * @return the securityCode
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * @param securityCode the securityCode to set
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * @return the expirationDateOfTheCreditCards
     */
    public Date getExpirationDateOfTheCreditCards() {
        return expirationDateOfTheCreditCards;
    }

    /**
     * @param expirationDateOfTheCreditCards the expirationDateOfTheCreditCards to set
     */
    public void setExpirationDateOfTheCreditCards(String expirationDateOfTheCreditCards) throws ParseException {
        Date expirationDateOfTheCreditCard = new SimpleDateFormat("dd/MM/yyyy").parse(expirationDateOfTheCreditCards);
        this.expirationDateOfTheCreditCards = expirationDateOfTheCreditCard;
    }
    //methots here
    
   
}
