/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRoles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class AdminRoleJPanel extends javax.swing.JPanel {

     JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    /**
     * Creates new form AdminRoleJPanel
     */
    public AdminRoleJPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         
        initComponents();
        this.userProcessContainer = container;
        this.enterprise = enterprise;
        this.system = business;
        enterpriseNameTxt.setText(enterprise.getName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enterpriseNameTxt = new javax.swing.JLabel();
        mngOrgBtn = new javax.swing.JButton();
        mngPerson = new javax.swing.JButton();
        mngUserBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("Manage Enterprise");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setText("Enterprise :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 160, 30));

        enterpriseNameTxt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        enterpriseNameTxt.setText("<Enterprise Name>");
        add(enterpriseNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 200, 40));

        mngOrgBtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        mngOrgBtn.setText("Manage Organisation");
        mngOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrgBtnActionPerformed(evt);
            }
        });
        add(mngOrgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 300, 50));

        mngPerson.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        mngPerson.setText("Manage Persons");
        mngPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngPersonActionPerformed(evt);
            }
        });
        add(mngPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 300, 50));

        mngUserBtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        mngUserBtn.setText("Manage UserAccounts");
        mngUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserBtnActionPerformed(evt);
            }
        });
        add(mngUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 300, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2040, 1490));
    }// </editor-fold>//GEN-END:initComponents

    private void mngUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserBtnActionPerformed
         // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise,this.system);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngUserBtnActionPerformed

    private void mngOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrgBtnActionPerformed
        // TODO add your handling code here:
//         ManageOrganizationJPanel_2 manageOrganizationJPanel = new ManageOrganizationJPanel_2();
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    
    }//GEN-LAST:event_mngOrgBtnActionPerformed

    private void mngPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngPersonActionPerformed
        // TODO add your handling code here:
        
        ManagePersonJPanel manageEmployeeJPanel = new ManagePersonJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mngOrgBtn;
    private javax.swing.JButton mngPerson;
    private javax.swing.JButton mngUserBtn;
    // End of variables declaration//GEN-END:variables
}
