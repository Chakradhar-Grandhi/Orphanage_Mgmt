/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.Adopter.AdopterDirectory;
import Model.Child.ChildDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DoctorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import Views.DocterRole.DoctorJPanel;

/**
 *
 * @author yashpawar
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory,AdopterDirectory udirectorDirectory) {
        return new DoctorJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise, business, directory);
    }
    
    
}
