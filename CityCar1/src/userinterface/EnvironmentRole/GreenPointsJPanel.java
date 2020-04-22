/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnvironmentRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.CarOwnerOrganization;
import Business.Organization.EnvironmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnvRewardsWorkRequest;
import Business.WorkQueue.RideShareWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author CodeSmiths
 */
public class GreenPointsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EnvironmentOrganization environmentOrganization;
    

    GreenPointsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EnvironmentOrganization environmentOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.environmentOrganization = environmentOrganization;
        
        populateComboBox();
    }

    public void populateComboBox(){
        comboCarOwner.removeAllItems();
        
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList() ){
            if (organization instanceof CarOwnerOrganization){
                for (UserAccount userAccount : ((CarOwnerOrganization)organization).getUserAccountDirectory().getUserAccountList()){
                    comboCarOwner.addItem(userAccount);
                }
            }
        }
    }
    
    public int totalGreenPts(){
        UserAccount userAccount = (UserAccount) comboCarOwner.getSelectedItem();
        int totalGreenPts = 0;
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()){
            if (workRequest instanceof RideShareWorkRequest){
                totalGreenPts = totalGreenPts + ((RideShareWorkRequest)workRequest).getGreenPoints();
            }
        }
        return totalGreenPts;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboCarOwner = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnCheckGreenPoints = new javax.swing.JButton();
        textGreenPts = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSendRewards = new javax.swing.JButton();

        setBackground(new java.awt.Color(128, 203, 196));

        comboCarOwner.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Select a Car Owner to see his/her Green points:");

        btnCheckGreenPoints.setText("Check");
        btnCheckGreenPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckGreenPointsActionPerformed(evt);
            }
        });

        textGreenPts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSendRewards.setText("Send Rewards");
        btnSendRewards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRewardsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboCarOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnCheckGreenPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(textGreenPts, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSendRewards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)))
                .addContainerGap(464, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCarOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGreenPts, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckGreenPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnSendRewards, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckGreenPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckGreenPointsActionPerformed
              
        textGreenPts.setText(Integer.toString(totalGreenPts()));
    }//GEN-LAST:event_btnCheckGreenPointsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        CarOwnerListingJpanel carOwnerListingJpanel = (CarOwnerListingJpanel) component;
//        carOwnerListingJpanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendRewardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRewardsActionPerformed
        EnvRewardsWorkRequest envRewardsWorkRequest= new EnvRewardsWorkRequest();
        envRewardsWorkRequest.setRewards(totalGreenPts() + " Green Points worth of rewards");
        
        Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof CarOwnerOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(envRewardsWorkRequest);
                account.getWorkQueue().getWorkRequestList().add(envRewardsWorkRequest);
            }
        JOptionPane.showMessageDialog(null, "Rewards sent", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSendRewardsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckGreenPoints;
    private javax.swing.JButton btnSendRewards;
    private javax.swing.JComboBox comboCarOwner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textGreenPts;
    // End of variables declaration//GEN-END:variables
}
