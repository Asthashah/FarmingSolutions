/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRolePanel;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Enterprise.Enterprise;
import Business.FarmerData.Farmer;
import Business.Network.Network;
import Business.Organization.ExpertOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorRolePanel.DoctorExpert;
import UserInterface.ExpertRolePanel.FarmerDetailsInformationJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class FarmerLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerLoginPanel
     */
    JPanel container;
    EcoSystem system;
    
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    private Farmer farmer;
    private Person person;
    private UserAccount account;
    

    public FarmerLoginPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.container = container;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = business;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsoilProfile = new javax.swing.JButton();
        weatherBtn = new javax.swing.JButton();
        btnConsultAgricul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultDoctor1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsoilProfile.setBackground(new java.awt.Color(0, 153, 153));
        btnsoilProfile.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnsoilProfile.setText("Soil Profile ");
        btnsoilProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsoilProfileActionPerformed(evt);
            }
        });
        add(btnsoilProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 530, 60));

        weatherBtn.setBackground(new java.awt.Color(0, 153, 153));
        weatherBtn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        weatherBtn.setText("Weather Information");
        weatherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weatherBtnActionPerformed(evt);
            }
        });
        add(weatherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 530, 60));

        btnConsultAgricul.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultAgricul.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnConsultAgricul.setText("Consult  Agricultural Expert");
        btnConsultAgricul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultAgriculActionPerformed(evt);
            }
        });
        add(btnConsultAgricul, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 530, 60));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setText("Farmer Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 530, 70));

        btnConsultDoctor1.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultDoctor1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnConsultDoctor1.setText(" Consult Doctor");
        btnConsultDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultDoctor1ActionPerformed(evt);
            }
        });
        add(btnConsultDoctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 530, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 2040, 1490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnsoilProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsoilProfileActionPerformed
        // TODO add your handling code here:
        FarmerDetailsInformationJPanel manageEnterpriseAdminJPanel = new FarmerDetailsInformationJPanel(container,account, organization,enterprise,system,farmer);
        container.add("FarmerDetailsInformationJPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnsoilProfileActionPerformed

    private void weatherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weatherBtnActionPerformed
        // TODO add your handling code here:
        
        WeatherDetailsJPanel weatherPanel = new WeatherDetailsJPanel(container, account, organization, enterprise);
        container.add("WeatherDetailsJPanel", weatherPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
       
    }//GEN-LAST:event_weatherBtnActionPerformed

    private void btnConsultAgriculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultAgriculActionPerformed
        // TODO add your handling code here:
         FarmerRequestPanel manageEnterpriseAdminJPanel = new FarmerRequestPanel(container,account,organization,enterprise,system,farmer);
        container.add("FarmerRequestPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnConsultAgriculActionPerformed

    private void btnConsultDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultDoctor1ActionPerformed
        // TODO add your handling code here:
         FarmerDocRequestPanel doctorpanel = new FarmerDocRequestPanel(container,account, organization,enterprise, network, system);
        container.add("FarmerDocRequestPanel", doctorpanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnConsultDoctor1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultAgricul;
    private javax.swing.JButton btnConsultDoctor1;
    private javax.swing.JButton btnsoilProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton weatherBtn;
    // End of variables declaration//GEN-END:variables
}
