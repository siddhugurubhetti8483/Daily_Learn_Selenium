package com.example;

import org.testng.annotations.Test;

public class First {

    @Test(priority = 1)
    void login(){
        System.out.println("Lets login");
    }

    @Test(priority = 2)
    void search(){
        System.out.println("Lets execute");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("Lets logout");
    }
}
