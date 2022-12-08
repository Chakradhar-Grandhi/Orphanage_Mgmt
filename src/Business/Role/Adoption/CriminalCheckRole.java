/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Adoption;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Adoption.BackgroundAndCriminalCheckRole.BackgroundAndCriminalCheckWorkAreaJPanel;

/**
 *
 * @author yashpawar
 */
public class CriminalCheckRole extends Role{
AdopterDirectory udirectory;
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
        //return new BackgroundAndCriminalCheckProcessRequestJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
      
        return new BackgroundAndCriminalCheckWorkAreaJPanel(userProcessContainer,account, organization, enterprise,  business,  udirectory);
    }
    
}
