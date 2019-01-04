package org.java9recipes.chapter01.recipe1_02;

public class HelloWorld {
     public static void main(String[] args) {
         HelloMessage hm = new HelloMessage();
         System.out.println(hm.getMessage());
         hm.setMessage("Hello, World");
         System.out.println(hm.getMessage());      
     }
}