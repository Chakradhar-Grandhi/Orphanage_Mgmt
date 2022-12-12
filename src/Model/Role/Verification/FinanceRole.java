/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role.Verification;

import Model.Adopter.AdopterDirectory;
import Model.Child.ChildDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import Views.Verification.FinanceCheckRole.FinanceCheckWorkAreaJPanel;

/**
 *
 * @author yashpawar
 */
public class FinanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
        
        return new FinanceCheckWorkAreaJPanel(userProcessContainer,account, organization, enterprise,  business,  udirectory);
    }
}
