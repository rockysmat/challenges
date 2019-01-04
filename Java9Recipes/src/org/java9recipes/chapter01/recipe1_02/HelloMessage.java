package org.java9recipes.chapter01.recipe1_02;

public class HelloMessage {
    private String message = "";
    public HelloMessage() {
        this.message = "Default Message";
    }
    public void setMessage (String m){
        this.message = m;
    }
    public String getMessage () {
    return message.toUpperCase();
    }
}
