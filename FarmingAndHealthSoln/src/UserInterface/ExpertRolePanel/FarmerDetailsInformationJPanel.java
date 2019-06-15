/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ExpertRolePanel;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Enterprise.Enterprise;
import Business.FarmerData.Farmer;
import Business.FarmerData.SoilData;
import Business.Organization.ExpertOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aastha
 */
public class FarmerDetailsInformationJPanel extends javax.swing.JPanel {

    JPanel container;
    EcoSystem system;
    private Organization organization;
    private Enterprise enterprise;
    private Farmer farmer;
    private Person person;
    private UserAccount account;
    private SoilData soilData1;

    
   public FarmerDetailsInformationJPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Farmer farmer) {
      initComponents();

    this.container = container;
    this.account = account;
    this.organization = organization;
    this.enterprise = enterprise;
    this.system = system;
  lblFirstName.setText(this.account.getPerson().getFirstName());
  lblLastName.setText(this.account.getPerson().getLastName());
  lblSsn.setText(this.account.getPerson().getSSN());
  if (account.getPerson().getFarmer().getSoilDataList() == null){
      
      
  }else{
      
      
//      this.txtCropPlanted.setText(account.getPerson().getFarmer().getSoilDataList().get(0).getCropPlanted());
//      this.txtTechinology.setText(account.getPerson().getFarmer().getSoilDataList().get(0).getTechnologyUsed());
//      this.cbFertiliserType.setSelectedItem(account.getPerson().getFarmer().getSoilDataList().get(0).getFertiliserType());
//      this.cbtypeofLand.setSelectedItem(account.getPerson().getFarmer().getSoilDataList().get(0).getTypeOfLand());
//     // this.txtsoilScore.setText(account.getPerson().getFarmer().getSoilDataList().get(0).getSoilScore());
//      this.txtsoilScore.setText(String.valueOf(account.getPerson().getFarmer().getSoilDataList().get(0).getSoilScore()));
//        soildata.setMonthlyincome(Double.parseDouble("2500"))
//        soildata.setTypeOfLand(this.cbtypeofLand.getSelectedItem().toString());
//        soildata.setTechnologyUsed(txtTechinology.getText());
//        soildata.setIsSoilScore(cbSoilScore.getSelectedItem().toString());
      
      
  }
 
    }

    FarmerDetailsInformationJPanel(JPanel container, UserAccount account, ExpertOrganization organization, Enterprise enterprise, EcoSystem system) {
      
         initComponents();

    this.container = container;
    this.account = account;
    this.organization = organization;
    this.enterprise = enterprise;
    this.system = system;
  lblFirstName.setText(this.account.getPerson().getFirstName());
  lblLastName.setText(this.account.getPerson().getLastName());
  lblSsn.setText(this.account.getPerson().getSSN());
   if (account.getPerson().getFarmer().getSoilDataList() == null){
      
      
  }else{
      
      
      this.txtCropPlanted.setText(account.getPerson().getFarmer().getSoilDataList().get(0).getCropPlanted());
      this.txtTechinology.setText(account.getPerson().getFarmer().getSoilDataList().get(0).getTechnologyUsed());
      this.cbFertiliserType.setSelectedItem(account.getPerson().getFarmer().getSoilDataList().get(0).getFertiliserType());
      this.cbtypeofLand.setSelectedItem(account.getPerson().getFarmer().getSoilDataList().get(0).getTypeOfLand());
     this.txtsoilScore.setText(String.valueOf(account.getPerson().getFarmer().getSoilDataList().get(0).getSoilScore()));

      
  }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbtypeofLand = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCropPlanted = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cbFertiliserType = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtTechinology = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        cbSoilScore = new javax.swing.JComboBox<>();
        txtsoilScore = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Farmer Details Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 30));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("First Name : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 140, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Last Name : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setText("Farmer SSN : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        lblFirstName.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblFirstName.setOpaque(true);
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 590, 50));

        lblSsn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblSsn.setOpaque(true);
        add(lblSsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 590, 50));

        lblLastName.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblLastName.setOpaque(true);
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 590, 50));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel9.setText("Type Of Land : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        cbtypeofLand.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        cbtypeofLand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arable Land", "Permanent CropLand", "Grasslands" }));
        add(cbtypeofLand, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 580, 50));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel10.setText("Crop Planted : ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        txtCropPlanted.setBackground(new java.awt.Color(240, 240, 240));
        txtCropPlanted.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtCropPlanted.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCropPlanted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCropPlantedActionPerformed(evt);
            }
        });
        add(txtCropPlanted, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 590, 50));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 580, 10));

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel11.setText("Fertiliser Type : ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        cbFertiliserType.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        cbFertiliserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organic", "Inorganic" }));
        add(cbFertiliserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 590, 50));

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel12.setText("Technology Used If : ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        txtTechinology.setBackground(new java.awt.Color(240, 240, 240));
        txtTechinology.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtTechinology.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtTechinology, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 590, 40));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 590, 10));

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel13.setText("Soil Score if Calculated : ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, -1, 40));

        cbSoilScore.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        cbSoilScore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "NO", "YES" }));
        cbSoilScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSoilScoreActionPerformed(evt);
            }
        });
        add(cbSoilScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 630, 220, 40));

        txtsoilScore.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        add(txtsoilScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 680, 280, 40));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 590, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 590, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 590, 10));

        btnSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnSubmit.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setMinimumSize(new java.awt.Dimension(90, 37));
        btnSubmit.setPreferredSize(new java.awt.Dimension(90, 37));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 810, 190, 50));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 2050, 1500));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCropPlantedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCropPlantedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCropPlantedActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
         // TODO add your handling code here:
        try {

            if (this.txtCropPlanted.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name of planted crops");

            } else {

         soilData1 = account.getPerson().getFarmer().addSoilData();
        soilData1.setCropPlanted(this.txtCropPlanted.getText());
        soilData1.setFertiliserType(this.cbFertiliserType.getSelectedItem().toString());
        soilData1.setMonthlyincome(Double.parseDouble("2500"));
        soilData1.setTypeOfLand(this.cbtypeofLand.getSelectedItem().toString());
        soilData1.setTechnologyUsed(txtTechinology.getText());
        soilData1.setIsSoilScore(cbSoilScore.getSelectedItem().toString());


                JOptionPane.showMessageDialog(null, "Information saved Success Fully");

            }

        } catch (Exception e) {
            System.out.println("exception" + e);
            JOptionPane.showMessageDialog(null, "Please enter above information in correct format");
        }


      
      
      
       
     
// 
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbSoilScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSoilScoreActionPerformed
        // TODO add your handling code here:
        if (this.cbSoilScore.getSelectedItem().toString() == "NO"){
            
            this.txtsoilScore.setVisible(false);
            
        }else{
            
            this.txtsoilScore.setVisible(true);
        }
        
    }//GEN-LAST:event_cbSoilScoreActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbFertiliserType;
    private javax.swing.JComboBox<String> cbSoilScore;
    private javax.swing.JComboBox<String> cbtypeofLand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JTextField txtCropPlanted;
    private javax.swing.JTextField txtTechinology;
    private javax.swing.JLabel txtsoilScore;
    // End of variables declaration//GEN-END:variables
}
