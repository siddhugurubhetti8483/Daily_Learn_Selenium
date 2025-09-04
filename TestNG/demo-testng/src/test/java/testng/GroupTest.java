package testng;

import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "Sanity")
    void login(){
       System.out.println("Login"); 
    }

    @Test(groups = "Sanity")
    void search(){
       System.out.println("Search"); 
    }   

    @Test(groups = "Sanity")
    void addToCart(){
       System.out.println("AddToCart"); 
    }

    @Test(groups = "Regression")
    void payment(){
       System.out.println("Payment"); 
    }

    @Test(groups = "regression")
    void invoice(){
       System.out.println("Invoice"); 
    }

    @Test(groups = "regression")
    void logout(){
       System.out.println("Logout"); 
    }
}
