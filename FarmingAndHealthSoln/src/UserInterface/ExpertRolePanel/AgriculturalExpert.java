/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ExpertRolePanel;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Enterprise.Enterprise;
import Business.FarmerData.SoilData;
import Business.Organization.ExpertOrganization;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class AgriculturalExpert extends javax.swing.JPanel {

    /**
     * Creates new form AgriculturalExpert
     */
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private ExpertOrganization organization;
    private Enterprise enterprise;
    private Organization farmerorganisation;

   

    public AgriculturalExpert(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.container = container;
        this.account = account;
        this.organization = (ExpertOrganization) organization;
        this.enterprise = enterprise;
        this.system = business;

        System.out.println(this.account.getPerson().getFirstName());

        populateFarmerList();
    }

    public void populateFarmerList() {
 DefaultTableModel model = (DefaultTableModel) farmerTable.getModel();

        model.setRowCount(0);

        //   organization1.getWorkQueue().getWorkRequestList()
        Object[] row = new Object[6];

        for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization1 instanceof FarmerOrganization) {

                this.farmerorganisation = organization1;
            }
        }

        if (this.farmerorganisation.getWorkQueue().getWorkRequestList() != null) {
            System.out.println("if work null");

            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {

                System.out.println("if work queue isnot null");

                //    for (Person person : this.farmerorganisation.getPersonDirectory().getPersonList()) {
                //System.out.print("string" + person.getId());
                row[0] = request.getSender().getPerson().getFirstName();

                row[1] = request.getSender().getPerson().getLastName();
                row[2] = request.getSender().getPerson().getSSN();

                row[4] = request.getMessage();

                String result = request.getStatus();
                //  row[4] = account.getPerson().getFarmer().getSoilDataList().get(0).getIsSoilScore();
                //row[4] = "...........";
//                if (account.getPerson().getFarmer().getSoilDataList().size() == 0) {
//                    row[4] = "........";
//                } else {
//                    // row[4] = account.getPerson().getFarmer().getSoilDataList().get(0).getIsSoilScore();
//                }
                 

                row[3] = request;

                row[5] = request.getResponse();
                //result == null ? "Waiting" : result;

                model.addRow(row);
                //  }
            }

        } else {
            System.out.println("if work queue is null");

        }

    }
    
    
    
    public void PopulateTableAfterBack(){
        
         DefaultTableModel model = (DefaultTableModel) farmerTable.getModel();

        model.setRowCount(0);

        //   organization1.getWorkQueue().getWorkRequestList()
        Object[] row = new Object[7];

      
        if (this
       .farmerorganisation.getWorkQueue().getWorkRequestList() != null) {
            System.out.println("if work null");
            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {

                System.out.println("if work queue isnot null");

                //    for (Person person : this.farmerorganisation.getPersonDirectory().getPersonList()) {
                //System.out.print("string" + person.getId());
                row[0] = request.getSender().getPerson().getFirstName();

                row[1] = request.getSender().getPerson().getLastName();
                row[2] = request.getSender().getPerson().getSSN();

                row[4] = request.getMessage();

                String result = request.getStatus();
                //  row[4] = account.getPerson().getFarmer().getSoilDataList().get(0).getIsSoilScore();
                //row[4] = "...........";
                if (account.getPerson().getFarmer().getSoilDataList().size() == 0) {
                    row[4] = "........";
                } else {
                    // row[4] = account.getPerson().getFarmer().getSoilDataList().get(0).getIsSoilScore();
                }

                row[3] = request;

                row[6] = request.getResponse();
                //result == null ? "Waiting" : result;

                model.addRow(row);
                //  }
            }

        } else {
            System.out.println("if work queue is null");

        }

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        farmerTable = new javax.swing.JTable();
        btnSoilTest = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setText("Soil Testing and Feedback");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 550, 60));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("Please Select famer and calculates its soil score as per information given by Farmer");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 950, 40));

        farmerTable.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        farmerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Farmer Id", "Status", "Message", "Feedback"
            }
        ));
        farmerTable.setRowHeight(30);
        jScrollPane1.setViewportView(farmerTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1410, 410));

        btnSoilTest.setBackground(new java.awt.Color(0, 153, 153));
        btnSoilTest.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSoilTest.setText("Do Soil Test");
        btnSoilTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoilTestActionPerformed(evt);
            }
        });
        add(btnSoilTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 830, 340, 60));

        btnAssign.setBackground(new java.awt.Color(0, 153, 153));
        btnAssign.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 830, 260, 60));

        btnrefresh.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnrefresh.setText("Refresh Table");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 80, 210, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2050, 1490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSoilTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoilTestActionPerformed
        // TODO add your handling code here:

        int selectedRow = farmerTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) farmerTable.getValueAt(selectedRow, 3);

//        String s = farmerorganisation.getPersonDirectory().getPersonList().get(0).getFarmer().getSoilDataList().get(0).getTypeOfLand();
        //this.or.getPerson().getFarmer().getSoilDataList().get(0).getTypeOfLand();

//        System.out.println("value of this" + s);
        //request.setTestResult();

        if (request.getMessage().equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(null, "Request already processed.");
            return;
        } else {
            //   request.setReceiver(userAccount);

            request.setStatus("processed");

            // populateTable();
            CalculateSoilPanel manageEnterpriseAdminJPanel = new CalculateSoilPanel(container, account, farmerorganisation, enterprise, system, request);
            container.add("CalculateSoilPanel", manageEnterpriseAdminJPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
            this.populateFarmerList();

        }


    }//GEN-LAST:event_btnSoilTestActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        populateFarmerList();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
           int selectedRow = farmerTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null, "You are now handling this case.", "Message To You.", JOptionPane.INFORMATION_MESSAGE);

        WorkRequest request = (WorkRequest) farmerTable.getValueAt(selectedRow, 3);
      request.setReceiver(account);
        request.setStatus("Processing");
     
        populateFarmerList();
       // populateTable(true);
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnSoilTest;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JTable farmerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
