package CayATM_GUI;

import Cay_ATM.TransactionInfo;
import Enum_ATM.KeyboardEnum;
import Enum_ATM.ScreenEnum;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TransactionHistory extends javax.swing.JPanel implements IKeyCodeObserver {

    public TransactionHistory() {
        initComponents();
        myInits();
    }

    private static List<TransactionInfo> getHistory() {
        return CayATM.lichSuGD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();

        jLabel1.setText("LỊCH SỬ GIAO DỊCH");

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Giao Dịch ", "Ngày Giao Dịch", "Số Tiền Giao Dịch", "Nội Dung"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHistory;
    // End of variables declaration//GEN-END:variables

    private void myInits() {
        String[] columns = {"Mã", "Ngày", "Tiền", "ND"};
//        DefaultTableModel tblModel=new DefaultTableModel(columns,0);
        DefaultTableModel tblModel=new DefaultTableModel();
        tblModel.setColumnIdentifiers(columns);
        tblHistory.setModel(tblModel);
        getDataTransactionHistory();
//        DefaultTableModel tblModel1=new DefaultTableModel(Model,columns);
//        TableModel tbl=tblHistory.getModel();
//        DefaultTableModel dtmHistory = (DefaultTableModel) tbl;
//        tblHistory.setModel(dtmHistory);
//        JScrollPane sp= new JScrollPane(tblHistory);
//        sp.setBounds(0, 0, 490, 250);
//        this.add(sp);
        tblModel.addTableModelListener(tblHistory);
    }
    
    private void getDataTransactionHistory() {
        String data[]=new String[4];
        DefaultTableModel tbl = new DefaultTableModel();
        long idSTK = CayATM.currentCard.getIdSTK();
        List<TransactionInfo> transactionInfos = CayATM.trans.xemLichSu(idSTK);
        // Tiến hành đổ dữ liệu vào mảng data
        if (transactionInfos != null) {
            for (int i = 0; i < transactionInfos.size(); i++) {
                TransactionInfo transInfo = transactionInfos.get(i);
                data[0] = ""+transInfo.getIdTransaction();
                data[1] = ""+transInfo.getNgayGD().toString();
                data[2] = ""+transInfo.getSoTienGD();
                data[3] = ""+transInfo.getNoiDung();
                
                tbl.addRow(data);
            }
            tblHistory.setModel(tbl);
        }
    }

//    private String[][] getDataTransactionHistory() {
//        String data[][]=null;
//        long idSTK = CayATM.currentCard.getIdSTK();
//        List<TransactionInfo> transactionInfos = CayATM.trans.xemLichSu(idSTK);
//        // Tiến hành đổ dữ liệu vào mảng data
//        if (transactionInfos != null) {
//            TableModel tbl=tblHistory.getModel();
//            for (int i = 0; i < transactionInfos.size(); i++) {
//                TransactionInfo transInfo = transactionInfos.get(i);
//                data[i][0] = ""+transInfo.getIdTransaction();
//                data[i][1] = ""+transInfo.getNgayGD().toString();
//                data[i][2] = ""+transInfo.getSoTienGD();
//                data[i][3] = ""+transInfo.getNoiDung();
//                
//                tbl.addTableModelListener(data);
//            }
////            tblHistory.setModel(model);
//        }
//        return data;
//    }

    @Override
    public void updateKeyCodeStatus(KeyboardEnum keyCode) {
        switch (keyCode) {
            case CANCEL_KEY ->
                changeScreen(ScreenEnum.SCR_MENU);
        }
    }

    @Override
    public void changeScreen(ScreenEnum nameScreen) {
        CayATM.requestChangeScreen(nameScreen);
    }
}
