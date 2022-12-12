/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise.Adoption;

import Model.Enterprise.Enterprise;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class AdoptionEnterprise extends Enterprise {

    public AdoptionEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Adoption);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         return null;
    }
    
    
}
