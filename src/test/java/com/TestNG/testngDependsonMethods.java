package com.TestNG;
import org.testng.annotations.Test;

/**
 * Created by user on 12/03/2017.
 */
public class testngDependsonMethods {
    @Test
    public void login()
    {
        System.out.println("I am login");

    }
    @Test(dependsOnMethods=("login"))
    public void search()
    {
        System.out.println("I am search");

    }
    @Test(dependsOnMethods=("search"),alwaysRun = true)
    public void logout()
    {
        System.out.println("I am logout");
    }
}

// In industrial practise, you perform login fn, perform search fn and perform logout fn.

//Therefore: "login fn is stand alone", "Search fn depends on login", logout fn depends on search.

// If the dependsOnMethods are failed, the method which depends on will be skipped

// @Test(dependsOnMethods =("search"),alwaysRun =true)

//If the dependsOnMethods are failed, the method which depends on will be executed.

//PASSED: Execution returns login-> Search-> logout.(In chronological order).





