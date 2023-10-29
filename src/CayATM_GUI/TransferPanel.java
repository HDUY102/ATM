package CayATM_GUI;

import Cay_ATM.Transaction;
import Cay_ATM.TransactionInfo;
import Enum_ATM.KeyboardEnum;
import static Enum_ATM.KeyboardEnum.CANCEL_KEY;
import static Enum_ATM.KeyboardEnum.CLEAR_KEY;
import static Enum_ATM.KeyboardEnum.OK_KEY;
import static Enum_ATM.KeyboardEnum.TRIPLEZERO_KEY;
import Enum_ATM.ScreenEnum;
import java.util.List;

public class TransferPanel extends javax.swing.JPanel implements IKeyCodeObserver{

    public TransferPanel() {
        initComponents();
        myInits();
    }
    private boolean chuyenTien(long stkreceiver,long money){
        return CayATM.chuyenTien(stkreceiver, money);
    }
    private void thucHienChuyenTien(long stkreceiver, long money){
        if(chuyenTien(stkreceiver,money)){
            CayATM.updateShowTransactionResultScreen(true);
            changeScreen(ScreenEnum.SCR_TRANSACTION_NOTIFICATION);
        }else{
            CayATM.updateShowTransactionResultScreen(false);
            changeScreen(ScreenEnum.SCR_TRANSACTION_NOTIFICATION);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSTKReceiver = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        txtThongBao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        btnPrevious.setText("PREVIOUS");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel1.setText("STK Người Nhận");

        jLabel2.setText("Số Tiền");

        jLabel3.setText("CHUYỂN TIỀN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(txtThongBao))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSTKReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSTKReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txtThongBao)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        txtSTKReceiver.requestFocus();
        txtFocused=txtSTKReceiver;
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        txtSoTien.requestFocus();
        txtFocused=txtSoTien;
    }//GEN-LAST:event_btnNextActionPerformed

    private javax.swing.JTextField txtFocused;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSTKReceiver;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JLabel txtThongBao;
    // End of variables declaration//GEN-END:variables

    private void myInits(){
       txtFocused = txtSTKReceiver;
    }
    private void takeTransferTransaction(){
        long idSTK = CayATM.currentCard.getIdSTK();
        if(CayATM.trans.ktSoTien(idSTK)>=Long.parseLong(txtSoTien.getText())){
            thucHienChuyenTien(Long.parseLong(txtSTKReceiver.getText()),Long.parseLong(txtSoTien.getText()));
            long currentTransactionId = Transaction.nextTransactionId;
            List<TransactionInfo> transactionInfos = CayATM.trans.xemLichSu(idSTK);
            TransactionInfo currentTransactionInfo;
        
            for(TransactionInfo trans: transactionInfos){
                if(trans.getIdTransaction() == currentTransactionId){
                    currentTransactionInfo = trans;
                    break;
                }
            }
            txtSTKReceiver.setText("");
            txtSoTien.setText("");
        }else{
            txtThongBao.setVisible(true);
            txtThongBao.setText("SỐ TIỀN TRONG TÀI KHOẢN HIỆN TẠI KHÔNG ĐỦ");
        }
    }
    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {
        switch(keyCode){
            case CANCEL_KEY:
                doCancelKey();
                break;
            case OK_KEY:
                doOkKey();
                break;
            case CLEAR_KEY:
                doClearKey();
                break;
            case TRIPLEZERO_KEY:
                doTripleZero();
                break;
            default:
                doDefault(keyCode);
                break;
        }
    }

    private void doTripleZero() {
        String oldText= txtFocused.getText();
        txtFocused.setText(oldText+"000");
    }

    private void doCancelKey() {
        txtSTKReceiver.setText("");
        txtSoTien.setText("");
        txtThongBao.setVisible(false);
        changeScreen(ScreenEnum.SCR_MENU);
        txtSTKReceiver.requestFocus();
        txtFocused=txtSTKReceiver;
    }

    private void doOkKey(){
        takeTransferTransaction();
        txtFocused=txtSTKReceiver;
    }

    private void doClearKey() {
        txtFocused.setText("");
    }

    private void doDefault(KeyboardEnum keyCode) {
        String oldText= txtFocused.getText();
        txtFocused.setText(oldText+keyCode.label);
    }

    @Override
    public void changeScreen(ScreenEnum nameScreen) {
        CayATM.requestChangeScreen(nameScreen);
    }
}
