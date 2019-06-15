/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ExpertRolePanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FarmerData.SoilData;
import Business.Organization.ExpertOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class CalculateSoilPanel extends javax.swing.JPanel {

private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private ExpertOrganization expertorganization; 
    private Enterprise enterprise;
    private Organization farmerorganisation;
    private WorkRequest  workrequest; 
    AgriculturalExpert agriExpert;
    //private SoilData soildata;
    private Double nitrogenContent;
    private Double phosphorous;
   private Double waterContent;
   private Double pottassimContent;
    
     CalculateSoilPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, WorkRequest request) {
       
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.farmerorganisation = organization;
        this.workrequest = request;
       this.nitrogenContent = 0.0;
      this.phosphorous = 0.0;
      this.waterContent =  0.0;
      this.pottassimContent = 0.0;
       
       //this.lblSoilType.setText(account.getPerson().getFarmer().addSoilData());
   //his.soildata = this.account.getPerson().getFarmer().addSoilData();   

    
//lblSoilType.setText(soildata.getTypeOfLand());

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNitrogen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtWaterContent = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPotassim = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPHVale = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescripation = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        btnSoilScore = new javax.swing.JButton();
        btnSendFeedback = new javax.swing.JButton();
        txtPhosporous = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtsoilscore = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setText("Check Soil Contents , Nutrient  ands its minerals :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 780, 50));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Nitrogen : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setText("Phosphorous :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel8.setText("Potassium :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel9.setText("Water Content :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        txtNitrogen.setBackground(new java.awt.Color(240, 240, 240));
        txtNitrogen.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtNitrogen.setForeground(new java.awt.Color(51, 51, 51));
        txtNitrogen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtNitrogen, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 590, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 590, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 590, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 590, 10));

        txtWaterContent.setBackground(new java.awt.Color(240, 240, 240));
        txtWaterContent.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtWaterContent.setForeground(new java.awt.Color(51, 51, 51));
        txtWaterContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtWaterContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaterContentActionPerformed(evt);
            }
        });
        add(txtWaterContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 590, 50));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 590, 10));

        txtPotassim.setBackground(new java.awt.Color(240, 240, 240));
        txtPotassim.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtPotassim.setForeground(new java.awt.Color(51, 51, 51));
        txtPotassim.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPotassim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotassimActionPerformed(evt);
            }
        });
        add(txtPotassim, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 590, 50));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 600, 10));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 840, 110, 50));

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel11.setText("pH Value of Soil :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 230, 60));

        txtPHVale.setBackground(new java.awt.Color(240, 240, 240));
        txtPHVale.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtPHVale.setForeground(new java.awt.Color(51, 51, 51));
        txtPHVale.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtPHVale, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 590, 50));

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel12.setText("Description : ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 720, 140, 60));

        txtDescripation.setBackground(new java.awt.Color(240, 240, 240));
        txtDescripation.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtDescripation.setForeground(new java.awt.Color(51, 51, 51));
        txtDescripation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDescripation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripationActionPerformed(evt);
            }
        });
        add(txtDescripation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 730, 250, 50));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 780, 210, 10));

        btnSoilScore.setBackground(new java.awt.Color(0, 153, 153));
        btnSoilScore.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSoilScore.setText("Calculate Soil Score ");
        btnSoilScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoilScoreActionPerformed(evt);
            }
        });
        add(btnSoilScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, 370, 70));

        btnSendFeedback.setBackground(new java.awt.Color(0, 153, 153));
        btnSendFeedback.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSendFeedback.setText("Send Feedback ");
        btnSendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFeedbackActionPerformed(evt);
            }
        });
        add(btnSendFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 830, 370, 50));

        txtPhosporous.setBackground(new java.awt.Color(240, 240, 240));
        txtPhosporous.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtPhosporous.setForeground(new java.awt.Color(51, 51, 51));
        txtPhosporous.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPhosporous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhosporousActionPerformed(evt);
            }
        });
        add(txtPhosporous, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 590, 50));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 650, 600, 10));

        txtsoilscore.setBackground(new java.awt.Color(240, 240, 240));
        txtsoilscore.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtsoilscore.setForeground(new java.awt.Color(51, 51, 51));
        txtsoilscore.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtsoilscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 590, 50));

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel13.setText("Soil Score :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 230, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2170, 1190));
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtDescripationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripationActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtDescripationActionPerformed

    private void txtPhosporousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhosporousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhosporousActionPerformed

    private void txtWaterContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaterContentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaterContentActionPerformed

    private void btnSoilScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoilScoreActionPerformed
        // TODO add your handling code here:
          try {

            if (this.txtNitrogen.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter value of nitrogen");

            } 
            else if (this.txtPhosporous.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name value of phosphorus");

            }else if (this.txtPotassim.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name value of potassium");

            }else if (this.txtWaterContent.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name value of leed");

            }
            else {

if (Double.parseDouble(this.txtNitrogen.getText()) > 20.0) {
           nitrogenContent = 0.4;
           
       }else  if ((Double.parseDouble(this.txtNitrogen.getText()) > 20.0 ) && (Double.parseDouble(this.txtNitrogen.getText()) < 60.0 )) {
      nitrogenContent = 0.6;
       }else {
           nitrogenContent = 0.9;
       }
       
        if (Double.parseDouble(this.txtPhosporous.getText()) > 20.0) {
           phosphorous = 0.5;
           
       }else  if ((Double.parseDouble(this.txtPhosporous.getText()) > 20.0 ) && (Double.parseDouble(this.txtPhosporous.getText()) < 60.0 )) {
      phosphorous = 0.7;
       }else {
           phosphorous = 0.8;
       }
       
        if (Double.parseDouble(this.txtWaterContent.getText()) > 20.0) {
           waterContent = 0.1;
           
       }else  if ((Double.parseDouble(this.txtWaterContent.getText()) > 20.0 ) && (Double.parseDouble(this.txtWaterContent.getText()) < 60.0 )) {
      waterContent = 0.2;
       }else{
           waterContent = 0.4;
       }
       
       
        if (Double.parseDouble(this.txtPotassim.getText()) > 20.0) {
           pottassimContent = 0.25;
           
       }else  if ((Double.parseDouble(this.txtPotassim.getText()) > 20.0 ) && (Double.parseDouble(this.txtPotassim.getText()) < 60.0 )) {
      pottassimContent = 0.5;
       }else {
           pottassimContent = 0.5;
       }
       
        CalculateRandomNumber(nitrogenContent,phosphorous,waterContent,pottassimContent);
            }

        } catch (Exception e) {
            System.out.println("exception" + e);
            JOptionPane.showMessageDialog(null, "Please enter above information in correct format");
        }
        
        
    }//GEN-LAST:event_btnSoilScoreActionPerformed
    
    private void txtPotassimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotassimActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtPotassimActionPerformed

    private void btnSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFeedbackActionPerformed
        // TODO add your handling code here:
        
        
            String message = txtDescripation.getText().trim();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Description message", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        workrequest.setStatus("Completed");
        workrequest.setResponse(this.txtDescripation.getText());
        
        SoilData soildata = new SoilData();
        
        //soildata.setCropPlanted(this.txt.getText());
        
        soildata.setNitroValue(Double.parseDouble(this.txtNitrogen.getText()));
        soildata.setPhosphorValue(Double.parseDouble(this.txtPhosporous.getText()));
        soildata.setPotassiumValue(Double.parseDouble(this.txtPotassim.getText()));
        soildata.setWaterValue(Double.parseDouble(this.txtPHVale.getText()));
        soildata.setSoilScore(Double.parseDouble(txtsoilscore.getText()));
        workrequest.getSender().getPerson().getFarmer().getSoilDataList().add(soildata);
//        account.getPerson().getFarmer().getSoilDataList().get(0).setIsSoilScore(this.txtPHVale.getText());


//         AgriculturalExpert manageEnterpriseAdminJPanel = new AgriculturalExpert(container,account,farmerorganisation, enterprise ,system);
//        container.add("AgriculturalExpert", manageEnterpriseAdminJPanel);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container);
//        
        
      //  agriExpert.populateFarmerList();

        
    }//GEN-LAST:event_btnSendFeedbackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void CalculateRandomNumber(Double nitrogenContent1, Double phosphorous1, Double waterContent1, Double pottassimContent1){
   
    float random1 =(float) (30.0 * waterContent1 + 20.0 * phosphorous1 + 20.0 * nitrogenContent1 + 30.0 * pottassimContent1);
   
   float random2 = (float) (random1 / 6.0);
   
    float random = (float) (Math.random() * 10.0 + 0.0);
   this.txtsoilscore.setText(String.valueOf(random2));
   
 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendFeedback;
    private javax.swing.JButton btnSoilScore;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtDescripation;
    private javax.swing.JTextField txtNitrogen;
    private javax.swing.JTextField txtPHVale;
    private javax.swing.JTextField txtPhosporous;
    private javax.swing.JTextField txtPotassim;
    private javax.swing.JTextField txtWaterContent;
    private javax.swing.JTextField txtsoilscore;
    // End of variables declaration//GEN-END:variables
}

