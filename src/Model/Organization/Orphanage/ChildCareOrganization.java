/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization.Orphanage;

import Model.Child.Child;
import Model.Child.ChildDirectory;
import Model.Organization.Organization;
import Model.Role.DoctorRole;
import Model.Role.Orphanage.ChildCareRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class ChildCareOrganization extends Organization {

  
    public ChildCareOrganization() {
       super(Organization.Type.ChildCare.getValue());
      
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ChildCareRole());
        return roles;
    }
    
  
     
}
