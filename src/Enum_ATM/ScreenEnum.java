package Enum_ATM;
public enum ScreenEnum {
    SCR_WELCOME("scrWelcome"),
    SCR_PIN_INPUT("scrPinInput"),
    SCR_MENU("scrMenu"),
    SCR_WITHDRAW("scrWithdraw"),
    SCR_WITHDRAW_OTHER_AMOUNT("scrWithDrawOtherAmount"),
//    SCR_WITHDRAW_CHOOSE_BANK_ACCOUNT_TYPE("scrWithDrawChooseBankAccount"),
    SCR_TRANSFER("scrTransfer"),
    SCR_TRANSACTION_NOTIFICATION("scrTransactionNotification"),
//    SCR_INVALID_TRANSACTION("scrInvalidTransaction"),
    SCR_LIST_TRANSACTION_HISTORY("scrListTransactionHistory"),
    SCR_NEW_PIN_INPUT("scrNewPinInput"),
//    SCR_NEW_PIN_REINPUT("scrNewPinReinput"),
    SCR_PRINT_INVOICE("scrPrintInvoice"),
    SCR_CHECK_AMOUNT("scrCheckAmount");
    
    public  final String label;
    
    private  ScreenEnum(String label){
        this.label=label;
    }
}
