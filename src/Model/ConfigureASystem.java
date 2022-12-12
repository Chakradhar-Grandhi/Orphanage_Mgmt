package Model;

import Model.Adopter.AdopterDirectory;
import Model.Child.ChildDirectory;
import Model.Employee.Employee;
import Model.Role.SystemAdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author yashpawar
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
    public static ChildDirectory configureDirectory(){
        ChildDirectory directory = ChildDirectory.getInstance();
        return directory;
    }
    
    //returns user directory.
    public static AdopterDirectory configureUserDirectory(){
        AdopterDirectory directory = AdopterDirectory.getInstance();
        return directory;
    }
}
