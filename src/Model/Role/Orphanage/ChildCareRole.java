/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role.Orphanage;

import Model.Adopter.AdopterDirectory;
import Model.Child.ChildDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import Views.orphanage.ChildCare.ChildCareWorkAreaJPanel;

/**
 *
 * @author just_chakri
 */
public class ChildCareRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
       
        return new ChildCareWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business, directory, udirectory);
    }
}
