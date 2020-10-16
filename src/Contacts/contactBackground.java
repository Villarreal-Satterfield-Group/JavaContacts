package Contacts;

import files.FileIO;
import util.Input;

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
        Contact newContact = new Contact(userName, userPH);
        Files.write(contactFile, Arrays.asList(newContact.getName()+", "+newContact.getPhoneNumber()), StandardOpenOption.APPEND);
    }

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
//                    for (Movie movie : MoviesArray.findAll()) {
//                        if (movie.categoryGetter().equalsIgnoreCase("drama")) {
//                            System.out.println(movie.nameGetter());
//                        }
//                    }
                    break;
                case 4:
//                    for (Movie movie : MoviesArray.findAll()) {
//                        if (movie.categoryGetter().equalsIgnoreCase("horror")) {
//                            System.out.println(movie.nameGetter());
//                        }
//                    }
                    break;
                default:
                    break;
            }
            toContinue = new Input().yesNo("Return to directory? [y/N]");
        } while (toContinue);
    }


}
