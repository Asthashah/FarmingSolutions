package UserInterface.FarmerRolePanel;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Enterprise.Enterprise;
import Business.FarmerData.Farmer;
import Business.Organization.ExpertOrganization;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FarmerRequestPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Farmer farmer;
    private ExpertOrganization expertOrganization;

    FarmerRequestPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Farmer farmer) {

        initComponents();
        this.container = container;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        populateRequestTable();
        
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[3] = request.getRequestDate();
            row[0] = request.getMessage();
            row[2] = request.getResponse();
            
            String result = request.getStatus();
            row[1] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        requestBtn = new javax.swing.JButton();
        txtMessaage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSendRequest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setText("Consultation to Expert");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 550, 60));

        workRequestJTable.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "FeedBack", "Date"
            }
        ));
        workRequestJTable.setRowHeight(30);
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 1270, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("Work Request History:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 830, 40));

        requestBtn.setBackground(new java.awt.Color(0, 153, 153));
        requestBtn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        requestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestBtn.setText("Back");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, 200, 50));

        txtMessaage.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        add(txtMessaage, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, 730, 90));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Please  enter the information which you wanted to request");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 620, 40));

        btnSendRequest.setBackground(new java.awt.Color(0, 153, 153));
        btnSendRequest.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSendRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSendRequest.setText("Send");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 810, 200, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2050, 1490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        // TODO add your handling code here:if 
        try {
            if (this.txtMessaage.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please request Message");

            } else {

                WorkRequest newMessage = new WorkRequest();
                newMessage.setMessage(this.txtMessaage.getText());
                newMessage.setSender(account);
                newMessage.setStatus("Waiting");
                newMessage.setResponse("......");

                account.getWorkQueue().getWorkRequestList().add(newMessage);

                System.out.println(account.getWorkQueue().getWorkRequestList().size() + "Work Request ");

                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof ExpertOrganization) {
                        org.getWorkQueue().getWorkRequestList().add(newMessage);
                    }
                }

                populateRequestTable();

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_requestBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTextField txtMessaage;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
