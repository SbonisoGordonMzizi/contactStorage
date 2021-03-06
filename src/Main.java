import java.util.ArrayList;
import java.util.Scanner;

public final class Main {



    public static void main(String[] args) {
        boolean loopControl = true;
        ArrayList<Contact>contactList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu();
        while (loopControl) {
            System.out.print("> ");
            String userChoice = scanner.next();
            if (userChoice.equals("1") || userChoice.equals("2") || userChoice.equals("3") || userChoice.equals("4") || userChoice.equals("5")
                    || userChoice.equals("6") || userChoice.equals("7") || userChoice.equals("8") || userChoice.equals("9")) {
                Integer userIntChoice = Integer.parseInt(userChoice);


                int choice = userIntChoice;


                switch (choice) {
                    case 1:
                        inputInstruction();
                        System.out.print(">> ");
                        scanner.nextLine();
                        String newContactData = scanner.nextLine();
                        String[] arrayContactData = newContactData.split(" ");

                        if (arrayContactData.length >= 3 && arrayContactData.length <= 6) {
                            if (arrayContactData.length == 3) {
                                contactList.add(new Contact(arrayContactData[0], arrayContactData[1], arrayContactData[2]));
                            } else if (arrayContactData.length == 4) {
                                contactList.add(new Contact(arrayContactData[0], arrayContactData[1], arrayContactData[2], arrayContactData[3]));
                            } else if (arrayContactData.length == 5) {
                                contactList.add(new Contact(arrayContactData[0], arrayContactData[1], arrayContactData[2], arrayContactData[3], arrayContactData[4]));
                            } else {
                                contactList.add(new Contact(arrayContactData[0], arrayContactData[1], arrayContactData[2], arrayContactData[3], arrayContactData[4], arrayContactData[5]));
                            }
                        } else {
                            inputInstruction();

                        }
                        ContactStorage storage = new ContactStorage(contactList);
                        break;
                    case 2:
                        System.out.print("ENTER VIEW TYPE (7|8) : ");
                        String viewType = "basic";
                        System.out.print(">> ");
                        userChoice = scanner.next();
                        int viewCode = Integer.parseInt(userChoice);

                        if (viewCode == 7) {
                            viewType = "basic";
                            System.out.println("__________________BASIC VIEW__________________");
                        } else if (viewCode == 8) {
                            viewType = "full";
                            System.out.println("__________________FULL VIEW___________________");
                        } else {
                            System.out.println("__________________BASIC VIEW__________________");
                        }
                        ReadContactStorage readContactStorage = new ReadContactStorage();
                        ArrayList<ContactReadData> contactReadData = readContactStorage.getContactList();
                        ContactViews contactViews = new ContactViews(contactReadData, viewType);
                        break;
                    case 3:
                        deletingUserInstruction();
                        System.out.print(">> ");
                        scanner.nextLine();
                        String deleteContactName = scanner.nextLine();
                        SearchContact contactToBeDeleted = new SearchContact(deleteContactName, 3);
                        break;
                    case 4:
                        System.out.println("UPDATING");
                        userUpdateInstruction();
                        System.out.print(">> ");
                        scanner.nextLine();
                        String updateContactName = scanner.nextLine();
                        SearchContact updateToBeDeleted = new SearchContact(updateContactName, 4);
                        break;
                    case 5:
                        searchNameInstruction();
                        System.out.print(">> ");
                        scanner.nextLine();
                        String searchName = scanner.nextLine();
                        SearchContact searchContact = new SearchContact(searchName, 5);
                        break;
                    case 6:
                        menu();
                        choice = userIntChoice;
                        break;
                    case 9:
                        loopControl = false;
                        System.out.println("\nThank for using Contact Storage\n");
                        break;
                    default:
                        System.out.println("PLEASE PROVIDE VALID KEY");
                        break;
                }
            }else {
                userErrorInstruction();
            }
        }
    }

    public static void menu(){
        System.out.println("___________Contact Storage___________");
        System.out.println("_____________________________________");
        System.out.println("Enter : 1 for ADDING NEW CONTACT     ");
        System.out.println("Enter : 2 for ViEWING CONTACTS       ");
        System.out.println("          Enter : 7 BASIC VIEW       ");
        System.out.println("          Enter : 8 FULL  VIEW       ");
        System.out.println("Enter : 3 for DELETING CONTACT       ");
        System.out.println("Enter : 4 for UPDATING CONTACT       ");
        System.out.println("Enter : 5 for SEARCHING CONTACT      ");
        System.out.println("Enter : 6 for VIEW MENU              ");
        System.out.println("Enter : 9 for EXIT STORAGE           ");
        System.out.println("_____________________________________");
    }


    public static void inputInstruction(){
        System.out.println("____________________________ADDING NEW CONTACT___________________________");
        System.out.println("Provide : FirstName SecondName Surname PhoneNumber TelNumber EmailAddress");
        System.out.println("PLEASE NOTE : FirstName, Surname, PhoneNumber Can not be empty           ");
        System.out.println("_________________________________________________________________________");
        System.out.println();
    }
    public static void searchNameInstruction(){
        System.out.println("__________________________SEARCHING FOR CONTACT__________________________");
        System.out.println("Provide : Name of contact to search                                                 ");
        System.out.println("_________________________________________________________________________");
        System.out.println();
    }
    public static void deletingUserInstruction(){
        System.out.println("__________________________DELETE CONTACT_________________________________");
        System.out.println("Provide : Name of contact to delete                                                 ");
        System.out.println("_________________________________________________________________________");
        System.out.println();

    }
    public static void userUpdateInstruction(){
        System.out.println("__________________________UPDATING CONTACT_______________________________");
        System.out.println("Provide : Name of contact to update                                                 ");
        System.out.println("_________________________________________________________________________");
        System.out.println();

    }
    public static void userErrorInstruction() {
        System.out.println("____________________________INPUT ERROR__________________________________");
        System.out.println("____________________NUMBER VALUE IS EXPECTED_____________________________");
    }
}
