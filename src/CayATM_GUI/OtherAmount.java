package CayATM_GUI;

import Cay_ATM.Transaction;
import Cay_ATM.TransactionInfo;
import Enum_ATM.KeyboardEnum;
import static Enum_ATM.KeyboardEnum.TRIPLEZERO_KEY;
import Enum_ATM.ScreenEnum;
import java.util.List;

public class OtherAmount extends javax.swing.JPanel implements IKeyCodeObserver{
    public OtherAmount() {
        initComponents();
        txtThongBao.setVisible(false);
    }
    private boolean rutTien(long money){
        return CayATM.rutTien(money);
    }
    private  void thucHienRutTien(long money){
        if(rutTien(money)){
            txtThongBao.setVisible(false);
            txtAmount.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCanCel = new javax.swing.JButton();
        txtThongBao = new javax.swing.JLabel();

        jLabel1.setText("SỐ TIỀN MUỐN RÚT");

        jLabel2.setText("Thấp Nhất");

        jLabel3.setText("Cao Nhất");

        jLabel4.setText("5.000.000");

        jLabel5.setText("100.000");

        txtAmount.setForeground(new java.awt.Color(255, 0, 0));
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCanCel.setText("CANCEL");
        btnCanCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanCelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAmount)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(txtThongBao)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnCanCel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtThongBao)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCanCel))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCanCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanCelActionPerformed
        doCancelKey();
    }//GEN-LAST:event_btnCanCelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        doOkKey();
    }//GEN-LAST:event_btnOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanCel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JLabel txtThongBao;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {
        String oldText=txtAmount.getText();
        String newText;
        switch(keyCode){
            case OK_KEY -> doOkKey();
            case CANCEL_KEY -> doCancelKey();
            case CLEAR_KEY-> txtAmount.setText("");
            case TRIPLEZERO_KEY -> doTripleZeroKey(oldText);
            default -> doDefault(oldText, keyCode);
        }
    }

    private void doCancelKey() {
        txtThongBao.setVisible(false);
        txtAmount.setText("");
        changeScreen(ScreenEnum.SCR_WITHDRAW);
    }

    private void doOkKey(){
        if(Long.parseLong(txtAmount.getText())>=100000&&Long.parseLong(txtAmount.getText())<=5000000){
            long idSTK = CayATM.currentCard.getIdSTK();
            if(CayATM.trans.ktSoTien(idSTK)>=Long.parseLong(txtAmount.getText())){
                thucHienRutTien(Long.parseLong(txtAmount.getText()));
            }else{
                txtThongBao.setVisible(true);
                txtThongBao.setText("SỐ TIỀN TRONG TÀI KHOẢN HIỆN TẠI KHÔNG ĐỦ");
            }
            long currentTransactionId = Transaction.nextTransactionId;
            List<TransactionInfo> transactionInfos = CayATM.trans.xemLichSu(idSTK);
            TransactionInfo currentTransactionInfo = null;
            
            for(TransactionInfo trans: transactionInfos){
                if(trans.getIdTransaction()!= currentTransactionId-1){
                    currentTransactionInfo = trans;
                    break;
                }
            }
            
        }else{
            txtThongBao.setVisible(true);
            txtThongBao.setText("SỐ TIỀN PHẢI TRONG HẠN MỨC CHO PHÉP");
        }
    }

    private void doDefault(String oldText, KeyboardEnum keyCode) {
        String newText;
        newText=oldText+keyCode.ordinal();
        txtAmount.setText(newText);
    }

    private void doTripleZeroKey(String oldText) {
        String newText;
        newText=oldText+"000";
        txtAmount.setText(newText);
    }

    @Override
    public void changeScreen(ScreenEnum nameScreen) {
       CayATM.requestChangeScreen(nameScreen);
    }
}
