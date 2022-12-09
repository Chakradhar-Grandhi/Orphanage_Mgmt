/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Adoption.AdoptersRole;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Adoption.AdopterOrganization;
import Business.Organization.Organization;
import Business.Organization.Orphanage.ChildCareOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChildCareAdoptionWorkRequest;
import Business.WorkQueue.ChildCareWorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashpawar
 */
public class ChildSelectionJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory udirectory;
    AdopterOrganization adopterorganization;
    Adopter adopter;
    String bgcstatus,financestatus;
    int uid;
    ChildDirectory directory;
    ChildCareWorkRequest request;
  
    ChildSelectionJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory udirectory, int uid, ChildDirectory directory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.udirectory=udirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.adopterorganization =(AdopterOrganization) organization;
        this.uid = uid;
        this.directory = directory;
    //if condition for enabling proceed with adoption button if BGC and fin checks are approved
       for(Adopter a: udirectory.getAdoptersList()){
           if(a.getUsername().equals(account.getUsername())){
               adopter=a;
           }
       }
       
      
       
        populateChildTable();
       
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        childTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        childTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child Id", "Child Name", "Gender", "Age", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(childTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Child Selection Page");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Adopt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = childTable.getSelectedRow();
        if(selectedRow<0){
            return;
        }
        Child ch = (Child) childTable.getValueAt(selectedRow, 0);
        ChildCareAdoptionWorkRequest adc = new ChildCareAdoptionWorkRequest();
        adc.setChildId(ch.getChildId());
        adc.setUserId(uid);
        adc.setUserName(adopter.getName());
        adc.setMessage("I want to adopt");
          Organization org = null;
        for (Network network : business.getNetworkList()){
           // getNetworkList().getOrganizationDirectory().getOrganizationList()
            System.out.println("ye hai network: "+network);
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("ye hai enterprise: "+ent);
                for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                    System.out.println("ye hai org: "+organization);
                       
                    if (organization instanceof ChildCareOrganization){

                        org = organization;
                        System.out.println("ye hai org: "+org);
                        break;
                    } 
                }
            }
        }
        
        /*The below if code checks if there is some value for org. If there is then add the work request 
        - At the organization level, where other organization in the same enterprise can access it
        -At the account level, so the adopter can also see see the request created
        - At the business level, as the request has to be transferred to a different organization in a different enterprise.
        */
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(adc);
            account.getWorkQueue().getWorkRequestList().add(adc);
            business.getWorkQueue().getWorkRequestList().add(adc);
        } 
        
        adopter.setFlag(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void populateChildTable(){

    DefaultTableModel dtms = (DefaultTableModel)childTable.getModel();
    dtms.setRowCount(0);
    for(Child child: directory.getChildList()){
        System.out.println("inside for");
        if(child.getStatus().equalsIgnoreCase("Acquired") || child.getStatus().startsWith("Adopted by "+adopter.getName())){
          Object[] row = new Object[dtms.getColumnCount()];
            System.out.println("child"+child);
          row[0]=child;
          row[1]=child.getChildname();
          row[2]=child.getChildGender();
          row[3]=child.getChildAge();
          row[4]=child.getStatus();
          
          dtms.addRow(row);
       }
    }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable childTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
