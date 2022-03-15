package com.LockedMe;
import java.util.Scanner;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
	    int choice;
        do {
            LockedMe.displayMenu();
            System.out.println(ANSI_YELLOW
            + "Enter the choice"
            + ANSI_RESET);
            choice = Integer.parseInt(obj.nextLine());
            
            switch (choice) {
                case 1: LockedMe.getAllFiles();
                    break;
                case 2: LockedMe.addNewFile();
                    break;
                case 3: LockedMe.deleteFile();
                    break;
                case 4: LockedMe.SearchFiles();
                    break;
                case 5: System.exit(0);
                    break;
                 default: System.out.println("Invalid choice");
                    break;
            }
            
        } while (choice>0);

        obj.next();
	    obj.close();
    }
}
