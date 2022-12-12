/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization.Orphanage;

import Model.Child.ChildDirectory;
import Model.Organization.Organization;
import Model.Role.Orphanage.ChildRegistrationRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class ChildRegistrationOrganization extends Organization {
ChildDirectory directory;
    public ChildRegistrationOrganization() {
        super(Organization.Type.ChildRegistration.getValue());
       // this.directory = super.getChildDirectory(); // Calling the getter method over here so that the same child directory everywhere
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ChildRegistrationRole());
        return roles;
    }
      
//      @Override
//    public ChildDirectory getChildDirectory(){
//        ChildDirectory directory = new ChildDirectory();
//        directory.addChild();
//        return directory;
//    }
    
    }

   

