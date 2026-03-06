
package arrayutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankingSystemTest 
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
    public void depositTest()
    {
        BankingSystem b1=new BankingSystem();
        double res=b1.depositamount(1000);
        Assert.assertEquals(1000, res, 0.01);
        System.out.println("completed");
      
    }
    @Test
    public void withdrawTest()
    {
        BankingSystem b1=new BankingSystem();
        double res=b1.withdrawamount(500);
        Assert.assertEquals(res, res, 0.01);
        System.out.println("completed");
    }
    @Test
    public void getcheckBalance()
    {
        BankingSystem b1=new BankingSystem();
        double res=b1.getcheckBalance();
        Assert.assertEquals(res, res, res);
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
