/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;
public class M7{
    
    private TreeMap<String,String>hash;
    public PhoneBook(){
        hash=new TreeMap<>();
    }
        
        public void addContact(String name, String phoneNumber) {
        hash.put(name, phoneNumber);
        
        System.out.println("Contact added: " + name + " -> " + phoneNumber);
    }
    
    public void removeContact(String name) {
        if (hash.containsKey(name)) {
            hash.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }
    
    public String searchContact(String name) {
    if (hash.containsKey(name)) {
        return "Contact found: " + hash.get(name);
    } else {
        return "Contact not found";
    }
}

   public void displayContacts() {
        if (hash.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            for (Map.Entry<String,String> entry : hash.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
    
     public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

    
        phoneBook.addContact("Arya", "123-456-7890");
        phoneBook.addContact("Balaji", "234-567-8901");
        phoneBook.addContact("Charlie", "345-678-9012");

        System.out.println("\nAll contacts:");
        phoneBook.displayContacts();

        System.out.println("\nSearch for Balaji:");
        System.out.println(phoneBook.searchContact("Balaji"));

        System.out.println("\nRemoving Alice:");
        phoneBook.removeContact("Arya");

       
        System.out.println("\nAll contacts after removal:");
        phoneBook.displayContacts();
    }
}

        