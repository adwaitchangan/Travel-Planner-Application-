/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.OrganizationsManage;

import Model.Hotel.Hotel;
import Model.LocalBusiness.LocalBusiness;
import Model.Organizations.Organization;
import Model.TransportAgency.TransportAgency;
import Model.Travel;
import Model.TravelAgency.TravelAgency;
import static Utilities.Validations.validateEmail;
import static Utilities.Validations.validateName;
import static Utilities.Validations.validatePassword;
import static Utilities.Validations.validatePhone;
import static Utilities.Validations.validateUsername;
import com.itextpdf.text.log.Logger;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class AddOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private Travel travel;
    private String org;
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon logoImage;

    public AddOrganizationJPanel(JPanel userProcessContainer, Travel travel, String org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travel = travel;
        this.org = org;
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        if (org.equals("Transport Agency")) {
            model.addElement("Road");
            model.addElement("Rail");
            model.addElement("Sea");
            model.addElement("Air");
        } else if (org.equals("Government")) {
            model.addElement("Hotel");
            model.addElement("Travel Agency");
            model.addElement("Local Business");
        }
        optionsType.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrgHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        txtHq = new javax.swing.JTextField();
        lblHq = new javax.swing.JLabel();
        txtManagerName = new javax.swing.JTextField();
        lblManagerName = new javax.swing.JLabel();
        txtManagerEmail = new javax.swing.JTextField();
        lblManagerEmail = new javax.swing.JLabel();
        txtManagerContact = new javax.swing.JTextField();
        lblManagerContact = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        optionsType = new javax.swing.JComboBox<>();
        imgLogo = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblOrgHeader.setText("Add Organization type:");

        lblName.setText("Name:");

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblDescription.setText("Description:");

        lblHq.setText("Location Headquarters:");

        lblManagerName.setText("Manager Name:");

        lblManagerEmail.setText("Manager Email:");

        lblManagerContact.setText("Manager Contact:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblLogo.setText("Logo:");

        lblType.setText("Type:");

        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAttach.setText("Attach");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblManagerEmail)
                        .addGap(24, 24, 24)
                        .addComponent(txtManagerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblManagerName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHq)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHq, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrgHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName)
                                            .addComponent(lblUsername))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDescription)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPassword)
                                            .addGap(24, 24, 24)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblType)
                            .addComponent(lblManagerContact))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtManagerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(optionsType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove))
                    .addComponent(lblLogo)
                    .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrgHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblName))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescription)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHq)
                            .addComponent(txtHq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManagerName)
                            .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManagerEmail)
                            .addComponent(txtManagerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManagerContact)
                            .addComponent(txtManagerContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType)
                            .addComponent(optionsType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAttach)
                            .addComponent(btnRemove))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            URL url;
            try {
                url = file.toURI().toURL();
                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                imgLogo.setIcon(logoImage);
            } catch (MalformedURLException ex) {
                java.util.logging.Logger.getLogger(this.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        logoImage = null;
        imgLogo.setIcon(logoImage);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String oName = txtName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String description = txtDescription.getText();
        String headquarters = txtHq.getText();
        String mName = txtManagerName.getText();
        String mEmail = txtManagerEmail.getText();
        String mContact = txtManagerContact.getText();
        String type = optionsType.getSelectedItem().toString();

        if (oName.isEmpty() || username.isEmpty() || password.isEmpty() || description.isEmpty() || headquarters.isEmpty() || mName.isEmpty() || mEmail.isEmpty() || mContact.isEmpty() || type.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please check if all fields are filled before processing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (validateName(mName)) {
            JOptionPane.showMessageDialog(this, "Name should be between 5 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (validateUsername(username)) {
            JOptionPane.showMessageDialog(this, "Username should be between 5 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (validatePhone(mContact)) {
            JOptionPane.showMessageDialog(this, "Please verify if Phone number is in correct format \"(000) 000-0000\"", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (validateEmail(mEmail)) {
            JOptionPane.showMessageDialog(this, "Please verify if email is in correct format \"youremail@xxx.xxx\"", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (validatePassword(password)) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Map<String, String> loginCredentials = new HashMap<>();
        loginCredentials.put(username, password);

        if (type.equals("Hotel")) {
            for (Hotel hotel : travel.getHotelDirectory().getHotelList()) {
                if (hotel.getBusinessName().equals(oName) && hotel.getType().equals(type)) {
                    JOptionPane.showMessageDialog(this, "Hotel Name already exits in this type. Please try with a new one.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            travel.getHotelDirectory().addHodel(oName, description, loginCredentials, headquarters, mName, mContact, mEmail, type, logoImage);
        }

        if (type.equals("Local Business")) {
            for (LocalBusiness localBusiness : travel.getLocalBusinessDirectory().getLocalBusinessList()) {
                if (localBusiness.getBusinessName().equals(oName) && localBusiness.getType().equals(type)) {
                    JOptionPane.showMessageDialog(this, "Local Business Name already exits in this type. Please try with a new one.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            travel.getLocalBusinessDirectory().addLocalBusiness(oName, description, loginCredentials, headquarters, mName, mContact, mEmail, type, logoImage);
        }

        if (type.equals("Air")) {
            for (TransportAgency transportAgency : travel.getTrnsportAgencyDirectory().getTransporAgencyList()) {
                if (transportAgency.getBusinessName().equals(oName) && transportAgency.getType().equals(type)) {
                    JOptionPane.showMessageDialog(this, "Transport Agency Name already exits in this type. Please try with a new one.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            travel.getTrnsportAgencyDirectory().addTransporAgency(oName, description, loginCredentials, headquarters, mName, mContact, mEmail, type, logoImage, "Air");
        }

        if (type.equals("Road")) {
            for (TransportAgency transportAgency : travel.getTrnsportAgencyDirectory().getTransporAgencyList()) {
                if (transportAgency.getBusinessName().equals(oName) && transportAgency.getType().equals(type)) {
                    JOptionPane.showMessageDialog(this, "Transport Agency Name already exits in this type. Please try with a new one.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            travel.getTrnsportAgencyDirectory().addTransporAgency(oName, description, loginCredentials, headquarters, mName, mContact, mEmail, type, logoImage, "Road");
        }

        if (type.equals("Rail")) {
            for (TransportAgency transportAgency : travel.getTrnsportAgencyDirectory().getTransporAgencyList()) {
                if (transportAgency.getBusinessName().equals(oName) && transportAgency.getType().equals(type)) {
                    JOptionPane.showMessageDialog(this, "Transport Agency Name already exits in this type. Please try with a new one.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            travel.getTrnsportAgencyDirectory().addTransporAgency(oName, description, loginCredentials, headquarters, mName, mContact, mEmail, type, logoImage, "Rail");
        }

        if (type.equals("Sea")) {
            for (TransportAgency transportAgency : travel.getTrnsportAgencyDirectory().getTransporAgencyList()) {
                if (transportAgency.getBusinessName().equals(oName) && transportAgency.getType().equals(type)) {
                    JOptionPane.showMessageDialog(this, "Transport Agency Name already exits in this type. Please try with a new one.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            travel.getTrnsportAgencyDirectory().addTransporAgency(oName, description, loginCredentials, headquarters, mName, mContact, mEmail, type, logoImage, "Sea");
        }

        if (type.equals("Travel Agency")) {
            for (TravelAgency travelAgency : travel.getTravelAgencyDirectory().getTravelAgencyList()) {
                if (travelAgency.getBusinessName().equals(oName) && travelAgency.getType().equals(type)) {
                    JOptionPane.showMessageDialog(this, "Travel Agency Name already exits in this type. Please try with a new one.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            travel.getTravelAgencyDirectory().addTravelAgency(oName, description, loginCredentials, headquarters, mName, mContact, mEmail, type, logoImage);
        }        
        
        JOptionPane.showMessageDialog(this, "Organization registered successfuly!");
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtDescription.setText("");
        txtHq.setText("");
        txtManagerName.setText("");
        txtManagerEmail.setText("");
        txtManagerContact.setText("");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblHq;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblManagerContact;
    private javax.swing.JLabel lblManagerEmail;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrgHeader;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JComboBox<String> optionsType;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtHq;
    private javax.swing.JTextField txtManagerContact;
    private javax.swing.JTextField txtManagerEmail;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
