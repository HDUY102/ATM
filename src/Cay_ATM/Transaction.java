
package Cay_ATM;

import Enum_ATM.TransactionTypeEnum;
import java.time.LocalDateTime;
import java.util.List;

public class Transaction {
    private BankDB bankDB;
    private long idTransaction;
    public static long nextTransactionId = 0;
    public Transaction() {
        bankDB=new BankDB();
    }
    private STK getSTK(long idSTK){
        return bankDB.getSTKFromId(idSTK);
    }
    //Nhấn /***/ enter
    // rút tiền
    /***?/
     * 
     * @param idSTK
     * @param soTien
     * @return 
     */
    public boolean rutTien(Long idSTK,Long idSTK2,long soTien, String content){
        // Lấy TK từ id nhập vào
        STK stk = getSTK(idSTK);
        
        //ktr STK còn hoạt động không?
        if(!stk.isNormal()){
            return false;
        }
        
        //ktr SoTien có vượt quá trong TK ko
        if(stk.getAmount()<soTien){
            return false;
        }
        //trừ tiền trong TK
        boolean isSuccessed= stk.rutTien(soTien);
        bankDB.addTransactionInfo(idSTK, createNewTransactionInfo(TransactionTypeEnum.RUT_TIEN,
                idSTK,idSTK2,content,soTien));
        /*Nếu như khai báo là "long" nó là 1 kiểu trả về số nên khi t truyền vào cùng 1 stk thì nghĩa là
        người rút và nhận là 1
        Nếu như muốn truyền vào là "null" thì ta phải biến kiểu "long" thành 1 class "Long" => có thể khai
        báo là null cho stk nhận.*/
        CayATM_GUI.CayATM.updateAccountBalance();
        return isSuccessed;
    }
    
    // nạp tiền
    public boolean napTien(Long idSTK,Long idSTK2, long soTien, String content){
        //lay stk  
        STK stk=getSTK(idSTK);
        //kt trạng thái stk
        if(!stk.isNormal()){
            return false;
        }
        //thêm tiền vào tk
        boolean isSuccessed= stk.napTien(soTien);
        // thêm thông tin lịch sử gd vào DB
        bankDB.addTransactionInfo(idSTK, createNewTransactionInfo(TransactionTypeEnum.NAP_TIEN,
                idSTK,idSTK2,content,soTien));
        return isSuccessed;
    }
    
    // chuyển tiền
    public boolean chuyenTien(long idSTK1, long idSTK2,long soTien, String content){
          if(!rutTien(idSTK1,idSTK2,soTien,content)){
             return false;
          }
          if(!napTien(idSTK2,idSTK2,soTien,content)){
             return false;
          }
          return true;
    }
    
    //Ktr số tiền
    public long ktSoTien(long idSTK){
        //lấy stk
        STK stk=getSTK(idSTK);
        //kt tình trạng stk
        if(!stk.isNormal()){
            return 0;
        }
        //kt số tiền
        return stk.getAmount();
        
    }
    
    //Lịch sử giao dịch
    public List<TransactionInfo> xemLichSu(long idstk){
        //lấy stk
        STK stk=getSTK(idstk);
        return bankDB.getTransactionInfoBySTK(idstk);
    }
    /***
     * 
     * @return id next transaction
     */
    public static long getNextTransactionId(){
        nextTransactionId +=1;
        return nextTransactionId;
    }
    
    private TransactionInfo createNewTransactionInfo(
            TransactionTypeEnum transType,
            Long idSTK,
            Long idSTKReceiver,
            String content,
            double money
    ){
        return new TransactionInfo(transType,
                LocalDateTime.now(),
                money,
                idSTK,
                idSTKReceiver,
                content,
                getNextTransactionId());
    }
}
