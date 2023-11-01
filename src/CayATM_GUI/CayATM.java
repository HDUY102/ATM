package CayATM_GUI;
import Cay_ATM.Card;
import Cay_ATM.Transaction;
import Cay_ATM.TransactionInfo;
import Enum_ATM.CardStatusEnum;
import Enum_ATM.CardTypeEnum;
import Enum_ATM.KeyboardEnum;
import Enum_ATM.ScreenEnum;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Action;
import javax.swing.Timer;

public class CayATM extends javax.swing.JFrame{
    
    public CayATM() {        
        initComponents();
        myInits();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        pnlKeyBoard = new javax.swing.JPanel();
        keyboardPanel1 = new CayATM_GUI.KeyboardPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ Thống Giả Lập ATM");
        setName("pnlMainScreen"); // NOI18N

        pnlMainScreen.setPreferredSize(new java.awt.Dimension(715, 424));

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS-PRO\\Pictures\\inputcard.png")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 200));
        jLabel1.setPreferredSize(new java.awt.Dimension(350, 200));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlKeyBoardLayout = new javax.swing.GroupLayout(pnlKeyBoard);
        pnlKeyBoard.setLayout(pnlKeyBoardLayout);
        pnlKeyBoardLayout.setHorizontalGroup(
            pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keyboardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKeyBoardLayout.setVerticalGroup(
            pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keyboardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKeyBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlKeyBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CayATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CayATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CayATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CayATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CayATM().setVisible(true);
            }
        });
    }
    
    public void myInits(){
        createAllScreens();
        addAllScreens();
        requestChangeScreen(ScreenEnum.SCR_WELCOME);
        showScreenAfter(ScreenEnum.SCR_PIN_INPUT);
    }
    
    private void createAllScreens(){
        scrWelcome = new WelcomScreenPanel();
        scrMenu = new MenuPanel();
        scrWithdraw=new WithdrawMoneyPanel();
        scrPinInput=new InputPinPanel();
        scrTransfer=new TransferPanel();
        scrListTransactionHistory=new TransactionHistory();
        scrWithDrawOtherAmount=new OtherAmount();
        scrCheckAmount=new CheckSTK();
        scrTransactionNotification=new TransactionNotification(true);
        scrNewPinInput=new ChangePinCard();
    }
    private void addAllScreens(){
        pnlMainScreen.setLayout(cardLayout);
        pnlMainScreen.add(ScreenEnum.SCR_WELCOME.label,scrWelcome);
        pnlMainScreen.add(ScreenEnum.SCR_TRANSACTION_NOTIFICATION.label,scrTransactionNotification);
        pnlMainScreen.add(ScreenEnum.SCR_PIN_INPUT.label,scrPinInput);     
        pnlMainScreen.add(ScreenEnum.SCR_MENU.label,scrMenu);
        pnlMainScreen.add(ScreenEnum.SCR_WITHDRAW.label,scrWithdraw);
        pnlMainScreen.add(ScreenEnum.SCR_WITHDRAW_OTHER_AMOUNT.label,scrWithDrawOtherAmount);
        pnlMainScreen.add(ScreenEnum.SCR_TRANSFER.label,scrTransfer);
        pnlMainScreen.add(ScreenEnum.SCR_LIST_TRANSACTION_HISTORY.label,scrListTransactionHistory);
        pnlMainScreen.add(ScreenEnum.SCR_NEW_PIN_INPUT.label,scrNewPinInput);
        pnlMainScreen.add(ScreenEnum.SCR_CHECK_AMOUNT.label,scrCheckAmount);
    }
    
    public static void  setCurrentScreen(ScreenEnum screen){
        switch(screen){
            case SCR_WELCOME:
                currentPanel= scrWelcome;
                break;
            case SCR_MENU:
                currentPanel=scrMenu;
                break;
            case SCR_WITHDRAW:
                currentPanel=scrWithdraw;
                break;
            case SCR_CHECK_AMOUNT:
                currentPanel=scrCheckAmount;
                break;
            case SCR_PIN_INPUT:
                currentPanel=scrPinInput;
                break;
            case SCR_TRANSFER:
                currentPanel=scrTransfer;
                break;
            case SCR_WITHDRAW_OTHER_AMOUNT:
                currentPanel=scrWithDrawOtherAmount;
                break;
            case SCR_LIST_TRANSACTION_HISTORY:
                currentPanel=scrListTransactionHistory;
                break;
            case SCR_NEW_PIN_INPUT:
                currentPanel=scrNewPinInput;
                break;
            case SCR_TRANSACTION_NOTIFICATION:
                currentPanel=scrTransactionNotification;
                break;
            case SCR_PRINT_INVOICE:
                currentPanel=scrPrintInvoice;
                break;        
        }
    }
    static Timer timer;
    static int counter=3;
    static int delay=1000;
    
    private static void showScreenAfter(ScreenEnum screen){
        ActionListener action =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter==0){
                    timer.stop();
                    requestChangeScreen(screen);
                }else{
                    counter--;
                }
            }
        };
        
        timer = new Timer(delay, action);
        timer.setInitialDelay(0);
        timer.start();
    }
    public static void updateShowTransactionResultScreen(boolean isSuccessed){
        pnlMainScreen.remove(scrTransactionNotification);
        scrTransactionNotification = new TransactionNotification(isSuccessed);
        pnlMainScreen.add(ScreenEnum.SCR_TRANSACTION_NOTIFICATION.label, scrTransactionNotification);
    }
    public static void updatePrintScreen(){
        if(scrPrintInvoice != null){
        pnlMainScreen.remove(scrPrintInvoice);
        }
        scrPrintInvoice = new PrintInvoice();
        pnlMainScreen.add(ScreenEnum.SCR_PRINT_INVOICE.label, scrPrintInvoice);
    }
    public static void updateAccountBalance(){
        scrCheckAmount = new CheckSTK();
        pnlMainScreen.add(ScreenEnum.SCR_CHECK_AMOUNT.label, scrCheckAmount);
    }
    public static void updateHistoryScreen(){
        if(scrListTransactionHistory!=null){
            pnlMainScreen.remove(scrListTransactionHistory);
        }
        scrListTransactionHistory = new TransactionHistory();
        pnlMainScreen.add(ScreenEnum.SCR_LIST_TRANSACTION_HISTORY.label, scrListTransactionHistory);
    }
    
    public static void requestChangeScreen(ScreenEnum screen){
        cardLayout.show(pnlMainScreen,screen.label);
        setCurrentScreen(screen);
    }
    
    public static void updateKeyCodeStatus(KeyboardEnum keyCode){
        currentPanel.updateKeyCodeStatus(keyCode);
    }
    
    public static boolean rutTien(long money){
        return trans.rutTien(currentCard.getIdSTK(),currentCard.getIdSTK(),money,"rutTienTaiATM");
    }
    public static boolean chuyenTien(long stkReceiver, long money){
        return trans.chuyenTien(currentCard.getIdSTK(), stkReceiver, money, "chuyenTien");
    }
    
    public static List<TransactionInfo> lichSuGD(){
        return trans.xemLichSu(currentCard.getIdSTK());
    }
    
    private static CardLayout cardLayout=new CardLayout(15,10);;
    public static IKeyCodeObserver currentPanel;
    public static Transaction trans = new Transaction();
    public static Card currentCard = new Card(1,"hello",1111,CardStatusEnum.BINH_THUONG,CardTypeEnum.MASTER,111);
    
    //Screen declaration
    private static WelcomScreenPanel scrWelcome;
    private static WithdrawMoneyPanel scrWithdraw;
    private static MenuPanel scrMenu;
    private static InputPinPanel scrPinInput;
    private static TransferPanel scrTransfer;
    private static TransactionHistory scrListTransactionHistory;
    private static OtherAmount scrWithDrawOtherAmount;
    private static CheckSTK scrCheckAmount;
    private static ChangePinCard scrNewPinInput;
    private static TransactionNotification scrTransactionNotification;
    private static PrintInvoice scrPrintInvoice;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private CayATM_GUI.KeyboardPanel keyboardPanel1;
    private javax.swing.JPanel pnlKeyBoard;
    private static javax.swing.JPanel pnlMainScreen;
    // End of variables declaration//GEN-END:variables

    
}