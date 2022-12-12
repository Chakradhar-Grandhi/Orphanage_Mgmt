package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author just_chakri
 */
public class VerificationEnterprise extends Enterprise {
        public VerificationEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Verification);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
