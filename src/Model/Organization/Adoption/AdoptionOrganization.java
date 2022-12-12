/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization.Adoption;

import Model.Organization.Organization;
import Model.Role.Adoption.AdoptionRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yashpawar
 */
public class AdoptionOrganization extends Organization{

    public AdoptionOrganization() {
         super(Organization.Type.Adoption.getValue());
    
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdoptionRole());
        return roles;
    }
    
}




   
    