
package arrayutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StringOperationTest 
{
    @BeforeClass
    public static void beforeClassTest()
    {
        System.out.println("Started");
    }
    @Before
    public void beforeTest()
    {
        System.out.println("test started");
    }
    @Test
    public void LengthTest()
    {
        StringOperation s1=new StringOperation();
        double res=s1.Length("Sakthivel");
        Assert.assertEquals(9, res, res);
        System.out.println("completed");
    }
    @Test
    public void toUpperCaseTest()
    {
        StringOperation s1=new StringOperation();
        String res=s1.toUpperCase("Sakthivel");
        Assert.assertEquals("SAKTHIVEL", res, res);
        System.out.println("completed");
      
    }
    @Test
    public void toLowerCaseTest()
    {
        StringOperation s1=new StringOperation();
        String res=s1.toLowerCase("Sakthivel");
        Assert.assertEquals("sakthivel", res, res);
        System.out.println("completed");
      
    }
    @Test
    public void reverseTest()
    {
        StringOperation s1=new StringOperation();
        String res=s1.reverseString("Sakthivel");
        Assert.assertEquals("levihtkaS", res, res);
        System.out.println("completed");
      
    }
    
    
    @After
    public void afterTest()
    {
        System.out.println("test ended");
    }
    @AfterClass
    public static void afterClassTest()
    {
        System.out.println("Ended");
    }
    
}
