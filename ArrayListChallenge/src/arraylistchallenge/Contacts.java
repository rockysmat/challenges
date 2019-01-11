package arraylistchallenge;

import java.util.ArrayList;

public class Contacts {
    
    ArrayList<String> contactNames = new ArrayList<>();
    ArrayList<Integer> contactNumbers = new ArrayList<>();
    
    public void addContact(int contactNumber, String contactName){
        if(!contactNames.contains(contactName)){
            contactNumbers.add(contactNumber);
            contactNames.add(contactName);
            System.out.println("Contact added successfully");
        }
        else
            System.out.println("Contact name already exist");
    }
    
    public void modifyContactName(String currentContactName, String newContactName){
        int pos = searchContact(currentContactName);
        if(pos >= 0){
            contactNames.set(pos, newContactName);
            System.out.println("Contact name updated successfully");
        }
        else
            System.out.println("Either the contact name doesn't exist or is duplicate");
    }
    
    public void modifyContactNumber(int currentContactNumber, int newContactNumber){
        int pos = searchContact(currentContactNumber);
        if(pos >= 0 && !contactNumbers.contains(newContactNumber)){
            contactNumbers.set(pos, newContactNumber);
            System.out.println("Contact number updated successfully");
        }
        else 
            System.out.println("Either the contact number doesn't exist or is duplicate");
    }
    
    public void removeContact(String contactName){
        int pos = searchContact(contactName);
        if(pos >= 0){
            contactNames.remove(pos);
            contactNumbers.remove(pos);
            System.out.println("Contact deleted successfully");
        }
        else 
            System.out.println("Contact doesn't exist");
    }
    
    public void listAllContacts(){
        if(!contactNames.isEmpty()){
            for(int i = 0; i < contactNames.size(); i++){
                System.out.println(contactNames.get(i)+ "  " +contactNumbers.get(i));
            }
        }
        else 
            System.out.println("There are no saved contacts");
    }
    
    public void searchContacts(String searchName){
        if(contactNames.contains(searchName)){
            int pos = searchContact(searchName);
            System.out.println(contactNames.get(pos)+ "  " +contactNumbers.get(pos));
        }
        else
            System.out.println("Contact doesn't exist");
    }
    
    private int searchContact(String searchName){
        return contactNames.indexOf(searchName);
    }
    
    private int searchContact(int contactNumber){
        return contactNumbers.indexOf(contactNumber);
    }
}
