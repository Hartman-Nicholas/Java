package com.company;

import java.util.*;

public class PostNote extends Note {

    Map<String, String> commentMap = new HashMap<>();



    public PostNote(String author, String title, String body) {
        super(author, title, body);

    }

    @Override
    public void generateNote () {
        super.generateNote();
        for (String name : commentMap.keySet()) {
            System.out.println("key: " + name);
            System.out.print("Comment: " + commentMap.get(name));
            System.out.println();
        }

//        for each loop doing the same as above
//        commentMap.forEach((k,v) -> System.out.println(k + "=" + v));

    }

    public void addComment (String author, String comment) {
        commentMap.put(author, comment);
    }

    public Map<String, String> getCommentMap() {
        return commentMap;
    }

    public void setCommentMap(Map<String, String> commentMap) {
        this.commentMap = commentMap;
    }
}
