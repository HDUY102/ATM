package Cay_ATM;
import Enum_ATM.STKStatusEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class BankDB {
    private List<Customer> customers;
    private List<Card> cards;
    private List<STK> stks;
    private List<Account> accounts;
    private List<ATM> ATMs;
    private Map<Long, List<TransactionInfo>> transInfos;

    public BankDB() {
        customers = new ArrayList<>();
        cards = new ArrayList<>();
        stks = new ArrayList<>();
        accounts = new ArrayList<>();
        ATMs = new ArrayList<>();
        transInfos =new HashMap<>();
        createFakeData();
    }
    public void createFakeData(){
        //tạo ds account number
        stks.add(new STK(111, 1000000,"1111", STKStatusEnum.DA_KICH_HOAT));
        stks.add(new STK(222, 100000,"2222", STKStatusEnum.DA_KICH_HOAT));
        stks.add(new STK(333, 500000,"3333", STKStatusEnum.DA_KICH_HOAT));
    }
    public STK getSTKFromId(long idSTK){
        for(STK stk : stks){
            if(stk.getIdSTK()==idSTK){
                return stk;
            }
        }
        return null;
    }
    
    public Card getCardromId(long idCard){
        for(Card card : cards){
            if(card.getIdCard()==idCard){
                return card;
            }
        }
        return null;
    }
    public Card getSTKFromCard(long idSTK){
        for(Card card : cards){
            if(card.getIdSTK()==idSTK){
                return card;
            }
        }
        return null;
    }
    public List<TransactionInfo> getTransactionInfoBySTK(long idSTK){
        return transInfos.get(idSTK);
    }
    public boolean addTransactionInfo(long id_BankAccountNumber, TransactionInfo transInfor){
        List<TransactionInfo> transInfors = transInfos.get(id_BankAccountNumber);

        if(transInfors == null){
            transInfors = new ArrayList<>();
            transInfors.add(transInfor);
            transInfos.put(id_BankAccountNumber, transInfors);
        } else {
            transInfors.add(transInfor);
        }
        
        return true;
    }
}
