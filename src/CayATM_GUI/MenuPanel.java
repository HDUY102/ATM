
package CayATM_GUI;

import Enum_ATM.KeyboardEnum;
import Enum_ATM.ScreenEnum;

public class MenuPanel extends javax.swing.JPanel implements IKeyCodeObserver{

    public MenuPanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRutTien = new javax.swing.JButton();
        btnXemTK = new javax.swing.JButton();
        btnLichSu = new javax.swing.JButton();
        btnChuyenTien = new javax.swing.JButton();
        btnDoiPin = new javax.swing.JButton();
        btnInLichSuGD = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        btnRutTien.setText("RÚT TIỀN");
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        btnXemTK.setText("XEM TÀI KHOẢN");
        btnXemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemTKActionPerformed(evt);
            }
        });

        btnLichSu.setText("LỊCH SỬ GIAO DỊCH");
        btnLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuActionPerformed(evt);
            }
        });

        btnChuyenTien.setText("CHUYỂN TIỀN");
        btnChuyenTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenTienActionPerformed(evt);
            }
        });

        btnDoiPin.setText("ĐỔI MÃ PIN");
        btnDoiPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiPinActionPerformed(evt);
            }
        });

        btnInLichSuGD.setText("IN LỊCH SỬ GIAO DỊCH");
        btnInLichSuGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInLichSuGDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInLichSuGD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoiPin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLichSu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXemTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenTien, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoiPin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInLichSuGD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        changeScreen(ScreenEnum.SCR_WITHDRAW);
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void btnXemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemTKActionPerformed
        changeScreen(ScreenEnum.SCR_CHECK_AMOUNT);
    }//GEN-LAST:event_btnXemTKActionPerformed

    private void btnLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuActionPerformed
        changeScreen(ScreenEnum.SCR_LIST_TRANSACTION_HISTORY);
    }//GEN-LAST:event_btnLichSuActionPerformed

    private void btnChuyenTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenTienActionPerformed
        changeScreen(ScreenEnum.SCR_TRANSFER);
    }//GEN-LAST:event_btnChuyenTienActionPerformed

    private void btnDoiPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiPinActionPerformed
        changeScreen(ScreenEnum.SCR_NEW_PIN_INPUT);
    }//GEN-LAST:event_btnDoiPinActionPerformed

    private void btnInLichSuGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInLichSuGDActionPerformed
        changeScreen(ScreenEnum.SCR_LIST_TRANSACTION_HISTORY);
    }//GEN-LAST:event_btnInLichSuGDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenTien;
    private javax.swing.JButton btnDoiPin;
    private javax.swing.JButton btnInLichSuGD;
    private javax.swing.JButton btnLichSu;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JButton btnXemTK;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {    
    }

    @Override
    public void changeScreen(ScreenEnum nameScreen) {
        CayATM.requestChangeScreen(nameScreen);
    }

    
}
