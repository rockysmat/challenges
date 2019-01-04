/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java9recipes.chapter01.recipe1_13;
/**
 * @author ROTINA
 */

public class ReadOneEnvVariable {

    /**
     *
     * @param args is used
     * @www.rocky.com RockySmat
     */
    public static void main(String args[]){
        /**
         * @1stIF checks if user has input a system environment parameter
         */
        if(args.length > 0){
               String stringValue  = System.getenv(args[0]);
               /**
                * @2ndIF checks that the returned environment variable value is not null
                */
               if(stringValue != null){
               System.out.println("The value of "+args[0]+" = "+stringValue);
            }
               else 
                   System.out.println("The entered system parameter does not exist");
        }
        else {
            System.out.println("You have not entered system parameter to check");
        }
    }
}
