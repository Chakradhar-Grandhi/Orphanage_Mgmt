/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Adoption.AdopterOrganization;
import Business.Organization.Adoption.AdoptionOrganization;
import Business.Organization.Verification.BackgroundAndCriminalCheckOrganization;
import Business.Organization.Verification.FinanceCheckOrganization;
import Business.Organization.Orphanage.ChildCareOrganization;
import Business.Organization.Orphanage.ChildRegistrationOrganization;
import Business.Organization.Orphanage.FinanceOrphanageOrganization;
import java.util.ArrayList;

/**
 *
 * @author just_chakri
 */
public class OrganizationDirectory {
    
        private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Pharmacist.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        }
        
        
        
   //-----------Orphanage Organizations----------------
        
        
        else if (type.getValue().equals(Organization.Type.ChildCare.getValue())){
            organization = new ChildCareOrganization();
            
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ChildRegistration.getValue())){
            organization = new ChildRegistrationOrganization();
            
            organizationList.add(organization);
          //  organization.getChildDirectory();
        }
        else if (type.getValue().equals(Organization.Type.FinanceOrphanage.getValue())){
            organization = new FinanceOrphanageOrganization();
            organizationList.add(organization);
        }
        
  //-----------Adoption Organizations----------------   
        
        else if (type.getValue().equals(Organization.Type.CriminalCheck.getValue())){
            organization = new BackgroundAndCriminalCheckOrganization();
            organizationList.add(organization);
            System.out.println("Created criminal check");
        }
        else if (type.getValue().equals(Organization.Type.FinanceCheck.getValue())){
            organization = new FinanceCheckOrganization();
            organizationList.add(organization);
            System.out.println("Created finance check");
        }
        else if (type.getValue().equals(Organization.Type.Adoption.getValue())){
            organization = new AdoptionOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Adopter.getValue())){
            organization = new AdopterOrganization();
            organizationList.add(organization);
        }
        return organization;
    
}
    
}
