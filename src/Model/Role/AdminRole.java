/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.Adopter.AdopterDirectory;
import Model.Child.ChildDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Views.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author just_chakri
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
