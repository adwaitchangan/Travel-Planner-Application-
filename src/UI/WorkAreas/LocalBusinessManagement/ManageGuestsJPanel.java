/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.LocalBusinessManagement;

import Model.LocalBusiness.Activity;
import Model.LocalBusiness.Guest;
import Model.LocalBusiness.LocalBusiness;
import Model.Roles.Customer;
import Model.Travel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samik
 */
public class ManageGuestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageGuestJPanel
     */
    private JPanel userProcessContainer;
    private Travel travel;
    private LocalBusiness localBusiness;

    ManageGuestsJPanel(JPanel userProcessContainer, Travel travel, LocalBusiness localBusiness) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travel = travel;
        this.localBusiness = localBusiness;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblGuests.getModel();
        dtm.setRowCount(0);
        for (Customer c : travel.getCustomerDirectory().getCustomerList()) {
            for(Activity a : c.getLocalActivity()){
                if(a.getLb().getBusinessName().equals(localBusiness.getBusinessName())){
                    Object[] row = new Object[4];
                    row[0] = c.getName();
                    row[1] = a.getDate();
                    row[2] = a.getLa().getType();
                    row[3] = a.getLa().getDescription();
                    dtm.addRow(row);
                }
                
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblGuests = new javax.swing.JTable();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblGuests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Booking Date", "Activity Type", "Activity Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblGuests);
        if (tblGuests.getColumnModel().getColumnCount() > 0) {
            tblGuests.getColumnModel().getColumn(0).setResizable(false);
            tblGuests.getColumnModel().getColumn(1).setResizable(false);
            tblGuests.getColumnModel().getColumn(2).setResizable(false);
            tblGuests.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(714, Short.MAX_VALUE)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(533, Short.MAX_VALUE)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGuests;
    // End of variables declaration//GEN-END:variables
}
