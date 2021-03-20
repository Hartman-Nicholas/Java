package com.company;

public class Main {

    public static void main(String[] args) {


        EventNote eventNote = new EventNote("Nic", "Daft Tour", "Music Tour", "18-12-2021", 300);
        PostNote postNote = new PostNote("Nic", "Java 11", "Inheritance lesson");

//        postNote.setCommentAuthor("Bob");
//        postNote.setComment("You need to work on your tutorial");
//
//        postNote.setCommentAuthor("Mary");
//        postNote.setComment("Great Work");

        postNote.addComment("Robert", "Great Work");
        postNote.addComment("Mary", "Keep on going");



        Note [] notes = new Note[2];

        notes[0] = eventNote;
        notes[1] = postNote;

        for (Note printNote : notes) {
            printNote.generateNote();
            System.out.println();
        }



    }
}
