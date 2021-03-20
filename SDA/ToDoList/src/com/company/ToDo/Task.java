package com.company.ToDo;
import com.company.utils.WordWrap;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private static final WordWrap wordWrap = new WordWrap();
    private String title;
    private String body;
    private final Date taskCreateDate;
    private Date taskModifyDate;
    private boolean status;

    @Serial
    private final static long serialVersionUID = 4L;

    public Task(String title, String body) {
        this.title = title;
        this.body = wordWrap.wrap(body);
        this.taskCreateDate = new Date();
        this.status = false;
    }


    public void viewTask () {
        System.out.println("Title: " + title);
        System.out.println("Task: " + "\n" + body);
        System.out.println("Date Created: " + taskCreateDate);
        if (status) {
            System.out.println("Status: Completed");
        } else {
            System.out.println("Status: Incomplete");
        }
        if (taskModifyDate == null) {
            System.out.println("");
        } else {
            System.out.println("Task modified on the: " + taskModifyDate);
        }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = wordWrap.wrap(body);
    }

    public Date getTaskCreateDate() {
        return taskCreateDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
