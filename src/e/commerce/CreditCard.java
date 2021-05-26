/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

/**
 *
 * @author tugrulcanmercan
 */
class CreditCard {
    private int creditCardNumber;
    private User creditCardUser;
    private int securityCode;
    private int expirationDateOfTheCreditCards;
    
    public CreditCard(int creditCardNumber,User creditCardUser,int securityCode,int expirationDateOfTheCreditCards){
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDateOfTheCreditCards = expirationDateOfTheCreditCards;
    }
    public CreditCard(){
        
    }

    /**
     * @return the creditCardNumber
     */
    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber the creditCardNumber to set
     */
    public void setCreditCardNumber(int creditCardNumber) {
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
    public int getSecurityCode() {
        return securityCode;
    }

    /**
     * @param securityCode the securityCode to set
     */
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * @return the expirationDateOfTheCreditCards
     */
    public int getExpirationDateOfTheCreditCards() {
        return expirationDateOfTheCreditCards;
    }

    /**
     * @param expirationDateOfTheCreditCards the expirationDateOfTheCreditCards to set
     */
    public void setExpirationDateOfTheCreditCards(int expirationDateOfTheCreditCards) {
        this.expirationDateOfTheCreditCards = expirationDateOfTheCreditCards;
    }
    //methots here
    
   
}
