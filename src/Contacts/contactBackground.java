package Contacts;

import util.Input;

public class contactBackground {

    public void directory() {
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
//                    for (Movie movie : MoviesArray.findAll()) {
//                        System.out.println(movie.nameGetter() + " - " + movie.categoryGetter());
//                    }
                    break;
                case 2:
//                    for (Movie movie : MoviesArray.findAll()) {
//                        if (movie.categoryGetter().equalsIgnoreCase("animated")) {
//                            System.out.println(movie.nameGetter());
//                        }
//                    }
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
