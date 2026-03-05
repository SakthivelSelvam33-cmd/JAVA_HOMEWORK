
package arrayutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class NumberTest 
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
    public void factorial()
    {
      NumberUtils n1=new NumberUtils();
      int res=n1.factorial(10);
      Assert.assertEquals(3628800, res);
        System.out.println("completed");
    }
    @Test
    public void isPrimeTest()
    {
        NumberUtils n2=new NumberUtils();
        boolean res=n2.isPrime(2);
        Assert.assertTrue(res);
    }
    @Test
    public void isPrimeTest1()
    {
        NumberUtils n2=new NumberUtils();
        boolean res=n2.isPrime(8);
        Assert.assertFalse(res);
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
