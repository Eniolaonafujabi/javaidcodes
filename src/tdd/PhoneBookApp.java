package tdd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookApp {
    static ArrayList<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
        String prompt = """
                Welcome to the Phone Book App!
                1 -> Add a new contact to the Phone Book App.
                2 -> Remove a contact from the Phone Book App.
                3 -> Search a contact in the Phone Book App By First Name.
                4 -> Search a contact in the Phone Book App By Last Name.
                5 -> Search a contact in the Phone Book App By Phone Number.
                6 -> Check All Contacts
                7 -> Exit the Phone Book App.
                """;
        String inputForMainMenu = input(prompt);
        switch (inputForMainMenu){
            case "1" -> addContact();
//            case "2" -> removeContact();
//            case "3" -> searchContactByFirstName();
            case "4" -> searchContactByLastName();
            case "5" -> searchContactByPhoneNumber();
            case "6" -> checkAllContact();
            case "7" -> System.exit(69);
            default -> goToMainMenu();
        }
    }

    private static void checkAllContact() {
        String [] contactView = new String[contacts.size()];
        int counter = 0 ;
        for(Contact contact : contacts){
            contactView[counter] = contact.toString();
            counter++;
        }
        displayAllContact(contactView);
    }

    private static void displayAllContact(String[] prompt) {
        System.out.println(Arrays.toString(prompt));
    }


    private static void searchContactByPhoneNumber() {
        String collectPhoneNumber = input("Enter the phone number to search for in contact");
        for(Contact  contact:contacts){
            if(collectPhoneNumber.equals(contact.getPhoneNumber())){
                displaySearchContact(contact.toString());
                System.out.println();
            }
        }
        goToMainMenu();
    }

    private static void displaySearchContact(String contact) {
        System.out.println(contact);
    }

    private static void searchContactByLastName() {
        String collectLastName = input("Enter the last name to search for in contact");
        ArrayList<Contact > contactList = new ArrayList<>();
        for(Contact contact:contacts){
            if(collectLastName.equalsIgnoreCase(contact.getLastName())){
                contactList.add(contact);
            }
        }
        displaySearchedContact(contactList);
        goToMainMenu();
    }

    private static void displaySearchedContact(ArrayList<Contact> contactList) {
        Contact [] contactView = new Contact[contactList.size()];
        for(int contact = 0; contact < contactView.length; contact++){
            System.out.println(contactList.get(contact).toString());
        }
    }
//
//    private static void searchContactByFirstName() {
//        String collectContactFirstName = input("Enter the first name to search for contact");
//        for(String[] contact:contacts){
//            for (String element:contact){
//                if(collectContactFirstName.equals(element)){
//                    displayAllContact(contact);
//                }
//            }
//        }
//        goToMainMenu();
//    }

//    private static void removeContact() {
//        String contactToRemove = input("Enter the contact to remove: ");
//        for(String[] contact : contacts){
//            for(String element : contact){
//                if(contactToRemove.equals(contactToRemove))contacts.remove(contact);
//            }
//            break;
//        }
//        goToMainMenu();
//    }

    private static void addContact() {
        String firstName = input("Enter first name: ");
        String lastName = input("Enter last name: ");
        String phoneNumber = input("Enter phone number: ");
        Contact newContact = new Contact(firstName, lastName, phoneNumber);
        //validatingContactBeforeStoring(contact);
        contacts.add(newContact);
        goToMainMenu();
    }

//    private static void validatingContactBeforeStoring(String[] validatingContact) {
//        String phoneNumber = validatingContact[2];
//        String found = "false";
//        for(String[] contact: contacts){
//            for(String element : contact){
//                if(element.equals(phoneNumber)){
//                    found = "true";
//                }
//            }
//        }
//        if(found.equals("true"))addContact();
//    }

    private static String input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.next();
    }
}
