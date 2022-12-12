package Model.Role;

import Model.Adopter.AdopterDirectory;
import Model.Child.ChildDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author yashpawar
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        ChildCare("Child Care"),
        OrphanageAdmin("Orphanage Admin Organization"),
        ChildRegistration("Child Registeration Organization"),
        FinanceOrphanage("Finance Organization"),
        AdoptionAdmin("Adoption Admin Organization"),
        Adoption("Adoption Organization"),
        Adopter("Adopter Organization"),
        CriminalCheck("Criminal Check Organization"),
        FinanceCheck("Finance Check Organization"),
        Pharmacist("Pharmacy Organization");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,
            Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory,
            AdopterDirectory udirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
