
package Cay_ATM;

import Enum_ATM.CardStatusEnum;
import Enum_ATM.CardTypeEnum;



public class Card{
    private long idCard;
    private String cvv;
    private long pinCard;
    private CardStatusEnum cardStatus;
    private CardTypeEnum cardType;
    private long idSTK;

    public Card() {
    }

    public Card(long idCard, String cvv, long pinCard, CardStatusEnum cardStatus, CardTypeEnum cardType, long idSTK) {
        this.idCard = idCard;
        this.cvv = cvv;
        this.pinCard = pinCard;
        this.cardStatus = cardStatus;
        this.cardType = cardType;
        this.idSTK = idSTK;
    }

    
    public long getIdCard() {
        return idCard;
    }
    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public long getPinCard() {
        return pinCard;
    }
    public void setPingCard(long pinCard) {
        this.pinCard = pinCard;
    }
    public CardStatusEnum getCardStatus() {
        return cardStatus;
    }
    public void setCardStatus(CardStatusEnum cardStatus) {
        this.cardStatus = cardStatus;
    }
    public CardTypeEnum getCardType() {
        return cardType;
    }
    public void setCardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }
    public long getIdSTK() {
        return idSTK;
    }
    public void setIdSTK(long idSTK) {
        this.idSTK = idSTK;
    }

    public boolean isCardNormal(){
        if(this.getCardStatus()==CardStatusEnum.BINH_THUONG){
            return true;
        }else return false;
    }   
    public boolean isCardType(){
        if(this.getCardType()==CardTypeEnum.MASTER){
            return true;
        }else return false;
    }
}
