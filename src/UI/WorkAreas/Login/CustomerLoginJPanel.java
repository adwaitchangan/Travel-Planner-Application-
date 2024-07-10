package UI.WorkAreas.Login;

import Model.Roles.Customer;
import Model.Travel;
import UI.WorkAreas.Customer.CustomerJPanel;
import UI.WorkAreas.Register.RegisterJPanel;
import UI.WorkAreas.Login.ForgotPasswordJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class CustomerLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerLoginJPanel
     */
    private JPanel userProcessContainer;
    private Travel travel;
    public CustomerLoginJPanel(JPanel userProcessContainer, Travel travel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travel = travel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNotACustomer = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnForgot = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNotACustomer.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnNotACustomer.setText("Not a Customer?");
        btnNotACustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotACustomerActionPerformed(evt);
            }
        });
        add(btnNotACustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, -1, 46));

        lblLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblLogin.setText("Login");
        add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 135, 60));

        txtUserName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 230, 40));

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 120, 27));

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 120, -1));

        btnRegister.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, -1, 40));

        btnLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, -1, 40));

        txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 230, 40));

        btnForgot.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnForgot.setText("Forgot Password");
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });
        add(btnForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNotACustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotACustomerActionPerformed
        // TODO add your handling code here:
        AdminLoginJPanel panel = new AdminLoginJPanel(userProcessContainer, travel);
        userProcessContainer.add("AdminLoginJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNotACustomerActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please check if all fields are filled before processing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (Customer customer : travel.getCustomerDirectory().getCustomerList()) {

            if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())) {
                CustomerJPanel panel = new CustomerJPanel(userProcessContainer, travel, customer);
                userProcessContainer.add("CustomerJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Incorrect Username or Password.", "Credentials Error", JOptionPane.ERROR_MESSAGE);
        txtUserName.setText("");
        txtPassword.setText("");

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        RegisterJPanel panel = new RegisterJPanel(userProcessContainer, travel);
        userProcessContainer.add("RegisterJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        // TODO add your handling code here:
        String username = txtUserName.getText();
        ForgotPasswordJPanel panel = new ForgotPasswordJPanel(userProcessContainer, travel, username);
        userProcessContainer.add("ForgotPasswordJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnForgotActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNotACustomer;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
