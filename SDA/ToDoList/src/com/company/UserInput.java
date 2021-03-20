package com.company;

import com.company.planner.Planner;
import com.company.utils.ASCIIArt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class UserInput {

    private static final String FOUND_TASK = "Found the following task: ";
    private static final String YES_NO_OR_QUIT = "Please enter Yes, No or Quit";
    private static final String NOT_A_VALID_CHOICE = "\"%s\" is not a valid choice.%n";
    private static final String NOT_A_VALID_NUMBER = "\"%s\" is not a valid number.%n";
    private static final String ENTER_THE_TIME = "Please enter the time between 0-23: ";
    private static final String ENTER_THE_DAY = "Please enter the day: ";
    private static final String OPERATION_ABORTED = "Operation aborted returning to main menu...";
    private static final Scanner scanner = new Scanner(System.in);
    private static Planner planner = new Planner();
    private static final ASCIIArt todoArt = new ASCIIArt();


    public static void welcomeScreen() {
        boolean quit = false;
        int choice;

        todoArt.drawArt();
        UserInput.printWelcome();
        do {
            System.out.println("Enter your choice: " );
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf(NOT_A_VALID_NUMBER, input);
                System.out.println("Enter your choice: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> UserInput.optionsScreen();
                case 1 -> {
                    UserInput.load();
                    UserInput.optionsScreen();
                }
                case 2 -> quit = true;
                default -> System.out.println("Invalid Selection");
            }
        } while (!quit);
        scanner.close();
    }

    public static void load () {

        String filePath = "BobsPlan.txt";

        try {
            planner = planner.load(filePath);
            planner.viewPlanner();
        } catch (Exception e) {
            System.out.println("Hi There " + e);
        }

    }

    public static void optionsScreen () {
        boolean quit = false;
        int choice;

        todoArt.drawArt();
        UserInput.printInstructions();
        do {
            System.out.println("Enter your choice: " );
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf(NOT_A_VALID_NUMBER, input);
                System.out.println("Enter your choice: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> UserInput.printInstructions();
                case 1 -> {
                    UserInput.viewPlanner(); UserInput.printInstructions();}
                case 2 -> UserInput.addItem();
                case 3 -> UserInput.modifyItem();
                case 4 -> UserInput.removeItem();
                case 5 -> UserInput.searchForItem();
                case 6 -> UserInput.savePlanner();
                case 7 -> quit = true;
                default -> System.out.println("Invalid Selection");
            }
        } while (!quit);
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To view the week Planner");
        System.out.println("\t 2 - To add a task to the Planner");
        System.out.println("\t 3 - To modify a task");
        System.out.println("\t 4 - To remove a task from the Planner");
        System.out.println("\t 5 - To search for a task");
        System.out.println("\t 6 - Make a text copy of your planner");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void printWelcome () {
        System.out.println("\nPress");
        System.out.println("\t 0 - To create new ToDo.");
        System.out.println("\t 1 - To Load an existing ToDo.");
        System.out.println("\t 2 - To quit the application");

    }

    public static void viewPlanner() {
        planner.viewPlanner();
    }


    public static void addItem() {
        String day;
        int time;
        String task;
        String oldTask;
        boolean flag = true;

        day = setDay();
        if(day.equals("QUIT")) { return; }
        time = setTime();
        if(time < 0) { return; }


        if (planner.checkTask(time, day)) {
            oldTask = planner.findTask(time,day);
            System.out.printf("Please note if you continue you will be overwriting this \"%s\" task .%n", oldTask);
            flag = continueCheck();
        }

        if (!flag) { return; }

        System.out.println("Please enter task: ");
        task = scanner.nextLine();
        if (task.equalsIgnoreCase("QUIT")) {
            System.out.println(OPERATION_ABORTED);
            printInstructions();
            return;
        }

        planner.addTask(time, day, task);
        System.out.printf("Task \"%s\" Successfully added.%n", task);
        printInstructions();

    }

    public static void modifyItem() {
        String day;
        int time;
        String task;
        boolean flag;
        String oldTask;


        day = setDay();
        if(day.equals("QUIT")) { return; }
        time = setTime();
        if(time < 0) { return; }



        if(planner.checkTask(time, day)) {
            oldTask = planner.findTask(time,day);
            System.out.println(FOUND_TASK + oldTask );

            flag = continueCheck();
            if (!flag) { return; }

            System.out.println("Please enter new task name: ");
            task = scanner.nextLine();
            planner.addTask(time, day, task);
            System.out.printf("Task \"%s\" Successfully updated.%n", oldTask);

        } else {
            System.out.println("Task not found");
        }
        printInstructions();

    }

    public static void removeItem () {

        String day;
        int time;
        boolean flag;
        String oldTask;

        day = setDay();
        if(day.equals("QUIT")) { return; }
        time = setTime();
        if(time < 0) { return; }


        if(planner.checkTask(time, day)) {
            oldTask = planner.findTask(time,day);
            System.out.println(FOUND_TASK + oldTask );

            flag = continueCheck();
            if (!flag) { return; }

            planner.removeTask(time, day);
            System.out.printf("Task \"%s\" Successfully deleted.%n", oldTask);

        } else {
            System.out.println("You have no tasks to Delete please check your weekly planner.");
        }
        printInstructions();

    }

    public static void searchForItem () {
        String day;
        int time;
        String oldTask;

        day = setDay();
        if(day.equals("QUIT")) { return; }
        time = setTime();
        if(time < 0) { return; }


        if(planner.checkTask(time, day)) {
            oldTask = planner.findTask(time,day);
            System.out.println(FOUND_TASK + oldTask );

        } else {
            System.out.println("You have no tasks at this time.");
        }
        printInstructions();

    }

    public static void savePlanner ()  {

        String filePath;
        boolean flag = true;

        do {
            System.out.println("Please enter your file name: ");
            filePath = scanner.nextLine();

            String appendedFile = planner.checkFile(filePath) ? filePath : filePath + ".txt";

            File checkFile = new File (appendedFile);

            if (checkFile.exists()) {
                System.out.printf("Please note if you continue you will be overwriting this \"%s\" file .%n", filePath);
                flag = continueCheck();
            }

            if (!flag) { return; }

            try {

                planner.savePlanner(appendedFile, planner);
                System.out.println("Your planner has been saved successfully");
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Invalid file name.");
            } catch (IOException e) {
                System.out.println("Hi there" + e);
            }
        } while (true);
    }

    private static boolean continueCheck() {
        String flag;
        do {
            System.out.println("Would you like to continue? Yes, No or Quit");
            flag = scanner.nextLine();
            if(flag.equalsIgnoreCase("YES")) {
                return true;
            } else if (flag.equalsIgnoreCase("NO") || flag.equalsIgnoreCase("QUIT")) {
                System.out.println(OPERATION_ABORTED);
                printInstructions();
                return false;
            } else {
                System.out.println(YES_NO_OR_QUIT);
            }
        } while (true);
    }

    private static String setDay() {
        String day;
        do
        {
            System.out.println(ENTER_THE_DAY);
            try {
                day = scanner.nextLine();
                if(day.equalsIgnoreCase("QUIT")) {
                    System.out.println(OPERATION_ABORTED);
                    printInstructions();
                    return "QUIT";
                }
                planner.dayIndex(day);
                break;
            } catch (NullPointerException e) {
                System.out.println("Please enter a valid week day");
            }
        } while (true);
        return day;
    }

    private static int setTime () {
        int time;
        do{
            System.out.println(ENTER_THE_TIME);
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("QUIT")) {
                    System.out.println(OPERATION_ABORTED);
                    printInstructions();
                    return -1;
                }
                System.out.printf(NOT_A_VALID_NUMBER, input);
                System.out.println(ENTER_THE_TIME);
            }
            time = scanner.nextInt();
            scanner.nextLine();
            if (time < 0 || time > 23) {
                System.out.printf(NOT_A_VALID_CHOICE, time);
            }
        } while(time < 0 || time > 23);
        return time;
    }

}
