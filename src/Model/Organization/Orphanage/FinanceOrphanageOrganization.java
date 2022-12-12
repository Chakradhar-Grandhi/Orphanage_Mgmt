/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization.Orphanage;

import Model.Organization.Organization;
import Model.Role.Verification.FinanceAssisstantRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class FinanceOrphanageOrganization extends Organization {

  
    public FinanceOrphanageOrganization() {
       super(Organization.Type.FinanceOrphanage.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceAssisstantRole());
        return roles;
    }
     
}