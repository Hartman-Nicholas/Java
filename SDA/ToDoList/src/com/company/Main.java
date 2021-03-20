package com.company;


import com.company.ToDo.Task;
import com.company.ToDo.TaskSchedule;
import com.company.planner.Planner;
import com.company.utils.ASCIIArt;

import java.io.*;


public class Main {

    private static final ASCIIArt todoArt = new ASCIIArt();
    private final UserInput userInput = new UserInput();




    public static void main(String[] args) throws IOException, ClassNotFoundException {

        UserInput.welcomeScreen();

        TaskSchedule schedule = new TaskSchedule();

        Task task = new Task("ToDo List", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//        Task event = new Task("Event List", "Lorem iadsmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//        Task daftEvent = new Task("daftEvent", "Lorem iadsmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//        Task swimmingEvent = new Task("SwimmingEvent", "Lorem iadsmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//
//        schedule.addEvent(event);
//        schedule.addTask(task);
//        schedule.addEvent(daftEvent);
//        schedule.addEvent(swimmingEvent);

//        schedule.viewSchedule();
//        schedule.viewEvents();
//        schedule.viewTasks();
//        schedule.viewAll();

//        Planner planner = new Planner();
//        planner.addTask(12, "Sat", task.getTitle());
//
//        planner.viewPlanner();







//        SaveAndLoad save = new SaveAndLoad();
//        Planner task3 = new Planner();
//Task task = new Task("ToDo List", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//
//

//
//        task3 = save.load("bobsPlan.txt");
//
//        task3.viewPlanner();



    }
}

