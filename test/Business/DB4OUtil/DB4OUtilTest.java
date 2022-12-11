/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Business.DB4OUtil;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
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
}
