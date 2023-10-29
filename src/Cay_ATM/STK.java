
package Cay_ATM;
import Enum_ATM.STKStatusEnum;
import java.util.List;
public class STK {
    private long idSTK;
    protected long amount;
    private String pinSTK;
    private STKStatusEnum staTus;
    public STK(){}

    public STK(long idSTK, long amount, String pinSTK, STKStatusEnum staTus) {
        this.idSTK = idSTK;
        this.amount = amount;
        this.pinSTK = pinSTK;
        this.staTus = staTus;
    }

    public long getIdSTK() {
        return idSTK;
    }
    public void setIdSTK(long idSTK) {
        this.idSTK = idSTK;
    }
    public String getPinSTK() {
        return pinSTK;
    }
    public void setPinSTK(String pinSTK) {
        this.pinSTK = pinSTK;
    }
    public STKStatusEnum getStaTus() {
        return staTus;
    }
    public void setStaTus(STKStatusEnum staTus) {
        this.staTus = staTus;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }

    public boolean rutTien(double soTien){
        this.amount -= soTien;
        return true;
    }
    public boolean napTien(double soTien){
        this.amount += soTien;
        return true;
    }
    public boolean isNormal(){
        if(this.getStaTus()==STKStatusEnum.DA_KICH_HOAT){
            return true;
        }
        return false;
    }    
}
