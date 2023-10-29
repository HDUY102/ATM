package CayATM_GUI;

import Enum_ATM.KeyboardEnum;
import Enum_ATM.ScreenEnum;

public class InputPinPanel extends javax.swing.JPanel implements IKeyCodeObserver{

    public InputPinPanel() {
        initComponents();
        lblMessage.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtInputPin = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("INPUT PIN");

        txtInputPin.setBackground(new java.awt.Color(204, 255, 204));
        txtInputPin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 51, 51));
        lblMessage.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtInputPin, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtInputPin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblMessage)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextField txtInputPin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {
        switch (keyCode) {
            case TRIPLEZERO_KEY:
                doTripleZeroKey();
                break;
            case CANCEL_KEY:
                changeScreen(ScreenEnum.SCR_WELCOME);
                break;
            case CLEAR_KEY: 
                txtInputPin.setText("");
                break;
            case OK_KEY:
                doOkKey();
                break;
            default:
                doDefault(keyCode);
                break;
        }
    }

    private void doTripleZeroKey() {
        String newText;
        String oldText=txtInputPin.getText();
        newText=oldText+"000";
        txtInputPin.setText(newText);
    }

    private void doDefault(KeyboardEnum keyCode) {
        String oldText;
        oldText=txtInputPin.getText().trim();
        txtInputPin.setText(oldText+keyCode.label);
    }

    private void doOkKey() throws NumberFormatException {
        String oldText=txtInputPin.getText();
        int length=oldText.length();
        if(length>0){
            long pinCodeInput =Long.parseLong(txtInputPin.getText());
            long pinCodeInCard= CayATM.currentCard.getPinCard();
            if(pinCodeInput==pinCodeInCard){
                changeScreen(ScreenEnum.SCR_MENU);
            }else
                lblMessage.setVisible(true);
                lblMessage.setText("Mã Pin sai, hãy nhập lại");
        }
    }
    public void changeScreen(ScreenEnum nameScreen){
        CayATM.requestChangeScreen(nameScreen);
    }
}
