package com.company.ToDo;

import com.company.ToDo.Task;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> taskList = new ArrayList<>();



    public void addTask (Task task) {
        taskList.add(task);
    }

    public void viewTask () {

        for (int i = 0; i < taskList.size(); i++)
        {
            System.out.println((i+1) +": " + taskList.get(i).getTitle());
        }

//        for (Task task : taskList) {
//            System.out.println(task.getTitle());
//        }
    }

    public String viewTask (int index) {
        return (index+1) + ": " + taskList.get(index).getTitle();
    }

    public int size () {
        return taskList.size();
    }



}
