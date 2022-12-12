/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
