package com.TestNG;
import org.testng.annotations.Test;

/**
 * Created by user on 12/03/2017.
 */
public class testngMethodsPriority {
    @Test(priority=2)
    public void u()
    {
        System.out.println("u");

    }
    @Test(priority=1)
    public void t()
    {
        System.out.println("t");

    }
    @Test(priority=4)
    public void d()
    {
        System.out.println("d");

    }
    @Test(priority=3)
    public void n()
    {
        System.out.println("n");
    }

    @Test(priority=5)
    public void e()
    {
        System.out.println("e");

    }
    {
    }
}
//With the priority been set, execution will follow the priority.



// If two methods are having the same priority, the methods will be executed in an alphabetical order.



//PASSED: (tunde) is returned.

