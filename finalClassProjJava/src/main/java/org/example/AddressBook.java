package org.example;
import java.util.*;

public class AddressBook {
    ArrayList<AddressBookEntry> addressBook1 = new ArrayList<AddressBookEntry>();

    public void addEntry() {
        addressBook1.add(new AddressBookEntry());
    }

    public void printEntries() {

        if(addressBook1.size() == 0){
            System.out.println("There aren't any entries to print.");
        }else if(addressBook1.size() > 0) {
            for (int i = 0; i < addressBook1.size(); i++) {

                System.out.println("First name: " + addressBook1.get(i).getFirstName() +
                        "Last name: " + addressBook1.get(i).getLastName() +
                        "Email address: " + addressBook1.get(i).getEmailAddress() +
                        "Phone number: " + addressBook1.get(i).getPhoneNumber() + "\n"
                );
            }
        }
    }

    public void removeEntry(){

        if (addressBook1.size() == 0) {
            System.out.println("There aren't any entries to delete.");

        } else {

            String searchVal;
            Scanner uI2 = new Scanner(System.in);

            System.out.println("Please enter the email address of the entry you would like to delete: ");
            searchVal = uI2.nextLine();

                for (int i = 0; i < addressBook1.size(); i++) { //iterate through the overall addressbook1
                    String emailAddress = addressBook1.get(i).getEmailAddress(); //store email of index
                    if (emailAddress.contains(searchVal)) { //if index contains search val
                        System.out.println("Deleted the following entry: \n" + "First name: " + addressBook1.get(i).getFirstName() +
                                "Last name: " + addressBook1.get(i).getLastName() +
                                "Phone number: " + addressBook1.get(i).getPhoneNumber() +
                                "Email address: " + addressBook1.get(i).getEmailAddress());//print full entry
                        addressBook1.remove(addressBook1.get(i));
                        break;
                    }
                    if (i == addressBook1.size() - 1) {
                        System.out.println("There aren't any address book entries that match your search query.");

                    }
                }


        }

    }//end of method code
    public void deleteAllEntries(){
        addressBook1.clear();
        System.out.println("All entries have been deleted.");
    }

    public void searchEntries() {

        if (addressBook1.size() == 0) {
            System.out.println("There aren't any entries to search through.");

        } else {


            int searchVal;
            Scanner uI2 = new Scanner(System.in);

            System.out.println("1.) First name" + "\n" +
                    "2.) Last name" + "\n" +
                    "3.) Phone number" + "\n" +
                    "4.) Email address" + "\n\n" +
                    "Choose a search type: ");
            searchVal = uI2.nextInt();

            if (searchVal > 4) {

                do {
                    System.out.println("Please enter a valid search type." + "\n");

                    System.out.println("1.) First name" + "\n" +
                            "2.) Last name" + "\n" +
                            "3.) Phone number" + "\n" +
                            "4.) Email address" + "\n\n" +
                            "Choose a search type: ");
                    searchVal = uI2.nextInt();

                } while (searchVal > 4);
            }

            if (searchVal == 1) {

                Scanner sI = new Scanner(System.in);
                System.out.println("Enter your search value: ");
                String searchInput = sI.nextLine(); //search entry

                for (int i = 0; i < addressBook1.size(); i++) { //iterate through the overall addressbook1
                    String nameTest = addressBook1.get(i).getFirstName(); //store firstname of index
                    if (nameTest.contains(searchInput)) { //if index contains search val
                        System.out.println("First name: " + addressBook1.get(i).getFirstName() +
                                "Last name: " + addressBook1.get(i).getLastName() +
                                "Phone number: " + addressBook1.get(i).getPhoneNumber() +
                                "Email address: " + addressBook1.get(i).getEmailAddress()); //print full entry
                        break;
                    }
                    if (i == addressBook1.size() - 1) {
                        System.out.println("There aren't any address book entries that match your search query.");

                    }

                }
            }

            if (searchVal == 2) {

                Scanner sI = new Scanner(System.in);
                System.out.println("Enter your search value: ");
                String searchInput = sI.nextLine(); //search entry

                for (int i = 0; i < addressBook1.size(); i++) { //iterate through the overall addressbook1
                    String nameTest = addressBook1.get(i).getLastName(); //store firstname of index
                    if (nameTest.contains(searchInput)) { //if index contains search val
                        System.out.println("First name: " + addressBook1.get(i).getFirstName() +
                                "Last name: " + addressBook1.get(i).getLastName() +
                                "Phone number: " + addressBook1.get(i).getPhoneNumber() +
                                "Email address: " + addressBook1.get(i).getEmailAddress()); //print full entry
                        break;
                    }
                    if (i == addressBook1.size() - 1) {
                        System.out.println("There aren't any address book entries that match your search query.");
                    }
                }

            }


            if (searchVal == 3) {

                Scanner sI = new Scanner(System.in);
                System.out.println("Enter your search value: ");
                String searchInput = sI.nextLine(); //search entry

                for (int i = 0; i < addressBook1.size(); i++) { //iterate through the overall addressbook1
                    String nameTest = addressBook1.get(i).getPhoneNumber(); //store firstname of index
                    if (nameTest.contains(searchInput)) { //if index contains search val
                        System.out.println("First name: " + addressBook1.get(i).getFirstName() +
                                "Last name: " + addressBook1.get(i).getLastName() +
                                "Phone number: " + addressBook1.get(i).getPhoneNumber() +
                                "Email address: " + addressBook1.get(i).getEmailAddress()); //print full entry
                        break;
                    }
                    if (i == addressBook1.size() - 1) {
                        System.out.println("There aren't any address book entries that match your search query.");
                    }
                }

            }

            if (searchVal == 4) {

                Scanner sI = new Scanner(System.in);
                System.out.println("Enter your search value: ");
                String searchInput = sI.nextLine(); //search entry

                for (int i = 0; i < addressBook1.size(); i++) { //iterate through the overall addressbook1
                    String nameTest = addressBook1.get(i).getEmailAddress(); //store firstname of index
                    if (nameTest.contains(searchInput)) { //if index contains search val
                        System.out.println("First name: " + addressBook1.get(i).getFirstName() +
                                "Last name: " + addressBook1.get(i).getLastName() +
                                "Phone number: " + addressBook1.get(i).getPhoneNumber() +
                                "Email address: " + addressBook1.get(i).getEmailAddress());
                        break;
                    }
                    if (i == addressBook1.size() - 1) {
                        System.out.println("There aren't any address book entries that match your search query.");
                    }
                }

            }


        }
    }

// end of class code

        public static void main (String[]args){

            AddressBook addressBook = new AddressBook();

            int userInput;

            //runs infinite loop to continually print database menu
            do {
                System.out.println(
                        "\n\nAddress Option Menu:\n" +
                                "1.) Add an entry\n" +
                                "2.) Remove an entry\n" +
                                "3.) Search for a specific entry\n" +
                                "4.) Print Address Book\n" +
                                "5.) Delete Book\n" +
                                "6.) Quit\n");

                System.out.println("Please choose what you would like to do with your database:");
                Scanner uI = new Scanner(System.in);
                userInput = uI.nextInt();

                if (userInput == 1) {
                    addressBook.addEntry();
                    int indexLastEntry = addressBook.addressBook1.size() - 1;
                    addressBook.addressBook1.get(indexLastEntry).setEntry();
                }
                if (userInput == 2) {
                    addressBook.removeEntry();
                }
                if (userInput == 3) {
                    addressBook.searchEntries();

                }
                if (userInput == 4) {
                    addressBook.printEntries();
                }
                if (userInput == 5) {
                    addressBook.deleteAllEntries();
                }
                if (userInput == 6) {
                    System.out.println("The program has been ended. Goodbye!");
                }

            } while (userInput != 6);

        }

    }


