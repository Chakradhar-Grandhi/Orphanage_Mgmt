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
import Views.orphanage.ChildRegistrationRole.ChildRegistrationWorkAreaPanel;


/**
 *
 * @author just_chakri
 */
public class ChildRegistrationRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
      
        return new ChildRegistrationWorkAreaPanel(userProcessContainer, account, organization, enterprise, business, directory); // this would return the JPanel of the childregisteration
    }
}
