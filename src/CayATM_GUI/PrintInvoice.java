
package CayATM_GUI;

import Cay_ATM.Transaction;
import Cay_ATM.TransactionInfo;
import Enum_ATM.KeyboardEnum;
import Enum_ATM.ScreenEnum;
import java.util.List;

public class PrintInvoice extends javax.swing.JPanel implements IKeyCodeObserver{

    public PrintInvoice() {
        initComponents();
        myInit();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMaGD = new javax.swing.JLabel();
        lblSTK = new javax.swing.JLabel();
        lblTienGD = new javax.swing.JLabel();
        lblSoDu = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        lblSoThe = new javax.swing.JLabel();
        lblNoiDung = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("THÔNG TIN HÓA ĐƠN");

        jLabel2.setText("Mã Giao Dịch:");

        jLabel3.setText("Số Tài Khoản:");

        jLabel4.setText("Số Tiền Giao Dịch:");

        jLabel5.setText("Ngày Giao Dịch:");

        jLabel6.setText("Nội Dung:");

        jLabel7.setText("Số Dư:");

        jLabel8.setText("Số Thẻ:");

        lblMaGD.setText("jLabel9");

        lblSTK.setText("jLabel10");

        lblTienGD.setText("jLabel11");

        lblSoDu.setText("jLabel12");

        lblNgay.setText("jLabel13");

        lblSoThe.setText("jLabel14");

        lblNoiDung.setText("jLabel15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSTK)
                            .addComponent(lblMaGD))
                        .addGap(7, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNoiDung)
                            .addComponent(lblSoThe)
                            .addComponent(lblNgay))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblTienGD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(lblMaGD)
                    .addComponent(lblNgay))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(lblSTK)
                    .addComponent(lblSoThe))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(lblTienGD)
                    .addComponent(lblNoiDung))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblSoDu))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblMaGD;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblNoiDung;
    private javax.swing.JLabel lblSTK;
    private javax.swing.JLabel lblSoDu;
    private javax.swing.JLabel lblSoThe;
    private javax.swing.JLabel lblTienGD;
    // End of variables declaration//GEN-END:variables

    private void myInit(){
        //b1: lấy id transaction hiện tại
        long currentTransactionId = Transaction.nextTransactionId;
        //b2: Lấy stk hiện tại
        long idSTK = CayATM.currentCard.getIdSTK();
        //b3: lấy thông tin transactioninfo theo stk hiện tại
        List<TransactionInfo> transactionInfos = CayATM.trans.xemLichSu(idSTK);
        //b4: Lấy transactionInfo theo currentTransactionId
        TransactionInfo currentTransactionInfo = null; 
        
        for(TransactionInfo trans: transactionInfos){
            if(trans.getIdTransaction() == currentTransactionId){
                currentTransactionInfo = trans;
                break;
            }
        }
        lblSTK.setText(""+idSTK);
        lblSoThe.setText(""+CayATM.currentCard.getIdCard());
        lblMaGD.setText(""+currentTransactionId);
        lblNgay.setText(currentTransactionInfo.getNgayGD().toString());
        lblTienGD.setText(""+Math.round(currentTransactionInfo.getSoTienGD()));
        lblNoiDung.setText(""+currentTransactionInfo.getNoiDung());
        lblSoDu.setText(""+Math.round(CayATM.trans.ktSoTien(idSTK)));
    }
    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {
        switch(keyCode){
            case CANCEL_KEY->changeScreen(ScreenEnum.SCR_MENU);
        }
    }
    @Override
    public void changeScreen(ScreenEnum nameScreen) {
        CayATM.requestChangeScreen(nameScreen);
    }
}
