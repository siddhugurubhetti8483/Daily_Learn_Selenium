package testng;

import org.testng.annotations.Test;

public class DependencyMethod {
    
    @Test
    void openApp(){
       System.out.println("true"); 
    }

    @Test(dependsOnMethods = "openApp")
    void login(){
       System.out.println("false"); 
    }

    @Test(dependsOnMethods = "login")
    void search(){
       System.out.println("true"); 
    }   

    @Test(dependsOnMethods = "search")
    void addToCart(){
       System.out.println("true"); 
    }

    @Test(dependsOnMethods = "addToCart")
    void logout(){
       System.out.println("true"); 
    }
}
