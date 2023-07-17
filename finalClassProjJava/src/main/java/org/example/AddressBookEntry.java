package org.example;
import java.util.*;

public class AddressBookEntry {


/*


STORING EACH ADDRESS BOOK INSTANCE IN AN ARRAYLIST AND FIGURE OUT HOW TO SEARCH


REQS

- email address needs to be unique
- all options filled

- first name
- last name
- phone number
- email address
success message "Added new entry!"

 */

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    String successMsg = "Added new entry!";

    public void setEntry(String firstName, String lastName,String phoneNumber, String emailAddress){

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;

        System.out.println(successMsg);
    }

    public void setEntry(){ //overloaded addEntry
        System.out.println("Welcome to your address book.");
        System.out.println("Please enter the first name of the address book entry: ");

        Scanner sc = new Scanner(System.in);
        firstName = sc.nextLine();

        System.out.println("Please enter the last name of the address book entry: ");
        this.lastName = sc.nextLine();

        System.out.println("Please enter the phone number of the address book entry: ");
        phoneNumber = sc.nextLine();

        System.out.println("Please enter the email address of the address book entry: ");
        emailAddress = sc.nextLine();


    }

    public String getFirstName(){
        return firstName + "\n";
    }
    public String getLastName(){
        return lastName + "\n";
    }
    public String getPhoneNumber(){
        return phoneNumber + "\n";
    }

    public String getEmailAddress(){
        return emailAddress + "\n";
    }


} //end of code
