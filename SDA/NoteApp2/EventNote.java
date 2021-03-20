package com.company;

public class EventNote extends Note {

    private String eventDate;
    private int eventPrice;

    public EventNote(String author, String title, String body, String eventDate, int eventPrice) {
        super(author, title, body);
        this.eventDate = eventDate;
        this.eventPrice = eventPrice;
    }

    @Override
    public void generateNote () {
        super.generateNote();
        System.out.println("Event Date: " +getEventDate());
        System.out.println("Event Price: " + getEventPrice());
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(int eventPrice) {
        this.eventPrice = eventPrice;
    }
}
