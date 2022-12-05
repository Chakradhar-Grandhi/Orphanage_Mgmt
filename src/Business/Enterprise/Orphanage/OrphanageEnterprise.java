/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Orphanage;

import Business.Enterprise.Enterprise;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class OrphanageEnterprise extends Enterprise{

    public OrphanageEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Orphanage); //Enterprise type is orphanage
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
