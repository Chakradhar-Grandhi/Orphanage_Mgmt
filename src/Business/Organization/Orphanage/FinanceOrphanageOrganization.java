/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Orphanage;

import Business.Organization.Organization;
import Business.Role.Role;
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
        
        return roles;
    }
     
}