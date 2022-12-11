/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Business.DB4OUtil;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yashpawar
 */
public class DB4OUtilTest {
    
    private EcoSystem system;
    private ChildDirectory cdirectory;
    private AdopterDirectory udirectory;
    
    @Test
    public void testChildDirectorySize() {
        assertEquals(new DB4OUtil().childDirectorySize(), 6);
        //fail("Child directory size not 6");
    }
    
    @Test
    public void testUserAccDirectorySize() {
        assertEquals(new DB4OUtil().UserAccDirectorySize(), 7);
        //fail("Adopter Directory Size not 7");
    }

    @Test
    public void testRetrieveDirectory() {
        cdirectory = new DB4OUtil().retrieveDirectory();
        
        for(Child c: cdirectory.getChildList()){
            if(c.getChildname().equals("abcc"))
            assertEquals(c.getChildname(), "abcc"); 
        }
        
        //fail("abcc not found in list");
    }

    @Test
    public void testRetrieveUserDirectory() {
        udirectory = new DB4OUtil().retrieveUserDirectory();
        
        for(Adopter c: udirectory.getAdoptersList()){
            if(c.getName().equals("daadopter"))
            assertEquals(c.getName(), "daadopter"); 
        }
        
        //fail("daadopter not found in list");
    }
    
    @Test
    public void testcheckNetwork(){
        system= new DB4OUtil().retrieveSystem();
        assertEquals(system.getNetworkList().size(), 3); 
        //fail("NetworkList size is not 3");
    }
    
    @Test
    public void testcheckEmployee(){
        system= new DB4OUtil().retrieveSystem();
        assertEquals(system.getEmployeeDirectory().getEmployeeList().size(), 1); 
        //fail("Employee size not 1");
    }
    
    @Test
    public void testRoleList(){
        system= new DB4OUtil().retrieveSystem();
        assertEquals(system.getSupportedRole().size(),1);
        //fail("role list size not 1");
    }
    
    @Test
    public void testcheckNetworkName(){
        system= new DB4OUtil().retrieveSystem();
        List<String> networklist= new ArrayList<String>();
        for(Network n: system.getNetworkList()){
            networklist.add(n.getName());
        }
        
        assertEquals(networklist.contains("NY"), true); 
        //fail("NetworkList does not contain NY");
    }
    
    @Test
    public void testcheckNumberOfNetworkHavingEnterprise(){
        system= new DB4OUtil().retrieveSystem();
        List<String> networklist= new ArrayList<String>();
        for(Network n: system.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getEnterpriseType().getValue().equals("Hospital"))
                    networklist.add(n.getName());
            }
            
        }
        assertEquals(networklist.size(), 3); 
        //fail("NetworkList does not contain NY");
    }
}
