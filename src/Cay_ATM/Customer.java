
package Cay_ATM;

import java.util.List;

public class Customer {
    private CustomerInfo customerInfo;
    private Account account;
    private List<Card> Cards;
    public Customer(){}

    public Customer(CustomerInfo customerInfo, Account account, List<Card> Cards) {
        this.customerInfo = customerInfo;
        this.account = account;
        this.Cards = Cards;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }
    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public List<Card> getCards() {
        return Cards;
    }
    public void setCards(List<Card> Cards) {
        this.Cards = Cards;
    }

    

    
}
