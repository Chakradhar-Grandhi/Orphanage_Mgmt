/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization.Adoption;

import Model.Organization.Organization;
import Model.Role.Adoption.AdoptionAdminRole;
import Model.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author yashpawar
 */
public class AdoptionAdminOrganization extends Organization {

    public AdoptionAdminOrganization(String name) {
        super(Type.AdoptionAdmin.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdoptionAdminRole());
        return roles;
    }
    
}
