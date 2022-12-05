package Business.Role;

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

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
