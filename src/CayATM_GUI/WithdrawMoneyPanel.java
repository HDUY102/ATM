package CayATM_GUI;

import Enum_ATM.KeyboardEnum;
import Enum_ATM.ScreenEnum;

public class WithdrawMoneyPanel extends javax.swing.JPanel implements IKeyCodeObserver{

    public WithdrawMoneyPanel() {
        initComponents();
    }
    private boolean rutTien(long money){
        return CayATM.rutTien(money);
    }
    private  void thucHienRutTien(long money){
        if(rutTien(money)){
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

        btn100K = new javax.swing.JButton();
        btn1trieu = new javax.swing.JButton();
        btn2trieu = new javax.swing.JButton();
        btnAmountKhac = new javax.swing.JButton();
        btn500K = new javax.swing.JButton();
        btn200K = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(576, 321));

        btn100K.setText("100.000");
        btn100K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100KActionPerformed(evt);
            }
        });

        btn1trieu.setText("1.000.000");
        btn1trieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1trieuActionPerformed(evt);
            }
        });

        btn2trieu.setText("2.000.000");
        btn2trieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2trieuActionPerformed(evt);
            }
        });

        btnAmountKhac.setText("SỐ KHÁC");
        btnAmountKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmountKhacActionPerformed(evt);
            }
        });

        btn500K.setText("500.000");
        btn500K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500KActionPerformed(evt);
            }
        });

        btn200K.setText("200.000");
        btn200K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200KActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn500K, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn200K, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100K, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAmountKhac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2trieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1trieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1trieu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100K, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2trieu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn200K, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAmountKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn500K, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn100KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100KActionPerformed
        thucHienRutTien(100000);
    }//GEN-LAST:event_btn100KActionPerformed

    private void btn1trieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1trieuActionPerformed
        thucHienRutTien(1000000);
    }//GEN-LAST:event_btn1trieuActionPerformed

    private void btn2trieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2trieuActionPerformed
        thucHienRutTien(2000000);
    }//GEN-LAST:event_btn2trieuActionPerformed

    private void btnAmountKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmountKhacActionPerformed
        changeScreen(ScreenEnum.SCR_WITHDRAW_OTHER_AMOUNT);
    }//GEN-LAST:event_btnAmountKhacActionPerformed

    private void btn500KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500KActionPerformed
        thucHienRutTien(500000);
    }//GEN-LAST:event_btn500KActionPerformed

    private void btn200KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200KActionPerformed
        thucHienRutTien(200000);
    }//GEN-LAST:event_btn200KActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100K;
    private javax.swing.JButton btn1trieu;
    private javax.swing.JButton btn200K;
    private javax.swing.JButton btn2trieu;
    private javax.swing.JButton btn500K;
    private javax.swing.JButton btnAmountKhac;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {
        switch(keyCode){
            case CANCEL_KEY -> changeScreen(ScreenEnum.SCR_MENU);
        }
    }

    @Override
    public void changeScreen(ScreenEnum nameScreen) {
        CayATM.requestChangeScreen(nameScreen);
    }
}
