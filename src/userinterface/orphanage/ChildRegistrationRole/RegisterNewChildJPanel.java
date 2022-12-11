/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orphanage.ChildRegistrationRole;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.Orphanage.ChildRegistrationOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.File;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yashpawar
 */

public class RegisterNewChildJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterNewChildJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
 Enterprise enterprise;
 EcoSystem business;
//    Child child;
 ChildDirectory directory;
 ChildRegistrationOrganization organization;
     Network network;
     JCalendar calendar = new JCalendar();
    public RegisterNewChildJPanel(JPanel userProcessContainer, ChildDirectory directory, UserAccount account, Enterprise enterprise, EcoSystem business, Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.directory=directory;
       this.account=account;
       this.enterprise=enterprise;
       this.business = business;
this.organization =(ChildRegistrationOrganization) organization;
calenderPanel.add(calendar);
calenderPanel.setLayout(new BorderLayout());
calenderPanel.add(calendar, BorderLayout.CENTER);
//jXDatePicker1.getMonthView().setUpperBound(new Date());

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageComboBox = new javax.swing.JComboBox();
        maleRDB = new javax.swing.JRadioButton();
        femaleRDB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        registerChild = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        photoText = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        calenderPanel = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register New Child");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age:");

        ageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        ageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(maleRDB);
        maleRDB.setText("Male");

        buttonGroup1.add(femaleRDB);
        femaleRDB.setText("Female");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender:");

        registerChild.setText("Register and send for medicals");
        registerChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerChildActionPerformed(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        photoText.setMaximumSize(new java.awt.Dimension(6, 20));

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Photo: ");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Registration Date:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Identification mark");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRDB)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRDB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(photoText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(calenderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(registerChild, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(540, 540, 540))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRDB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleRDB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calenderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(photoText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(registerChild, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
       browseImageFile();
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void ageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageComboBoxActionPerformed
      
    }//GEN-LAST:event_ageComboBoxActionPerformed
/*Upon click the method would regoster the child and would send the details to the doctor for medical examination*/
    private void registerChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerChildActionPerformed
        try {
            //Fetching the input from the application
            if(!validation()){
                String childName = nameTextField.getText();
                String ageString = ageComboBox.getSelectedItem().toString();
                int childAge = Integer.parseInt(ageString);
                String gender = "";
                if(maleRDB.isSelected()){
                    gender = "Male";
                }
                else if(femaleRDB.isSelected()){
                    gender = "Female";
                }
               
                String identificationMark = jTextArea1.getText();
                
                
                Child child = new Child();
//       directory=childRegistrationOrganization.getChildDirectory();
                /*Setting the data in the child object*/
                int childId =  directory.getChildList().size()+1;
                child = directory.addChild();
                child.setChildAge(childAge);
                child.setChildId(childId);
                child.setChildname(childName);
                child.setIdentificationMark(identificationMark);
                child.setImageDetails(photoText.getText());
                ///*child.setRegistrationDate(regDate);*/child.setRegistrationDate(new SimpleDateFormat("yyyy-MM-dd").parse(dateTextField.getText()));
                child.setRegistrationDate(calendar.getDate());
                child.setChildGender(gender);
                child.setStatus("Newly Registered");
                child.setMedicalStatus(child.getMedicalStatus()+"\n"+"Medically Unfit");
                /*Creating a work request for the child object created*/
                DoctorWorkRequest docwrkreq = new DoctorWorkRequest();
                docwrkreq.setStatus("Medically Unfit");
                docwrkreq.setMessage("Please medically examine the newly registered child");
                docwrkreq.setSender(account);
                docwrkreq.setChildId(child.getChildId());
                
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
                            
                            
                            
                          // if(this.network.equals(network)){
                            if (organization instanceof DoctorOrganization){
                                
                                org = organization;
                                break;
                            }
                          //  }
                            
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
                
                /*Once the request has been moved and child data has been added, the data is moved to the Child registration page again*/
                ChildRegistrationWorkAreaPanel childregpanel = new ChildRegistrationWorkAreaPanel(userProcessContainer, account, organization, enterprise, business, directory);
                this.userProcessContainer.add("ChildRegistrationWorkAreaPanel", childregpanel);
                CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        } catch (ParseException ex) {
            Logger.getLogger(RegisterNewChildJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerChildActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ageComboBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel calenderPanel;
    private javax.swing.JRadioButton femaleRDB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton maleRDB;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField photoText;
    private javax.swing.JButton registerChild;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables

    private String browseImageFile() {
           JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File file = chooseFile.getSelectedFile();
        String filePath = file.getPath();
        System.out.println(filePath);
        photoText.setText(filePath);
        return filePath;
    }

    public boolean validation() throws ParseException {
        Date currentDate = new Date();
        Date selectedDate = calendar.getDate();
     if(nameTextField.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Please enter the name of the child");
         return true;
     }
     else if(!validateName()){
         JOptionPane.showMessageDialog(null, "Please enter the name in the correct format(No special characters)");
         return true;
     }
     else if(ageComboBox.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(null, "Please provide the age of the child");
         return true;
     }
     else if(!maleRDB.isSelected()&& !femaleRDB.isSelected()){
         JOptionPane.showMessageDialog(null, "Please select the gender of the child");
         return true;
     }
     else if(selectedDate.compareTo(currentDate)>0){
         JOptionPane.showMessageDialog(null, "Registration Date cannot be in future");
         return true;
     }
     else if(jTextArea1.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Please enter the identification mark. If there are none, please write NA/None");
         return true;
     }
     else if(!validateIdentity()){
         JOptionPane.showMessageDialog(null, "No special character in identification mark");
         return true;
     }
     else if(photoText.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Please select the image of the child");
         return true;
     }
      
      else
       return false;
    }
    
    
    
       public boolean validateName(){
    boolean b=false;
    Pattern p = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
    String name = nameTextField.getText();
    Matcher m = p.matcher(name);
    b = m.matches();
    return b;
}  

    private boolean validateIdentity() {
         boolean b=false;
    Pattern p = Pattern.compile("^[A-Za-z0-9. ]*$");
    String name = jTextArea1.getText();
    Matcher m = p.matcher(name);
    b = m.matches();
    return b;
    }
}
