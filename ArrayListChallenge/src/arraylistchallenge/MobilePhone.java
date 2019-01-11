package arraylistchallenge;

import java.util.Scanner;

public class MobilePhone {
    Contacts contact = new Contacts();
    private static Scanner scan = new Scanner(System.in);
    
    public void printInstructions(){
        System.out.println("\nInstructions: "
                + "\n1 - Add contact "
                + "\n2 - Modify contact name "
                + "\n3 - Modify contact number "
                + "\n4 - Remove contact "
                + "\n5 - Search contact "
                + "\n6 - List all contacts"
                + "\n0 - Exit");
    }
    
    public void processContacts(){
        boolean flag = true;
        while(flag){
            System.out.print("Enter an option: ");
            if(scan.hasNextInt()){
                switch(scan.nextInt()){
                    case 1:
                        System.out.print("Enter contact number: ");
                        int contactNumber = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter contact name: ");
                        String contactName = scan.nextLine();
                        contact.addContact(contactNumber, contactName);
                        break;
                    case 2:
                        scan.nextLine();
                        System.out.print("Enter current contact name: ");
                        String currentContactName = scan.nextLine();
                        System.out.print("Enter new contact name: ");
                        String newContactName = scan.nextLine();
                        contact.modifyContactName(currentContactName, newContactName);
                        break;
                    case 3:
                        System.out.print("Enter current contact number: ");
                        int currentContactNumber = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter new contact number: ");
                        int newContactNumber = scan.nextInt();
                        scan.nextLine();
                        contact.modifyContactNumber(currentContactNumber, newContactNumber);
                        break;
                    case 4:
                        scan.nextLine();
                        System.out.print("Enter contact name to delete: ");
                        String removeContactName = scan.nextLine();
                        contact.removeContact(removeContactName);
                        break;
                    case 5:
                        scan.nextLine();
                        System.out.print("Enter contact name: ");
                        String searchContact = scan.nextLine();
                        contact.searchContacts(searchContact);
                        break;
                    case 6:
                        System.out.println("All contacts: ");
                        contact.listAllContacts();
                        break;
                    case 0:
                        flag = false;
                        System.out.println("Goodbye");
                        break;
                    default:
                        scan.nextLine();
                        System.out.println("Please enter a valid integer option");
                }
            }
            else
                System.out.println("Please enter a valid integer option");
        }
        scan.close();
    }
}
