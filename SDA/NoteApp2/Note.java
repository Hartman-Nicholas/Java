package com.company;

public abstract class Note {

    private String author;
    private String title;
    private String body;

    public Note(String author, String title, String body) {
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public void generateNote () {
        System.out.println("Authors Name: " + getAuthor());
        System.out.println("Title of note: " + getTitle());
        System.out.println("Body of message: " + getBody());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
