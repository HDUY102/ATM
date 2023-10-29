
package Cay_ATM;

import Enum_ATM.AccountStatusEnum;
import java.util.List;


public class Account {
    private String userName;
    private String passWord;
    private long idAccount;
    private AccountStatusEnum statusAcc;
    private List<STK> STKs;
    private List<TransactionInfo> transInfos;
    public Account() {
    }

    public Account(String userName, String passWord, long idAccount, AccountStatusEnum statusAcc, List<STK> STKs, List<TransactionInfo> transInfos) {
        this.userName = userName;
        this.passWord = passWord;
        this.idAccount = idAccount;
        this.statusAcc = statusAcc;
        this.STKs = STKs;
        this.transInfos = transInfos;
    }

    public List<TransactionInfo> getTransInfos() {
        return transInfos;
    }

    public void setTransInfos(List<TransactionInfo> transInfos) {
        this.transInfos = transInfos;
    }

    public AccountStatusEnum getStatusAcc() {
        return statusAcc;
    }
    public void setStatusAcc(AccountStatusEnum statusAcc) {
        this.statusAcc = statusAcc;
    }
    public long getIdAccount() {
        return idAccount;
    }
    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
    }
    public List<STK> getSTKs() {
        return STKs;
    }
    public void setSTKs(List<STK> STKs) {
        this.STKs = STKs;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
}
