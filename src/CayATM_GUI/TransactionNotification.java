package CayATM_GUI;
import Enum_ATM.KeyboardEnum;
import static Enum_ATM.KeyboardEnum.OK_KEY;
import Enum_ATM.ScreenEnum;

public class TransactionNotification extends javax.swing.JPanel implements IKeyCodeObserver{
    
    public TransactionNotification(boolean isSuccessed){
        initComponents();
        myInits(isSuccessed);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMessage = new javax.swing.JLabel();
        lblOptionKeyPress = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();

        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setText("GIAO DỊCH THÀNH CÔNG !");

        lblOptionKeyPress.setText("BẠN CÓ MUỐN IN HÓA ĐƠN KHÔNG?");

        btnYes.setText("YES");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setText("NO");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblOptionKeyPress)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNo)
                            .addComponent(btnYes))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOptionKeyPress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        updateKeyCodeStatus(OK_KEY);
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        changeScreen(ScreenEnum.SCR_MENU);
    }//GEN-LAST:event_btnNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblOptionKeyPress;
    // End of variables declaration//GEN-END:variables
    
    private void myInits(boolean isSuccessed){
        lblOptionKeyPress.setVisible(isSuccessed);
        btnNo.setVisible(isSuccessed);
        btnYes.setVisible(isSuccessed);
        if(!isSuccessed){
            lblMessage.setText("Giao Dịch Không Thành Công");
        }else{
           lblMessage.setText("Giao Dịch Thành Công");
        }
    }
    
    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {
        switch(keyCode){
            case CANCEL_KEY -> changeScreen(ScreenEnum.SCR_MENU);
            case OK_KEY -> {
                CayATM.updatePrintScreen();
                changeScreen(ScreenEnum.SCR_PRINT_INVOICE);
                }
        }
    }

    @Override
    public void changeScreen(ScreenEnum nameScreen) {
        CayATM.requestChangeScreen(nameScreen);
    }

    
}
