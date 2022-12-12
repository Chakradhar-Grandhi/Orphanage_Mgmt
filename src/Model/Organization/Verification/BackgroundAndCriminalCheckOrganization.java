/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization.Verification;

import Model.Organization.Organization;
import Model.Role.Verification.CriminalCheckRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yashpawar
 */
public class BackgroundAndCriminalCheckOrganization extends Organization{

    public BackgroundAndCriminalCheckOrganization() {
        super(Organization.Type.CriminalCheck.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CriminalCheckRole());
        return roles;
    }
     
    
}