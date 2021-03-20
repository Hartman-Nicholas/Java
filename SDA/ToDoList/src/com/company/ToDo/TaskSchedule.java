package com.company.ToDo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskSchedule {

    private Map<String, TaskList> taskSchedule = new HashMap<>();
    private final String[] taskMap = {"01: EventList","02: TaskList"};
    private ArrayList <TaskList> taskListArray = new ArrayList<>();
    private EventList eventList = new EventList();
    private TaskList taskList = new TaskList();


    private void generateMap () {
        taskListArray.add(eventList);
        taskListArray.add(taskList);

        for (int i = 0; i< taskMap.length; i++) {
            taskSchedule.put(taskMap[i], taskListArray.get(i));
        }
    }

    public void viewSchedule () {
        generateMap();
        System.out.println(taskSchedule);
    }

    public void viewEvents () {
        generateMap();
        taskListArray.get(0).viewTask();
    }

    public void viewTasks () {
        generateMap();
        taskListArray.get(1).viewTask();
    }

    public void viewAll () {
        generateMap();
        System.out.printf("%-22s%-22s\n","Event List","Task List");

        if (taskListArray.get(0).size() > taskListArray.get(1).size())
        {
            for (int i = 0; i < taskListArray.get(0).size(); i++) {
                System.out.printf("%-22s",taskListArray.get(0).viewTask(i));
                try {
                    System.out.printf("%-22s\n",taskListArray.get(1).viewTask(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.printf("%-22s\n", "   ");
                }
            }
        }
    }

    public void addEvent (Task task) {
        eventList.addTask(task);
    }

    public void addTask (Task task) {
        taskList.addTask(task);
    }





//    ArrayList<TaskList> taskSchedule = new ArrayList<>();
//
//    public void viewTask () {
//        for (TaskList task : taskSchedule) {
//            task.viewTask();
//        }
//    }






}
