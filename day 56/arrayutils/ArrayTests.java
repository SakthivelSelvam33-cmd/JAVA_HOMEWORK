
package arrayutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArrayTests 
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
    public void findMaxTest()
    {
       Array a1=new Array();
       int arr[]={10,20,30,40};
       int res=a1.findMax(arr);
      Assert.assertEquals(40, res);
        System.out.println("completed");
    }
    @Test
    public void findMinTest()
    {
        Array a2=new Array();
       int arr[]={10,20,30,40};
       int res=a2.findMin(arr);
      Assert.assertEquals(10, res);
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
