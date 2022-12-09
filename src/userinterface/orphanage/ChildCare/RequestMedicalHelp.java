/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orphanage.ChildCare;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.Orphanage.ChildCareOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author just_chakri
 */
public class RequestMedicalHelp extends javax.swing.JPanel {

    /**
     * Creates new form RequestMedicalHelp
     */
  JPanel userProcessContainer;
    Child child; 
   
    UserAccount account;
    ChildCareOrganization organization;
    Enterprise enterprise;
    EcoSystem business;
    ChildDirectory directory;
        Network network;
    public RequestMedicalHelp(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, Child child) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.child=child;
        this.account=account;
        this.organization = (ChildCareOrganization) organization;
        this.enterprise=enterprise;
        this.business=business;
        this.directory=directory;
         for(Network net: business.getNetworkList()){
      for(Enterprise ent: net.getEnterpriseDirectory().getEnterpriseList()){
          if(ent.equals(enterprise)){
              network= net;
          }
      }
  }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Symptoms:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(jTextArea1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the symptoms");
            return;
        }
        
        String symptoms = jTextArea1.getText();
        child.setMedicalStatus(child.getMedicalStatus()+"\n"+symptoms+" on date "+new Date());
        
        DoctorWorkRequest docwrkreq = new DoctorWorkRequest();
        docwrkreq.setStatus("Medically Unfit");
        docwrkreq.setMessage(symptoms);
        docwrkreq.setSender(account);
        docwrkreq.setChildId(child.getChildId());
        docwrkreq.setRemarks("Request for Doctor");
     
        /*
        The below set of code iterates through the network list and get the network
        Once the network is received then it iterates over all the enterprises present in the network
        It goes thought every organization in the enterprise.
        
        Once it has found the Doctor organization, it sets the organization as Doctor organization
        
        */
        Organization org = null;
        for (Network network : business.getNetworkList()){
           // getNetworkList().getOrganizationDirectory().getOrganizationList()
            System.out.println("network: "+network);
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                
                for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                   
                
              //if(this.network.equals(network)){
                            if (organization instanceof DoctorOrganization){
                                
                                org = organization;
                                break;
                            }
                        //    }
            
        }
            }
        }
/*The below if code checks if there is some value for org. If there is then add the work request 
        - At the organization level, where other organization in the same enterprise can access it
        -At the account level, so the child registration can also see the request created
        - At the business level, as the request has to be transferred to a different organization in a different enterprise.
        */
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(docwrkreq);
          
            account.getWorkQueue().getWorkRequestList().add(docwrkreq);
             business.getWorkQueue().getWorkRequestList().add(docwrkreq);
    
        }
        
        ViewCompleteChildDetails vccd = new ViewCompleteChildDetails(userProcessContainer, account, organization, enterprise, business, directory, child);
        this.userProcessContainer.add("ViewCompleteChildDetails", vccd);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
