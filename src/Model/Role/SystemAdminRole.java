/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.Adopter.AdopterDirectory;
import Model.Child.ChildDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Views.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author yashpawar
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, ChildDirectory directory, AdopterDirectory udirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
