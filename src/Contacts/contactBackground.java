package Contacts;

import files.FileIO;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contactBackground {

    public static void contactAdd(Path contactFile) throws Exception {
        String userName = new Input().getString("Enter contact name: ");
        String userPH = new Input().getString("Enter contact phone-number: ");
        List<String> readables = Files.readAllLines(contactFile);
        int count = 1;
        for(String contact:readables){
            count += 1;
        }
        Contact newContact = new Contact(userName, userPH, count);
        Files.write(contactFile, Arrays.asList(newContact.getId()+ "  |  " + newContact.getName() + "  |  " + newContact.getPhoneNumber()), StandardOpenOption.APPEND);
    }

    public static void deleteContact(Path contactFile, String numberToDelete) throws IOException {
        List<String> fileContents = Files.readAllLines(contactFile);
        List<String> modifiedList = new ArrayList<>();
        for (String item : fileContents) {
            if (!item.startsWith(numberToDelete)){
                modifiedList.add(item);
            }
        }
        Files.write(contactFile, modifiedList);
    }

    public static void searchContact(Path contactFile) throws IOException{
        List<String> fileContents = Files.readAllLines(contactFile);
        List<String> lowerList = new ArrayList<>();
        for(String item : fileContents ){
            lowerList.add(item.toLowerCase());
        }
        String userSearch = new Input().getString("Find contact: ");
        System.out.println("Id  |  Name  |  Phone number \n----------------------------");
        for(String item: lowerList){
            if(item.contains(userSearch.toLowerCase())){
                for(String item2 : fileContents){
                    if(item2.startsWith(String.valueOf(item.charAt(0)))){
                        System.out.println(item2);
                    }
                }
            }
        }
    }
//   String.valueOf(item2.charAt(0)).equalsIgnoreCase(String.valueOf(item.charAt(0)))
    public static void directory(Path contactFile) throws Exception {
        boolean toContinue;
        do {
            Input scanner = new Input();
            int answer = scanner.getInt("\nWhat would you like to do?\n" +
                    "1. View all contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4, or 5): ");
            switch (answer) {
                case 1:
                    FileIO.printFileContents(contactFile);
                    break;
                case 2:
                    contactAdd(contactFile);
                    break;
                case 3:
                    searchContact(contactFile);
                    break;
                case 4:
                    FileIO.printFileContents(contactFile);
                    String delete = new Input().getString("Enter contact number to delete (1, 2, 3, etc.): ");
                    deleteContact(contactFile, delete);
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default:
                    System.err.println("Not a valid option");
                    break;
            }
            toContinue = new Input().yesNo("\nReturn to directory? [y/N] ");
        } while (toContinue);
    }


}
