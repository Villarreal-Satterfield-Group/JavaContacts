package Contacts;

import files.FileIO;
import util.Input;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contactApp {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to The Directory!");
        String directoryName = "data";
        String fileName = "contacts.txt";
        try {
            Path contactFile = FileIO.createDirectoryAndFile(directoryName, fileName);
//            Contact Sam = new Contact("Sam", "777-7777");
//            Contact Sammy = new Contact("Sammy", "111-1111");
//            Contact Sammie = new Contact("Sammie", "222-2222");
//            Contact Sammuel = new Contact("Sammuel", "333-3333");
//            List<Contact> ObjectList = Arrays.asList(Sam, Sammie, Sammy, Sammuel);
//            List<String> contactList = new ArrayList<>();
//            for (Contact object : ObjectList) {
//                contactList.add(object.getName()+", "+object.getPhoneNumber());
//            }
//            Files.write(contactFile, contactList);
            contactBackground.directory(contactFile);
        } catch (IOException ex) {
            System.out.println("Cannot create the file.");
            ex.printStackTrace();
        }
    }
}
