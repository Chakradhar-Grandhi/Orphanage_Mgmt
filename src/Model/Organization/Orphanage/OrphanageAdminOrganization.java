/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization.Orphanage;

import Model.Organization.Organization;
import Model.Role.AdminRole;
import Model.Role.Orphanage.OrphanageAdminRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class OrphanageAdminOrganization extends Organization{

    public OrphanageAdminOrganization() {
        super(Organization.Type.OrphanageAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrphanageAdminRole());
        return roles;
    }
     
}


